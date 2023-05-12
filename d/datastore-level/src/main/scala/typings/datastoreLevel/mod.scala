package typings.datastoreLevel

import typings.datastoreCore.mod.BaseDatastore
import typings.datastoreLevel.anon.Prefix
import typings.interfaceDatastore.mod.Pair
import typings.level.mod.DatabaseOptions
import typings.level.mod.Level
import typings.level.mod.OpenOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("datastore-level", "LevelDatastore")
  @js.native
  open class LevelDatastore protected () extends BaseDatastore {
    def this(path: String) = this()
    def this(path: Level[String, js.typedarray.Uint8Array]) = this()
    def this(path: String, opts: (DatabaseOptions[String, js.typedarray.Uint8Array]) & OpenOptions) = this()
    def this(
      path: Level[String, js.typedarray.Uint8Array],
      opts: (DatabaseOptions[String, js.typedarray.Uint8Array]) & OpenOptions
    ) = this()
    
    def _query(opts: Prefix): AsyncIterable[Pair] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    var db: Level[String, js.typedarray.Uint8Array] = js.native
    
    def open(): js.Promise[Unit] = js.native
    
    /* private */ val opts: Any = js.native
  }
}
