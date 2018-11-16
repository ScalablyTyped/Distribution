package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Scope extends js.Object {
  /**
       * Close the scope, and finish the span if the scope was created with `finishSpanOnClose` set to true.
       */
  def close(): scala.Unit
  /**
       * Get the span wrapped by this scope.
       */
  def span(): opentracingLib.opentracingMod.Span
}

