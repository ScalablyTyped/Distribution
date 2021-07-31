package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServersResponse extends StObject {
  
  /**
    * This is not currently implemented for DescribeServers requests. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the response to a DescribeServers request.  For Chef Automate servers: If DescribeServersResponse$Servers$EngineAttributes includes CHEF_MAJOR_UPGRADE_AVAILABLE, you can upgrade the Chef Automate server to Chef Automate 2. To be eligible for upgrade, a server running Chef Automate 1 must have had at least one successful maintenance run after November 1, 2019.  For Puppet Server: DescribeServersResponse$Servers$EngineAttributes contains PUPPET_API_CA_CERT. This is the PEM-encoded CA certificate that is used by the Puppet API over TCP port number 8140. The CA certificate is also used to sign node certificates.
    */
  var Servers: js.UndefOr[typings.awsSdk.opsworkscmMod.Servers] = js.undefined
}
object DescribeServersResponse {
  
  @scala.inline
  def apply(): DescribeServersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServersResponse]
  }
  
  @scala.inline
  implicit class DescribeServersResponseMutableBuilder[Self <: DescribeServersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setServers(value: Servers): Self = StObject.set(x, "Servers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServersUndefined: Self = StObject.set(x, "Servers", js.undefined)
    
    @scala.inline
    def setServersVarargs(value: Server*): Self = StObject.set(x, "Servers", js.Array(value :_*))
  }
}
