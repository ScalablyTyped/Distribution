package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDocumentClassificationJobsResponse extends js.Object {
  
  /**
    * A list containing the properties of each job returned.
    */
  var DocumentClassificationJobPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.DocumentClassificationJobPropertiesList] = js.native
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListDocumentClassificationJobsResponse {
  
  @scala.inline
  def apply(): ListDocumentClassificationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentClassificationJobsResponse]
  }
  
  @scala.inline
  implicit class ListDocumentClassificationJobsResponseOps[Self <: ListDocumentClassificationJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setDocumentClassificationJobPropertiesListVarargs(value: DocumentClassificationJobProperties*): Self = this.set("DocumentClassificationJobPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setDocumentClassificationJobPropertiesList(value: DocumentClassificationJobPropertiesList): Self = this.set("DocumentClassificationJobPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentClassificationJobPropertiesList: Self = this.set("DocumentClassificationJobPropertiesList", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
