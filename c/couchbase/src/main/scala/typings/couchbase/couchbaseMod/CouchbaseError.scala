package typings.couchbase.couchbaseMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The virtual class thrown for all Couchnode errors.
  */
trait CouchbaseError extends Error {
  /**
    * The error code for this error.
    */
  var code: js.UndefOr[errors] = js.undefined
  /**
    * Possible inner error for this error.
    */
  var innerError: js.UndefOr[CouchbaseError] = js.undefined
  /**
    * Possible response body included with the error.
    */
  var responseBody: js.UndefOr[js.Any] = js.undefined
}

object CouchbaseError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    code: errors = null,
    innerError: CouchbaseError = null,
    responseBody: js.Any = null,
    stack: String = null
  ): CouchbaseError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (code != null) __obj.updateDynamic("code")(code)
    if (innerError != null) __obj.updateDynamic("innerError")(innerError)
    if (responseBody != null) __obj.updateDynamic("responseBody")(responseBody)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[CouchbaseError]
  }
}

