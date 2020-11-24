package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalysisSearchFilter extends js.Object {
  
  /**
    * The name of the value that you want to use as a filter, for example "Name": "QUICKSIGHT_USER".
    */
  var Name: js.UndefOr[AnalysisFilterAttribute] = js.native
  
  /**
    * The comparison operator that you want to use as a filter, for example "Operator": "StringEquals".
    */
  var Operator: js.UndefOr[FilterOperator] = js.native
  
  /**
    * The value of the named item, in this case QUICKSIGHT_USER, that you want to use as a filter, for example "Value". An example is "arn:aws:quicksight:us-east-1:1:user/default/UserName1".
    */
  var Value: js.UndefOr[String] = js.native
}
object AnalysisSearchFilter {
  
  @scala.inline
  def apply(): AnalysisSearchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisSearchFilter]
  }
  
  @scala.inline
  implicit class AnalysisSearchFilterOps[Self <: AnalysisSearchFilter] (val x: Self) extends AnyVal {
    
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
    def setName(value: AnalysisFilterAttribute): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOperator(value: FilterOperator): Self = this.set("Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("Operator", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
