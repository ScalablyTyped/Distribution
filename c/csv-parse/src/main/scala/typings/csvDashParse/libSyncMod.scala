package typings.csvDashParse

import typings.csvDashParse.csvDashParseMod.Options
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csv-parse/lib/sync", JSImport.Namespace)
@js.native
object libSyncMod extends js.Object {
  def apply(input: String): js.Any = js.native
  def apply(input: String, options: Options): js.Any = js.native
  def apply(input: Buffer): js.Any = js.native
  def apply(input: Buffer, options: Options): js.Any = js.native
}

