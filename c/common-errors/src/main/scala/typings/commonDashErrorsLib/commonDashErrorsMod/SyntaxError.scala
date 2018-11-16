package typings
package commonDashErrorsLib.commonDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "SyntaxError")
@js.native
class SyntaxError protected ()
  extends stdLib.SyntaxErrorConstructor {
  /**
       * @param message     any message
       * @param inner_error the Error instance that caused the current error.
       *                    Stack trace will be appended.
       */
  def this(message: java.lang.String) = this()
  /**
       * @param message     any message
       * @param inner_error the Error instance that caused the current error.
       *                    Stack trace will be appended.
       */
  def this(message: java.lang.String, inner_error: Error) = this()
}

