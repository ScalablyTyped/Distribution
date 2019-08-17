package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atAwsDashSdkS3DashRequestDashPresigner {
  import typings.std.Exclude
  import typings.std.Pick

  /**
    * PartialBy<T, K> makes properties specified in K optional in interface T
    * see: https://stackoverflow.com/questions/43159887/make-a-single-property-optional-in-typescript
    * */
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
