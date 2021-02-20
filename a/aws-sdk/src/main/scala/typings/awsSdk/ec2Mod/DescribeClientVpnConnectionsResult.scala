package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeClientVpnConnectionsResult extends StObject {
  
  /**
    * Information about the active and terminated client connections.
    */
  var Connections: js.UndefOr[ClientVpnConnectionSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}
object DescribeClientVpnConnectionsResult {
  
  @scala.inline
  def apply(): DescribeClientVpnConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientVpnConnectionsResult]
  }
  
  @scala.inline
  implicit class DescribeClientVpnConnectionsResultMutableBuilder[Self <: DescribeClientVpnConnectionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnections(value: ClientVpnConnectionSet): Self = StObject.set(x, "Connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "Connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: ClientVpnConnection*): Self = StObject.set(x, "Connections", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
