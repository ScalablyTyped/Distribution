package typings.sucraseTbLAtQ5t

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionalCatchBindingTransformerDTsMod {
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/transformers/OptionalCatchBindingTransformer.d.ts", JSImport.Default)
  @js.native
  open class default protected () extends OptionalCatchBindingTransformer {
    def this(
      tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default,
      nameManager: typings.sucraseTbLAtQ5t.nameManagerDTsMod.default
    ) = this()
  }
  
  @js.native
  trait OptionalCatchBindingTransformer
    extends typings.sucraseTbLAtQ5t.transformerDTsMod.default {
    
    val nameManager: typings.sucraseTbLAtQ5t.nameManagerDTsMod.default = js.native
    
    val tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default = js.native
  }
}
