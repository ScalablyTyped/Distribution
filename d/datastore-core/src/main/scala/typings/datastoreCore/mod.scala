package typings.datastoreCore

import typings.interfaceDatastore.mod.Datastore
import typings.interfaceDatastore.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("datastore-core", "BaseDatastore")
  @js.native
  open class BaseDatastore ()
    extends typings.datastoreCore.distSrcBaseMod.BaseDatastore
  
  object Errors {
    
    @JSImport("datastore-core", "Errors")
    @js.native
    val ^ : js.Any = js.native
    
    inline def abortedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("abortedError")().asInstanceOf[js.Error]
    inline def abortedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("abortedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    
    inline def dbDeleteFailedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDeleteFailedError")().asInstanceOf[js.Error]
    inline def dbDeleteFailedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDeleteFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    
    inline def dbOpenFailedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbOpenFailedError")().asInstanceOf[js.Error]
    inline def dbOpenFailedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbOpenFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    
    inline def dbReadFailedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbReadFailedError")().asInstanceOf[js.Error]
    inline def dbReadFailedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbReadFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    
    inline def dbWriteFailedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbWriteFailedError")().asInstanceOf[js.Error]
    inline def dbWriteFailedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbWriteFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    
    inline def notFoundError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("notFoundError")().asInstanceOf[js.Error]
    inline def notFoundError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("notFoundError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  }
  
  @JSImport("datastore-core", "KeyTransformDatastore")
  @js.native
  open class KeyTransformDatastore protected ()
    extends typings.datastoreCore.distSrcKeytransformMod.KeyTransformDatastore {
    def this(
      child: Datastore[
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object
          ],
      transform: KeyTransform
    ) = this()
  }
  
  @JSImport("datastore-core", "MemoryDatastore")
  @js.native
  open class MemoryDatastore ()
    extends typings.datastoreCore.distSrcMemoryMod.MemoryDatastore
  
  @JSImport("datastore-core", "MountDatastore")
  @js.native
  open class MountDatastore protected ()
    extends typings.datastoreCore.distSrcMountMod.MountDatastore {
    def this(mounts: js.Array[typings.datastoreCore.anon.Datastore]) = this()
  }
  
  @JSImport("datastore-core", "NamespaceDatastore")
  @js.native
  open class NamespaceDatastore protected ()
    extends typings.datastoreCore.distSrcNamespaceMod.NamespaceDatastore {
    def this(
      child: Datastore[
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object
          ],
      prefix: Key
    ) = this()
  }
  
  @JSImport("datastore-core", "ShardingDatastore")
  @js.native
  open class ShardingDatastore protected ()
    extends typings.datastoreCore.distSrcShardingMod.ShardingDatastore {
    def this(
      store: Datastore[
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object
          ],
      shard: Shard_
    ) = this()
  }
  /* static members */
  object ShardingDatastore {
    
    @JSImport("datastore-core", "ShardingDatastore")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(
      store: Datastore[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object
        ]
    ): js.Promise[Shard_] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(store.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Shard_]]
    inline def create(
      store: Datastore[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object
        ],
      shard: Shard_
    ): js.Promise[Shard_] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(store.asInstanceOf[js.Any], shard.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Shard_]]
  }
  
  @JSImport("datastore-core", "TieredDatastore")
  @js.native
  open class TieredDatastore protected ()
    extends typings.datastoreCore.distSrcTieredMod.TieredDatastore {
    def this(stores: js.Array[
            Datastore[
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object
            ]
          ]) = this()
  }
  
  object shard {
    
    @JSImport("datastore-core", "shard")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("datastore-core", "shard.NextToLast")
    @js.native
    open class NextToLast protected ()
      extends typings.datastoreCore.distSrcShardMod.NextToLast {
      def this(suffixLen: Double) = this()
    }
    
    @JSImport("datastore-core", "shard.PREFIX")
    @js.native
    val PREFIX_ : /* "/repo/flatfs/shard/" */ String = js.native
    
    @JSImport("datastore-core", "shard.Prefix")
    @js.native
    open class Prefix protected ()
      extends typings.datastoreCore.distSrcShardMod.Prefix {
      def this(prefixLen: Double) = this()
    }
    
    @JSImport("datastore-core", "shard.SHARDING_FN")
    @js.native
    val SHARDING_FN: /* "SHARDING" */ String = js.native
    
    @JSImport("datastore-core", "shard.ShardBase")
    @js.native
    open class ShardBase protected ()
      extends typings.datastoreCore.distSrcShardMod.ShardBase {
      def this(param: Double) = this()
    }
    
    @JSImport("datastore-core", "shard.Suffix")
    @js.native
    open class Suffix protected ()
      extends typings.datastoreCore.distSrcShardMod.Suffix {
      def this(suffixLen: Double) = this()
    }
    
    inline def parseShardFun(str: String): Shard_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parseShardFun")(str.asInstanceOf[js.Any]).asInstanceOf[Shard_]
    
    inline def readShardFun(
      path: String,
      store: Datastore[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object
        ]
    ): js.Promise[Shard_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readShardFun")(path.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Shard_]]
    inline def readShardFun(
      path: js.typedarray.Uint8Array,
      store: Datastore[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object
        ]
    ): js.Promise[Shard_] = (^.asInstanceOf[js.Dynamic].applyDynamic("readShardFun")(path.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Shard_]]
  }
  
  trait KeyTransform extends StObject {
    
    def convert(key: Key): Key
    
    def invert(key: Key): Key
  }
  object KeyTransform {
    
    inline def apply(convert: Key => Key, invert: Key => Key): KeyTransform = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), invert = js.Any.fromFunction1(invert))
      __obj.asInstanceOf[KeyTransform]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyTransform] (val x: Self) extends AnyVal {
      
      inline def setConvert(value: Key => Key): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
      
      inline def setInvert(value: Key => Key): Self = StObject.set(x, "invert", js.Any.fromFunction1(value))
    }
  }
  
  trait Shard_ extends StObject {
    
    val _padding: String
    
    def fun(s: String): String
    
    var name: String
    
    var param: Double
  }
  object Shard_ {
    
    inline def apply(_padding: String, fun: String => String, name: String, param: Double): Shard_ = {
      val __obj = js.Dynamic.literal(_padding = _padding.asInstanceOf[js.Any], fun = js.Any.fromFunction1(fun), name = name.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shard_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Shard_] (val x: Self) extends AnyVal {
      
      inline def setFun(value: String => String): Self = StObject.set(x, "fun", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParam(value: Double): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def set_padding(value: String): Self = StObject.set(x, "_padding", value.asInstanceOf[js.Any])
    }
  }
}
