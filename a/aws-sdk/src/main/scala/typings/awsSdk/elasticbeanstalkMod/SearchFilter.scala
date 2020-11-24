package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFilter extends js.Object {
  
  /**
    * The result attribute to which the filter values are applied. Valid values vary by API action.
    */
  var Attribute: js.UndefOr[SearchFilterAttribute] = js.native
  
  /**
    * The operator to apply to the Attribute with each of the Values. Valid values vary by Attribute.
    */
  var Operator: js.UndefOr[SearchFilterOperator] = js.native
  
  /**
    * The list of values applied to the Attribute and Operator attributes. Number of values and valid values vary by Attribute.
    */
  var Values: js.UndefOr[SearchFilterValues] = js.native
}
object SearchFilter {
  
  @scala.inline
  def apply(): SearchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFilter]
  }
  
  @scala.inline
  implicit class SearchFilterOps[Self <: SearchFilter] (val x: Self) extends AnyVal {
    
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
    def setAttribute(value: SearchFilterAttribute): Self = this.set("Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("Attribute", js.undefined)
    
    @scala.inline
    def setOperator(value: SearchFilterOperator): Self = this.set("Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("Operator", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: SearchFilterValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: SearchFilterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
