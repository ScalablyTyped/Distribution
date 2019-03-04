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
    after: js.Function0[datejsLib.Date],
    ago: js.Function0[datejsLib.Date],
    before: js.Function0[datejsLib.Date],
    fromNow: js.Function0[datejsLib.Date]
  ): IDateElementEvaluator = {
    val __obj = js.Dynamic.literal(after = after, ago = ago, before = before, fromNow = fromNow)
  
    __obj.asInstanceOf[IDateElementEvaluator]
  }
}

