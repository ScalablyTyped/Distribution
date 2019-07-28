package typings.centra

import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object centraMod {
  type CentraFactory = js.Function2[/* url */ URL | String, /* method */ js.UndefOr[String], Request]
}
