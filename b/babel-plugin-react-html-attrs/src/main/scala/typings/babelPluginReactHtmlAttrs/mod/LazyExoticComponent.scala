package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ExoticComponent<babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ComponentPropsWithRef<T>> & { readonly _result  :T} */
@js.native
trait LazyExoticComponent[T /* <: ComponentType[_] */] extends js.Object {
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  val _result: T = js.native
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: ComponentPropsWithRef[T]): (ReactElement[_, String | JSXElementConstructor[_]]) | Null = js.native
}

