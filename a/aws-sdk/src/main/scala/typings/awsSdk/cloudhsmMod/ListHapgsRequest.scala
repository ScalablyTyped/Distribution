package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHapgsRequest extends StObject {
  
  /**
    * The NextToken value from a previous call to ListHapgs. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListHapgsRequest {
  
  @scala.inline
  def apply(): ListHapgsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHapgsRequest]
  }
  
  @scala.inline
  implicit class ListHapgsRequestMutableBuilder[Self <: ListHapgsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
