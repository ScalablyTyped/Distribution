package typings.babylonjs.easingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEasingFunction extends js.Object {
  
  /**
    * Given an input gradient between 0 and 1, this returns the corrseponding value
    * of the easing function.
    * The link below provides some of the most common examples of easing functions.
    * @see https://easings.net/
    * @param gradient Defines the value between 0 and 1 we want the easing value for
    * @returns the corresponding value on the curve defined by the easing function
    */
  def ease(gradient: Double): Double = js.native
}
object IEasingFunction {
  
  @scala.inline
  def apply(ease: Double => Double): IEasingFunction = {
    val __obj = js.Dynamic.literal(ease = js.Any.fromFunction1(ease))
    __obj.asInstanceOf[IEasingFunction]
  }
  
  @scala.inline
  implicit class IEasingFunctionOps[Self <: IEasingFunction] (val x: Self) extends AnyVal {
    
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
    def setEase(value: Double => Double): Self = this.set("ease", js.Any.fromFunction1(value))
  }
}
