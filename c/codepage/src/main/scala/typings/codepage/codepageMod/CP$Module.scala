package typings.codepage.codepageMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CP$Module extends /** Codepage Converters */
/* cp */ NumberDictionary[CP$Conv] {
  /** Utility Functions */
  var utils: CP$Utils
  /** Version string */
  var version: String
}

object CP$Module {
  @scala.inline
  def apply(
    utils: CP$Utils,
    version: String,
    NumberDictionary: /** Codepage Converters */
  /* cp */ NumberDictionary[CP$Conv] = null
  ): CP$Module = {
    val __obj = js.Dynamic.literal(utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[CP$Module]
  }
}

