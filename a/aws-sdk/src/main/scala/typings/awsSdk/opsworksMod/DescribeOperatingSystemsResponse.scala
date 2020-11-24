package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOperatingSystemsResponse extends js.Object {
  
  /**
    * Contains information in response to a DescribeOperatingSystems request.
    */
  var OperatingSystems: js.UndefOr[typings.awsSdk.opsworksMod.OperatingSystems] = js.native
}
object DescribeOperatingSystemsResponse {
  
  @scala.inline
  def apply(): DescribeOperatingSystemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOperatingSystemsResponse]
  }
  
  @scala.inline
  implicit class DescribeOperatingSystemsResponseOps[Self <: DescribeOperatingSystemsResponse] (val x: Self) extends AnyVal {
    
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
    def setOperatingSystemsVarargs(value: OperatingSystem*): Self = this.set("OperatingSystems", js.Array(value :_*))
    
    @scala.inline
    def setOperatingSystems(value: OperatingSystems): Self = this.set("OperatingSystems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystems: Self = this.set("OperatingSystems", js.undefined)
  }
}
