package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcConnectionProperties extends js.Object {
  
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
  implicit class VpcConnectionPropertiesOps[Self <: VpcConnectionProperties] (val x: Self) extends AnyVal {
    
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
    def setVpcConnectionArn(value: Arn): Self = this.set("VpcConnectionArn", value.asInstanceOf[js.Any])
  }
}
