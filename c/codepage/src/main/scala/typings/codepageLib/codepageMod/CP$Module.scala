package typings
package codepageLib.codepageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CP$Module
  extends /** Codepage Converters */
/* cp */ org.scalablytyped.runtime.NumberDictionary[CP$Conv] {
  /** Utility Functions */
  var utils: CP$Utils
  /** Version string */
  var version: java.lang.String
}

object CP$Module {
  @scala.inline
  def apply(
    utils: CP$Utils,
    version: java.lang.String,
    NumberDictionary: /** Codepage Converters */
  /* cp */ org.scalablytyped.runtime.NumberDictionary[CP$Conv] = null
  ): CP$Module = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("utils")(utils)
    __obj.updateDynamic("version")(version)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[CP$Module]
  }
}

