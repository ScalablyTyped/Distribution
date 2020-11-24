package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#core/animation
  *
  */
@js.native
trait AnimationFitOptions extends js.Object {
  
  var eles: CollectionArgument | Selector = js.native
  
   // to which the viewport will be fitted.
  var padding: Double = js.native
}
object AnimationFitOptions {
  
  @scala.inline
  def apply(eles: CollectionArgument | Selector, padding: Double): AnimationFitOptions = {
    val __obj = js.Dynamic.literal(eles = eles.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationFitOptions]
  }
  
  @scala.inline
  implicit class AnimationFitOptionsOps[Self <: AnimationFitOptions] (val x: Self) extends AnyVal {
    
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
    def setEles(value: CollectionArgument | Selector): Self = this.set("eles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
  }
}
