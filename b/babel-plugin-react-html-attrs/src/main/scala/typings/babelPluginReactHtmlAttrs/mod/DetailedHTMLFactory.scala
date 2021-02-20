package typings.babelPluginReactHtmlAttrs.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailedHTMLFactory[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */] extends DOMFactory[P, T] {
  
  def apply(props: ClassAttributes[T] with P, children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
  def apply(props: js.UndefOr[scala.Nothing], children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
  def apply(props: Null, children: ReactNode*): DetailedReactHTMLElement[P, T] = js.native
}
