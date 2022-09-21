package typings.sucraseTbLAtQ5t

import typings.sucraseTbLAtQ5t.indexDDotTsMod.Token
import typings.sucraseTbLAtQ5t.stateDTsMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexDTsMod {
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/parser/index.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/parser/index.d.ts", "File")
  @js.native
  open class File protected () extends StObject {
    def this(tokens: js.Array[Token], scopes: js.Array[Scope]) = this()
    
    var scopes: js.Array[Scope] = js.native
    
    var tokens: js.Array[Token] = js.native
  }
  
  inline def parse(input: String, isJSXEnabled: Boolean, isTypeScriptEnabled: Boolean, isFlowEnabled: Boolean): File = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], isJSXEnabled.asInstanceOf[js.Any], isTypeScriptEnabled.asInstanceOf[js.Any], isFlowEnabled.asInstanceOf[js.Any])).asInstanceOf[File]
}
