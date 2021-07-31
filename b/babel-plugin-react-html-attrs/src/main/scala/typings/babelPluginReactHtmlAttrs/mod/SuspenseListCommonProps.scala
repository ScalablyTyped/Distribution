package typings.babelPluginReactHtmlAttrs.mod

import typings.std.Iterable
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
  var children: (ReactElement[js.Any, String | JSXElementConstructor[js.Any]]) | (Iterable[ReactElement[js.Any, String | JSXElementConstructor[js.Any]]])
}
object SuspenseListCommonProps {
  
  @scala.inline
  def apply(
    children: (ReactElement[js.Any, String | JSXElementConstructor[js.Any]]) | (Iterable[ReactElement[js.Any, String | JSXElementConstructor[js.Any]]])
  ): SuspenseListCommonProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseListCommonProps]
  }
  
  @scala.inline
  implicit class SuspenseListCommonPropsMutableBuilder[Self <: SuspenseListCommonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(
      value: (ReactElement[js.Any, String | JSXElementConstructor[js.Any]]) | (Iterable[ReactElement[js.Any, String | JSXElementConstructor[js.Any]]])
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
