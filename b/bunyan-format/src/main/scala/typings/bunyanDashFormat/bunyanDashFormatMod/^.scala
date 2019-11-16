package typings.bunyanDashFormat.bunyanDashFormatMod

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bunyan-format", JSImport.Namespace)
@js.native
class ^ protected () extends Writable {
  /** Creates a writable stream that formats bunyan records written to it. */
  def this(options: Options) = this()
  def this(options: Options, output: Writable) = this()
}

@JSImport("bunyan-format", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: Options): BunyanFormatWritable = js.native
  def apply(options: Options, output: Writable): BunyanFormatWritable = js.native
}

