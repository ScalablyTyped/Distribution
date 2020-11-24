package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConnectionsInput extends js.Object {
  
  /**
    * Filters the list of connections to those associated with a specified host.
    */
  var HostArnFilter: js.UndefOr[HostArn] = js.native
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.codestarconnectionsMod.MaxResults] = js.native
  
  /**
    * The token that was returned from the previous ListConnections call, which can be used to return the next set of connections in the list.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarconnectionsMod.NextToken] = js.native
  
  /**
    * Filters the list of connections to those associated with a specified provider, such as Bitbucket.
    */
  var ProviderTypeFilter: js.UndefOr[ProviderType] = js.native
}
object ListConnectionsInput {
  
  @scala.inline
  def apply(): ListConnectionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionsInput]
  }
  
  @scala.inline
  implicit class ListConnectionsInputOps[Self <: ListConnectionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHostArnFilter(value: HostArn): Self = this.set("HostArnFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostArnFilter: Self = this.set("HostArnFilter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setProviderTypeFilter(value: ProviderType): Self = this.set("ProviderTypeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderTypeFilter: Self = this.set("ProviderTypeFilter", js.undefined)
  }
}
