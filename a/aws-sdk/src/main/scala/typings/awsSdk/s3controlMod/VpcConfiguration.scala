package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfiguration extends StObject {
  
  /**
    * If this field is specified, this access point will only allow connections from the specified VPC ID.
    */
  var VpcId: typings.awsSdk.s3controlMod.VpcId
}
object VpcConfiguration {
  
  @scala.inline
  def apply(VpcId: VpcId): VpcConfiguration = {
    val __obj = js.Dynamic.literal(VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfiguration]
  }
  
  @scala.inline
  implicit class VpcConfigurationMutableBuilder[Self <: VpcConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
