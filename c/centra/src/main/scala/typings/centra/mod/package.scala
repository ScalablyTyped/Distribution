package typings.centra

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CentraFactory = js.Function2[
    /* url */ typings.std.URL | java.lang.String, 
    /* method */ js.UndefOr[java.lang.String], 
    typings.centra.mod.Request
  ]
}
