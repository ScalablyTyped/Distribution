package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameInfoSuccess
  extends StObject
     with RenameInfo {
  
  /**
    * True if item can be renamed.
    */
  var canRename: `true`
  
  /**
    * Display name of the item to be renamed.
    */
  var displayName: String
  
  /**
    * File or directory to rename.
    * If set, `getEditsForFileRename` should be called instead of `findRenameLocations`.
    */
  var fileToRename: js.UndefOr[String] = js.undefined
  
  /**
    * Full display name of item to be renamed.
    */
  var fullDisplayName: String
  
  /**
    * The items's kind (such as 'className' or 'parameterName' or plain 'text').
    */
  var kind: ScriptElementKind
  
  /**
    * Optional modifiers for the kind (such as 'public').
    */
  var kindModifiers: String
  
  /** Span of text to rename. */
  var triggerSpan: TextSpan
}
object RenameInfoSuccess {
  
  inline def apply(
    displayName: String,
    fullDisplayName: String,
    kind: ScriptElementKind,
    kindModifiers: String,
    triggerSpan: TextSpan
  ): RenameInfoSuccess = {
    val __obj = js.Dynamic.literal(canRename = true, displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameInfoSuccess]
  }
  
  extension [Self <: RenameInfoSuccess](x: Self) {
    
    inline def setCanRename(value: `true`): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setFileToRename(value: String): Self = StObject.set(x, "fileToRename", value.asInstanceOf[js.Any])
    
    inline def setFileToRenameUndefined: Self = StObject.set(x, "fileToRename", js.undefined)
    
    inline def setFullDisplayName(value: String): Self = StObject.set(x, "fullDisplayName", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindModifiers(value: String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    inline def setTriggerSpan(value: TextSpan): Self = StObject.set(x, "triggerSpan", value.asInstanceOf[js.Any])
  }
}
