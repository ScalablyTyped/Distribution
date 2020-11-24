package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchFilter extends js.Object {
  
  /**
    * The key for the filter. Run the DescribePatchProperties command to view lists of valid keys for each operating system type.
    */
  var Key: PatchFilterKey = js.native
  
  /**
    * The value for the filter key. Run the DescribePatchProperties command to view lists of valid values for each key based on operating system type.
    */
  var Values: PatchFilterValueList = js.native
}
object PatchFilter {
  
  @scala.inline
  def apply(Key: PatchFilterKey, Values: PatchFilterValueList): PatchFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchFilter]
  }
  
  @scala.inline
  implicit class PatchFilterOps[Self <: PatchFilter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: PatchFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: PatchFilterValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: PatchFilterValueList): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
}
