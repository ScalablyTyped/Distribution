package typings.atAwsDashSdkXmlDashBuilder.buildStringableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stringable extends js.Object

object Stringable {
  @scala.inline
  def apply(toString: () => String): Stringable = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Stringable]
  }
}

