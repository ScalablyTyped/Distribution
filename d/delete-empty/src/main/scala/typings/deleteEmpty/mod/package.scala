package typings.deleteEmpty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DeleteEmptyCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* deleted */ js.Array[java.lang.String], 
    scala.Unit
  ]
  
  type FilterFunction = js.Function2[/* file */ java.lang.String, /* regex */ typings.std.RegExp, java.lang.String]
}
