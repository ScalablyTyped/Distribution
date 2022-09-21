package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspenseListCommonProps extends StObject {
  
  /**
    * Note that SuspenseList require more than one child;
    * it is a runtime warning to provide only a single child.
    *
    * It does, however, allow those children to be wrapped inside a single
    * level of `<React.Fragment>`.
    */
  var children: (ReactElement[Any, String | JSXElementConstructor[Any]]) | (js.Iterable[ReactElement[Any, String | JSXElementConstructor[Any]]])
}
object SuspenseListCommonProps {
  
  inline def apply(
    children: (ReactElement[Any, String | JSXElementConstructor[Any]]) | (js.Iterable[ReactElement[Any, String | JSXElementConstructor[Any]]])
  ): SuspenseListCommonProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListCommonProps]
  }
  
  extension [Self <: SuspenseListCommonProps](x: Self) {
    
    inline def setChildren(
      value: (ReactElement[Any, String | JSXElementConstructor[Any]]) | (js.Iterable[ReactElement[Any, String | JSXElementConstructor[Any]]])
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
