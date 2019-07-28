package typings.consul

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object consulMod {
  type Callback[TData] = js.Function3[
    /* err */ js.UndefOr[Error], 
    /* data */ js.UndefOr[TData], 
    /* res */ js.UndefOr[Response], 
    js.Any
  ]
}
