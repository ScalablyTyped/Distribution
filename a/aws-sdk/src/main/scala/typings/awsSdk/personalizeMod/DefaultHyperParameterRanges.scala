package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultHyperParameterRanges extends js.Object {
  
  /**
    * The categorical hyperparameters and their default ranges.
    */
  var categoricalHyperParameterRanges: js.UndefOr[DefaultCategoricalHyperParameterRanges] = js.native
  
  /**
    * The continuous hyperparameters and their default ranges.
    */
  var continuousHyperParameterRanges: js.UndefOr[DefaultContinuousHyperParameterRanges] = js.native
  
  /**
    * The integer-valued hyperparameters and their default ranges.
    */
  var integerHyperParameterRanges: js.UndefOr[DefaultIntegerHyperParameterRanges] = js.native
}
object DefaultHyperParameterRanges {
  
  @scala.inline
  def apply(): DefaultHyperParameterRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultHyperParameterRanges]
  }
  
  @scala.inline
  implicit class DefaultHyperParameterRangesOps[Self <: DefaultHyperParameterRanges] (val x: Self) extends AnyVal {
    
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
    def setCategoricalHyperParameterRangesVarargs(value: DefaultCategoricalHyperParameterRange*): Self = this.set("categoricalHyperParameterRanges", js.Array(value :_*))
    
    @scala.inline
    def setCategoricalHyperParameterRanges(value: DefaultCategoricalHyperParameterRanges): Self = this.set("categoricalHyperParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoricalHyperParameterRanges: Self = this.set("categoricalHyperParameterRanges", js.undefined)
    
    @scala.inline
    def setContinuousHyperParameterRangesVarargs(value: DefaultContinuousHyperParameterRange*): Self = this.set("continuousHyperParameterRanges", js.Array(value :_*))
    
    @scala.inline
    def setContinuousHyperParameterRanges(value: DefaultContinuousHyperParameterRanges): Self = this.set("continuousHyperParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuousHyperParameterRanges: Self = this.set("continuousHyperParameterRanges", js.undefined)
    
    @scala.inline
    def setIntegerHyperParameterRangesVarargs(value: DefaultIntegerHyperParameterRange*): Self = this.set("integerHyperParameterRanges", js.Array(value :_*))
    
    @scala.inline
    def setIntegerHyperParameterRanges(value: DefaultIntegerHyperParameterRanges): Self = this.set("integerHyperParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerHyperParameterRanges: Self = this.set("integerHyperParameterRanges", js.undefined)
  }
}
