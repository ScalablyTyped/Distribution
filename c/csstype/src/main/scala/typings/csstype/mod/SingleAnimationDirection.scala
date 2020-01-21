package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.alternate
  - typings.csstype.csstypeStrings.`alternate-reverse`
  - typings.csstype.csstypeStrings.normal
  - typings.csstype.csstypeStrings.reverse
*/
trait SingleAnimationDirection
  extends _SingleAnimation
     with _AnimationDirectionProperty

object SingleAnimationDirection {
  @scala.inline
  def alternate: typings.csstype.csstypeStrings.alternate = this.cast("alternate")
  @scala.inline
  def `alternate-reverse`: typings.csstype.csstypeStrings.`alternate-reverse` = this.cast("alternate-reverse")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typings.csstype.csstypeStrings.normal = this.cast("normal")
  @scala.inline
  def reverse: typings.csstype.csstypeStrings.reverse = this.cast("reverse")
}

