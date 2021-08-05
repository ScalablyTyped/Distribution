package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBlobMetadataMod {
  
  trait BlobMetadata extends StObject {
    
    /**
      * <p>The full ID of the blob.</p>
      */
    var blobId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The file mode permissions of the blob. File mode permission codes include:</p> <ul> <li> <p> <code>100644</code> indicates read/write</p> </li> <li> <p> <code>100755</code> indicates read/write/execute</p> </li> <li> <p> <code>160000</code> indicates a submodule</p> </li> <li> <p> <code>120000</code> indicates a symlink</p> </li> </ul>
      */
    var mode: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The path to the blob and any associated file name, if any.</p>
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object BlobMetadata {
    
    inline def apply(): BlobMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlobMetadata]
    }
    
    extension [Self <: BlobMetadata](x: Self) {
      
      inline def setBlobId(value: String): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
      
      inline def setBlobIdUndefined: Self = StObject.set(x, "blobId", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  type UnmarshalledBlobMetadata = BlobMetadata
}
