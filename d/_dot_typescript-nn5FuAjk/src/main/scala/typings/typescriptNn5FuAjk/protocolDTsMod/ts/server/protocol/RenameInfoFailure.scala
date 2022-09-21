package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameInfoFailure
  extends StObject
     with RenameInfo {
  
  var canRename: `false`
  
  /**
    * Error message if item can not be renamed.
    */
  var localizedErrorMessage: String
}
object RenameInfoFailure {
  
  inline def apply(localizedErrorMessage: String): RenameInfoFailure = {
    val __obj = js.Dynamic.literal(canRename = false, localizedErrorMessage = localizedErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameInfoFailure]
  }
  
  extension [Self <: RenameInfoFailure](x: Self) {
    
    inline def setCanRename(value: `false`): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
    
    inline def setLocalizedErrorMessage(value: String): Self = StObject.set(x, "localizedErrorMessage", value.asInstanceOf[js.Any])
  }
}
