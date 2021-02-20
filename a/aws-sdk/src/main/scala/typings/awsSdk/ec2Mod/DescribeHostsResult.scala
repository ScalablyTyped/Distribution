package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHostsResult extends StObject {
  
  /**
    * Information about the Dedicated Hosts.
    */
  var Hosts: js.UndefOr[HostList] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeHostsResult {
  
  @scala.inline
  def apply(): DescribeHostsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHostsResult]
  }
  
  @scala.inline
  implicit class DescribeHostsResultMutableBuilder[Self <: DescribeHostsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHosts(value: HostList): Self = StObject.set(x, "Hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostsUndefined: Self = StObject.set(x, "Hosts", js.undefined)
    
    @scala.inline
    def setHostsVarargs(value: Host*): Self = StObject.set(x, "Hosts", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
