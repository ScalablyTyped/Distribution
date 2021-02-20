package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalGateway extends StObject {
  
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.LocalGatewayId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  
  /**
    * The AWS account ID that owns the local gateway.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The state of the local gateway.
    */
  var State: js.UndefOr[String] = js.native
  
  /**
    * The tags assigned to the local gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object LocalGateway {
  
  @scala.inline
  def apply(): LocalGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalGateway]
  }
  
  @scala.inline
  implicit class LocalGatewayMutableBuilder[Self <: LocalGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalGatewayId(value: LocalGatewayId): Self = StObject.set(x, "LocalGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayIdUndefined: Self = StObject.set(x, "LocalGatewayId", js.undefined)
    
    @scala.inline
    def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
