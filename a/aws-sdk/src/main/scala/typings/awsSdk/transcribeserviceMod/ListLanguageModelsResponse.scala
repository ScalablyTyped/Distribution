package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLanguageModelsResponse extends js.Object {
  
  /**
    * A list of objects containing information about custom language models.
    */
  var Models: js.UndefOr[typings.awsSdk.transcribeserviceMod.Models] = js.native
  
  /**
    * The operation returns a page of jobs at a time. The maximum size of the list is set by the MaxResults parameter. If there are more language models in the list than the page size, Amazon Transcribe returns the NextPage token. Include the token in the next request to the operation to return the next page of language models.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
}
object ListLanguageModelsResponse {
  
  @scala.inline
  def apply(): ListLanguageModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLanguageModelsResponse]
  }
  
  @scala.inline
  implicit class ListLanguageModelsResponseOps[Self <: ListLanguageModelsResponse] (val x: Self) extends AnyVal {
    
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
    def setModelsVarargs(value: LanguageModel*): Self = this.set("Models", js.Array(value :_*))
    
    @scala.inline
    def setModels(value: Models): Self = this.set("Models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModels: Self = this.set("Models", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
