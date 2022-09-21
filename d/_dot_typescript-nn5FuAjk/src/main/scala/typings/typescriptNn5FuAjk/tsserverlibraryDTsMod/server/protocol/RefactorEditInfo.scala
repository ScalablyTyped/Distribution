package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefactorEditInfo extends StObject {
  
  var edits: Array[FileCodeEdits]
  
  var renameFilename: js.UndefOr[String] = js.undefined
  
  /**
    * An optional location where the editor should start a rename operation once
    * the refactoring edits have been applied
    */
  var renameLocation: js.UndefOr[Location] = js.undefined
}
object RefactorEditInfo {
  
  inline def apply(edits: Array[FileCodeEdits]): RefactorEditInfo = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefactorEditInfo]
  }
  
  extension [Self <: RefactorEditInfo](x: Self) {
    
    inline def setEdits(value: Array[FileCodeEdits]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
    
    inline def setRenameFilename(value: String): Self = StObject.set(x, "renameFilename", value.asInstanceOf[js.Any])
    
    inline def setRenameFilenameUndefined: Self = StObject.set(x, "renameFilename", js.undefined)
    
    inline def setRenameLocation(value: Location): Self = StObject.set(x, "renameLocation", value.asInstanceOf[js.Any])
    
    inline def setRenameLocationUndefined: Self = StObject.set(x, "renameLocation", js.undefined)
  }
}
