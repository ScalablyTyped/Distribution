package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildContextProvider[CC] extends StObject {
  
  def getChildContext(): CC = js.native
}
object ChildContextProvider {
  
  @scala.inline
  def apply[CC](getChildContext: () => CC): ChildContextProvider[CC] = {
    val __obj = js.Dynamic.literal(getChildContext = js.Any.fromFunction0(getChildContext))
    __obj.asInstanceOf[ChildContextProvider[CC]]
  }
  
  @scala.inline
  implicit class ChildContextProviderMutableBuilder[Self <: ChildContextProvider[_], CC] (val x: Self with ChildContextProvider[CC]) extends AnyVal {
    
    @scala.inline
    def setGetChildContext(value: () => CC): Self = StObject.set(x, "getChildContext", js.Any.fromFunction0(value))
  }
}
