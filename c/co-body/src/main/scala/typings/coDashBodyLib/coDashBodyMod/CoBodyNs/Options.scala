package typings
package coDashBodyLib.coDashBodyMod.CoBodyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var formTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var jsonTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var limit: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var queryString: js.UndefOr[qsLib.qsMod.QueryStringNs.IParseOptions] = js.undefined
  var returnRawBody: js.UndefOr[scala.Boolean] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var textTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    formTypes: js.Array[java.lang.String] = null,
    jsonTypes: js.Array[java.lang.String] = null,
    length: scala.Int | scala.Double = null,
    limit: scala.Double | java.lang.String = null,
    queryString: qsLib.qsMod.QueryStringNs.IParseOptions = null,
    returnRawBody: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    textTypes: js.Array[java.lang.String] = null
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

