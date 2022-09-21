package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentFactory[P, T /* <: Component[P, ComponentState, Any] */] extends StObject {
  
  def apply(props: ClassAttributes[T] & P, children: ReactNode*): CElement[P, T] = js.native
  def apply(props: Unit, children: ReactNode*): CElement[P, T] = js.native
}
