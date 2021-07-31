package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EXECUTABLE
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NORMAL
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SYMLINK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSymbolicLinkMod {
  
  trait SymbolicLink extends StObject {
    
    /**
      * <p>The fully-qualified path to the folder that contains the symbolic link.</p>
      */
    var absolutePath: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The blob ID that contains the information about the symbolic link.</p>
      */
    var blobId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The file mode permissions of the blob that cotains information about the symbolic link.</p>
      */
    var fileMode: js.UndefOr[EXECUTABLE | NORMAL | SYMLINK | String] = js.undefined
    
    /**
      * <p>The relative path of the symbolic link from the folder where the query originated.</p>
      */
    var relativePath: js.UndefOr[String] = js.undefined
  }
  object SymbolicLink {
    
    @scala.inline
    def apply(): SymbolicLink = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SymbolicLink]
    }
    
    @scala.inline
    implicit class SymbolicLinkMutableBuilder[Self <: SymbolicLink] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
      
      @scala.inline
      def setBlobId(value: String): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlobIdUndefined: Self = StObject.set(x, "blobId", js.undefined)
      
      @scala.inline
      def setFileMode(value: EXECUTABLE | NORMAL | SYMLINK | String): Self = StObject.set(x, "fileMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileModeUndefined: Self = StObject.set(x, "fileMode", js.undefined)
      
      @scala.inline
      def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    }
  }
  
  type UnmarshalledSymbolicLink = SymbolicLink
}
