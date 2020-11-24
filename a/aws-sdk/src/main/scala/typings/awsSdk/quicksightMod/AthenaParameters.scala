package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AthenaParameters extends js.Object {
  
  /**
    * The workgroup that Amazon Athena uses.
    */
  var WorkGroup: js.UndefOr[typings.awsSdk.quicksightMod.WorkGroup] = js.native
}
object AthenaParameters {
  
  @scala.inline
  def apply(): AthenaParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AthenaParameters]
  }
  
  @scala.inline
  implicit class AthenaParametersOps[Self <: AthenaParameters] (val x: Self) extends AnyVal {
    
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
    def setWorkGroup(value: WorkGroup): Self = this.set("WorkGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkGroup: Self = this.set("WorkGroup", js.undefined)
  }
}
