package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIpRoutesResult extends StObject {
  
  /**
    * A list of IpRoutes.
    */
  var IpRoutesInfo: js.UndefOr[typings.awsSdk.directoryserviceMod.IpRoutesInfo] = js.native
  
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to ListIpRoutes to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
}
object ListIpRoutesResult {
  
  @scala.inline
  def apply(): ListIpRoutesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIpRoutesResult]
  }
  
  @scala.inline
  implicit class ListIpRoutesResultMutableBuilder[Self <: ListIpRoutesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpRoutesInfo(value: IpRoutesInfo): Self = StObject.set(x, "IpRoutesInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpRoutesInfoUndefined: Self = StObject.set(x, "IpRoutesInfo", js.undefined)
    
    @scala.inline
    def setIpRoutesInfoVarargs(value: IpRouteInfo*): Self = StObject.set(x, "IpRoutesInfo", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
