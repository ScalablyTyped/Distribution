package typings.deprecation

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deprecation", JSImport.Namespace)
@js.native
object deprecationMod extends js.Object {
  @js.native
  class Deprecation () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    @JSName("name")
    var name_Deprecation: typings.deprecation.deprecationStrings.Deprecation = js.native
  }
  
}

