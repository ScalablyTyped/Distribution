package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchBaselineIdentity extends js.Object {
  
  /**
    * The description of the patch baseline.
    */
  var BaselineDescription: js.UndefOr[typings.awsSdk.ssmMod.BaselineDescription] = js.native
  
  /**
    * The ID of the patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.ssmMod.BaselineId] = js.native
  
  /**
    * The name of the patch baseline.
    */
  var BaselineName: js.UndefOr[typings.awsSdk.ssmMod.BaselineName] = js.native
  
  /**
    * Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.
    */
  var DefaultBaseline: js.UndefOr[typings.awsSdk.ssmMod.DefaultBaseline] = js.native
  
  /**
    * Defines the operating system the patch baseline applies to. The Default value is WINDOWS. 
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.ssmMod.OperatingSystem] = js.native
}
object PatchBaselineIdentity {
  
  @scala.inline
  def apply(): PatchBaselineIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchBaselineIdentity]
  }
  
  @scala.inline
  implicit class PatchBaselineIdentityOps[Self <: PatchBaselineIdentity] (val x: Self) extends AnyVal {
    
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
    def setBaselineDescription(value: BaselineDescription): Self = this.set("BaselineDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineDescription: Self = this.set("BaselineDescription", js.undefined)
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = this.set("BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineId: Self = this.set("BaselineId", js.undefined)
    
    @scala.inline
    def setBaselineName(value: BaselineName): Self = this.set("BaselineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineName: Self = this.set("BaselineName", js.undefined)
    
    @scala.inline
    def setDefaultBaseline(value: DefaultBaseline): Self = this.set("DefaultBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBaseline: Self = this.set("DefaultBaseline", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = this.set("OperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystem: Self = this.set("OperatingSystem", js.undefined)
  }
}
