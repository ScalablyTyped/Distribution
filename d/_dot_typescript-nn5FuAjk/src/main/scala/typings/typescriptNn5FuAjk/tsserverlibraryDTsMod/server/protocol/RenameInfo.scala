package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptElementKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the item to be renamed.
  */
/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.RenameInfoSuccess
  - typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.RenameInfoFailure
*/
trait RenameInfo extends StObject
object RenameInfo {
  
  inline def RenameInfoFailure(localizedErrorMessage: String): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.RenameInfoFailure = {
    val __obj = js.Dynamic.literal(canRename = false, localizedErrorMessage = localizedErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.RenameInfoFailure]
  }
  
  inline def RenameInfoSuccess(
    displayName: String,
    fullDisplayName: String,
    kind: ScriptElementKind,
    kindModifiers: String,
    triggerSpan: TextSpan
  ): typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.RenameInfoSuccess = {
    val __obj = js.Dynamic.literal(canRename = true, displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.RenameInfoSuccess]
  }
}
