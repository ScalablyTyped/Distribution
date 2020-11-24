package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRemoteAccessSessionRequest extends js.Object {
  
  /**
    * Unique identifier for the client. If you want access to multiple devices on the same client, you should pass the same clientId value in each call to CreateRemoteAccessSession. This identifier is required only if remoteDebugEnabled is set to true. Remote debugging is no longer supported.
    */
  var clientId: js.UndefOr[ClientId] = js.native
  
  /**
    * The configuration information for the remote access session request.
    */
  var configuration: js.UndefOr[CreateRemoteAccessSessionConfiguration] = js.native
  
  /**
    * The ARN of the device for which you want to create a remote access session.
    */
  var deviceArn: AmazonResourceName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the device instance for which you want to create a remote access session.
    */
  var instanceArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The interaction mode of the remote access session. Valid values are:   INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You cannot run XCUITest framework-based tests in this mode.   NO_VIDEO: You are connected to the device, but cannot interact with it or view the screen. This mode has the fastest test execution speed. You can run XCUITest framework-based tests in this mode.   VIDEO_ONLY: You can view the screen, but cannot touch or rotate it. You can run XCUITest framework-based tests and watch the screen in this mode.  
    */
  var interactionMode: js.UndefOr[InteractionMode] = js.native
  
  /**
    * The name of the remote access session to create.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
    */
  var projectArn: AmazonResourceName = js.native
  
  /**
    * Set to true if you want to access devices remotely for debugging in your remote access session. Remote debugging is no longer supported.
    */
  var remoteDebugEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the app to be recorded in the remote access session.
    */
  var remoteRecordAppArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * Set to true to enable remote recording for the remote access session.
    */
  var remoteRecordEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information on how Device Farm modifies your uploads during tests, see Do you modify my app? 
    */
  var skipAppResign: js.UndefOr[Boolean] = js.native
  
  /**
    * Ignored. The public key of the ssh key pair you want to use for connecting to remote devices in your remote debugging session. This key is required only if remoteDebugEnabled is set to true. Remote debugging is no longer supported.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.native
}
object CreateRemoteAccessSessionRequest {
  
  @scala.inline
  def apply(deviceArn: AmazonResourceName, projectArn: AmazonResourceName): CreateRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(deviceArn = deviceArn.asInstanceOf[js.Any], projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRemoteAccessSessionRequest]
  }
  
  @scala.inline
  implicit class CreateRemoteAccessSessionRequestOps[Self <: CreateRemoteAccessSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceArn(value: AmazonResourceName): Self = this.set("deviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectArn(value: AmazonResourceName): Self = this.set("projectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: ClientId): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setConfiguration(value: CreateRemoteAccessSessionConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setInstanceArn(value: AmazonResourceName): Self = this.set("instanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceArn: Self = this.set("instanceArn", js.undefined)
    
    @scala.inline
    def setInteractionMode(value: InteractionMode): Self = this.set("interactionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractionMode: Self = this.set("interactionMode", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRemoteDebugEnabled(value: Boolean): Self = this.set("remoteDebugEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteDebugEnabled: Self = this.set("remoteDebugEnabled", js.undefined)
    
    @scala.inline
    def setRemoteRecordAppArn(value: AmazonResourceName): Self = this.set("remoteRecordAppArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteRecordAppArn: Self = this.set("remoteRecordAppArn", js.undefined)
    
    @scala.inline
    def setRemoteRecordEnabled(value: Boolean): Self = this.set("remoteRecordEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteRecordEnabled: Self = this.set("remoteRecordEnabled", js.undefined)
    
    @scala.inline
    def setSkipAppResign(value: Boolean): Self = this.set("skipAppResign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipAppResign: Self = this.set("skipAppResign", js.undefined)
    
    @scala.inline
    def setSshPublicKey(value: SshPublicKey): Self = this.set("sshPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshPublicKey: Self = this.set("sshPublicKey", js.undefined)
  }
}
