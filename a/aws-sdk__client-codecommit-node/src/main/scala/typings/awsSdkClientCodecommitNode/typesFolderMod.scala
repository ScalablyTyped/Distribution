package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFolderMod {
  
  trait Folder extends StObject {
    
    /**
      * <p>The fully-qualified path of the folder in the repository.</p>
      */
    var absolutePath: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The relative path of the specified folder from the folder where the query originated.</p>
      */
    var relativePath: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The full SHA-1 pointer of the tree information for the commit that contains the folder.</p>
      */
    var treeId: js.UndefOr[String] = js.undefined
  }
  object Folder {
    
    inline def apply(): Folder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Folder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Folder] (val x: Self) extends AnyVal {
      
      inline def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
      
      inline def setTreeId(value: String): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
      
      inline def setTreeIdUndefined: Self = StObject.set(x, "treeId", js.undefined)
    }
  }
  
  type UnmarshalledFolder = Folder
}
