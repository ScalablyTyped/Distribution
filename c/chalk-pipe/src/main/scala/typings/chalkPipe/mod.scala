package typings.chalkPipe

import typings.chalk.AnonSupportsColor
import typings.chalk.mod.Chalk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chalk-pipe", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * 🌈 Create chalk-style schemes with simpler style strings.
    * @param stylePipe Use a dot `.` to separate multiple styles.
    */
  def apply[T /* <: Chalk with AnonSupportsColor */](stylePipe: String): T = js.native
  def apply[T /* <: Chalk with AnonSupportsColor */](stylePipe: String, customChalk: T): T = js.native
}

