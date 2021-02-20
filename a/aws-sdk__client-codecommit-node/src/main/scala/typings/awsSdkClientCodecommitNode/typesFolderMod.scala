package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFolderMod {
  
  @js.native
  trait Folder extends StObject {
    
    /**
      * <p>The fully-qualified path of the folder in the repository.</p>
      */
    var absolutePath: js.UndefOr[String] = js.native
    
    /**
      * <p>The relative path of the specified folder from the folder where the query originated.</p>
      */
    var relativePath: js.UndefOr[String] = js.native
    
    /**
      * <p>The full SHA-1 pointer of the tree information for the commit that contains the folder.</p>
      */
    var treeId: js.UndefOr[String] = js.native
  }
  object Folder {
    
    @scala.inline
    def apply(): Folder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Folder]
    }
    
    @scala.inline
    implicit class FolderMutableBuilder[Self <: Folder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
      
      @scala.inline
      def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
      
      @scala.inline
      def setTreeId(value: String): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeIdUndefined: Self = StObject.set(x, "treeId", js.undefined)
    }
  }
  
  type UnmarshalledFolder = Folder
}
