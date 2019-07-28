package typings.coffeeify.coffeeifyMod

import org.scalablytyped.runtime.Instantiable3
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseError
  extends Error
     with Instantiable3[/* error */ js.Any, /* src */ String, /* file */ String, ParseError] {
  var annotated: String = js.native
  var column: Double = js.native
  var line: Double = js.native
}

