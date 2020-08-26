package typings.csstype.mod.DataType

import typings.csstype.mod.Property._AnimationDirection
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
  extends _SingleAnimation[js.Any]
     with _AnimationDirection

object SingleAnimationDirection {
  @scala.inline
  def alternate: typings.csstype.csstypeStrings.alternate = "alternate".asInstanceOf[typings.csstype.csstypeStrings.alternate]
  @scala.inline
  def `alternate-reverse`: typings.csstype.csstypeStrings.`alternate-reverse` = "alternate-reverse".asInstanceOf[typings.csstype.csstypeStrings.`alternate-reverse`]
  @scala.inline
  def normal: typings.csstype.csstypeStrings.normal = "normal".asInstanceOf[typings.csstype.csstypeStrings.normal]
  @scala.inline
  def reverse: typings.csstype.csstypeStrings.reverse = "reverse".asInstanceOf[typings.csstype.csstypeStrings.reverse]
}

