package typings.browserDashPack.browserDashPackMod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browser-pack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** pack node-style source files from a json stream into a browser bundle
    */
  def apply(): ReadWriteStream = js.native
  def apply(opts: Options): ReadWriteStream = js.native
}

