package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSentimentDetectionJobsResponse extends js.Object {
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var SentimentDetectionJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.SentimentDetectionJobPropertiesList] = js.native
}
object ListSentimentDetectionJobsResponse {
  
  @scala.inline
  def apply(): ListSentimentDetectionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSentimentDetectionJobsResponse]
  }
  
  @scala.inline
  implicit class ListSentimentDetectionJobsResponseOps[Self <: ListSentimentDetectionJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setSentimentDetectionJobPropertiesListVarargs(value: SentimentDetectionJobProperties*): Self = this.set("SentimentDetectionJobPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setSentimentDetectionJobPropertiesList(value: SentimentDetectionJobPropertiesList): Self = this.set("SentimentDetectionJobPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentimentDetectionJobPropertiesList: Self = this.set("SentimentDetectionJobPropertiesList", js.undefined)
  }
}
