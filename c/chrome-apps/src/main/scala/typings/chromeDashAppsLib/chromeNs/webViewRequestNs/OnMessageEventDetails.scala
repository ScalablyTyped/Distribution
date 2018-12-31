package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMessageEventDetails extends js.Object {
  /**
    * The value 0 indicates that the request happens in the main frame;
    * a positive value indicates the ID of a subframe in which the request happens.
    * If the document of a (sub-)frame is loaded (type is main_frame or sub_frame),
    * frameId indicates the ID of this frame, not the ID of the outer frame.
    * Frame IDs are unique within a tab.
    */
  var frameId: chromeDashAppsLib.chromeNs.integer
  /** The message sent by the calling script. */
  var message: java.lang.String
  /** Standard HTTP method. */
  var method: java.lang.String
  /** ID of frame that wraps the frame which sent the request. Set to -1 if no parent frame exists. */
  var parentFrameId: chromeDashAppsLib.chromeNs.integer
  /**
    * The ID of the request.
    * Request IDs are unique within a browser session.
    * As a result, they could be used to relate different events of the same request.
    */
  var requestId: java.lang.String
  /** The stage of the network request during which the event was triggered. */
  var stage: Stage
  /** The ID of the tab in which the request takes place. Set to -1 if the request isn't related to a tab. */
  var tabId: chromeDashAppsLib.chromeNs.integer
  /** The time when this signal is triggered, in milliseconds since the epoch. */
  var timeStamp: chromeDashAppsLib.chromeNs.double
  /** How the requested resource will be used. */
  var `type`: chromeDashAppsLib.chromeNs.webRequestNs.ResourceType
  /** URL */
  var url: java.lang.String
}

