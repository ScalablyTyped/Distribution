package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPSetSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: js.UndefOr[ResourceArn] = js.native
  
  /**
    * A description of the IP set that helps with identification. You cannot change the description of an IP set after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  
  /**
    * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: js.UndefOr[EntityId] = js.native
  
  /**
    * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var LockToken: js.UndefOr[typings.awsSdk.wafv2Mod.LockToken] = js.native
  
  /**
    * The name of the IP set. You cannot change the name of an IPSet after you create it.
    */
  var Name: js.UndefOr[EntityName] = js.native
}
object IPSetSummary {
  
  @scala.inline
  def apply(): IPSetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPSetSummary]
  }
  
  @scala.inline
  implicit class IPSetSummaryMutableBuilder[Self <: IPSetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: ResourceArn): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: EntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLockToken(value: LockToken): Self = StObject.set(x, "LockToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockTokenUndefined: Self = StObject.set(x, "LockToken", js.undefined)
    
    @scala.inline
    def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
