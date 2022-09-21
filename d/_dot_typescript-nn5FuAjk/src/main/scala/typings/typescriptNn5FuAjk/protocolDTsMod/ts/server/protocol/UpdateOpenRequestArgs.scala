package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments to UpdateOpenRequest
  */
trait UpdateOpenRequestArgs extends StObject {
  
  /**
    * List of open files files that were changes
    */
  var changedFiles: js.UndefOr[Array[FileCodeEdits]] = js.undefined
  
  /**
    * List of files that were closed
    */
  var closedFiles: js.UndefOr[Array[String]] = js.undefined
  
  /**
    * List of newly open files
    */
  var openFiles: js.UndefOr[Array[OpenRequestArgs]] = js.undefined
}
object UpdateOpenRequestArgs {
  
  inline def apply(): UpdateOpenRequestArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOpenRequestArgs]
  }
  
  extension [Self <: UpdateOpenRequestArgs](x: Self) {
    
    inline def setChangedFiles(value: Array[FileCodeEdits]): Self = StObject.set(x, "changedFiles", value.asInstanceOf[js.Any])
    
    inline def setChangedFilesUndefined: Self = StObject.set(x, "changedFiles", js.undefined)
    
    inline def setClosedFiles(value: Array[String]): Self = StObject.set(x, "closedFiles", value.asInstanceOf[js.Any])
    
    inline def setClosedFilesUndefined: Self = StObject.set(x, "closedFiles", js.undefined)
    
    inline def setOpenFiles(value: Array[OpenRequestArgs]): Self = StObject.set(x, "openFiles", value.asInstanceOf[js.Any])
    
    inline def setOpenFilesUndefined: Self = StObject.set(x, "openFiles", js.undefined)
  }
}
