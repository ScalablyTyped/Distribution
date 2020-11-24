package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CostCategoryValues extends js.Object {
  
  var Key: js.UndefOr[CostCategoryName] = js.native
  
  /**
    *  The match options that you can use to filter your results. MatchOptions is only applicable for only applicable for actions related to cost category. The default values for MatchOptions is EQUALS and CASE_SENSITIVE. 
    */
  var MatchOptions: js.UndefOr[typings.awsSdk.costexplorerMod.MatchOptions] = js.native
  
  /**
    * The specific value of the Cost Category.
    */
  var Values: js.UndefOr[typings.awsSdk.costexplorerMod.Values] = js.native
}
object CostCategoryValues {
  
  @scala.inline
  def apply(): CostCategoryValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostCategoryValues]
  }
  
  @scala.inline
  implicit class CostCategoryValuesOps[Self <: CostCategoryValues] (val x: Self) extends AnyVal {
    
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
    def setKey(value: CostCategoryName): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setMatchOptionsVarargs(value: MatchOption*): Self = this.set("MatchOptions", js.Array(value :_*))
    
    @scala.inline
    def setMatchOptions(value: MatchOptions): Self = this.set("MatchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchOptions: Self = this.set("MatchOptions", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Value*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: Values): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
