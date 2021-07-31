package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassicLinkDnsSupport extends StObject {
  
  /**
    * Indicates whether ClassicLink DNS support is enabled for the VPC.
    */
  var ClassicLinkDnsSupported: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object ClassicLinkDnsSupport {
  
  @scala.inline
  def apply(): ClassicLinkDnsSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassicLinkDnsSupport]
  }
  
  @scala.inline
  implicit class ClassicLinkDnsSupportMutableBuilder[Self <: ClassicLinkDnsSupport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassicLinkDnsSupported(value: Boolean): Self = StObject.set(x, "ClassicLinkDnsSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassicLinkDnsSupportedUndefined: Self = StObject.set(x, "ClassicLinkDnsSupported", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
