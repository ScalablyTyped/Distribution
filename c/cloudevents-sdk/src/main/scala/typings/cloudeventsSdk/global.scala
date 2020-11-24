package typings.cloudeventsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  val ValidationError: js.Any = js.native
  
  def asJSON(v: String): js.Any = js.native
  def asJSON(v: js.Object): js.Any = js.native
  
  val invalidPayloadTypeError: js.Any = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(isDefinedOrThrow, isStringOrObjectOrThrow) */ val isString: js.Any = js.native
  
  val nullOrUndefinedPayload: js.Any = js.native
  
  @js.native
  class Base64Parser protected ()
    extends typings.cloudeventsSdk.Base64Parser {
    def this(decorator: js.Any) = this()
  }
  
  @js.native
  class JSONParser protected ()
    extends typings.cloudeventsSdk.JSONParser {
    def this(decorator: typings.cloudeventsSdk.Base64Parser) = this()
  }
}
