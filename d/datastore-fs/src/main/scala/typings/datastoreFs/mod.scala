package typings.datastoreFs

import typings.datastoreCore.mod.BaseDatastore
import typings.datastoreFs.anon.Dir
import typings.interfaceDatastore.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("datastore-fs", "FsDatastore")
  @js.native
  open class FsDatastore protected () extends BaseDatastore {
    def this(location: String) = this()
    def this(location: String, init: FsDatastoreInit) = this()
    
    /**
      * Calculate the original key, given the file name.
      */
    def _decode(file: String): Key = js.native
    
    /**
      * Calculate the directory and file name for a given key.
      */
    def _encode(key: Key): Dir = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    /* private */ val createIfMissing: Any = js.native
    
    /* private */ val deleteManyConcurrency: Any = js.native
    
    /* private */ val errorIfExists: Any = js.native
    
    /* private */ val `extension`: Any = js.native
    
    /* private */ val getManyConcurrency: Any = js.native
    
    def open(): js.Promise[Unit] = js.native
    
    var path: String = js.native
    
    /* private */ val putManyConcurrency: Any = js.native
  }
  
  trait FsDatastoreInit extends StObject {
    
    var createIfMissing: js.UndefOr[Boolean] = js.undefined
    
    var deleteManyConcurrency: js.UndefOr[Double] = js.undefined
    
    var errorIfExists: js.UndefOr[Boolean] = js.undefined
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var getManyConcurrency: js.UndefOr[Double] = js.undefined
    
    var putManyConcurrency: js.UndefOr[Double] = js.undefined
  }
  object FsDatastoreInit {
    
    inline def apply(): FsDatastoreInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FsDatastoreInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FsDatastoreInit] (val x: Self) extends AnyVal {
      
      inline def setCreateIfMissing(value: Boolean): Self = StObject.set(x, "createIfMissing", value.asInstanceOf[js.Any])
      
      inline def setCreateIfMissingUndefined: Self = StObject.set(x, "createIfMissing", js.undefined)
      
      inline def setDeleteManyConcurrency(value: Double): Self = StObject.set(x, "deleteManyConcurrency", value.asInstanceOf[js.Any])
      
      inline def setDeleteManyConcurrencyUndefined: Self = StObject.set(x, "deleteManyConcurrency", js.undefined)
      
      inline def setErrorIfExists(value: Boolean): Self = StObject.set(x, "errorIfExists", value.asInstanceOf[js.Any])
      
      inline def setErrorIfExistsUndefined: Self = StObject.set(x, "errorIfExists", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setGetManyConcurrency(value: Double): Self = StObject.set(x, "getManyConcurrency", value.asInstanceOf[js.Any])
      
      inline def setGetManyConcurrencyUndefined: Self = StObject.set(x, "getManyConcurrency", js.undefined)
      
      inline def setPutManyConcurrency(value: Double): Self = StObject.set(x, "putManyConcurrency", value.asInstanceOf[js.Any])
      
      inline def setPutManyConcurrencyUndefined: Self = StObject.set(x, "putManyConcurrency", js.undefined)
    }
  }
}
