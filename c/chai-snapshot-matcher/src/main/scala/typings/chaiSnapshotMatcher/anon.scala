package typings.chaiSnapshotMatcher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Folder extends StObject {
    
    var folder: js.UndefOr[String] = js.undefined
    
    var hint: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var snapshotPath: js.UndefOr[String] = js.undefined
  }
  object Folder {
    
    inline def apply(): Folder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Folder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Folder] (val x: Self) extends AnyVal {
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSnapshotPath(value: String): Self = StObject.set(x, "snapshotPath", value.asInstanceOf[js.Any])
      
      inline def setSnapshotPathUndefined: Self = StObject.set(x, "snapshotPath", js.undefined)
    }
  }
}
