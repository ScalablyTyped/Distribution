package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRoutingProfileRequest extends StObject {
  
  /**
    * The default outbound queue for the routing profile.
    */
  var DefaultOutboundQueueId: QueueId = js.native
  
  /**
    * Description of the routing profile. Must not be more than 250 characters.
    */
  var Description: RoutingProfileDescription = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
    */
  var MediaConcurrencies: typings.awsSdk.connectMod.MediaConcurrencies = js.native
  
  /**
    * The name of the routing profile. Must not be more than 127 characters.
    */
  var Name: RoutingProfileName = js.native
  
  /**
    * The inbound queues associated with the routing profile. If no queue is added, the agent can only make outbound calls.
    */
  var QueueConfigs: js.UndefOr[RoutingProfileQueueConfigList] = js.native
  
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object CreateRoutingProfileRequest {
  
  @scala.inline
  def apply(
    DefaultOutboundQueueId: QueueId,
    Description: RoutingProfileDescription,
    InstanceId: InstanceId,
    MediaConcurrencies: MediaConcurrencies,
    Name: RoutingProfileName
  ): CreateRoutingProfileRequest = {
    val __obj = js.Dynamic.literal(DefaultOutboundQueueId = DefaultOutboundQueueId.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], MediaConcurrencies = MediaConcurrencies.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoutingProfileRequest]
  }
  
  @scala.inline
  implicit class CreateRoutingProfileRequestMutableBuilder[Self <: CreateRoutingProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultOutboundQueueId(value: QueueId): Self = StObject.set(x, "DefaultOutboundQueueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: RoutingProfileDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaConcurrencies(value: MediaConcurrencies): Self = StObject.set(x, "MediaConcurrencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaConcurrenciesVarargs(value: MediaConcurrency*): Self = StObject.set(x, "MediaConcurrencies", js.Array(value :_*))
    
    @scala.inline
    def setName(value: RoutingProfileName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueConfigs(value: RoutingProfileQueueConfigList): Self = StObject.set(x, "QueueConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueConfigsUndefined: Self = StObject.set(x, "QueueConfigs", js.undefined)
    
    @scala.inline
    def setQueueConfigsVarargs(value: RoutingProfileQueueConfig*): Self = StObject.set(x, "QueueConfigs", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
