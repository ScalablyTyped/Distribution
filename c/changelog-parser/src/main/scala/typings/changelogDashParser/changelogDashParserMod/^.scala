package typings.changelogDashParser.changelogDashParserMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("changelog-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Change log parser for node.
    */
  def apply(options: Partial[Options] | String): js.Promise[js.Object] = js.native
  def apply(
    options: Partial[Options] | String,
    callback: js.Function2[/* error */ String | Null, /* result */ js.Object, Unit]
  ): js.Promise[js.Object] = js.native
}

