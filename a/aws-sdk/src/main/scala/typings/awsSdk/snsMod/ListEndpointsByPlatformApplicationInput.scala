package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEndpointsByPlatformApplicationInput extends StObject {
  
  /**
    * NextToken string is used when calling ListEndpointsByPlatformApplication action to retrieve additional records that are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * PlatformApplicationArn for ListEndpointsByPlatformApplicationInput action.
    */
  var PlatformApplicationArn: String = js.native
}
object ListEndpointsByPlatformApplicationInput {
  
  @scala.inline
  def apply(PlatformApplicationArn: String): ListEndpointsByPlatformApplicationInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointsByPlatformApplicationInput]
  }
  
  @scala.inline
  implicit class ListEndpointsByPlatformApplicationInputMutableBuilder[Self <: ListEndpointsByPlatformApplicationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPlatformApplicationArn(value: String): Self = StObject.set(x, "PlatformApplicationArn", value.asInstanceOf[js.Any])
  }
}
