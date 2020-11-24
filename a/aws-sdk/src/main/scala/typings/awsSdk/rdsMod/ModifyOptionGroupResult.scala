package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyOptionGroupResult extends js.Object {
  
  var OptionGroup: js.UndefOr[typings.awsSdk.rdsMod.OptionGroup] = js.native
}
object ModifyOptionGroupResult {
  
  @scala.inline
  def apply(): ModifyOptionGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyOptionGroupResult]
  }
  
  @scala.inline
  implicit class ModifyOptionGroupResultOps[Self <: ModifyOptionGroupResult] (val x: Self) extends AnyVal {
    
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
    def setOptionGroup(value: OptionGroup): Self = this.set("OptionGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionGroup: Self = this.set("OptionGroup", js.undefined)
  }
}
