package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIPSetsResponse extends StObject {
  
  /**
    * The IDs of the IPSet resources.
    */
  var IpSetIds: typings.awsSdk.guarddutyMod.IpSetIds = js.native
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListIPSetsResponse {
  
  @scala.inline
  def apply(IpSetIds: IpSetIds): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal(IpSetIds = IpSetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIPSetsResponse]
  }
  
  @scala.inline
  implicit class ListIPSetsResponseMutableBuilder[Self <: ListIPSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpSetIds(value: IpSetIds): Self = StObject.set(x, "IpSetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetIdsVarargs(value: String*): Self = StObject.set(x, "IpSetIds", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
