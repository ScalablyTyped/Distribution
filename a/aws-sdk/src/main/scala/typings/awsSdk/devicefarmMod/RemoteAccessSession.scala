package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteAccessSession extends js.Object {
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
  implicit class RemoteAccessSessionOps[Self <: RemoteAccessSession] (val x: Self) extends AnyVal {
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
    def setArn(value: AmazonResourceName): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setBillingMethod(value: BillingMethod): Self = this.set("billingMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingMethod: Self = this.set("billingMethod", js.undefined)
    @scala.inline
    def setClientId(value: ClientId): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setCreated(value: DateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDevice(value: Device): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    @scala.inline
    def setDeviceMinutes(value: DeviceMinutes): Self = this.set("deviceMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceMinutes: Self = this.set("deviceMinutes", js.undefined)
    @scala.inline
    def setDeviceUdid(value: String): Self = this.set("deviceUdid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceUdid: Self = this.set("deviceUdid", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setHostAddress(value: HostAddress): Self = this.set("hostAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostAddress: Self = this.set("hostAddress", js.undefined)
    @scala.inline
    def setInstanceArn(value: AmazonResourceName): Self = this.set("instanceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceArn: Self = this.set("instanceArn", js.undefined)
    @scala.inline
    def setInteractionMode(value: InteractionMode): Self = this.set("interactionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractionMode: Self = this.set("interactionMode", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
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
    def setResult(value: ExecutionResult): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setSkipAppResign(value: SkipAppResign): Self = this.set("skipAppResign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipAppResign: Self = this.set("skipAppResign", js.undefined)
    @scala.inline
    def setStarted(value: DateTime): Self = this.set("started", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarted: Self = this.set("started", js.undefined)
    @scala.inline
    def setStatus(value: ExecutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStopped(value: DateTime): Self = this.set("stopped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopped: Self = this.set("stopped", js.undefined)
  }
  
}

