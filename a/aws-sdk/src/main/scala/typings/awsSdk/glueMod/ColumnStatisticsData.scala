package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnStatisticsData extends js.Object {
  
  /**
    * Binary column statistics data.
    */
  var BinaryColumnStatisticsData: js.UndefOr[typings.awsSdk.glueMod.BinaryColumnStatisticsData] = js.native
  
  /**
    * Boolean column statistics data.
    */
  var BooleanColumnStatisticsData: js.UndefOr[typings.awsSdk.glueMod.BooleanColumnStatisticsData] = js.native
  
  /**
    * Date column statistics data.
    */
  var DateColumnStatisticsData: js.UndefOr[typings.awsSdk.glueMod.DateColumnStatisticsData] = js.native
  
  /**
    * Decimal column statistics data.
    */
  var DecimalColumnStatisticsData: js.UndefOr[typings.awsSdk.glueMod.DecimalColumnStatisticsData] = js.native
  
  /**
    * Double column statistics data.
    */
  var DoubleColumnStatisticsData: js.UndefOr[typings.awsSdk.glueMod.DoubleColumnStatisticsData] = js.native
  
  /**
    * Long column statistics data.
    */
  var LongColumnStatisticsData: js.UndefOr[typings.awsSdk.glueMod.LongColumnStatisticsData] = js.native
  
  /**
    * String column statistics data.
    */
  var StringColumnStatisticsData: js.UndefOr[typings.awsSdk.glueMod.StringColumnStatisticsData] = js.native
  
  /**
    * The type of column statistics data.
    */
  var Type: ColumnStatisticsType = js.native
}
object ColumnStatisticsData {
  
  @scala.inline
  def apply(Type: ColumnStatisticsType): ColumnStatisticsData = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnStatisticsData]
  }
  
  @scala.inline
  implicit class ColumnStatisticsDataOps[Self <: ColumnStatisticsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: ColumnStatisticsType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryColumnStatisticsData(value: BinaryColumnStatisticsData): Self = this.set("BinaryColumnStatisticsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryColumnStatisticsData: Self = this.set("BinaryColumnStatisticsData", js.undefined)
    
    @scala.inline
    def setBooleanColumnStatisticsData(value: BooleanColumnStatisticsData): Self = this.set("BooleanColumnStatisticsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooleanColumnStatisticsData: Self = this.set("BooleanColumnStatisticsData", js.undefined)
    
    @scala.inline
    def setDateColumnStatisticsData(value: DateColumnStatisticsData): Self = this.set("DateColumnStatisticsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateColumnStatisticsData: Self = this.set("DateColumnStatisticsData", js.undefined)
    
    @scala.inline
    def setDecimalColumnStatisticsData(value: DecimalColumnStatisticsData): Self = this.set("DecimalColumnStatisticsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalColumnStatisticsData: Self = this.set("DecimalColumnStatisticsData", js.undefined)
    
    @scala.inline
    def setDoubleColumnStatisticsData(value: DoubleColumnStatisticsData): Self = this.set("DoubleColumnStatisticsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleColumnStatisticsData: Self = this.set("DoubleColumnStatisticsData", js.undefined)
    
    @scala.inline
    def setLongColumnStatisticsData(value: LongColumnStatisticsData): Self = this.set("LongColumnStatisticsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongColumnStatisticsData: Self = this.set("LongColumnStatisticsData", js.undefined)
    
    @scala.inline
    def setStringColumnStatisticsData(value: StringColumnStatisticsData): Self = this.set("StringColumnStatisticsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringColumnStatisticsData: Self = this.set("StringColumnStatisticsData", js.undefined)
  }
}
