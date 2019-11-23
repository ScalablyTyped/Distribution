package typings.cssDashMediaquery.cssDashMediaqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expression extends js.Object {
  var feature: String
  var modifier: String
  var value: String
}

object Expression {
  @scala.inline
  def apply(feature: String, modifier: String, value: String): Expression = {
    val __obj = js.Dynamic.literal(feature = feature, modifier = modifier, value = value)
  
    __obj.asInstanceOf[Expression]
  }
}

