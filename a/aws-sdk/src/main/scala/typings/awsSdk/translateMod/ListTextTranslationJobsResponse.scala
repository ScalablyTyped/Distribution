package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTextTranslationJobsResponse extends StObject {
  
  /**
    * The token to use to retreive the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.translateMod.NextToken] = js.native
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var TextTranslationJobPropertiesList: js.UndefOr[typings.awsSdk.translateMod.TextTranslationJobPropertiesList] = js.native
}
object ListTextTranslationJobsResponse {
  
  @scala.inline
  def apply(): ListTextTranslationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTextTranslationJobsResponse]
  }
  
  @scala.inline
  implicit class ListTextTranslationJobsResponseMutableBuilder[Self <: ListTextTranslationJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTextTranslationJobPropertiesList(value: TextTranslationJobPropertiesList): Self = StObject.set(x, "TextTranslationJobPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTranslationJobPropertiesListUndefined: Self = StObject.set(x, "TextTranslationJobPropertiesList", js.undefined)
    
    @scala.inline
    def setTextTranslationJobPropertiesListVarargs(value: TextTranslationJobProperties*): Self = StObject.set(x, "TextTranslationJobPropertiesList", js.Array(value :_*))
  }
}
