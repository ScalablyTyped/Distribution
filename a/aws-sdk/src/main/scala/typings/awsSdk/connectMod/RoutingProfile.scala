package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutingProfile extends js.Object {
  
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
  implicit class RoutingProfileOps[Self <: RoutingProfile] (val x: Self) extends AnyVal {
    
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
    def deleteDefaultOutboundQueueId: Self = this.set("DefaultOutboundQueueId", js.undefined)
    
    @scala.inline
    def setDescription(value: RoutingProfileDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setMediaConcurrenciesVarargs(value: MediaConcurrency*): Self = this.set("MediaConcurrencies", js.Array(value :_*))
    
    @scala.inline
    def setMediaConcurrencies(value: MediaConcurrencies): Self = this.set("MediaConcurrencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaConcurrencies: Self = this.set("MediaConcurrencies", js.undefined)
    
    @scala.inline
    def setName(value: RoutingProfileName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setRoutingProfileArn(value: ARN): Self = this.set("RoutingProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingProfileArn: Self = this.set("RoutingProfileArn", js.undefined)
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = this.set("RoutingProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingProfileId: Self = this.set("RoutingProfileId", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
