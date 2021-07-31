package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLabelsRequest extends StObject {
  
  /**
    * The maximum number of objects to return for the request.
    */
  var maxResults: js.UndefOr[labelsMaxResults] = js.undefined
  
  /**
    * The name of the label or labels to get.
    */
  var name: js.UndefOr[identifier] = js.undefined
  
  /**
    * The next token for the subsequent request.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetLabelsRequest {
  
  @scala.inline
  def apply(): GetLabelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLabelsRequest]
  }
  
  @scala.inline
  implicit class GetLabelsRequestMutableBuilder[Self <: GetLabelsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: labelsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setName(value: identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
