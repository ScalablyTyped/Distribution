package typings.baseui.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedProps extends js.Object {
  
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  
  @JSName("$isDragged")
  var $isDragged: Boolean = js.native
  
  @JSName("$marks")
  var $marks: Boolean = js.native
  
  @JSName("$max")
  var $max: Double = js.native
  
  @JSName("$min")
  var $min: Double = js.native
  
  @JSName("$thumbIndex")
  var $thumbIndex: Double = js.native
  
  @JSName("$value")
  var $value: js.Array[Double] = js.native
}
object SharedProps {
  
  @scala.inline
  def apply(
    $disabled: Boolean,
    $isDragged: Boolean,
    $marks: Boolean,
    $max: Double,
    $min: Double,
    $thumbIndex: Double,
    $value: js.Array[Double]
  ): SharedProps = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isDragged = $isDragged.asInstanceOf[js.Any], $marks = $marks.asInstanceOf[js.Any], $max = $max.asInstanceOf[js.Any], $min = $min.asInstanceOf[js.Any], $thumbIndex = $thumbIndex.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedProps]
  }
  
  @scala.inline
  implicit class SharedPropsOps[Self <: SharedProps] (val x: Self) extends AnyVal {
    
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
    def set$disabled(value: Boolean): Self = this.set("$disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isDragged(value: Boolean): Self = this.set("$isDragged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$marks(value: Boolean): Self = this.set("$marks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$max(value: Double): Self = this.set("$max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$min(value: Double): Self = this.set("$min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$thumbIndex(value: Double): Self = this.set("$thumbIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$valueVarargs(value: Double*): Self = this.set("$value", js.Array(value :_*))
    
    @scala.inline
    def set$value(value: js.Array[Double]): Self = this.set("$value", value.asInstanceOf[js.Any])
  }
}
