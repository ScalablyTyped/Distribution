package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartContactRecordingRequest extends StObject {
  
  /**
    * The identifier of the contact.
    */
  var ContactId: typings.awsSdk.connectMod.ContactId = js.native
  
  /**
    * The identifier of the contact. This is the identifier of the contact associated with the first interaction with the contact center.
    */
  var InitialContactId: ContactId = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * Who is being recorded.
    */
  var VoiceRecordingConfiguration: typings.awsSdk.connectMod.VoiceRecordingConfiguration = js.native
}
object StartContactRecordingRequest {
  
  @scala.inline
  def apply(
    ContactId: ContactId,
    InitialContactId: ContactId,
    InstanceId: InstanceId,
    VoiceRecordingConfiguration: VoiceRecordingConfiguration
  ): StartContactRecordingRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], InitialContactId = InitialContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], VoiceRecordingConfiguration = VoiceRecordingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartContactRecordingRequest]
  }
  
  @scala.inline
  implicit class StartContactRecordingRequestMutableBuilder[Self <: StartContactRecordingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialContactId(value: ContactId): Self = StObject.set(x, "InitialContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceRecordingConfiguration(value: VoiceRecordingConfiguration): Self = StObject.set(x, "VoiceRecordingConfiguration", value.asInstanceOf[js.Any])
  }
}
