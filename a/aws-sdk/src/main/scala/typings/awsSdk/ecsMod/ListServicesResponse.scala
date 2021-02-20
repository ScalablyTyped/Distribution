package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServicesResponse extends StObject {
  
  /**
    * The nextToken value to include in a future ListServices request. When the results of a ListServices request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The list of full ARN entries for each service associated with the specified cluster.
    */
  var serviceArns: js.UndefOr[StringList] = js.native
}
object ListServicesResponse {
  
  @scala.inline
  def apply(): ListServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServicesResponse]
  }
  
  @scala.inline
  implicit class ListServicesResponseMutableBuilder[Self <: ListServicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setServiceArns(value: StringList): Self = StObject.set(x, "serviceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceArnsUndefined: Self = StObject.set(x, "serviceArns", js.undefined)
    
    @scala.inline
    def setServiceArnsVarargs(value: String*): Self = StObject.set(x, "serviceArns", js.Array(value :_*))
  }
}
