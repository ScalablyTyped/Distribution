package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProjectVersionsResponse extends js.Object {
  
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.native
  
  /**
    * A list of model descriptions. The list is sorted by the creation date and time of the model versions, latest to earliest.
    */
  var ProjectVersionDescriptions: js.UndefOr[typings.awsSdk.rekognitionMod.ProjectVersionDescriptions] = js.native
}
object DescribeProjectVersionsResponse {
  
  @scala.inline
  def apply(): DescribeProjectVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProjectVersionsResponse]
  }
  
  @scala.inline
  implicit class DescribeProjectVersionsResponseOps[Self <: DescribeProjectVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: ExtendedPaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setProjectVersionDescriptionsVarargs(value: ProjectVersionDescription*): Self = this.set("ProjectVersionDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setProjectVersionDescriptions(value: ProjectVersionDescriptions): Self = this.set("ProjectVersionDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectVersionDescriptions: Self = this.set("ProjectVersionDescriptions", js.undefined)
  }
}
