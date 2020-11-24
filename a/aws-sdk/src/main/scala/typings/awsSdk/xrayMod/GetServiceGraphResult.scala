package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceGraphResult extends js.Object {
  
  /**
    * A flag indicating whether the group's filter expression has been consistent, or if the returned service graph may show traces from an older version of the group's filter expression.
    */
  var ContainsOldGroupVersions: js.UndefOr[Boolean] = js.native
  
  /**
    * The end of the time frame for which the graph was generated.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The services that have processed a traced request during the specified time frame.
    */
  var Services: js.UndefOr[ServiceList] = js.native
  
  /**
    * The start of the time frame for which the graph was generated.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
}
object GetServiceGraphResult {
  
  @scala.inline
  def apply(): GetServiceGraphResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceGraphResult]
  }
  
  @scala.inline
  implicit class GetServiceGraphResultOps[Self <: GetServiceGraphResult] (val x: Self) extends AnyVal {
    
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
    def setContainsOldGroupVersions(value: Boolean): Self = this.set("ContainsOldGroupVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainsOldGroupVersions: Self = this.set("ContainsOldGroupVersions", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: Service*): Self = this.set("Services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: ServiceList): Self = this.set("Services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServices: Self = this.set("Services", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
}
