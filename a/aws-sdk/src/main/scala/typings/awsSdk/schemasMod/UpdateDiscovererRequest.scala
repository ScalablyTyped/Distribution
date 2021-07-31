package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDiscovererRequest extends StObject {
  
  /**
    * The description of the discoverer to update.
    */
  var Description: js.UndefOr[stringMin0Max256] = js.undefined
  
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: string
}
object UpdateDiscovererRequest {
  
  @scala.inline
  def apply(DiscovererId: string): UpdateDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDiscovererRequest]
  }
  
  @scala.inline
  implicit class UpdateDiscovererRequestMutableBuilder[Self <: UpdateDiscovererRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: stringMin0Max256): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDiscovererId(value: string): Self = StObject.set(x, "DiscovererId", value.asInstanceOf[js.Any])
  }
}
