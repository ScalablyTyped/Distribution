package typings
package chartistLib.chartistMod.ChartistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// data formats are not well documented on all the ways they can be passed to the constructors
// this definition gives some intellisense, but does not protect the user from misuse
// TODO: come in and tidy this up and make it fit better
trait IChartistData extends js.Object {
  var labels: js.UndefOr[js.Array[java.lang.String] | js.Array[scala.Double] | js.Array[stdLib.Date]] = js.undefined
  var series: js.Array[IChartistSeriesData] | js.Array[js.Array[IChartistSeriesData]] | js.Array[js.Array[IChartistData]] | js.Array[scala.Double] | js.Array[js.Array[scala.Double]]
}

