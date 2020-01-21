package typings.bowser.mod.Parser

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
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedResult]
  }
}

