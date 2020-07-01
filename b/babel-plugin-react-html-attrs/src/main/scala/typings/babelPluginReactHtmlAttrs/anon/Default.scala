package typings.babelPluginReactHtmlAttrs.anon

import typings.babelPluginReactHtmlAttrs.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default[T /* <: ComponentType[_] */] extends js.Object {
  var default: T
}

object Default {
  @scala.inline
  def apply[/* <: typings.babelPluginReactHtmlAttrs.mod.ComponentType[_] */ T](default: T): Default[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[T]]
  }
}

