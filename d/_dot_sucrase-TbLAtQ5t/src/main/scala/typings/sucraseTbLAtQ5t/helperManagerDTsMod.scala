package typings.sucraseTbLAtQ5t

import typings.sucraseTbLAtQ5t.nameManagerDTsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperManagerDTsMod {
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/HelperManager.d.ts", "HelperManager")
  @js.native
  open class HelperManager protected () extends StObject {
    def this(nameManager: default) = this()
    
    def emitHelpers(): String = js.native
    
    def getHelperName(baseName: /* keyof {[name: string] : string} */ String): String = js.native
    
    val nameManager: default = js.native
  }
}
