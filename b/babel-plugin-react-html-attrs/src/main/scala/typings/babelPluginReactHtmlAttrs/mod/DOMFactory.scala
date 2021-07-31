package typings.babelPluginReactHtmlAttrs.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMFactory[P /* <: DOMAttributes[T] */, T /* <: Element */] extends StObject {
  
  def apply(props: ClassAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = js.native
  def apply(props: Null, children: ReactNode*): DOMElement[P, T] = js.native
  def apply(props: Unit, children: ReactNode*): DOMElement[P, T] = js.native
}
