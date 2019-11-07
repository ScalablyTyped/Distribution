package typings.depcheck.depcheckMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var detectors: js.UndefOr[js.Array[Detector]] = js.undefined
  var ignoreBinPackage: js.UndefOr[Boolean] = js.undefined
  var ignoreDirs: js.UndefOr[js.Array[String]] = js.undefined
  var ignoreMatches: js.UndefOr[js.Array[String]] = js.undefined
  var parsers: js.UndefOr[StringDictionary[Parser]] = js.undefined
  var skipMissing: js.UndefOr[Boolean] = js.undefined
  var specials: js.UndefOr[js.Array[Parser]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    detectors: js.Array[Detector] = null,
    ignoreBinPackage: js.UndefOr[Boolean] = js.undefined,
    ignoreDirs: js.Array[String] = null,
    ignoreMatches: js.Array[String] = null,
    parsers: StringDictionary[Parser] = null,
    skipMissing: js.UndefOr[Boolean] = js.undefined,
    specials: js.Array[Parser] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (detectors != null) __obj.updateDynamic("detectors")(detectors)
    if (!js.isUndefined(ignoreBinPackage)) __obj.updateDynamic("ignoreBinPackage")(ignoreBinPackage)
    if (ignoreDirs != null) __obj.updateDynamic("ignoreDirs")(ignoreDirs)
    if (ignoreMatches != null) __obj.updateDynamic("ignoreMatches")(ignoreMatches)
    if (parsers != null) __obj.updateDynamic("parsers")(parsers)
    if (!js.isUndefined(skipMissing)) __obj.updateDynamic("skipMissing")(skipMissing)
    if (specials != null) __obj.updateDynamic("specials")(specials)
    __obj.asInstanceOf[Options]
  }
}

