package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnStatistics extends StObject {
  
  /**
    * The timestamp of when column statistics were generated.
    */
  var AnalyzedTime: Timestamp = js.native
  
  /**
    * Name of column which statistics belong to.
    */
  var ColumnName: NameString = js.native
  
  /**
    * The data type of the column.
    */
  var ColumnType: TypeString = js.native
  
  /**
    * A ColumnStatisticData object that contains the statistics data values.
    */
  var StatisticsData: ColumnStatisticsData = js.native
}
object ColumnStatistics {
  
  @scala.inline
  def apply(
    AnalyzedTime: Timestamp,
    ColumnName: NameString,
    ColumnType: TypeString,
    StatisticsData: ColumnStatisticsData
  ): ColumnStatistics = {
    val __obj = js.Dynamic.literal(AnalyzedTime = AnalyzedTime.asInstanceOf[js.Any], ColumnName = ColumnName.asInstanceOf[js.Any], ColumnType = ColumnType.asInstanceOf[js.Any], StatisticsData = StatisticsData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnStatistics]
  }
  
  @scala.inline
  implicit class ColumnStatisticsMutableBuilder[Self <: ColumnStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzedTime(value: Timestamp): Self = StObject.set(x, "AnalyzedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnName(value: NameString): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnType(value: TypeString): Self = StObject.set(x, "ColumnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsData(value: ColumnStatisticsData): Self = StObject.set(x, "StatisticsData", value.asInstanceOf[js.Any])
  }
}
