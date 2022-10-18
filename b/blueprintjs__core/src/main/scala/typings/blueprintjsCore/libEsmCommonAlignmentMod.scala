package typings.blueprintjsCore

import typings.blueprintjsCore.blueprintjsCoreStrings.center
import typings.blueprintjsCore.blueprintjsCoreStrings.left
import typings.blueprintjsCore.blueprintjsCoreStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonAlignmentMod {
  
  /* Inlined {  CENTER :'center',   LEFT :'left',   RIGHT :'right'}[keyof {  CENTER :'center',   LEFT :'left',   RIGHT :'right'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsCore.blueprintjsCoreStrings.center
    - typings.blueprintjsCore.blueprintjsCoreStrings.left
    - typings.blueprintjsCore.blueprintjsCoreStrings.right
  */
  trait Alignment extends StObject
  object Alignment {
    
    @JSImport("@blueprintjs/core/lib/esm/common/alignment", "Alignment")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common/alignment", "Alignment.CENTER")
    @js.native
    def CENTER: center = js.native
    inline def CENTER_=(x: center): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common/alignment", "Alignment.LEFT")
    @js.native
    def LEFT: left = js.native
    inline def LEFT_=(x: left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common/alignment", "Alignment.RIGHT")
    @js.native
    def RIGHT: right = js.native
    inline def RIGHT_=(x: right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
  }
}
