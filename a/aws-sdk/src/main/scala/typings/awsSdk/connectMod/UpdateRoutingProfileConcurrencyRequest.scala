package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRoutingProfileConcurrencyRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The channels agents can handle in the Contact Control Panel (CCP).
    */
  var MediaConcurrencies: typings.awsSdk.connectMod.MediaConcurrencies = js.native
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: typings.awsSdk.connectMod.RoutingProfileId = js.native
}
object UpdateRoutingProfileConcurrencyRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, MediaConcurrencies: MediaConcurrencies, RoutingProfileId: RoutingProfileId): UpdateRoutingProfileConcurrencyRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], MediaConcurrencies = MediaConcurrencies.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoutingProfileConcurrencyRequest]
  }
  
  @scala.inline
  implicit class UpdateRoutingProfileConcurrencyRequestMutableBuilder[Self <: UpdateRoutingProfileConcurrencyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaConcurrencies(value: MediaConcurrencies): Self = StObject.set(x, "MediaConcurrencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaConcurrenciesVarargs(value: MediaConcurrency*): Self = StObject.set(x, "MediaConcurrencies", js.Array(value :_*))
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
  }
}
