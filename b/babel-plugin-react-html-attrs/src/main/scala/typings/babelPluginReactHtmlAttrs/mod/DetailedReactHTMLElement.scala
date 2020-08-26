package typings.babelPluginReactHtmlAttrs.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */] extends DOMElement[P, T]

object DetailedReactHTMLElement {
  @scala.inline
  def apply[/* <: typings.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */ P, /* <: typings.std.HTMLElement */ T](props: P, `type`: String): DetailedReactHTMLElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedReactHTMLElement[P, T]]
  }
}

