package typings.cwise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Arg = typings.ndarray.mod.ndarray[scala.Double] | (js.Function2[/* row */ scala.Double, /* col */ scala.Double, scala.Double]) | js.Array[scala.Double] | js.Any
  
  type Return = js.Function2[
    /* a */ typings.ndarray.mod.ndarray[scala.Double], 
    /* repeated */ typings.cwise.mod.Arg, 
    scala.Unit
  ]
}
