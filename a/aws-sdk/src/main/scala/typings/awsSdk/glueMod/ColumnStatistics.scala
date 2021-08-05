package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnStatistics extends StObject {
  
  /**
    * The timestamp of when column statistics were generated.
    */
  var AnalyzedTime: Timestamp
  
  /**
    * Name of column which statistics belong to.
    */
  var ColumnName: NameString
  
  /**
    * The data type of the column.
    */
  var ColumnType: TypeString
  
  /**
    * A ColumnStatisticData object that contains the statistics data values.
    */
  var StatisticsData: ColumnStatisticsData
}
object ColumnStatistics {
  
  inline def apply(
    AnalyzedTime: Timestamp,
    ColumnName: NameString,
    ColumnType: TypeString,
    StatisticsData: ColumnStatisticsData
  ): ColumnStatistics = {
    val __obj = js.Dynamic.literal(AnalyzedTime = AnalyzedTime.asInstanceOf[js.Any], ColumnName = ColumnName.asInstanceOf[js.Any], ColumnType = ColumnType.asInstanceOf[js.Any], StatisticsData = StatisticsData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnStatistics]
  }
  
  extension [Self <: ColumnStatistics](x: Self) {
    
    inline def setAnalyzedTime(value: Timestamp): Self = StObject.set(x, "AnalyzedTime", value.asInstanceOf[js.Any])
    
    inline def setColumnName(value: NameString): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setColumnType(value: TypeString): Self = StObject.set(x, "ColumnType", value.asInstanceOf[js.Any])
    
    inline def setStatisticsData(value: ColumnStatisticsData): Self = StObject.set(x, "StatisticsData", value.asInstanceOf[js.Any])
  }
}
