package typings
package axeDashCoreLib.axeDashCoreMod.axeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeResult extends js.Object {
  var all: js.Array[CheckResult]
  var any: js.Array[CheckResult]
  var failureSummary: js.UndefOr[java.lang.String] = js.undefined
  var html: java.lang.String
  var impact: ImpactValue
  var none: js.Array[CheckResult]
  var target: js.Array[java.lang.String]
}

