package typings.coinbaseCommerceNode

import org.scalablytyped.runtime.StringDictionary
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.applicationSlashjson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccept
  extends /* key */ StringDictionary[js.Any] {
  var Accept: applicationSlashjson
  var `Content-Type`: applicationSlashjson
  var `User-Agent`: String
  var `X-CC-Api-Key`: String
  var `X-CC-Version`: String
}

object AnonAccept {
  @scala.inline
  def apply(
    Accept: applicationSlashjson,
    `Content-Type`: applicationSlashjson,
    `User-Agent`: String,
    `X-CC-Api-Key`: String,
    `X-CC-Version`: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): AnonAccept = {
    val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any])
    __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-CC-Api-Key")(`X-CC-Api-Key`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-CC-Version")(`X-CC-Version`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonAccept]
  }
}

