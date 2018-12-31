package typings
package coreDashObjectLib.dashPrivateUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallOrApply[This, Args, Return] extends js.Object {
  // TODO support this properly with `...args: Args` once we can restrict to 3.0+ on DT
  var call: (js.Function2[/* thisArg */ This, /* repeated */ js.Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, Return]) | (js.Function1[/* thisArg */ This, Return]) = js.native
  @JSName("apply")
  def apply(thisArg: This, args: Args): Return = js.native
  @JSName("apply")
  def apply(thisArg: This, args: js.Array[_]): Return = js.native
  @JSName("apply")
  def apply(thisArg: This, args: stdLib.IArguments): Return = js.native
}

