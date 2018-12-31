package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioMixinOptions extends js.Object {
  /**
    * Defines the Radio channel that will be used for the requests and/or
    * events.
    */
  var channelName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines an events hash with the events to be listened and its respective
    * handlers.
    */
  var radioEvents: js.UndefOr[js.Any] = js.undefined
  /**
    * Defines an events hash with the requests to be replied and its respective
    * handlers
    */
  var radioRequests: js.UndefOr[js.Any] = js.undefined
}

