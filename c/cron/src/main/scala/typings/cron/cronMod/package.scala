package typings.cron

import typings.cron.Anon_Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cronMod {
  type CronCommand = js.Function0[Unit] | String | Anon_Args
}
