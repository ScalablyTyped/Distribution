package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePatchBaselineResult extends js.Object {
  
  /**
    * The ID of the created patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.ssmMod.BaselineId] = js.native
}
object CreatePatchBaselineResult {
  
  @scala.inline
  def apply(): CreatePatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePatchBaselineResult]
  }
  
  @scala.inline
  implicit class CreatePatchBaselineResultOps[Self <: CreatePatchBaselineResult] (val x: Self) extends AnyVal {
    
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
    def setBaselineId(value: BaselineId): Self = this.set("BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineId: Self = this.set("BaselineId", js.undefined)
  }
}
