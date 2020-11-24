package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoolCidrBlock extends js.Object {
  
  /**
    * The CIDR block.
    */
  var Cidr: js.UndefOr[String] = js.native
}
object PoolCidrBlock {
  
  @scala.inline
  def apply(): PoolCidrBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolCidrBlock]
  }
  
  @scala.inline
  implicit class PoolCidrBlockOps[Self <: PoolCidrBlock] (val x: Self) extends AnyVal {
    
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
    def setCidr(value: String): Self = this.set("Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidr: Self = this.set("Cidr", js.undefined)
  }
}
