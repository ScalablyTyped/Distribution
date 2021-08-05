package typings.cloudeventsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Base64Parser")
  @js.native
  class Base64Parser protected ()
    extends StObject
       with typings.cloudeventsSdk.Base64Parser {
    def this(decorator: js.Any) = this()
    
    /* CompleteClass */
    var decorator: js.Any = js.native
    
    /* CompleteClass */
    override def parse(payload: js.Any): js.Any = js.native
  }
  
  @JSGlobal("JSONParser")
  @js.native
  class JSONParser protected ()
    extends StObject
       with typings.cloudeventsSdk.JSONParser {
    def this(decorator: typings.cloudeventsSdk.Base64Parser) = this()
  }
  
  @JSGlobal("ValidationError")
  @js.native
  val ValidationError: js.Any = js.native
  
  inline def asJSON(v: String): js.Any = js.Dynamic.global.applyDynamic("asJSON")(v.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def asJSON(v: js.Object): js.Any = js.Dynamic.global.applyDynamic("asJSON")(v.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
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
