package typings.depcheck.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var detectors: js.UndefOr[js.Array[Detector_]] = js.undefined
  var ignoreBinPackage: js.UndefOr[Boolean] = js.undefined
  var ignoreDirs: js.UndefOr[js.Array[String]] = js.undefined
  var ignoreMatches: js.UndefOr[js.Array[String]] = js.undefined
  var parsers: js.UndefOr[StringDictionary[Parser_]] = js.undefined
  var skipMissing: js.UndefOr[Boolean] = js.undefined
  var specials: js.UndefOr[js.Array[Parser_]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    detectors: js.Array[Detector_] = null,
    ignoreBinPackage: js.UndefOr[Boolean] = js.undefined,
    ignoreDirs: js.Array[String] = null,
    ignoreMatches: js.Array[String] = null,
    parsers: StringDictionary[Parser_] = null,
    skipMissing: js.UndefOr[Boolean] = js.undefined,
    specials: js.Array[Parser_] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (detectors != null) __obj.updateDynamic("detectors")(detectors.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBinPackage)) __obj.updateDynamic("ignoreBinPackage")(ignoreBinPackage.asInstanceOf[js.Any])
    if (ignoreDirs != null) __obj.updateDynamic("ignoreDirs")(ignoreDirs.asInstanceOf[js.Any])
    if (ignoreMatches != null) __obj.updateDynamic("ignoreMatches")(ignoreMatches.asInstanceOf[js.Any])
    if (parsers != null) __obj.updateDynamic("parsers")(parsers.asInstanceOf[js.Any])
    if (!js.isUndefined(skipMissing)) __obj.updateDynamic("skipMissing")(skipMissing.asInstanceOf[js.Any])
    if (specials != null) __obj.updateDynamic("specials")(specials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

