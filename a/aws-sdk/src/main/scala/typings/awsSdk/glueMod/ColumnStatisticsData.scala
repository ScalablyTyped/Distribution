package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnStatisticsData extends js.Object {
  /**
    * Binary Column Statistics Data.
    */
  var BinaryColumnStatisticsData: js.UndefOr[typings.awsSdk.glueMod.BinaryColumnStatisticsData] = js.native
  /**
    * Boolean Column Statistics Data.
    */
  var BooleanColumnStatisticsData: js.UndefOr[typings.awsSdk.glueMod.BooleanColumnStatisticsData] = js.native
  /**
    * Date Column Statistics Data.
    */
  var DateColumnStatisticsData: js.UndefOr[typings.awsSdk.glueMod.DateColumnStatisticsData] = js.native
  /**
    * Decimal Column Statistics Data.
    */
  var DecimalColumnStatisticsData: js.UndefOr[typings.awsSdk.glueMod.DecimalColumnStatisticsData] = js.native
  /**
    * Double Column Statistics Data.
    */
  var DoubleColumnStatisticsData: js.UndefOr[typings.awsSdk.glueMod.DoubleColumnStatisticsData] = js.native
  /**
    * Long Column Statistics Data.
    */
  var LongColumnStatisticsData: js.UndefOr[typings.awsSdk.glueMod.LongColumnStatisticsData] = js.native
  /**
    * String Column Statistics Data.
    */
  var StringColumnStatisticsData: js.UndefOr[typings.awsSdk.glueMod.StringColumnStatisticsData] = js.native
  /**
    * The name of the column.
    */
  var Type: ColumnStatisticsType = js.native
}

object ColumnStatisticsData {
  @scala.inline
  def apply(
    Type: ColumnStatisticsType,
    BinaryColumnStatisticsData: BinaryColumnStatisticsData = null,
    BooleanColumnStatisticsData: BooleanColumnStatisticsData = null,
    DateColumnStatisticsData: DateColumnStatisticsData = null,
    DecimalColumnStatisticsData: DecimalColumnStatisticsData = null,
    DoubleColumnStatisticsData: DoubleColumnStatisticsData = null,
    LongColumnStatisticsData: LongColumnStatisticsData = null,
    StringColumnStatisticsData: StringColumnStatisticsData = null
  ): ColumnStatisticsData = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (BinaryColumnStatisticsData != null) __obj.updateDynamic("BinaryColumnStatisticsData")(BinaryColumnStatisticsData.asInstanceOf[js.Any])
    if (BooleanColumnStatisticsData != null) __obj.updateDynamic("BooleanColumnStatisticsData")(BooleanColumnStatisticsData.asInstanceOf[js.Any])
    if (DateColumnStatisticsData != null) __obj.updateDynamic("DateColumnStatisticsData")(DateColumnStatisticsData.asInstanceOf[js.Any])
    if (DecimalColumnStatisticsData != null) __obj.updateDynamic("DecimalColumnStatisticsData")(DecimalColumnStatisticsData.asInstanceOf[js.Any])
    if (DoubleColumnStatisticsData != null) __obj.updateDynamic("DoubleColumnStatisticsData")(DoubleColumnStatisticsData.asInstanceOf[js.Any])
    if (LongColumnStatisticsData != null) __obj.updateDynamic("LongColumnStatisticsData")(LongColumnStatisticsData.asInstanceOf[js.Any])
    if (StringColumnStatisticsData != null) __obj.updateDynamic("StringColumnStatisticsData")(StringColumnStatisticsData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnStatisticsData]
  }
}

