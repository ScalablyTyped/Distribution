package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOfferingResponse extends js.Object {
  
  var Offering: js.UndefOr[typings.awsSdk.mediaconnectMod.Offering] = js.native
}
object DescribeOfferingResponse {
  
  @scala.inline
  def apply(): DescribeOfferingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOfferingResponse]
  }
  
  @scala.inline
  implicit class DescribeOfferingResponseOps[Self <: DescribeOfferingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOffering(value: Offering): Self = this.set("Offering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffering: Self = this.set("Offering", js.undefined)
  }
}
