package typings.sucraseTbLAtQ5t

import typings.sucraseTbLAtQ5t.getJSXPragmaInfoDTsMod.JSXPragmaInfo
import typings.sucraseTbLAtQ5t.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsxtransformerDTsMod {
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/transformers/JSXTransformer.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/transformers/JSXTransformer.d.ts", JSImport.Default)
  @js.native
  open class default protected () extends JSXTransformer {
    def this(
      rootTransformer: typings.sucraseTbLAtQ5t.rootTransformerDTsMod.default,
      tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default,
      importProcessor: Null,
      nameManager: typings.sucraseTbLAtQ5t.nameManagerDTsMod.default,
      options: Options
    ) = this()
    def this(
      rootTransformer: typings.sucraseTbLAtQ5t.rootTransformerDTsMod.default,
      tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default,
      importProcessor: typings.sucraseTbLAtQ5t.cjsimportprocessorDTsMod.default,
      nameManager: typings.sucraseTbLAtQ5t.nameManagerDTsMod.default,
      options: Options
    ) = this()
  }
  
  inline def startsWithLowerCase(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("startsWithLowerCase")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait JSXTransformer
    extends typings.sucraseTbLAtQ5t.transformerDTsMod.default {
    
    var filenameVarName: String | Null = js.native
    
    def getFilenameVarName(): String = js.native
    
    /**
      * Lazily calculate line numbers to avoid unneeded work. We assume this is always called in
      * increasing order by index.
      */
    def getLineNumberForIndex(index: Double): Double = js.native
    
    val importProcessor: typings.sucraseTbLAtQ5t.cjsimportprocessorDTsMod.default | Null = js.native
    
    val jsxPragmaInfo: JSXPragmaInfo = js.native
    
    var lastIndex: Double = js.native
    
    var lastLineNumber: Double = js.native
    
    val nameManager: typings.sucraseTbLAtQ5t.nameManagerDTsMod.default = js.native
    
    val options: Options = js.native
    
    def processChildTextElement(): Unit = js.native
    
    def processChildren(): Unit = js.native
    
    def processJSXTag(): Unit = js.native
    
    def processPropKeyName(): Unit = js.native
    
    def processProps(firstTokenStart: Double): Unit = js.native
    
    def processStringPropValue(): Unit = js.native
    
    /**
      * Process the first part of a tag, before any props.
      */
    def processTagIntro(): Unit = js.native
    
    val rootTransformer: typings.sucraseTbLAtQ5t.rootTransformerDTsMod.default = js.native
    
    val tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default = js.native
  }
}
