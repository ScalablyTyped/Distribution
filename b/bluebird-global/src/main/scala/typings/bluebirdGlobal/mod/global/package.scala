package typings.bluebirdGlobal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object global {
  
  type IterateFunction[T, R] = js.Function3[
    /* item */ T, 
    /* index */ scala.Double, 
    /* arrayLength */ scala.Double, 
    R | js.Thenable[R]
  ]
}
