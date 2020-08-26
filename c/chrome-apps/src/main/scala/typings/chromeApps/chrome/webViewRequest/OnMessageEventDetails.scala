package typings.chromeApps.chrome.webViewRequest

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import typings.chromeApps.chrome.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnMessageEventDetails extends js.Object {
  /**
    * The value 0 indicates that the request happens in the main frame;
    * a positive value indicates the ID of a subframe in which the request happens.
    * If the document of a (sub-)frame is loaded (type is main_frame or sub_frame),
    * frameId indicates the ID of this frame, not the ID of the outer frame.
    * Frame IDs are unique within a tab.
    */
  var frameId: integer = js.native
  /** The message sent by the calling script. */
  var message: String = js.native
  /** Standard HTTP method. */
  var method: String = js.native
  /** ID of frame that wraps the frame which sent the request. Set to -1 if no parent frame exists. */
  var parentFrameId: integer = js.native
  /**
    * The ID of the request.
    * Request IDs are unique within a browser session.
    * As a result, they could be used to relate different events of the same request.
    */
  var requestId: String = js.native
  /** The stage of the network request during which the event was triggered. */
  var stage: Stage = js.native
  /** The ID of the tab in which the request takes place. Set to -1 if the request isn't related to a tab. */
  var tabId: integer = js.native
  /** The time when this signal is triggered, in milliseconds since the epoch. */
  var timeStamp: double = js.native
  /** How the requested resource will be used. */
  var `type`: ResourceType = js.native
  /** URL */
  var url: String = js.native
}

object OnMessageEventDetails {
  @scala.inline
  def apply(
    frameId: integer,
    message: String,
    method: String,
    parentFrameId: integer,
    requestId: String,
    stage: Stage,
    tabId: integer,
    timeStamp: double,
    `type`: ResourceType,
    url: String
  ): OnMessageEventDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMessageEventDetails]
  }
  @scala.inline
  implicit class OnMessageEventDetailsOps[Self <: OnMessageEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFrameId(value: integer): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentFrameId(value: integer): Self = this.set("parentFrameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStage(value: Stage): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabId(value: integer): Self = this.set("tabId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ResourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

