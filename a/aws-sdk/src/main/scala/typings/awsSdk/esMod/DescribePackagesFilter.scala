package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePackagesFilter extends js.Object {
  
  /**
    * Any field from PackageDetails.
    */
  var Name: js.UndefOr[DescribePackagesFilterName] = js.native
  
  /**
    * A list of values for the specified field.
    */
  var Value: js.UndefOr[DescribePackagesFilterValues] = js.native
}
object DescribePackagesFilter {
  
  @scala.inline
  def apply(): DescribePackagesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePackagesFilter]
  }
  
  @scala.inline
  implicit class DescribePackagesFilterOps[Self <: DescribePackagesFilter] (val x: Self) extends AnyVal {
    
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
    def setName(value: DescribePackagesFilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: DescribePackagesFilterValue*): Self = this.set("Value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: DescribePackagesFilterValues): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
