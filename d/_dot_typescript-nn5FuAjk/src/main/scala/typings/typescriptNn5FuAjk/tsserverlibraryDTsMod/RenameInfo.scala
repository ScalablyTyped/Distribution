package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.RenameInfoSuccess
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.RenameInfoFailure
*/
trait RenameInfo extends StObject
object RenameInfo {
  
  inline def RenameInfoFailure(localizedErrorMessage: java.lang.String): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.RenameInfoFailure = {
    val __obj = js.Dynamic.literal(canRename = false, localizedErrorMessage = localizedErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.RenameInfoFailure]
  }
  
  inline def RenameInfoSuccess(
    displayName: java.lang.String,
    fullDisplayName: java.lang.String,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    triggerSpan: TextSpan
  ): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.RenameInfoSuccess = {
    val __obj = js.Dynamic.literal(canRename = true, displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.RenameInfoSuccess]
  }
}
