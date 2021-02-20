package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteAccessSession extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the remote access session.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The billing method of the remote access session. Possible values include METERED or UNMETERED. For more information about metered devices, see AWS Device Farm terminology.
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.native
  
  /**
    * Unique identifier of your client for the remote access session. Only returned if remote debugging is enabled for the remote access session. Remote debugging is no longer supported.
    */
  var clientId: js.UndefOr[ClientId] = js.native
  
  /**
    * The date and time the remote access session was created.
    */
  var created: js.UndefOr[DateTime] = js.native
  
  /**
    * The device (phone or tablet) used in the remote access session.
    */
  var device: js.UndefOr[Device] = js.native
  
  /**
    * The number of minutes a device is used in a remote access session (including setup and teardown minutes).
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.native
  
  /**
    * Unique device identifier for the remote device. Only returned if remote debugging is enabled for the remote access session. Remote debugging is no longer supported.
    */
  var deviceUdid: js.UndefOr[String] = js.native
  
  /**
    * The endpoint for the remote access sesssion.
    */
  var endpoint: js.UndefOr[String] = js.native
  
  /**
    * IP address of the EC2 host where you need to connect to remotely debug devices. Only returned if remote debugging is enabled for the remote access session. Remote debugging is no longer supported.
    */
  var hostAddress: js.UndefOr[HostAddress] = js.native
  
  /**
    * The ARN of the instance.
    */
  var instanceArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The interaction mode of the remote access session. Valid values are:   INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You cannot run XCUITest framework-based tests in this mode.   NO_VIDEO: You are connected to the device, but cannot interact with it or view the screen. This mode has the fastest test execution speed. You can run XCUITest framework-based tests in this mode.   VIDEO_ONLY: You can view the screen, but cannot touch or rotate it. You can run XCUITest framework-based tests and watch the screen in this mode.  
    */
  var interactionMode: js.UndefOr[InteractionMode] = js.native
  
  /**
    * A message about the remote access session.
    */
  var message: js.UndefOr[Message] = js.native
  
  /**
    * The name of the remote access session.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * This flag is set to true if remote debugging is enabled for the remote access session. Remote debugging is no longer supported.
    */
  var remoteDebugEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The ARN for the app to be recorded in the remote access session.
    */
  var remoteRecordAppArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * This flag is set to true if remote recording is enabled for the remote access session.
    */
  var remoteRecordEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The result of the remote access session. Can be any of the following:   PENDING.   PASSED.   WARNED.   FAILED.   SKIPPED.   ERRORED.   STOPPED.  
    */
  var result: js.UndefOr[ExecutionResult] = js.native
  
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information about how Device Farm re-signs your apps, see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.native
  
  /**
    * The date and time the remote access session was started.
    */
  var started: js.UndefOr[DateTime] = js.native
  
  /**
    * The status of the remote access session. Can be any of the following:   PENDING.   PENDING_CONCURRENCY.   PENDING_DEVICE.   PROCESSING.   SCHEDULING.   PREPARING.   RUNNING.   COMPLETED.   STOPPING.  
    */
  var status: js.UndefOr[ExecutionStatus] = js.native
  
  /**
    * The date and time the remote access session was stopped.
    */
  var stopped: js.UndefOr[DateTime] = js.native
}
object RemoteAccessSession {
  
  @scala.inline
  def apply(): RemoteAccessSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteAccessSession]
  }
  
  @scala.inline
  implicit class RemoteAccessSessionMutableBuilder[Self <: RemoteAccessSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setBillingMethod(value: BillingMethod): Self = StObject.set(x, "billingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingMethodUndefined: Self = StObject.set(x, "billingMethod", js.undefined)
    
    @scala.inline
    def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setCreated(value: DateTime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMinutes(value: DeviceMinutes): Self = StObject.set(x, "deviceMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMinutesUndefined: Self = StObject.set(x, "deviceMinutes", js.undefined)
    
    @scala.inline
    def setDeviceUdid(value: String): Self = StObject.set(x, "deviceUdid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUdidUndefined: Self = StObject.set(x, "deviceUdid", js.undefined)
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setHostAddress(value: HostAddress): Self = StObject.set(x, "hostAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostAddressUndefined: Self = StObject.set(x, "hostAddress", js.undefined)
    
    @scala.inline
    def setInstanceArn(value: AmazonResourceName): Self = StObject.set(x, "instanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceArnUndefined: Self = StObject.set(x, "instanceArn", js.undefined)
    
    @scala.inline
    def setInteractionMode(value: InteractionMode): Self = StObject.set(x, "interactionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionModeUndefined: Self = StObject.set(x, "interactionMode", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
    def setResult(value: ExecutionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setSkipAppResign(value: SkipAppResign): Self = StObject.set(x, "skipAppResign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipAppResignUndefined: Self = StObject.set(x, "skipAppResign", js.undefined)
    
    @scala.inline
    def setStarted(value: DateTime): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    @scala.inline
    def setStatus(value: ExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStopped(value: DateTime): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoppedUndefined: Self = StObject.set(x, "stopped", js.undefined)
  }
}
