package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object c3Mod {
  type ArrayOrString = js.Array[String] | String
  type FormatFunction = js.Function4[/* v */ js.Any, /* id */ String, /* i */ Double, /* j */ Double, Unit]
  type PrimitiveArray = js.Array[String | Boolean | Double | Null]
}
