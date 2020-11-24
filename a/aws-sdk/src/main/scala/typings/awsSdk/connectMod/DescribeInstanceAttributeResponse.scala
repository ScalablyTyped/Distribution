package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceAttributeResponse extends js.Object {
  
  /**
    * The type of attribute.
    */
  var Attribute: js.UndefOr[typings.awsSdk.connectMod.Attribute] = js.native
}
object DescribeInstanceAttributeResponse {
  
  @scala.inline
  def apply(): DescribeInstanceAttributeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceAttributeResponse]
  }
  
  @scala.inline
  implicit class DescribeInstanceAttributeResponseOps[Self <: DescribeInstanceAttributeResponse] (val x: Self) extends AnyVal {
    
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
    def setAttribute(value: Attribute): Self = this.set("Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("Attribute", js.undefined)
  }
}
