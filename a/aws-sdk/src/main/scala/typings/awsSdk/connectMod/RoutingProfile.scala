package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutingProfile extends StObject {
  
  /**
    * The identifier of the default outbound queue for this routing profile.
    */
  var DefaultOutboundQueueId: js.UndefOr[QueueId] = js.native
  
  /**
    * The description of the routing profile.
    */
  var Description: js.UndefOr[RoutingProfileDescription] = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.connectMod.InstanceId] = js.native
  
  /**
    * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
    */
  var MediaConcurrencies: js.UndefOr[typings.awsSdk.connectMod.MediaConcurrencies] = js.native
  
  /**
    * The name of the routing profile.
    */
  var Name: js.UndefOr[RoutingProfileName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the routing profile.
    */
  var RoutingProfileArn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: js.UndefOr[typings.awsSdk.connectMod.RoutingProfileId] = js.native
  
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object RoutingProfile {
  
  @scala.inline
  def apply(): RoutingProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutingProfile]
  }
  
  @scala.inline
  implicit class RoutingProfileMutableBuilder[Self <: RoutingProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultOutboundQueueId(value: QueueId): Self = StObject.set(x, "DefaultOutboundQueueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOutboundQueueIdUndefined: Self = StObject.set(x, "DefaultOutboundQueueId", js.undefined)
    
    @scala.inline
    def setDescription(value: RoutingProfileDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setMediaConcurrencies(value: MediaConcurrencies): Self = StObject.set(x, "MediaConcurrencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaConcurrenciesUndefined: Self = StObject.set(x, "MediaConcurrencies", js.undefined)
    
    @scala.inline
    def setMediaConcurrenciesVarargs(value: MediaConcurrency*): Self = StObject.set(x, "MediaConcurrencies", js.Array(value :_*))
    
    @scala.inline
    def setName(value: RoutingProfileName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRoutingProfileArn(value: ARN): Self = StObject.set(x, "RoutingProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileArnUndefined: Self = StObject.set(x, "RoutingProfileArn", js.undefined)
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileIdUndefined: Self = StObject.set(x, "RoutingProfileId", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
