package typings.cloudeventsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Base64Parser")
  @js.native
  open class Base64Parser protected ()
    extends StObject
       with typings.cloudeventsSdk.Base64Parser {
    def this(decorator: Any) = this()
    
    /* CompleteClass */
    var decorator: Any = js.native
    
    /* CompleteClass */
    override def parse(payload: Any): Any = js.native
  }
  
  @JSGlobal("JSONParser")
  @js.native
  open class JSONParser protected ()
    extends StObject
       with typings.cloudeventsSdk.JSONParser {
    def this(decorator: typings.cloudeventsSdk.Base64Parser) = this()
  }
  
  @JSGlobal("ValidationError")
  @js.native
  val ValidationError: Any = js.native
  
  inline def asJSON(v: String): Any = js.Dynamic.global.applyDynamic("asJSON")(v.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def asJSON(v: js.Object): Any = js.Dynamic.global.applyDynamic("asJSON")(v.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSGlobal("invalidPayloadTypeError")
  @js.native
  val invalidPayloadTypeError: Any = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(isDefinedOrThrow, isStringOrObjectOrThrow) */ @JSGlobal("isString")
  @js.native
  val isString: Any = js.native
  
  @JSGlobal("nullOrUndefinedPayload")
  @js.native
  val nullOrUndefinedPayload: Any = js.native
}
