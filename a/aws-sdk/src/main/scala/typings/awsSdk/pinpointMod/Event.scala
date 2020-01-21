package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  /**
    * The package name of the app that's recording the event.
    */
  var AppPackageName: js.UndefOr[string] = js.native
  /**
    * The title of the app that's recording the event.
    */
  var AppTitle: js.UndefOr[string] = js.native
  /**
    * The version number of the app that's recording the event.
    */
  var AppVersionCode: js.UndefOr[string] = js.native
  /**
    * One or more custom attributes that are associated with the event.
    */
  var Attributes: js.UndefOr[MapOfString] = js.native
  /**
    * The version of the SDK that's running on the client device.
    */
  var ClientSdkVersion: js.UndefOr[string] = js.native
  /**
    * The name of the event.
    */
  var EventType: string = js.native
  /**
    * One or more custom metrics that are associated with the event.
    */
  var Metrics: js.UndefOr[MapOfDouble] = js.native
  /**
    * The name of the SDK that's being used to record the event.
    */
  var SdkName: js.UndefOr[string] = js.native
  /**
    * Information about the session in which the event occurred.
    */
  var Session: js.UndefOr[typings.awsSdk.pinpointMod.Session] = js.native
  /**
    * The date and time, in ISO 8601 format, when the event occurred.
    */
  var Timestamp: string = js.native
}

object Event {
  @scala.inline
  def apply(
    EventType: string,
    Timestamp: string,
    AppPackageName: string = null,
    AppTitle: string = null,
    AppVersionCode: string = null,
    Attributes: MapOfString = null,
    ClientSdkVersion: string = null,
    Metrics: MapOfDouble = null,
    SdkName: string = null,
    Session: Session = null
  ): Event = {
    val __obj = js.Dynamic.literal(EventType = EventType.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    if (AppPackageName != null) __obj.updateDynamic("AppPackageName")(AppPackageName.asInstanceOf[js.Any])
    if (AppTitle != null) __obj.updateDynamic("AppTitle")(AppTitle.asInstanceOf[js.Any])
    if (AppVersionCode != null) __obj.updateDynamic("AppVersionCode")(AppVersionCode.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (ClientSdkVersion != null) __obj.updateDynamic("ClientSdkVersion")(ClientSdkVersion.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (SdkName != null) __obj.updateDynamic("SdkName")(SdkName.asInstanceOf[js.Any])
    if (Session != null) __obj.updateDynamic("Session")(Session.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

