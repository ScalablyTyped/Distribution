package typings
package coreDashObjectLib.dashPrivateUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallOrApply[This, Args, Return] extends js.Object {
  // TODO support this properly with `...args: Args` once we can restrict to 3.0+ on DT
  var call: (js.Function2[/* thisArg */ This, /* repeated */ js.Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, Return]) | (js.Function1[/* thisArg */ This, Return])
  @JSName("apply")
  def apply(thisArg: This, args: Args | stdLib.IArguments | js.Array[_]): Return
}

object CallOrApply {
  @scala.inline
  def apply[This, Args, Return](
    apply: (This, Args | stdLib.IArguments | js.Array[_]) => Return,
    call: (js.Function2[/* thisArg */ This, /* repeated */ js.Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, Return]) | (js.Function1[/* thisArg */ This, Return])
  ): CallOrApply[This, Args, Return] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), call = call.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CallOrApply[This, Args, Return]]
  }
}

