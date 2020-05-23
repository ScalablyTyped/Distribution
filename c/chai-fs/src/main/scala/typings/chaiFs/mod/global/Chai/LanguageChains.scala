package typings.chaiFs.mod.global.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageChains extends js.Object {
  var json: Assertion
  var using: Assertion
}

object LanguageChains {
  @scala.inline
  def apply(json: Assertion, using: Assertion): LanguageChains = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any], using = using.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageChains]
  }
}

