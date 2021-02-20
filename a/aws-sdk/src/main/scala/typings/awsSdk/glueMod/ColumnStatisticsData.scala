package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnStatisticsData extends StObject {
  
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
  implicit class ColumnStatisticsDataMutableBuilder[Self <: ColumnStatisticsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryColumnStatisticsData(value: BinaryColumnStatisticsData): Self = StObject.set(x, "BinaryColumnStatisticsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryColumnStatisticsDataUndefined: Self = StObject.set(x, "BinaryColumnStatisticsData", js.undefined)
    
    @scala.inline
    def setBooleanColumnStatisticsData(value: BooleanColumnStatisticsData): Self = StObject.set(x, "BooleanColumnStatisticsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanColumnStatisticsDataUndefined: Self = StObject.set(x, "BooleanColumnStatisticsData", js.undefined)
    
    @scala.inline
    def setDateColumnStatisticsData(value: DateColumnStatisticsData): Self = StObject.set(x, "DateColumnStatisticsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateColumnStatisticsDataUndefined: Self = StObject.set(x, "DateColumnStatisticsData", js.undefined)
    
    @scala.inline
    def setDecimalColumnStatisticsData(value: DecimalColumnStatisticsData): Self = StObject.set(x, "DecimalColumnStatisticsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalColumnStatisticsDataUndefined: Self = StObject.set(x, "DecimalColumnStatisticsData", js.undefined)
    
    @scala.inline
    def setDoubleColumnStatisticsData(value: DoubleColumnStatisticsData): Self = StObject.set(x, "DoubleColumnStatisticsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleColumnStatisticsDataUndefined: Self = StObject.set(x, "DoubleColumnStatisticsData", js.undefined)
    
    @scala.inline
    def setLongColumnStatisticsData(value: LongColumnStatisticsData): Self = StObject.set(x, "LongColumnStatisticsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongColumnStatisticsDataUndefined: Self = StObject.set(x, "LongColumnStatisticsData", js.undefined)
    
    @scala.inline
    def setStringColumnStatisticsData(value: StringColumnStatisticsData): Self = StObject.set(x, "StringColumnStatisticsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringColumnStatisticsDataUndefined: Self = StObject.set(x, "StringColumnStatisticsData", js.undefined)
    
    @scala.inline
    def setType(value: ColumnStatisticsType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
