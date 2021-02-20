package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalNetwork extends StObject {
  
  /**
    * The date and time that the global network was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  
  /**
    * The description of the global network.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the global network.
    */
  var GlobalNetworkArn: js.UndefOr[String] = js.native
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  
  /**
    * The state of the global network.
    */
  var State: js.UndefOr[GlobalNetworkState] = js.native
  
  /**
    * The tags for the global network.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object GlobalNetwork {
  
  @scala.inline
  def apply(): GlobalNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalNetwork]
  }
  
  @scala.inline
  implicit class GlobalNetworkMutableBuilder[Self <: GlobalNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: DateTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGlobalNetworkArn(value: String): Self = StObject.set(x, "GlobalNetworkArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNetworkArnUndefined: Self = StObject.set(x, "GlobalNetworkArn", js.undefined)
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    @scala.inline
    def setState(value: GlobalNetworkState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
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
