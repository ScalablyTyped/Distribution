package typings.sucraseTbLAtQ5t

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactHotLoaderTransformerDTsMod {
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/transformers/ReactHotLoaderTransformer.d.ts", JSImport.Default)
  @js.native
  open class default protected () extends ReactHotLoaderTransformer {
    def this(tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default, filePath: String) = this()
  }
  
  @js.native
  trait ReactHotLoaderTransformer
    extends typings.sucraseTbLAtQ5t.transformerDTsMod.default {
    
    /* private */ var extractedDefaultExportName: Any = js.native
    
    val filePath: String = js.native
    
    def setExtractedDefaultExportName(extractedDefaultExportName: String): Unit = js.native
    
    val tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default = js.native
  }
}
