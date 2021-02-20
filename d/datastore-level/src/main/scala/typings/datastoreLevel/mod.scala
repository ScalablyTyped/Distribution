package typings.datastoreLevel

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.abstractLeveldown.mod.AbstractBatch
import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.interfaceDatastore.mod.Adapter
import typings.interfaceDatastore.mod.Batch
import typings.levelup.mod.LevelUp
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("datastore-level", JSImport.Namespace)
  @js.native
  val ^ : LevelDatastoreConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("datastore-level", JSImport.Namespace)
  @js.native
  class Class protected () extends LevelDatastore[Buffer] {
    def this(path: String) = this()
    def this(path: String, options: LevelDatastoreOptions) = this()
  }
  
  /**
    * A datastore backed by leveldb.
    */
  @js.native
  trait LevelDatastore[Value] extends Adapter[Value] {
    
    var db: LevelUp[AbstractLevelDOWN[String, Value], AbstractIterator[String, Value]] = js.native
  }
  
  @js.native
  trait LevelDatastoreBatch[Value] extends Batch[Value] {
    
    var ops: js.Array[AbstractBatch[String, Value]] = js.native
  }
  
  @js.native
  trait LevelDatastoreConstructor
    extends Instantiable1[/* path */ String, LevelDatastore[Buffer]]
       with Instantiable2[/* path */ String, /* options */ LevelDatastoreOptions, LevelDatastore[Buffer]] {
    
    def apply(path: String): LevelDatastore[Buffer] = js.native
    def apply(path: String, options: LevelDatastoreOptions): LevelDatastore[Buffer] = js.native
  }
  
  @js.native
  trait LevelDatastoreOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var db: js.UndefOr[
        js.Function2[
          /* location */ String, 
          /* options */ js.UndefOr[js.Any], 
          LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]
        ]
      ] = js.native
  }
  object LevelDatastoreOptions {
    
    @scala.inline
    def apply(): LevelDatastoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDatastoreOptions]
    }
    
    @scala.inline
    implicit class LevelDatastoreOptionsMutableBuilder[Self <: LevelDatastoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDb(
        value: (/* location */ String, /* options */ js.UndefOr[js.Any]) => LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]
      ): Self = StObject.set(x, "db", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
    }
  }
  
  type _To = LevelDatastoreConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: LevelDatastoreConstructor = ^
}
