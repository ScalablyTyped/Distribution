package typings.consola

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object consolaMod {
  type ConsolaMock = js.Function1[/* args */ js.Any, Unit]
  type ConsolaMockFn = js.Function2[/* type */ String, /* defaults */ ConsolaLogObject, ConsolaMock]
}
