package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BooleanColumnStatisticsData extends js.Object {
  /**
    * Number of false value.
    */
  var NumberOfFalses: NonNegativeLong = js.native
  /**
    * Number of nulls.
    */
  var NumberOfNulls: NonNegativeLong = js.native
  /**
    * Number of true value.
    */
  var NumberOfTrues: NonNegativeLong = js.native
}

object BooleanColumnStatisticsData {
  @scala.inline
  def apply(NumberOfFalses: NonNegativeLong, NumberOfNulls: NonNegativeLong, NumberOfTrues: NonNegativeLong): BooleanColumnStatisticsData = {
    val __obj = js.Dynamic.literal(NumberOfFalses = NumberOfFalses.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any], NumberOfTrues = NumberOfTrues.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanColumnStatisticsData]
  }
}

