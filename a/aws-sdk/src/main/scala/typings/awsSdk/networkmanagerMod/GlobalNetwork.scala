package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalNetwork extends StObject {
  
  /**
    * The date and time that the global network was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The description of the global network.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the global network.
    */
  var GlobalNetworkArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the global network.
    */
  var State: js.UndefOr[GlobalNetworkState] = js.undefined
  
  /**
    * The tags for the global network.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object GlobalNetwork {
  
  inline def apply(): GlobalNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalNetwork]
  }
  
  extension [Self <: GlobalNetwork](x: Self) {
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlobalNetworkArn(value: String): Self = StObject.set(x, "GlobalNetworkArn", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkArnUndefined: Self = StObject.set(x, "GlobalNetworkArn", js.undefined)
    
    inline def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    inline def setState(value: GlobalNetworkState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
