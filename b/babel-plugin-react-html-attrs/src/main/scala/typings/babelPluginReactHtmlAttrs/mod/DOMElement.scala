package typings.babelPluginReactHtmlAttrs.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// string fallback for custom web-components
trait DOMElement[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: Element */] extends ReactElement[P, String] {
  var ref: LegacyRef[T]
}

object DOMElement {
  @scala.inline
  def apply[/* <: typings.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] | typings.babelPluginReactHtmlAttrs.mod.SVGAttributes[T] */ P, /* <: typings.std.Element */ T](props: P, `type`: String, key: Key = null, ref: LegacyRef[T] = null): DOMElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMElement[P, T]]
  }
}

