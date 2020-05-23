package typings.coBody.mod

import typings.qs.mod.IParseOptions
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
    length: js.UndefOr[Double] = js.undefined,
    limit: Double | String = null,
    queryString: IParseOptions = null,
    returnRawBody: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    textTypes: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (formTypes != null) __obj.updateDynamic("formTypes")(formTypes.asInstanceOf[js.Any])
    if (jsonTypes != null) __obj.updateDynamic("jsonTypes")(jsonTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    if (!js.isUndefined(returnRawBody)) __obj.updateDynamic("returnRawBody")(returnRawBody.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (textTypes != null) __obj.updateDynamic("textTypes")(textTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

