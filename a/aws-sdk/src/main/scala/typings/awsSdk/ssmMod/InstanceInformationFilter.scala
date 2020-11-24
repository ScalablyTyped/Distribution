package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceInformationFilter extends js.Object {
  
  /**
    * The name of the filter. 
    */
  var key: InstanceInformationFilterKey = js.native
  
  /**
    * The filter values.
    */
  var valueSet: InstanceInformationFilterValueSet = js.native
}
object InstanceInformationFilter {
  
  @scala.inline
  def apply(key: InstanceInformationFilterKey, valueSet: InstanceInformationFilterValueSet): InstanceInformationFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceInformationFilter]
  }
  
  @scala.inline
  implicit class InstanceInformationFilterOps[Self <: InstanceInformationFilter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: InstanceInformationFilterKey): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSetVarargs(value: InstanceInformationFilterValue*): Self = this.set("valueSet", js.Array(value :_*))
    
    @scala.inline
    def setValueSet(value: InstanceInformationFilterValueSet): Self = this.set("valueSet", value.asInstanceOf[js.Any])
  }
}
