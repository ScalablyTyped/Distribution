package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonDirectionalSuspenseListProps
  extends StObject
     with typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListCommonProps {
  
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: js.UndefOr[
    Exclude[
      typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListRevealOrder, 
      forwards | backwards
    ]
  ] = js.undefined
  
  /**
    * The tail property is invalid when not using the `forwards` or `backwards` reveal orders.
    */
  var tail: js.UndefOr[scala.Nothing] = js.undefined
}
object NonDirectionalSuspenseListProps {
  
  inline def apply(
    children: (ReactElement[Any, String | JSXElementConstructor[Any]]) | (js.Iterable[ReactElement[Any, String | JSXElementConstructor[Any]]])
  ): NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonDirectionalSuspenseListProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonDirectionalSuspenseListProps] (val x: Self) extends AnyVal {
    
    inline def setRevealOrder(
      value: Exclude[
          typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListRevealOrder, 
          forwards | backwards
        ]
    ): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
    
    inline def setRevealOrderUndefined: Self = StObject.set(x, "revealOrder", js.undefined)
  }
}
