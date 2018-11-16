package typings
package chromeLib.chromeNs.devtoolsNs.inspectedWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EvaluationExceptionInfo extends js.Object {
  /** Set if the error occurred on the DevTools side before the expression is evaluated. */
  var code: java.lang.String
  /** Set if the error occurred on the DevTools side before the expression is evaluated. */
  var description: java.lang.String
  /** Set if the error occurred on the DevTools side before the expression is evaluated, contains the array of the values that may be substituted into the description string to provide more information about the cause of the error. */
  var details: js.Array[_]
  /** Set if the error occurred on the DevTools side before the expression is evaluated. */
  var isError: scala.Boolean
  /** Set if the evaluated code produces an unhandled exception. */
  var isException: scala.Boolean
  /** Set if the evaluated code produces an unhandled exception. */
  var value: java.lang.String
}

