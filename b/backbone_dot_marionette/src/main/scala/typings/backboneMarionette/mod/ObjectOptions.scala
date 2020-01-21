package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectOptions
  extends RadioMixinOptions
     with /* index */ StringDictionary[js.Any] {
  /**
    * Initialize is called immediately after the Object has been instantiated,
    * and is invoked with the same arguments that the constructor received.
    */
  var initialize: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], Unit]] = js.undefined
}

object ObjectOptions {
  @scala.inline
  def apply(
    StringDictionary: /* index */ StringDictionary[js.Any] = null,
    channelName: String = null,
    initialize: /* options */ js.UndefOr[ObjectOptions] => Unit = null,
    radioEvents: js.Any = null,
    radioRequests: js.Any = null
  ): ObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (channelName != null) __obj.updateDynamic("channelName")(channelName.asInstanceOf[js.Any])
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction1(initialize))
    if (radioEvents != null) __obj.updateDynamic("radioEvents")(radioEvents.asInstanceOf[js.Any])
    if (radioRequests != null) __obj.updateDynamic("radioRequests")(radioRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectOptions]
  }
}

