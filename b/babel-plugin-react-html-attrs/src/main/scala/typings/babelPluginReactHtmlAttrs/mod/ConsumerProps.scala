package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerProps[T] extends StObject {
  
  def children(value: T): ReactNode = js.native
  
  var unstable_observedBits: js.UndefOr[Double] = js.native
}
object ConsumerProps {
  
  @scala.inline
  def apply[T](children: T => ReactNode): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ConsumerProps[T]]
  }
  
  @scala.inline
  implicit class ConsumerPropsMutableBuilder[Self <: ConsumerProps[_], T] (val x: Self with ConsumerProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: T => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnstable_observedBits(value: Double): Self = StObject.set(x, "unstable_observedBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnstable_observedBitsUndefined: Self = StObject.set(x, "unstable_observedBits", js.undefined)
  }
}
