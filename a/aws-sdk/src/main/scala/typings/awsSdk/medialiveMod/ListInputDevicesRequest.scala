package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInputDevicesRequest extends StObject {
  
  var MaxResults: js.UndefOr[typings.awsSdk.medialiveMod.MaxResults] = js.native
  
  var NextToken: js.UndefOr[string] = js.native
}
object ListInputDevicesRequest {
  
  @scala.inline
  def apply(): ListInputDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputDevicesRequest]
  }
  
  @scala.inline
  implicit class ListInputDevicesRequestMutableBuilder[Self <: ListInputDevicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
