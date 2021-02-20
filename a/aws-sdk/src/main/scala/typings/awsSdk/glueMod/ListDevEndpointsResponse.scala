package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDevEndpointsResponse extends StObject {
  
  /**
    * The names of all the DevEndpoints in the account, or the DevEndpoints with the specified tags.
    */
  var DevEndpointNames: js.UndefOr[DevEndpointNameList] = js.native
  
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}
object ListDevEndpointsResponse {
  
  @scala.inline
  def apply(): ListDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevEndpointsResponse]
  }
  
  @scala.inline
  implicit class ListDevEndpointsResponseMutableBuilder[Self <: ListDevEndpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevEndpointNames(value: DevEndpointNameList): Self = StObject.set(x, "DevEndpointNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevEndpointNamesUndefined: Self = StObject.set(x, "DevEndpointNames", js.undefined)
    
    @scala.inline
    def setDevEndpointNamesVarargs(value: NameString*): Self = StObject.set(x, "DevEndpointNames", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
