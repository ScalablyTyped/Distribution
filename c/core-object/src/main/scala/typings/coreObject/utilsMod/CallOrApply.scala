package typings.coreObject.utilsMod

import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallOrApply[This, Args, Return] extends js.Object {
  
  @JSName("apply")
  def apply(thisArg: This, args: Args | IArguments | js.Array[_]): Return = js.native
  
  // TODO support this properly with `...args: Args` once we can restrict to 3.0+ on DT
  var call: (js.Function2[/* thisArg */ This, /* repeated */ js.Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, Return]) | (js.Function1[/* thisArg */ This, Return]) = js.native
}
object CallOrApply {
  
  @scala.inline
  def apply[This, Args, Return](
    apply: (This, Args | IArguments | js.Array[_]) => Return,
    call: (js.Function2[/* thisArg */ This, /* repeated */ js.Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, Return]) | (js.Function1[/* thisArg */ This, Return])
  ): CallOrApply[This, Args, Return] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOrApply[This, Args, Return]]
  }
  
  @scala.inline
  implicit class CallOrApplyOps[Self <: CallOrApply[_, _, _], This, Args, Return] (val x: Self with (CallOrApply[This, Args, Return])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApply(value: (This, Args | IArguments | js.Array[_]) => Return): Self = this.set("apply", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallFunction2(value: (/* thisArg */ This, /* repeated */ js.Any) => Return): Self = this.set("call", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCall(
      value: (js.Function2[/* thisArg */ This, /* repeated */ js.Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, Return]) | (js.Function1[/* thisArg */ This, Return])
    ): Self = this.set("call", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallFunction1(value: /* thisArg */ This => Return): Self = this.set("call", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallFunction4(value: (/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any) => Return): Self = this.set("call", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCallFunction3(value: (/* thisArg */ This, /* a */ js.Any, /* b */ js.Any) => Return): Self = this.set("call", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCallFunction5(
      value: (/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any) => Return
    ): Self = this.set("call", js.Any.fromFunction5(value))
  }
}
