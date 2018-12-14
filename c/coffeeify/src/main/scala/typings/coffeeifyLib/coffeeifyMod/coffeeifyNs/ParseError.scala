package typings
package coffeeifyLib.coffeeifyMod.coffeeifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseError
  extends stdLib.Error
     with org.scalablytyped.runtime.Instantiable3[
      /* error */ js.Any, 
      /* src */ java.lang.String, 
      /* file */ java.lang.String, 
      ParseError
    ] {
  var annotated: java.lang.String = js.native
  var column: scala.Double = js.native
  var line: scala.Double = js.native
}

