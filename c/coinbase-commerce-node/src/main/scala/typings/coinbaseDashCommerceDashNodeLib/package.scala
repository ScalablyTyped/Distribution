package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coinbaseDashCommerceDashNodeLib {
  /**
    * Omit a property from the given type.
    */
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  /**
    * Timestamp string.
    * ISO 8601
    */
  type Timestamp = java.lang.String
}
