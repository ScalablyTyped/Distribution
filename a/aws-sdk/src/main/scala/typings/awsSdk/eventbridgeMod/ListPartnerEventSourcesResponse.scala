package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPartnerEventSourcesResponse extends StObject {
  
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.native
  
  /**
    * The list of partner event sources returned by the operation.
    */
  var PartnerEventSources: js.UndefOr[PartnerEventSourceList] = js.native
}
object ListPartnerEventSourcesResponse {
  
  @scala.inline
  def apply(): ListPartnerEventSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartnerEventSourcesResponse]
  }
  
  @scala.inline
  implicit class ListPartnerEventSourcesResponseMutableBuilder[Self <: ListPartnerEventSourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPartnerEventSources(value: PartnerEventSourceList): Self = StObject.set(x, "PartnerEventSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerEventSourcesUndefined: Self = StObject.set(x, "PartnerEventSources", js.undefined)
    
    @scala.inline
    def setPartnerEventSourcesVarargs(value: PartnerEventSource*): Self = StObject.set(x, "PartnerEventSources", js.Array(value :_*))
  }
}
