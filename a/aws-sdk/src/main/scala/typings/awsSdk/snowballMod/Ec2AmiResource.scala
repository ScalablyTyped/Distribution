package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ec2AmiResource extends js.Object {
  
  /**
    * The ID of the AMI in Amazon EC2.
    */
  var AmiId: typings.awsSdk.snowballMod.AmiId = js.native
  
  /**
    * The ID of the AMI on the Snow device.
    */
  var SnowballAmiId: js.UndefOr[String] = js.native
}
object Ec2AmiResource {
  
  @scala.inline
  def apply(AmiId: AmiId): Ec2AmiResource = {
    val __obj = js.Dynamic.literal(AmiId = AmiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ec2AmiResource]
  }
  
  @scala.inline
  implicit class Ec2AmiResourceOps[Self <: Ec2AmiResource] (val x: Self) extends AnyVal {
    
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
    def setAmiId(value: AmiId): Self = this.set("AmiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowballAmiId(value: String): Self = this.set("SnowballAmiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnowballAmiId: Self = this.set("SnowballAmiId", js.undefined)
  }
}
