package typings.centra

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object centraMod {
  import typings.std.URL

  type CentraFactory = js.Function2[/* url */ URL | String, /* method */ js.UndefOr[String], Request]
}
