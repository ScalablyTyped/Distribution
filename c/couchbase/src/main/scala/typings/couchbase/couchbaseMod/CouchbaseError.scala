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
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (innerError != null) __obj.updateDynamic("innerError")(innerError.asInstanceOf[js.Any])
    if (responseBody != null) __obj.updateDynamic("responseBody")(responseBody.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CouchbaseError]
  }
}

