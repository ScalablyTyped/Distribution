package typings.bluebird

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CatchFilter[E] = (js.Function1[/* error */ E, scala.Boolean]) | (js.Object with E)
  
  type Constructor[E] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, E]
  
  type IterateFunction[T, R] = js.Function3[
    /* item */ T, 
    /* index */ scala.Double, 
    /* arrayLength */ scala.Double, 
    typings.bluebird.mod.Resolvable[R]
  ]
  
  type Resolvable[R] = R | js.Thenable[R]
  
  type ResolvableProps[T] = js.Object with typings.bluebird.bluebirdStrings.ResolvableProps with org.scalablytyped.runtime.TopLevel[T]
  
  /** @deprecated Use PromiseLike<T> directly. */
  type Thenable[T] = js.Thenable[T]
}
