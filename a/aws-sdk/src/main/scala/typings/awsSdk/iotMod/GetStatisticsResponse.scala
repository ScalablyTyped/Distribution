package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStatisticsResponse extends js.Object {
  
  /**
    * The statistics returned by the Fleet Indexing service based on the query and aggregation field.
    */
  var statistics: js.UndefOr[Statistics] = js.native
}
object GetStatisticsResponse {
  
  @scala.inline
  def apply(): GetStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStatisticsResponse]
  }
  
  @scala.inline
  implicit class GetStatisticsResponseOps[Self <: GetStatisticsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatistics(value: Statistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
  }
}
