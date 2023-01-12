package typings.cypress.anon

import typings.cypress.JQuery.Tween
import typings.cypress.JQuery._PropHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[TElement]
  extends StObject
     with _PropHook[TElement] {
  
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def get(tween: Tween[TElement]): Any
}
object `1` {
  
  inline def apply[TElement](get: Tween[TElement] => Any): `1`[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[`1`[TElement]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`[?], TElement] (val x: Self & `1`[TElement]) extends AnyVal {
    
    inline def setGet(value: Tween[TElement] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
