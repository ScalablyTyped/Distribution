package typings.compareFunction

import typings.compareFunction.compareFunctionNumbers.`-1`
import typings.compareFunction.compareFunctionNumbers.`0`
import typings.compareFunction.compareFunctionNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](fn: js.Function1[/* item */ T, js.Any]): js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`]]
  inline def apply[T](sign: Double, fn: js.Function1[/* item */ T, js.Any]): js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`] = (^.asInstanceOf[js.Dynamic].apply(sign.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`]]
  
  @JSImport("compare-function", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
