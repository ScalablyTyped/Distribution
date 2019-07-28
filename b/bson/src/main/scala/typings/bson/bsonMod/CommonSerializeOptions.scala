package typings.bson.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSerializeOptions extends js.Object {
  /** {default:false}, the serializer will check if keys are valid. */
  var checkKeys: js.UndefOr[Boolean] = js.undefined
  /** {default:true}, ignore undefined fields. */
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
  /** {default:false}, serialize the javascript functions. */
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
}

object CommonSerializeOptions {
  @scala.inline
  def apply(
    checkKeys: js.UndefOr[Boolean] = js.undefined,
    ignoreUndefined: js.UndefOr[Boolean] = js.undefined,
    serializeFunctions: js.UndefOr[Boolean] = js.undefined
  ): CommonSerializeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkKeys)) __obj.updateDynamic("checkKeys")(checkKeys)
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined)
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions)
    __obj.asInstanceOf[CommonSerializeOptions]
  }
}

