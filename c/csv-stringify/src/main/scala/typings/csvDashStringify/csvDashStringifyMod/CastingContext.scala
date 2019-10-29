package typings.csvDashStringify.csvDashStringifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CastingContext extends js.Object {
  val column: js.UndefOr[Double | String] = js.undefined
  val header: Boolean
  val index: Double
  val records: Double
}

object CastingContext {
  @scala.inline
  def apply(header: Boolean, index: Double, records: Double, column: Double | String = null): CastingContext = {
    val __obj = js.Dynamic.literal(header = header, index = index, records = records)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastingContext]
  }
}

