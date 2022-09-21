package typings.sucraseTbLAtQ5t

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowTransformerDTsMod {
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/transformers/FlowTransformer.d.ts", JSImport.Default)
  @js.native
  open class default protected () extends FlowTransformer {
    def this(
      rootTransformer: typings.sucraseTbLAtQ5t.rootTransformerDTsMod.default,
      tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default
    ) = this()
  }
  
  @js.native
  trait FlowTransformer
    extends typings.sucraseTbLAtQ5t.transformerDTsMod.default {
    
    val rootTransformer: typings.sucraseTbLAtQ5t.rootTransformerDTsMod.default = js.native
    
    val tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default = js.native
  }
}
