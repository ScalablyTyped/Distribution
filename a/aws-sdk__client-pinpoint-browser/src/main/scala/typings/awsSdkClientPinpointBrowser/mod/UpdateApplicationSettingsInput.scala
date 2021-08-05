package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesWriteApplicationSettingsRequestMod.WriteApplicationSettingsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationSettingsInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesUpdateApplicationSettingsInputMod.UpdateApplicationSettingsInput
object UpdateApplicationSettingsInput {
  
  inline def apply(ApplicationId: String, WriteApplicationSettingsRequest: WriteApplicationSettingsRequest): UpdateApplicationSettingsInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], WriteApplicationSettingsRequest = WriteApplicationSettingsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationSettingsInput]
  }
}
