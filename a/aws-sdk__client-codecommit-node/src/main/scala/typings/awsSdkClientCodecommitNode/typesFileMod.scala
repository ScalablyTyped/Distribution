package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EXECUTABLE
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NORMAL
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SYMLINK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFileMod {
  
  trait File extends StObject {
    
    /**
      * <p>The fully-qualified path to the file in the repository.</p>
      */
    var absolutePath: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The blob ID that contains the file information.</p>
      */
    var blobId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.</p>
      */
    var fileMode: js.UndefOr[EXECUTABLE | NORMAL | SYMLINK | String] = js.undefined
    
    /**
      * <p>The relative path of the file from the folder where the query originated.</p>
      */
    var relativePath: js.UndefOr[String] = js.undefined
  }
  object File {
    
    inline def apply(): File = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      inline def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
      
      inline def setBlobId(value: String): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
      
      inline def setBlobIdUndefined: Self = StObject.set(x, "blobId", js.undefined)
      
      inline def setFileMode(value: EXECUTABLE | NORMAL | SYMLINK | String): Self = StObject.set(x, "fileMode", value.asInstanceOf[js.Any])
      
      inline def setFileModeUndefined: Self = StObject.set(x, "fileMode", js.undefined)
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    }
  }
  
  type UnmarshalledFile = File
}
