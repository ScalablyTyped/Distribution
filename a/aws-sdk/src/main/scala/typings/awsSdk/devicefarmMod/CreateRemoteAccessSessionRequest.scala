package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRemoteAccessSessionRequest extends StObject {
  
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
  implicit class CreateRemoteAccessSessionRequestMutableBuilder[Self <: CreateRemoteAccessSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setConfiguration(value: CreateRemoteAccessSessionConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setDeviceArn(value: AmazonResourceName): Self = StObject.set(x, "deviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceArn(value: AmazonResourceName): Self = StObject.set(x, "instanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceArnUndefined: Self = StObject.set(x, "instanceArn", js.undefined)
    
    @scala.inline
    def setInteractionMode(value: InteractionMode): Self = StObject.set(x, "interactionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionModeUndefined: Self = StObject.set(x, "interactionMode", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProjectArn(value: AmazonResourceName): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteDebugEnabled(value: Boolean): Self = StObject.set(x, "remoteDebugEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteDebugEnabledUndefined: Self = StObject.set(x, "remoteDebugEnabled", js.undefined)
    
    @scala.inline
    def setRemoteRecordAppArn(value: AmazonResourceName): Self = StObject.set(x, "remoteRecordAppArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteRecordAppArnUndefined: Self = StObject.set(x, "remoteRecordAppArn", js.undefined)
    
    @scala.inline
    def setRemoteRecordEnabled(value: Boolean): Self = StObject.set(x, "remoteRecordEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteRecordEnabledUndefined: Self = StObject.set(x, "remoteRecordEnabled", js.undefined)
    
    @scala.inline
    def setSkipAppResign(value: Boolean): Self = StObject.set(x, "skipAppResign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipAppResignUndefined: Self = StObject.set(x, "skipAppResign", js.undefined)
    
    @scala.inline
    def setSshPublicKey(value: SshPublicKey): Self = StObject.set(x, "sshPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeyUndefined: Self = StObject.set(x, "sshPublicKey", js.undefined)
  }
}
