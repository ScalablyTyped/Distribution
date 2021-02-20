package typings.compareFunction

import typings.compareFunction.compareFunctionNumbers.`-1`
import typings.compareFunction.compareFunctionNumbers.`0`
import typings.compareFunction.compareFunctionNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("compare-function", JSImport.Namespace)
  @js.native
  def apply[T](fn: js.Function1[/* item */ T, _]): js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`] = js.native
  @JSImport("compare-function", JSImport.Namespace)
  @js.native
  def apply[T](sign: Double, fn: js.Function1[/* item */ T, _]): js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`] = js.native
}
