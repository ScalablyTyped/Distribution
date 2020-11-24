package typings.baseui.aspectRatioBoxMod

import typings.baseui.blockMod.BlockProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AspectRatioBoxProps extends BlockProps {
  
  /** Aspect ratio is width divided by height. */
  var aspectRatio: js.UndefOr[Double] = js.native
}
object AspectRatioBoxProps {
  
  @scala.inline
  def apply(): AspectRatioBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AspectRatioBoxProps]
  }
  
  @scala.inline
  implicit class AspectRatioBoxPropsOps[Self <: AspectRatioBoxProps] (val x: Self) extends AnyVal {
    
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
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
  }
}
