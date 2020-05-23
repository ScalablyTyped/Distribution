package typings.bunyanPrettystream.mod

import typings.bunyanPrettystream.anon.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bunyan-prettystream", JSImport.Namespace)
@js.native
/**
  * @param options.mode Output format, can be either `long`, `short`, or `dev`,
  *                     defaults to `long`.
  * @param options.useColor Indicates whether or not output should be colored,
  *                         defaults to `true`.
  */
class ^ () extends PrettyStream {
  def this(options: Mode) = this()
}

