package typings.bodyParser.mod

import typings.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("body-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // for docs go to https://github.com/expressjs/body-parser/tree/1.19.0#body-parser
  /** @deprecated */
  def apply(): NextHandleFunction = js.native
  def apply(options: OptionsJson with OptionsText with OptionsUrlencoded): NextHandleFunction = js.native
}

