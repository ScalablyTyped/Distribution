package typings.sucraseTbLAtQ5t

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestHoistTransformerDTsMod {
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/transformers/JestHoistTransformer.d.ts", JSImport.Default)
  @js.native
  open class default protected () extends JestHoistTransformer {
    def this(
      rootTransformer: typings.sucraseTbLAtQ5t.rootTransformerDTsMod.default,
      tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default,
      nameManager: typings.sucraseTbLAtQ5t.nameManagerDTsMod.default
    ) = this()
    def this(
      rootTransformer: typings.sucraseTbLAtQ5t.rootTransformerDTsMod.default,
      tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default,
      nameManager: typings.sucraseTbLAtQ5t.nameManagerDTsMod.default,
      importProcessor: typings.sucraseTbLAtQ5t.cjsimportprocessorDTsMod.default
    ) = this()
  }
  
  @js.native
  trait JestHoistTransformer
    extends typings.sucraseTbLAtQ5t.transformerDTsMod.default {
    
    /**
      * Extracts any methods calls on the jest-object that should be hoisted.
      *
      * According to the jest docs, https://jestjs.io/docs/en/jest-object#jestmockmodulename-factory-options,
      * mock, unmock, enableAutomock, disableAutomock, are the methods that should be hoisted.
      *
      * We do not apply the same checks of the arguments as babel-plugin-jest-hoist does.
      */
    /* private */ var extractHoistedCalls: Any = js.native
    
    /* private */ val hoistedFunctionNames: Any = js.native
    
    val importProcessor: typings.sucraseTbLAtQ5t.cjsimportprocessorDTsMod.default | Null = js.native
    
    val nameManager: typings.sucraseTbLAtQ5t.nameManagerDTsMod.default = js.native
    
    val rootTransformer: typings.sucraseTbLAtQ5t.rootTransformerDTsMod.default = js.native
    
    val tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default = js.native
  }
}
