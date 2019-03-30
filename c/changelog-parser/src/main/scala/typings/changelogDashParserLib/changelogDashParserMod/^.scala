package typings
package changelogDashParserLib.changelogDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("changelog-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Change log parser for node.
    */
  def apply(options: stdLib.Partial[Options] | java.lang.String): js.Promise[js.Object] = js.native
  def apply(
    options: stdLib.Partial[Options] | java.lang.String,
    callback: js.Function2[/* error */ java.lang.String | scala.Null, /* result */ js.Object, scala.Unit]
  ): js.Promise[js.Object] = js.native
}

