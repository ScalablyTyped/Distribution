package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeActivationsFilter extends js.Object {
  
  /**
    * The name of the filter.
    */
  var FilterKey: js.UndefOr[DescribeActivationsFilterKeys] = js.native
  
  /**
    * The filter values.
    */
  var FilterValues: js.UndefOr[StringList] = js.native
}
object DescribeActivationsFilter {
  
  @scala.inline
  def apply(): DescribeActivationsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActivationsFilter]
  }
  
  @scala.inline
  implicit class DescribeActivationsFilterOps[Self <: DescribeActivationsFilter] (val x: Self) extends AnyVal {
    
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
    def setFilterKey(value: DescribeActivationsFilterKeys): Self = this.set("FilterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterKey: Self = this.set("FilterKey", js.undefined)
    
    @scala.inline
    def setFilterValuesVarargs(value: String*): Self = this.set("FilterValues", js.Array(value :_*))
    
    @scala.inline
    def setFilterValues(value: StringList): Self = this.set("FilterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterValues: Self = this.set("FilterValues", js.undefined)
  }
}
