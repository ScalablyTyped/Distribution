package typings.customDashFunctionsDashRuntime.CustomFunctions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the invocation of a custom function.
  */
trait Invocation extends js.Object {
  /**
    * The cell address where the function is being called, if requested, otherwise undefined.
    *
    * To request the address for the function, in the metadata JSON file, the function options should specify:
    * `{ "requiresAddress": true }`
    *
    * If the metadata JSON file is being generated from JSDoc comments, include the tag `@requiresAddress`.
    */
  var address: js.UndefOr[String] = js.undefined
}

object Invocation {
  @scala.inline
  def apply(address: String = null): Invocation = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    __obj.asInstanceOf[Invocation]
  }
}

