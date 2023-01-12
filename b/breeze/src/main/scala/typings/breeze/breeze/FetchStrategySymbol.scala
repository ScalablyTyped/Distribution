package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchStrategySymbol
  extends StObject
     with EnumSymbol {
  
  /* private */ var foo: Any
}
object FetchStrategySymbol {
  
  inline def apply(foo: Any, getName: () => String, parentEnum: IEnum): FetchStrategySymbol = {
    val __obj = js.Dynamic.literal(foo = foo.asInstanceOf[js.Any], getName = js.Any.fromFunction0(getName), parentEnum = parentEnum.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchStrategySymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchStrategySymbol] (val x: Self) extends AnyVal {
    
    inline def setFoo(value: Any): Self = StObject.set(x, "foo", value.asInstanceOf[js.Any])
  }
}
