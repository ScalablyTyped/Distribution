package typings
package consulLib.consulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ConsulNs {
  type Callback[TData] = js.Function3[
    /* err */ js.UndefOr[nodeLib.Error], 
    /* data */ js.UndefOr[TData], 
    /* res */ js.UndefOr[Response], 
    js.Any
  ]
}
