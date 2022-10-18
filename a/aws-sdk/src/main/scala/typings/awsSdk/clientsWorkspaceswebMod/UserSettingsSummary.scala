package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSettingsSummary extends StObject {
  
  /**
    * Specifies whether the user can copy text from the streaming session to the local device.
    */
  var copyAllowed: js.UndefOr[EnabledType] = js.undefined
  
  /**
    * The amount of time that a streaming session remains active after users disconnect.
    */
  var disconnectTimeoutInMinutes: js.UndefOr[DisconnectTimeoutInMinutes] = js.undefined
  
  /**
    * Specifies whether the user can download files from the streaming session to the local device.
    */
  var downloadAllowed: js.UndefOr[EnabledType] = js.undefined
  
  /**
    * The amount of time that users can be idle (inactive) before they are disconnected from their streaming session and the disconnect timeout interval begins.
    */
  var idleDisconnectTimeoutInMinutes: js.UndefOr[IdleDisconnectTimeoutInMinutes] = js.undefined
  
  /**
    * Specifies whether the user can paste text from the local device to the streaming session.
    */
  var pasteAllowed: js.UndefOr[EnabledType] = js.undefined
  
  /**
    * Specifies whether the user can print to the local device.
    */
  var printAllowed: js.UndefOr[EnabledType] = js.undefined
  
  /**
    * Specifies whether the user can upload files from the local device to the streaming session.
    */
  var uploadAllowed: js.UndefOr[EnabledType] = js.undefined
  
  /**
    * The ARN of the user settings.
    */
  var userSettingsArn: js.UndefOr[ARN] = js.undefined
}
object UserSettingsSummary {
  
  inline def apply(): UserSettingsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSettingsSummary]
  }
  
  extension [Self <: UserSettingsSummary](x: Self) {
    
    inline def setCopyAllowed(value: EnabledType): Self = StObject.set(x, "copyAllowed", value.asInstanceOf[js.Any])
    
    inline def setCopyAllowedUndefined: Self = StObject.set(x, "copyAllowed", js.undefined)
    
    inline def setDisconnectTimeoutInMinutes(value: DisconnectTimeoutInMinutes): Self = StObject.set(x, "disconnectTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setDisconnectTimeoutInMinutesUndefined: Self = StObject.set(x, "disconnectTimeoutInMinutes", js.undefined)
    
    inline def setDownloadAllowed(value: EnabledType): Self = StObject.set(x, "downloadAllowed", value.asInstanceOf[js.Any])
    
    inline def setDownloadAllowedUndefined: Self = StObject.set(x, "downloadAllowed", js.undefined)
    
    inline def setIdleDisconnectTimeoutInMinutes(value: IdleDisconnectTimeoutInMinutes): Self = StObject.set(x, "idleDisconnectTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setIdleDisconnectTimeoutInMinutesUndefined: Self = StObject.set(x, "idleDisconnectTimeoutInMinutes", js.undefined)
    
    inline def setPasteAllowed(value: EnabledType): Self = StObject.set(x, "pasteAllowed", value.asInstanceOf[js.Any])
    
    inline def setPasteAllowedUndefined: Self = StObject.set(x, "pasteAllowed", js.undefined)
    
    inline def setPrintAllowed(value: EnabledType): Self = StObject.set(x, "printAllowed", value.asInstanceOf[js.Any])
    
    inline def setPrintAllowedUndefined: Self = StObject.set(x, "printAllowed", js.undefined)
    
    inline def setUploadAllowed(value: EnabledType): Self = StObject.set(x, "uploadAllowed", value.asInstanceOf[js.Any])
    
    inline def setUploadAllowedUndefined: Self = StObject.set(x, "uploadAllowed", js.undefined)
    
    inline def setUserSettingsArn(value: ARN): Self = StObject.set(x, "userSettingsArn", value.asInstanceOf[js.Any])
    
    inline def setUserSettingsArnUndefined: Self = StObject.set(x, "userSettingsArn", js.undefined)
  }
}
