package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedTargets extends js.Object {
  
  /**
    * A list of parameter values sent to targets that resolved during the Automation execution.
    */
  var ParameterValues: js.UndefOr[TargetParameterList] = js.native
  
  /**
    * A boolean value indicating whether the resolved target list is truncated.
    */
  var Truncated: js.UndefOr[Boolean] = js.native
}
object ResolvedTargets {
  
  @scala.inline
  def apply(): ResolvedTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedTargets]
  }
  
  @scala.inline
  implicit class ResolvedTargetsOps[Self <: ResolvedTargets] (val x: Self) extends AnyVal {
    
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
    def setParameterValuesVarargs(value: ParameterValue*): Self = this.set("ParameterValues", js.Array(value :_*))
    
    @scala.inline
    def setParameterValues(value: TargetParameterList): Self = this.set("ParameterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterValues: Self = this.set("ParameterValues", js.undefined)
    
    @scala.inline
    def setTruncated(value: Boolean): Self = this.set("Truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncated: Self = this.set("Truncated", js.undefined)
  }
}
