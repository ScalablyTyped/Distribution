package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentSpec[P, S]
  extends Mixin[P, S]
     with /* propertyName */ StringDictionary[js.Any] {
  
  def render(): ReactNode = js.native
}
object ComponentSpec {
  
  @scala.inline
  def apply[P, S](render: () => ReactNode): ComponentSpec[P, S] = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[ComponentSpec[P, S]]
  }
  
  @scala.inline
  implicit class ComponentSpecMutableBuilder[Self <: ComponentSpec[_, _], P, S] (val x: Self with (ComponentSpec[P, S])) extends AnyVal {
    
    @scala.inline
    def setRender(value: () => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
  }
}
