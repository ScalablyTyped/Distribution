package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coinbaseDashCommerceDashNode {
  import typings.std.Exclude
  import typings.std.Pick

  /**
    * Omit a property from the given type.
    */
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  /**
    * Timestamp string.
    * ISO 8601
    */
  type Timestamp = String
}
