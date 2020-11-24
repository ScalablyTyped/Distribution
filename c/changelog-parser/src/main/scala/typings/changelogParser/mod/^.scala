package typings.changelogParser.mod

import typings.changelogParser.anon.PartialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("changelog-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(options: String): js.Promise[js.Object] = js.native
  def apply(options: String, callback: js.Function2[/* error */ String | Null, /* result */ js.Object, Unit]): js.Promise[js.Object] = js.native
  /**
    * Change log parser for node.
    */
  def apply(options: PartialOptions): js.Promise[js.Object] = js.native
  def apply(
    options: PartialOptions,
    callback: js.Function2[/* error */ String | Null, /* result */ js.Object, Unit]
  ): js.Promise[js.Object] = js.native
}
