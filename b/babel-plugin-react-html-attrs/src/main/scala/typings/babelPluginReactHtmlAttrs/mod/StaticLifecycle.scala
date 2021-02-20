package typings.babelPluginReactHtmlAttrs.mod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Unfortunately, we have no way of declaring that the component constructor must implement this
@js.native
trait StaticLifecycle[P, S] extends StObject {
  
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[P, S]] = js.native
  
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[P, S]] = js.native
}
object StaticLifecycle {
  
  @scala.inline
  def apply[P, S](): StaticLifecycle[P, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticLifecycle[P, S]]
  }
  
  @scala.inline
  implicit class StaticLifecycleMutableBuilder[Self <: StaticLifecycle[_, _], P, S] (val x: Self with (StaticLifecycle[P, S])) extends AnyVal {
    
    @scala.inline
    def setGetDerivedStateFromError(value: /* error */ js.Any => Partial[S] | Null): Self = StObject.set(x, "getDerivedStateFromError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDerivedStateFromErrorUndefined: Self = StObject.set(x, "getDerivedStateFromError", js.undefined)
    
    @scala.inline
    def setGetDerivedStateFromProps(value: (P, S) => Partial[S] | Null): Self = StObject.set(x, "getDerivedStateFromProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDerivedStateFromPropsUndefined: Self = StObject.set(x, "getDerivedStateFromProps", js.undefined)
  }
}
