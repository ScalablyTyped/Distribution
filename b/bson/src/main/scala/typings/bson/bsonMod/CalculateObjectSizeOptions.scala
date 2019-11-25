package typings.bson.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalculateObjectSizeOptions extends js.Object {
  /** {default:true}, ignore undefined fields. */
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
  /** {default:false}, serialize the javascript functions */
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
}

object CalculateObjectSizeOptions {
  @scala.inline
  def apply(
    ignoreUndefined: js.UndefOr[Boolean] = js.undefined,
    serializeFunctions: js.UndefOr[Boolean] = js.undefined
  ): CalculateObjectSizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculateObjectSizeOptions]
  }
}

