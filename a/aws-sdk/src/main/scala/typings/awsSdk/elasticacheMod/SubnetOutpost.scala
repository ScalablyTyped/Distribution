package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetOutpost extends js.Object {
  
  /**
    * The outpost ARN of the subnet.
    */
  var SubnetOutpostArn: js.UndefOr[String] = js.native
}
object SubnetOutpost {
  
  @scala.inline
  def apply(): SubnetOutpost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetOutpost]
  }
  
  @scala.inline
  implicit class SubnetOutpostOps[Self <: SubnetOutpost] (val x: Self) extends AnyVal {
    
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
    def setSubnetOutpostArn(value: String): Self = this.set("SubnetOutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetOutpostArn: Self = this.set("SubnetOutpostArn", js.undefined)
  }
}
