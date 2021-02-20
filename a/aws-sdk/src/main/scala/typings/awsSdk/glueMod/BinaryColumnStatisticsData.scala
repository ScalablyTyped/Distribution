package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryColumnStatisticsData extends StObject {
  
  /**
    * The average bit sequence length in the column.
    */
  var AverageLength: NonNegativeDouble = js.native
  
  /**
    * The size of the longest bit sequence in the column.
    */
  var MaximumLength: NonNegativeLong = js.native
  
  /**
    * The number of null values in the column.
    */
  var NumberOfNulls: NonNegativeLong = js.native
}
object BinaryColumnStatisticsData {
  
  @scala.inline
  def apply(AverageLength: NonNegativeDouble, MaximumLength: NonNegativeLong, NumberOfNulls: NonNegativeLong): BinaryColumnStatisticsData = {
    val __obj = js.Dynamic.literal(AverageLength = AverageLength.asInstanceOf[js.Any], MaximumLength = MaximumLength.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryColumnStatisticsData]
  }
  
  @scala.inline
  implicit class BinaryColumnStatisticsDataMutableBuilder[Self <: BinaryColumnStatisticsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverageLength(value: NonNegativeDouble): Self = StObject.set(x, "AverageLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumLength(value: NonNegativeLong): Self = StObject.set(x, "MaximumLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNulls(value: NonNegativeLong): Self = StObject.set(x, "NumberOfNulls", value.asInstanceOf[js.Any])
  }
}
