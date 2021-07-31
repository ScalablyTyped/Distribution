package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetCustomDataIdentifiersResponse extends StObject {
  
  /**
    * An array of objects, one for each custom data identifier that meets the criteria specified in the request.
    */
  var customDataIdentifiers: js.UndefOr[listOfBatchGetCustomDataIdentifierSummary] = js.undefined
  
  /**
    * An array of identifiers, one for each identifier that was specified in the request, but doesn't correlate to an existing custom data identifier.
    */
  var notFoundIdentifierIds: js.UndefOr[listOfString] = js.undefined
}
object BatchGetCustomDataIdentifiersResponse {
  
  @scala.inline
  def apply(): BatchGetCustomDataIdentifiersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCustomDataIdentifiersResponse]
  }
  
  @scala.inline
  implicit class BatchGetCustomDataIdentifiersResponseMutableBuilder[Self <: BatchGetCustomDataIdentifiersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomDataIdentifiers(value: listOfBatchGetCustomDataIdentifierSummary): Self = StObject.set(x, "customDataIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataIdentifiersUndefined: Self = StObject.set(x, "customDataIdentifiers", js.undefined)
    
    @scala.inline
    def setCustomDataIdentifiersVarargs(value: BatchGetCustomDataIdentifierSummary*): Self = StObject.set(x, "customDataIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setNotFoundIdentifierIds(value: listOfString): Self = StObject.set(x, "notFoundIdentifierIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundIdentifierIdsUndefined: Self = StObject.set(x, "notFoundIdentifierIds", js.undefined)
    
    @scala.inline
    def setNotFoundIdentifierIdsVarargs(value: string*): Self = StObject.set(x, "notFoundIdentifierIds", js.Array(value :_*))
  }
}
