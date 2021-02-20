package typings.datastoreCore

import typings.datastoreCore.mod.shard.Shard
import typings.interfaceDatastore.mod.Adapter
import typings.interfaceDatastore.mod.Key
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("datastore-core", "KeytransformDatastore")
  @js.native
  class KeytransformDatastore[Value] protected () extends Adapter[Value] {
    def this(child: Adapter[Value], transform: Transform) = this()
    
    var child: Adapter[Value] = js.native
    
    var transform: Transform = js.native
  }
  
  @JSImport("datastore-core", "MountDatastore")
  @js.native
  class MountDatastore[Value] protected () extends Adapter[Value] {
    def this(mounts: js.Array[Mount[Value]]) = this()
    
    var mounts: js.Array[Mount[_]] = js.native
  }
  
  @JSImport("datastore-core", "NamespaceDatastore")
  @js.native
  class NamespaceDatastore[Value] protected () extends KeytransformDatastore[Value] {
    def this(child: Adapter[Value], prefix: Key) = this()
    
    var prefix: Key = js.native
  }
  
  @JSImport("datastore-core", "ShardingDatastore")
  @js.native
  class ShardingDatastore[Value] protected () extends Adapter[Value] {
    def this(stores: js.Array[Adapter[Value]]) = this()
    
    var child: KeytransformDatastore[Value] = js.native
    
    var shard: Shard = js.native
  }
  /* static members */
  object ShardingDatastore {
    
    @JSImport("datastore-core", "ShardingDatastore.create")
    @js.native
    def create[Value](store: Adapter[Value], shard: Shard): js.Promise[ShardingDatastore[Value]] = js.native
    
    @JSImport("datastore-core", "ShardingDatastore.createOrOpen")
    @js.native
    def createOrOpen[Value](store: Adapter[Value], shard: Shard): js.Promise[ShardingDatastore[Value]] = js.native
    
    @JSImport("datastore-core", "ShardingDatastore.open")
    @js.native
    def open[Value](store: Adapter[Value]): js.Promise[ShardingDatastore[Value]] = js.native
  }
  
  @JSImport("datastore-core", "TieredDatastore")
  @js.native
  class TieredDatastore[Value] protected () extends Adapter[Value] {
    def this(stores: js.Array[Adapter[Value]]) = this()
    
    var stores: js.Array[Adapter[Value]] = js.native
  }
  
  object shard {
    
    @JSImport("datastore-core", "shard.NextToLast")
    @js.native
    class NextToLast protected () extends Shard {
      def this(length: Double) = this()
    }
    
    @JSImport("datastore-core", "shard.PREFIX")
    @js.native
    val PREFIX_ : /* "/repo/flatfs/shard/" */ String = js.native
    
    @JSImport("datastore-core", "shard.Prefix")
    @js.native
    class Prefix protected () extends Shard {
      def this(length: Double) = this()
    }
    
    @JSImport("datastore-core", "shard.README_FN")
    @js.native
    val README_FN: /* "_README" */ String = js.native
    
    @JSImport("datastore-core", "shard.SHARDING_FN")
    @js.native
    val SHARDING_FN: /* "SHARDING" */ String = js.native
    
    @JSImport("datastore-core", "shard.Shard")
    @js.native
    class Shard protected () extends StObject {
      def this(length: Double) = this()
      
      var _padding: String = js.native
      
      def fun(str: String): String = js.native
      
      var name: String = js.native
      
      var param: Double = js.native
    }
    
    @JSImport("datastore-core", "shard.Suffix")
    @js.native
    class Suffix protected () extends Shard {
      def this(length: Double) = this()
    }
    
    @JSImport("datastore-core", "shard.parseShardFun")
    @js.native
    def parseShardFun(str: String): Shard = js.native
    
    @JSImport("datastore-core", "shard.readShardFun")
    @js.native
    def readShardFun(path: String, store: Adapter[Buffer]): js.Promise[Shard] = js.native
    
    @JSImport("datastore-core", "shard.readme")
    @js.native
    val readme: String = js.native
  }
  
  @js.native
  trait Mount[Value] extends StObject {
    
    /**
      * The child datastore.
      */
    var datastore: Adapter[Value] = js.native
    
    /**
      * The mount prefix.
      */
    var prefix: Key = js.native
  }
  object Mount {
    
    @scala.inline
    def apply[Value](datastore: Adapter[Value], prefix: Key): Mount[Value] = {
      val __obj = js.Dynamic.literal(datastore = datastore.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mount[Value]]
    }
    
    @scala.inline
    implicit class MountMutableBuilder[Self <: Mount[_], Value] (val x: Self with Mount[Value]) extends AnyVal {
      
      @scala.inline
      def setDatastore(value: Adapter[Value]): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: Key): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Transform extends StObject {
    
    /**
      * Forward transform function.
      * @param key Input key.
      * @example
      * // Forward prefix transform
      * const convert = (key: Key) => new Key('/abc').child(key)
      */
    def convert(key: Key): Key = js.native
    
    /**
      * Inverse transform function.
      * @param key Input key.
      * @example
      * // Inverse prefix transform
      * const invert = (key: Key) => Key.withNamespaces(key.list().slice(1))
      */
    def invert(key: Key): Key = js.native
  }
  object Transform {
    
    @scala.inline
    def apply(convert: Key => Key, invert: Key => Key): Transform = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), invert = js.Any.fromFunction1(invert))
      __obj.asInstanceOf[Transform]
    }
    
    @scala.inline
    implicit class TransformMutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConvert(value: Key => Key): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInvert(value: Key => Key): Self = StObject.set(x, "invert", js.Any.fromFunction1(value))
    }
  }
}
