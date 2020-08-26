package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLProps[T]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T]

object HTMLProps {
  @scala.inline
  def apply[T](): HTMLProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLProps[T]]
  }
}

