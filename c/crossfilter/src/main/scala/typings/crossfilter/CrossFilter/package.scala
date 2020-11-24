package typings.crossfilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object CrossFilter {
  
  type Bisection[T, U] = js.Function4[
    /* array */ js.Array[T], 
    /* value */ U, 
    /* lo */ scala.Double, 
    /* hi */ scala.Double, 
    scala.Double
  ]
  
  type HeapSelect[T] = js.Function4[
    /* array */ js.Array[T], 
    /* lo */ scala.Double, 
    /* hi */ scala.Double, 
    /* k */ scala.Double, 
    js.Array[T]
  ]
  
  type Selector[T] = js.Function1[/* value */ T, js.Any]
  
  type Sort[T] = js.Function3[/* array */ js.Array[T], /* lo */ scala.Double, /* hi */ scala.Double, js.Array[T]]
}
