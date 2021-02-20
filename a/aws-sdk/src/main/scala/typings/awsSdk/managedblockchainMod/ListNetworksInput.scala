package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNetworksInput extends StObject {
  
  /**
    * An optional framework specifier. If provided, only networks of this framework type are listed.
    */
  var Framework: js.UndefOr[typings.awsSdk.managedblockchainMod.Framework] = js.native
  
  /**
    * The maximum number of networks to list.
    */
  var MaxResults: js.UndefOr[NetworkListMaxResults] = js.native
  
  /**
    * The name of the network.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * An optional status specifier. If provided, only networks currently in this status are listed.
    */
  var Status: js.UndefOr[NetworkStatus] = js.native
}
object ListNetworksInput {
  
  @scala.inline
  def apply(): ListNetworksInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNetworksInput]
  }
  
  @scala.inline
  implicit class ListNetworksInputMutableBuilder[Self <: ListNetworksInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFramework(value: Framework): Self = StObject.set(x, "Framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkUndefined: Self = StObject.set(x, "Framework", js.undefined)
    
    @scala.inline
    def setMaxResults(value: NetworkListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: NetworkStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
