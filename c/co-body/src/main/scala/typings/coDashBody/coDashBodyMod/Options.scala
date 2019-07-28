package typings.coDashBody.coDashBodyMod

import typings.qs.qsMod.IParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var formTypes: js.UndefOr[js.Array[String]] = js.undefined
  var jsonTypes: js.UndefOr[js.Array[String]] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var limit: js.UndefOr[Double | String] = js.undefined
  var queryString: js.UndefOr[IParseOptions] = js.undefined
  var returnRawBody: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var textTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    encoding: String = null,
    formTypes: js.Array[String] = null,
    jsonTypes: js.Array[String] = null,
    length: Int | Double = null,
    limit: Double | String = null,
    queryString: IParseOptions = null,
    returnRawBody: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    textTypes: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (formTypes != null) __obj.updateDynamic("formTypes")(formTypes)
    if (jsonTypes != null) __obj.updateDynamic("jsonTypes")(jsonTypes)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    if (!js.isUndefined(returnRawBody)) __obj.updateDynamic("returnRawBody")(returnRawBody)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (textTypes != null) __obj.updateDynamic("textTypes")(textTypes)
    __obj.asInstanceOf[Options]
  }
}

