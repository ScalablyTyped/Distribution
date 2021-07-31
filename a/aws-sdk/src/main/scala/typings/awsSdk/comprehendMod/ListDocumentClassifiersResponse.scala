package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDocumentClassifiersResponse extends StObject {
  
  /**
    * A list containing the properties of each job returned.
    */
  var DocumentClassifierPropertiesList: js.UndefOr[typings.awsSdk.comprehendMod.DocumentClassifierPropertiesList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDocumentClassifiersResponse {
  
  @scala.inline
  def apply(): ListDocumentClassifiersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentClassifiersResponse]
  }
  
  @scala.inline
  implicit class ListDocumentClassifiersResponseMutableBuilder[Self <: ListDocumentClassifiersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentClassifierPropertiesList(value: DocumentClassifierPropertiesList): Self = StObject.set(x, "DocumentClassifierPropertiesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentClassifierPropertiesListUndefined: Self = StObject.set(x, "DocumentClassifierPropertiesList", js.undefined)
    
    @scala.inline
    def setDocumentClassifierPropertiesListVarargs(value: DocumentClassifierProperties*): Self = StObject.set(x, "DocumentClassifierPropertiesList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
