package typings.cypress.cypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If Cypress fails to run at all (for example, if there are no spec files to run),
  * then it will return a CypressFailedRunResult. Check the failures attribute.
  * @example
  ```
  const result = await cypress.run()
  if (result.failures) {
  console.error(result.message)
  process.exit(result.failures)
  }
  ```
  *
  **/
trait CypressFailedRunResult extends js.Object {
  var failures: Double
  var message: String
}

object CypressFailedRunResult {
  @scala.inline
  def apply(failures: Double, message: String): CypressFailedRunResult = {
    val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypressFailedRunResult]
  }
}

