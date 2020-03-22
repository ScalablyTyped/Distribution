package typings.c3

import typings.c3.mod.DataSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTargets extends js.Object {
  var targets: js.Array[DataSeries]
}

object AnonTargets {
  @scala.inline
  def apply(targets: js.Array[DataSeries]): AnonTargets = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTargets]
  }
}

