package typings
package commonDashErrorsLib.commonDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "ReferenceError")
@js.native
class ReferenceError protected ()
  extends stdLib.ReferenceErrorConstructor {
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

