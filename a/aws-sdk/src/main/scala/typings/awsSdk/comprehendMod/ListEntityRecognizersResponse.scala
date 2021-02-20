package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEntityRecognizersResponse extends StObject {
  
  /**
    * The list of properties of an entity recognizer.
    */
  var EntityRecognizerPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.EntityRecognizerPropertiesList] = js.native
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListEntityRecognizersResponse {
  
  @scala.inline
  def apply(): ListEntityRecognizersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntityRecognizersResponse]
  }
  
  @scala.inline
  implicit class ListEntityRecognizersResponseMutableBuilder[Self <: ListEntityRecognizersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityRecognizerPropertiesList(value: EntityRecognizerPropertiesList): Self = StObject.set(x, "EntityRecognizerPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityRecognizerPropertiesListUndefined: Self = StObject.set(x, "EntityRecognizerPropertiesList", js.undefined)
    
    @scala.inline
    def setEntityRecognizerPropertiesListVarargs(value: EntityRecognizerProperties*): Self = StObject.set(x, "EntityRecognizerPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
