package typings.c3.anon

import typings.c3.mod.DataSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Targets extends js.Object {
  var targets: js.Array[DataSeries]
}

object Targets {
  @scala.inline
  def apply(targets: js.Array[DataSeries]): Targets = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targets]
  }
}

