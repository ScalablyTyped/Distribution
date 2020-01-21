package typings.consola

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConsolaMock = js.Function1[/* args */ js.Any, scala.Unit]
  type ConsolaMockFn = js.Function2[
    /* type */ java.lang.String, 
    /* defaults */ typings.consola.mod.ConsolaLogObject, 
    typings.consola.mod.ConsolaMock
  ]
}
