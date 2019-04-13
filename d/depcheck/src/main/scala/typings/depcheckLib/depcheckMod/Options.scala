package typings
package depcheckLib.depcheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var detectors: js.UndefOr[js.Array[Detector]] = js.undefined
  var ignoreBinPackage: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ignoreMatches: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var parsers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Parser]] = js.undefined
  var specials: js.UndefOr[js.Array[Parser]] = js.undefined
  var withoutDev: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    detectors: js.Array[Detector] = null,
    ignoreBinPackage: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDirs: js.Array[java.lang.String] = null,
    ignoreMatches: js.Array[java.lang.String] = null,
    parsers: org.scalablytyped.runtime.StringDictionary[Parser] = null,
    specials: js.Array[Parser] = null,
    withoutDev: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (detectors != null) __obj.updateDynamic("detectors")(detectors)
    if (!js.isUndefined(ignoreBinPackage)) __obj.updateDynamic("ignoreBinPackage")(ignoreBinPackage)
    if (ignoreDirs != null) __obj.updateDynamic("ignoreDirs")(ignoreDirs)
    if (ignoreMatches != null) __obj.updateDynamic("ignoreMatches")(ignoreMatches)
    if (parsers != null) __obj.updateDynamic("parsers")(parsers)
    if (specials != null) __obj.updateDynamic("specials")(specials)
    if (!js.isUndefined(withoutDev)) __obj.updateDynamic("withoutDev")(withoutDev)
    __obj.asInstanceOf[Options]
  }
}

