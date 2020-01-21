package typings.codepage.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPModule extends /** Codepage Converters */
/* cp */ NumberDictionary[CPConv] {
  /** Utility Functions */
  var utils: CPUtils
  /** Version string */
  var version: String
}

object CPModule {
  @scala.inline
  def apply(
    utils: CPUtils,
    version: String,
    NumberDictionary: /** Codepage Converters */
  /* cp */ NumberDictionary[CPConv] = null
  ): CPModule = {
    val __obj = js.Dynamic.literal(utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[CPModule]
  }
}

