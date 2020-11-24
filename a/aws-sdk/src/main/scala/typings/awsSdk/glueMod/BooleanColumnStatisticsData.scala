package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanColumnStatisticsData extends js.Object {
  
  /**
    * The number of false values in the column.
    */
  var NumberOfFalses: NonNegativeLong = js.native
  
  /**
    * The number of null values in the column.
    */
  var NumberOfNulls: NonNegativeLong = js.native
  
  /**
    * The number of true values in the column.
    */
  var NumberOfTrues: NonNegativeLong = js.native
}
object BooleanColumnStatisticsData {
  
  @scala.inline
  def apply(NumberOfFalses: NonNegativeLong, NumberOfNulls: NonNegativeLong, NumberOfTrues: NonNegativeLong): BooleanColumnStatisticsData = {
    val __obj = js.Dynamic.literal(NumberOfFalses = NumberOfFalses.asInstanceOf[js.Any], NumberOfNulls = NumberOfNulls.asInstanceOf[js.Any], NumberOfTrues = NumberOfTrues.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanColumnStatisticsData]
  }
  
  @scala.inline
  implicit class BooleanColumnStatisticsDataOps[Self <: BooleanColumnStatisticsData] (val x: Self) extends AnyVal {
    
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
    def setNumberOfFalses(value: NonNegativeLong): Self = this.set("NumberOfFalses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNulls(value: NonNegativeLong): Self = this.set("NumberOfNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfTrues(value: NonNegativeLong): Self = this.set("NumberOfTrues", value.asInstanceOf[js.Any])
  }
}
