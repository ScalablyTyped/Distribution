package typings.customFunctionsRuntime.CustomFunctions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the invocation of a custom function.
  */
@js.native
trait Invocation extends js.Object {
  /**
    * The cell address where the function is being called, if requested, otherwise undefined.
    *
    * To request the address for the function, in the metadata JSON file, the function options should specify:
    * `{ "requiresAddress": true }`
    *
    * If the metadata JSON file is being generated from JSDoc comments, include the tag `@requiresAddress`.
    */
  var address: js.UndefOr[String] = js.native
}

object Invocation {
  @scala.inline
  def apply(): Invocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invocation]
  }
  @scala.inline
  implicit class InvocationOps[Self <: Invocation] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
  }
  
}

