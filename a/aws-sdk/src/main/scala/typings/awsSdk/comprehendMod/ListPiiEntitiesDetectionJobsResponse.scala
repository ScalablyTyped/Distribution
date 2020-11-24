package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPiiEntitiesDetectionJobsResponse extends js.Object {
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var PiiEntitiesDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.PiiEntitiesDetectionJobPropertiesList] = js.native
}
object ListPiiEntitiesDetectionJobsResponse {
  
  @scala.inline
  def apply(): ListPiiEntitiesDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPiiEntitiesDetectionJobsResponse]
  }
  
  @scala.inline
  implicit class ListPiiEntitiesDetectionJobsResponseOps[Self <: ListPiiEntitiesDetectionJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPiiEntitiesDetectionJobPropertiesListVarargs(value: PiiEntitiesDetectionJobProperties*): Self = this.set("PiiEntitiesDetectionJobPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setPiiEntitiesDetectionJobPropertiesList(value: PiiEntitiesDetectionJobPropertiesList): Self = this.set("PiiEntitiesDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePiiEntitiesDetectionJobPropertiesList: Self = this.set("PiiEntitiesDetectionJobPropertiesList", js.undefined)
  }
}
