package typings
package datejsLib.sugarpakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateElementEvaluator extends js.Object {
  def after(): datejsLib.Date
  def ago(): datejsLib.Date
  def before(): datejsLib.Date
  def fromNow(): datejsLib.Date
}

object IDateElementEvaluator {
  @scala.inline
  def apply(
    after: () => datejsLib.Date,
    ago: () => datejsLib.Date,
    before: () => datejsLib.Date,
    fromNow: () => datejsLib.Date
  ): IDateElementEvaluator = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction0(after), ago = js.Any.fromFunction0(ago), before = js.Any.fromFunction0(before), fromNow = js.Any.fromFunction0(fromNow))
  
    __obj.asInstanceOf[IDateElementEvaluator]
  }
}

