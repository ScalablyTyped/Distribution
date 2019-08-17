package typings.consul

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object consulMod {
  import typings.std.Error

  type Callback[TData] = js.Function3[
    /* err */ js.UndefOr[Error], 
    /* data */ js.UndefOr[TData], 
    /* res */ js.UndefOr[Response], 
    js.Any
  ]
}
