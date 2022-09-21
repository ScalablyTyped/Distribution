package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Note: Paths may also be directories. */
trait GetEditsForFileRenameRequestArgs extends StObject {
  
  val newFilePath: String
  
  val oldFilePath: String
}
object GetEditsForFileRenameRequestArgs {
  
  inline def apply(newFilePath: String, oldFilePath: String): GetEditsForFileRenameRequestArgs = {
    val __obj = js.Dynamic.literal(newFilePath = newFilePath.asInstanceOf[js.Any], oldFilePath = oldFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEditsForFileRenameRequestArgs]
  }
  
  extension [Self <: GetEditsForFileRenameRequestArgs](x: Self) {
    
    inline def setNewFilePath(value: String): Self = StObject.set(x, "newFilePath", value.asInstanceOf[js.Any])
    
    inline def setOldFilePath(value: String): Self = StObject.set(x, "oldFilePath", value.asInstanceOf[js.Any])
  }
}
