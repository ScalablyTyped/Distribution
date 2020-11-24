package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpsFilter extends js.Object {
  
  /**
    * The name of the filter.
    */
  var Key: OpsFilterKey = js.native
  
  /**
    * The type of filter.
    */
  var Type: js.UndefOr[OpsFilterOperatorType] = js.native
  
  /**
    * The filter value.
    */
  var Values: OpsFilterValueList = js.native
}
object OpsFilter {
  
  @scala.inline
  def apply(Key: OpsFilterKey, Values: OpsFilterValueList): OpsFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsFilter]
  }
  
  @scala.inline
  implicit class OpsFilterOps[Self <: OpsFilter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: OpsFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: OpsFilterValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: OpsFilterValueList): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OpsFilterOperatorType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
