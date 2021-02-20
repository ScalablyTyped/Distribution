package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcConnectionProperties extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the VPC connection.
    */
  var VpcConnectionArn: Arn = js.native
}
object VpcConnectionProperties {
  
  @scala.inline
  def apply(VpcConnectionArn: Arn): VpcConnectionProperties = {
    val __obj = js.Dynamic.literal(VpcConnectionArn = VpcConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConnectionProperties]
  }
  
  @scala.inline
  implicit class VpcConnectionPropertiesMutableBuilder[Self <: VpcConnectionProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpcConnectionArn(value: Arn): Self = StObject.set(x, "VpcConnectionArn", value.asInstanceOf[js.Any])
  }
}
