package typings.baseui.sliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedProps extends js.Object {
  @JSName("$disabled")
  var $disabled: Boolean
  @JSName("$isDragged")
  var $isDragged: Boolean
  @JSName("$max")
  var $max: Double
  @JSName("$min")
  var $min: Double
  @JSName("$thumbIndex")
  var $thumbIndex: Double
  @JSName("$value")
  var $value: js.Array[Double]
}

object SharedProps {
  @scala.inline
  def apply(
    $disabled: Boolean,
    $isDragged: Boolean,
    $max: Double,
    $min: Double,
    $thumbIndex: Double,
    $value: js.Array[Double]
  ): SharedProps = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isDragged = $isDragged.asInstanceOf[js.Any], $max = $max.asInstanceOf[js.Any], $min = $min.asInstanceOf[js.Any], $thumbIndex = $thumbIndex.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SharedProps]
  }
}

