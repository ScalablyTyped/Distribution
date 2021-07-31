package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.DirectionalSuspenseListProps
  - typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.NonDirectionalSuspenseListProps
*/
trait SuspenseListProps extends StObject
object SuspenseListProps {
  
  @scala.inline
  def DirectionalSuspenseListProps(
    children: (ReactElement[js.Any, String | JSXElementConstructor[js.Any]]) | (Iterable[ReactElement[js.Any, String | JSXElementConstructor[js.Any]]]),
    revealOrder: forwards | backwards
  ): typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.DirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.DirectionalSuspenseListProps]
  }
  
  @scala.inline
  def NonDirectionalSuspenseListProps(
    children: (ReactElement[js.Any, String | JSXElementConstructor[js.Any]]) | (Iterable[ReactElement[js.Any, String | JSXElementConstructor[js.Any]]])
  ): typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.NonDirectionalSuspenseListProps]
  }
}
