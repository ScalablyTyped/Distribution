package typings
package depcheckLib.depcheckMod.depcheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var detectors: js.UndefOr[js.Array[Detector]] = js.undefined
  var ignoreBinPackage: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ignoreMatches: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var parsers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[Parser]] = js.undefined
  var specials: js.UndefOr[js.Array[Parser]] = js.undefined
  var withoutDev: js.UndefOr[scala.Boolean] = js.undefined
}

