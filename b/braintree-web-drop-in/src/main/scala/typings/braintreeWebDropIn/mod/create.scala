package typings.braintreeWebDropIn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree-web-drop-in", "create")
@js.native
object create extends js.Object {
  
  def apply(options: Options): js.Promise[Dropin] = js.native
  def apply(
    options: Options,
    callback: js.Function2[/* error */ js.Object | Null, /* dropin */ js.UndefOr[Dropin], Unit]
  ): Unit = js.native
}
