package typings.sucraseTbLAtQ5t

import typings.sucraseTbLAtQ5t.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmimporttransformerDTsMod {
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/transformers/ESMImportTransformer.d.ts", JSImport.Default)
  @js.native
  open class default protected () extends ESMImportTransformer {
    def this(
      tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default,
      nameManager: typings.sucraseTbLAtQ5t.nameManagerDTsMod.default,
      reactHotLoaderTransformer: Null,
      isTypeScriptTransformEnabled: Boolean,
      options: Options
    ) = this()
    def this(
      tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default,
      nameManager: typings.sucraseTbLAtQ5t.nameManagerDTsMod.default,
      reactHotLoaderTransformer: typings.sucraseTbLAtQ5t.reactHotLoaderTransformerDTsMod.default,
      isTypeScriptTransformEnabled: Boolean,
      options: Options
    ) = this()
  }
  
  @js.native
  trait ESMImportTransformer
    extends typings.sucraseTbLAtQ5t.transformerDTsMod.default {
    
    /* private */ var declarationInfo: Any = js.native
    
    /* private */ var isTypeName: Any = js.native
    
    val isTypeScriptTransformEnabled: Boolean = js.native
    
    val nameManager: typings.sucraseTbLAtQ5t.nameManagerDTsMod.default = js.native
    
    /* private */ var nonTypeIdentifiers: Any = js.native
    
    /* private */ var processExportDefault: Any = js.native
    
    /* private */ var processImport: Any = js.native
    
    /* private */ var processImportEquals: Any = js.native
    
    /**
      * In TypeScript, we need to remove named exports that were never declared or only declared as a
      * type.
      */
    /* private */ var processNamedExports: Any = js.native
    
    val reactHotLoaderTransformer: typings.sucraseTbLAtQ5t.reactHotLoaderTransformerDTsMod.default | Null = js.native
    
    /**
      * Remove type bindings from this import, leaving the rest of the import intact.
      *
      * Return true if this import was ONLY types, and thus is eligible for removal. This will bail out
      * of the replacement operation, so we can return early here.
      */
    /* private */ var removeImportTypeBindings: Any = js.native
    
    /**
      * ESM elides all imports with the rule that we only elide if we see that it's
      * a type and never see it as a value. This is in contract to CJS, which
      * elides imports that are completely unknown.
      */
    /* private */ var shouldElideExportedName: Any = js.native
    
    val tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default = js.native
  }
}
