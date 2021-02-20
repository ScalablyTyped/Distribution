package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAcceleratorsResponse extends StObject {
  
  /**
    * The list of accelerators for a customer account.
    */
  var Accelerators: js.UndefOr[typings.awsSdk.globalacceleratorMod.Accelerators] = js.native
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}
object ListAcceleratorsResponse {
  
  @scala.inline
  def apply(): ListAcceleratorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAcceleratorsResponse]
  }
  
  @scala.inline
  implicit class ListAcceleratorsResponseMutableBuilder[Self <: ListAcceleratorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerators(value: Accelerators): Self = StObject.set(x, "Accelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorsUndefined: Self = StObject.set(x, "Accelerators", js.undefined)
    
    @scala.inline
    def setAcceleratorsVarargs(value: Accelerator*): Self = StObject.set(x, "Accelerators", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
