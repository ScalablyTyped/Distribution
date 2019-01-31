package typings
package customDashFunctionsDashRuntimeLib.CustomFunctionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @beta
  * Provides information about the invocation of a custom function.
  */
trait Invocation extends js.Object {
  /**
    * @beta
    * The cell address where the function is being called, if requested, otherwise undefined.
    *
    * To request the address for the function, in the metadata JSON file, the function options should specify:
    * `{ "requiresAddress": true }`
    *
    * If the metadata JSON file is being generated from JSDoc comments, include the tag `@requiresAddress`.
    */
  var address: js.UndefOr[java.lang.String] = js.undefined
}

