package typings.cloudeventsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Base64Parser")
  @js.native
  class Base64Parser protected ()
    extends typings.cloudeventsSdk.Base64Parser {
    def this(decorator: js.Any) = this()
  }
  
  @JSGlobal("JSONParser")
  @js.native
  class JSONParser protected ()
    extends typings.cloudeventsSdk.JSONParser {
    def this(decorator: typings.cloudeventsSdk.Base64Parser) = this()
  }
  
  @JSGlobal("ValidationError")
  @js.native
  val ValidationError: js.Any = js.native
  
  @JSGlobal("asJSON")
  @js.native
  def asJSON(v: String): js.Any = js.native
  @JSGlobal("asJSON")
  @js.native
  def asJSON(v: js.Object): js.Any = js.native
  
  @JSGlobal("invalidPayloadTypeError")
  @js.native
  val invalidPayloadTypeError: js.Any = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(isDefinedOrThrow, isStringOrObjectOrThrow) */ @JSGlobal("isString")
  @js.native
  val isString: js.Any = js.native
  
  @JSGlobal("nullOrUndefinedPayload")
  @js.native
  val nullOrUndefinedPayload: js.Any = js.native
}
