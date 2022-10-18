package typings.datastoreFs

import typings.datastoreCore.mod.BaseDatastore
import typings.datastoreFs.anon.CreateIfMissing
import typings.datastoreFs.anon.DeleteManyConcurrency
import typings.interfaceDatastore.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("datastore-fs", "FsDatastore")
  @js.native
  open class FsDatastore protected () extends BaseDatastore {
    /**
      * @param {string} location
      * @param {{ createIfMissing?: boolean, errorIfExists?: boolean, extension?: string, putManyConcurrency?: number } | undefined} [opts]
      */
    def this(location: String) = this()
    def this(location: String, opts: CreateIfMissing) = this()
    
    /**
      * Calculate the original key, given the file name.
      *
      * @private
      * @param {string} file
      * @returns {Key}
      */
    /* private */ var _decode: Any = js.native
    
    /**
      * Calculate the directory and file name for a given key.
      *
      * @private
      * @param {Key} key
      * @returns {{dir:string, file:string}}
      */
    /* private */ var _encode: Any = js.native
    
    /**
      * Read from the file system without extension.
      *
      * @param {Key} key
      * @returns {Promise<Uint8Array>}
      */
    def getRaw(key: Key): js.Promise[js.typedarray.Uint8Array] = js.native
    
    var opts: DeleteManyConcurrency = js.native
    
    var path: String = js.native
    
    /**
      * Write to the file system without extension.
      *
      * @param {Key} key
      * @param {Uint8Array} val
      * @returns {Promise<void>}
      */
    def putRaw(key: Key, `val`: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  }
  
  type AwaitIterable[TEntry] = typings.interfaceStore.mod.AwaitIterable[TEntry]
  
  type Datastore = typings.interfaceDatastore.mod.Datastore
  
  type KeyQuery = typings.interfaceDatastore.mod.KeyQuery
  
  type Pair = typings.interfaceDatastore.mod.Pair
  
  type Query = typings.interfaceDatastore.mod.Query
}
