package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDefaultClusterParametersResult extends js.Object {
  
  var DefaultClusterParameters: js.UndefOr[typings.awsSdk.redshiftMod.DefaultClusterParameters] = js.native
}
object DescribeDefaultClusterParametersResult {
  
  @scala.inline
  def apply(): DescribeDefaultClusterParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDefaultClusterParametersResult]
  }
  
  @scala.inline
  implicit class DescribeDefaultClusterParametersResultOps[Self <: DescribeDefaultClusterParametersResult] (val x: Self) extends AnyVal {
    
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
    def setDefaultClusterParameters(value: DefaultClusterParameters): Self = this.set("DefaultClusterParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultClusterParameters: Self = this.set("DefaultClusterParameters", js.undefined)
  }
}
