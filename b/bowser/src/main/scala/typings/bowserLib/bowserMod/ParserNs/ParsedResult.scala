package typings
package bowserLib.bowserMod.ParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedResult extends js.Object {
  var browser: BrowserDetails
  var engine: EngineDetails
  var os: OSDetails
  var platform: PlatformDetails
}

object ParsedResult {
  @scala.inline
  def apply(browser: BrowserDetails, engine: EngineDetails, os: OSDetails, platform: PlatformDetails): ParsedResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("browser")(browser)
    __obj.updateDynamic("engine")(engine)
    __obj.updateDynamic("os")(os)
    __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[ParsedResult]
  }
}

