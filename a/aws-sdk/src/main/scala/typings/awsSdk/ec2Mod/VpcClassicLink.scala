package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcClassicLink extends StObject {
  
  /**
    * Indicates whether the VPC is enabled for ClassicLink.
    */
  var ClassicLinkEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Any tags assigned to the VPC.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object VpcClassicLink {
  
  inline def apply(): VpcClassicLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcClassicLink]
  }
  
  extension [Self <: VpcClassicLink](x: Self) {
    
    inline def setClassicLinkEnabled(value: Boolean): Self = StObject.set(x, "ClassicLinkEnabled", value.asInstanceOf[js.Any])
    
    inline def setClassicLinkEnabledUndefined: Self = StObject.set(x, "ClassicLinkEnabled", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
