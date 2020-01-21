package typings.cbor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type commentCallback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error], 
    /* commented */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type decodeAllCallback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error], 
    /* value */ js.UndefOr[js.Array[js.Any]], 
    scala.Unit
  ]
  type decodeCallback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error], 
    /* value */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type diagnoseCallback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error], 
    /* str */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
