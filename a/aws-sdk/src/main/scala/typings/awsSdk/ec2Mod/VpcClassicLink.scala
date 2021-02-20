package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcClassicLink extends StObject {
  
  /**
    * Indicates whether the VPC is enabled for ClassicLink.
    */
  var ClassicLinkEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Any tags assigned to the VPC.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object VpcClassicLink {
  
  @scala.inline
  def apply(): VpcClassicLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcClassicLink]
  }
  
  @scala.inline
  implicit class VpcClassicLinkMutableBuilder[Self <: VpcClassicLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassicLinkEnabled(value: Boolean): Self = StObject.set(x, "ClassicLinkEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassicLinkEnabledUndefined: Self = StObject.set(x, "ClassicLinkEnabled", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
