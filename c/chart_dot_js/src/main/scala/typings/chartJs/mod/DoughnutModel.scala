package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Model used with the doughnut chart
trait DoughnutModel extends js.Object {
  var backgroundColor: ChartColor
  var borderAlign: BorderAlignment
  var borderColor: String
  var borderWidth: Double
  var circumference: Double
  var endAngle: Double
  var innerRadius: Double
  var outerRadius: Double
  var startAngle: Double
  var x: Double
  var y: Double
}

object DoughnutModel {
  @scala.inline
  def apply(
    backgroundColor: ChartColor,
    borderAlign: BorderAlignment,
    borderColor: String,
    borderWidth: Double,
    circumference: Double,
    endAngle: Double,
    innerRadius: Double,
    outerRadius: Double,
    startAngle: Double,
    x: Double,
    y: Double
  ): DoughnutModel = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderAlign = borderAlign.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], circumference = circumference.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoughnutModel]
  }
}

