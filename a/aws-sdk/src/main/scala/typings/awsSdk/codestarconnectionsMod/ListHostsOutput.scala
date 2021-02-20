package typings.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHostsOutput extends StObject {
  
  /**
    * A list of hosts and the details for each host, such as status, endpoint, and provider type.
    */
  var Hosts: js.UndefOr[HostList] = js.native
  
  /**
    * A token that can be used in the next ListHosts call. To view all items in the list, continue to call this operation with each subsequent token until no more nextToken values are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarconnectionsMod.NextToken] = js.native
}
object ListHostsOutput {
  
  @scala.inline
  def apply(): ListHostsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHostsOutput]
  }
  
  @scala.inline
  implicit class ListHostsOutputMutableBuilder[Self <: ListHostsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHosts(value: HostList): Self = StObject.set(x, "Hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostsUndefined: Self = StObject.set(x, "Hosts", js.undefined)
    
    @scala.inline
    def setHostsVarargs(value: Host*): Self = StObject.set(x, "Hosts", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
