package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkMaskFilterFactory extends js.Object {
  
  /**
    * Create a blur maskfilter
    * @param style
    * @param sigma - Standard deviation of the Gaussian blur to apply. Must be > 0.
    * @param respectCTM - if true the blur's sigma is modified by the CTM.
    */
  def MakeBlur(style: BlurStyle, sigma: Double, respectCTM: Boolean): SkMaskFilter = js.native
}
object SkMaskFilterFactory {
  
  @scala.inline
  def apply(MakeBlur: (BlurStyle, Double, Boolean) => SkMaskFilter): SkMaskFilterFactory = {
    val __obj = js.Dynamic.literal(MakeBlur = js.Any.fromFunction3(MakeBlur))
    __obj.asInstanceOf[SkMaskFilterFactory]
  }
  
  @scala.inline
  implicit class SkMaskFilterFactoryOps[Self <: SkMaskFilterFactory] (val x: Self) extends AnyVal {
    
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
    def setMakeBlur(value: (BlurStyle, Double, Boolean) => SkMaskFilter): Self = this.set("MakeBlur", js.Any.fromFunction3(value))
  }
}
