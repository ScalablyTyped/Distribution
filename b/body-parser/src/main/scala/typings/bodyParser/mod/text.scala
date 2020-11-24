package typings.bodyParser.mod

import typings.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("body-parser", "text")
@js.native
object text extends js.Object {
  
  /**
    * Returns middleware that parses all bodies as a string and only looks at requests
    * where the Content-Type header matches the type option.
    */
  def apply(): NextHandleFunction = js.native
  def apply(options: OptionsText): NextHandleFunction = js.native
}
