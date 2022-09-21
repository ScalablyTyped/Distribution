package typings.sucraseTbLAtQ5t

import typings.sucraseTbLAtQ5t.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactDisplayNameTransformerDTsMod {
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/transformers/ReactDisplayNameTransformer.d.ts", JSImport.Default)
  @js.native
  open class default protected () extends ReactDisplayNameTransformer {
    def this(
      rootTransformer: typings.sucraseTbLAtQ5t.rootTransformerDTsMod.default,
      tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default,
      importProcessor: Null,
      options: Options
    ) = this()
    def this(
      rootTransformer: typings.sucraseTbLAtQ5t.rootTransformerDTsMod.default,
      tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default,
      importProcessor: typings.sucraseTbLAtQ5t.cjsimportprocessorDTsMod.default,
      options: Options
    ) = this()
  }
  
  @js.native
  trait ReactDisplayNameTransformer
    extends typings.sucraseTbLAtQ5t.transformerDTsMod.default {
    
    /**
      * We only want to add a display name when this is a function call containing
      * one argument, which is an object literal without `displayName` as an
      * existing key.
      */
    /* private */ var classNeedsDisplayName: Any = js.native
    
    /* private */ var findDisplayName: Any = js.native
    
    /* private */ var getDisplayNameFromFilename: Any = js.native
    
    val importProcessor: typings.sucraseTbLAtQ5t.cjsimportprocessorDTsMod.default | Null = js.native
    
    val options: Options = js.native
    
    val rootTransformer: typings.sucraseTbLAtQ5t.rootTransformerDTsMod.default = js.native
    
    val tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default = js.native
    
    /**
      * This is called with the token position at the open-paren.
      */
    /* private */ var tryProcessCreateClassCall: Any = js.native
  }
}
