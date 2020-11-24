package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDocumentClassifiersResponse extends js.Object {
  
  /**
    * A list containing the properties of each job returned.
    */
  var DocumentClassifierPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.DocumentClassifierPropertiesList] = js.native
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListDocumentClassifiersResponse {
  
  @scala.inline
  def apply(): ListDocumentClassifiersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentClassifiersResponse]
  }
  
  @scala.inline
  implicit class ListDocumentClassifiersResponseOps[Self <: ListDocumentClassifiersResponse] (val x: Self) extends AnyVal {
    
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
    def setDocumentClassifierPropertiesListVarargs(value: DocumentClassifierProperties*): Self = this.set("DocumentClassifierPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setDocumentClassifierPropertiesList(value: DocumentClassifierPropertiesList): Self = this.set("DocumentClassifierPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentClassifierPropertiesList: Self = this.set("DocumentClassifierPropertiesList", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
