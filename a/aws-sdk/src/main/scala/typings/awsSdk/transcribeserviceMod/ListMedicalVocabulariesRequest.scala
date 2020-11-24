package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMedicalVocabulariesRequest extends js.Object {
  
  /**
    * The maximum number of vocabularies to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxResults] = js.native
  
  /**
    * Returns vocabularies whose names contain the specified string. The search is not case sensitive. ListMedicalVocabularies returns both "vocabularyname" and "VocabularyName".
    */
  var NameContains: js.UndefOr[VocabularyName] = js.native
  
  /**
    * If the result of your previous request to ListMedicalVocabularies was truncated, include the NextToken to fetch the next set of vocabularies.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
  
  /**
    * When specified, returns only vocabularies with the VocabularyState equal to the specified vocabulary state. Use this field to see which vocabularies are ready for your medical transcription jobs.
    */
  var StateEquals: js.UndefOr[VocabularyState] = js.native
}
object ListMedicalVocabulariesRequest {
  
  @scala.inline
  def apply(): ListMedicalVocabulariesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMedicalVocabulariesRequest]
  }
  
  @scala.inline
  implicit class ListMedicalVocabulariesRequestOps[Self <: ListMedicalVocabulariesRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: VocabularyName): Self = this.set("NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameContains: Self = this.set("NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStateEquals(value: VocabularyState): Self = this.set("StateEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateEquals: Self = this.set("StateEquals", js.undefined)
  }
}
