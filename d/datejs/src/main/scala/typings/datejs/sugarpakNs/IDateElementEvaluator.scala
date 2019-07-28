package typings.datejs.sugarpakNs

import typings.datejs.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateElementEvaluator extends js.Object {
  def after(): Date
  def ago(): Date
  def before(): Date
  def fromNow(): Date
}

object IDateElementEvaluator {
  @scala.inline
  def apply(after: () => Date, ago: () => Date, before: () => Date, fromNow: () => Date): IDateElementEvaluator = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction0(after), ago = js.Any.fromFunction0(ago), before = js.Any.fromFunction0(before), fromNow = js.Any.fromFunction0(fromNow))
  
    __obj.asInstanceOf[IDateElementEvaluator]
  }
}

