package typings.chalkDashPipe

import typings.chalk.Anon_SupportsColor
import typings.chalk.chalkMod.Chalk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chalk-pipe", JSImport.Namespace)
@js.native
object chalkDashPipeMod extends js.Object {
  /**
    * 🌈 Create chalk-style schemes with simpler style strings.
    * @param stylePipe Use a dot `.` to separate multiple styles.
    */
  def apply[T /* <: Chalk with Anon_SupportsColor */](stylePipe: String): T = js.native
  def apply[T /* <: Chalk with Anon_SupportsColor */](stylePipe: String, customChalk: T): T = js.native
}

