package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRoutingProfileRequest extends js.Object {
  
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
  implicit class CreateRoutingProfileRequestOps[Self <: CreateRoutingProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultOutboundQueueId(value: QueueId): Self = this.set("DefaultOutboundQueueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: RoutingProfileDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaConcurrenciesVarargs(value: MediaConcurrency*): Self = this.set("MediaConcurrencies", js.Array(value :_*))
    
    @scala.inline
    def setMediaConcurrencies(value: MediaConcurrencies): Self = this.set("MediaConcurrencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: RoutingProfileName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueConfigsVarargs(value: RoutingProfileQueueConfig*): Self = this.set("QueueConfigs", js.Array(value :_*))
    
    @scala.inline
    def setQueueConfigs(value: RoutingProfileQueueConfigList): Self = this.set("QueueConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueConfigs: Self = this.set("QueueConfigs", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
