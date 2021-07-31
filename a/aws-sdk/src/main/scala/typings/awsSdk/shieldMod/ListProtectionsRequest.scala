package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProtectionsRequest extends StObject {
  
  /**
    * The maximum number of Protection objects to return. If you leave this blank, Shield Advanced returns the first 20 results. This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number of objects returned could be less than MaxResults, even if there are still more objects yet to return. If there are more objects to return, Shield Advanced returns a value in NextToken that you can use in your next request, to get the next batch of objects.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.shieldMod.MaxResults] = js.undefined
  
  /**
    * The ListProtectionsRequest.NextToken value from a previous call to ListProtections. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListProtectionsRequest {
  
  @scala.inline
  def apply(): ListProtectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProtectionsRequest]
  }
  
  @scala.inline
  implicit class ListProtectionsRequestMutableBuilder[Self <: ListProtectionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
