package typings.babelPluginCodegen

import org.scalablytyped.runtime.StringDictionary
import typings.babelCore.mod.NodePath
import typings.babelCore.mod.TransformOptions
import typings.babelPluginCodegen.anon.Code
import typings.babelPluginCodegen.anon.Filename
import typings.babelPluginCodegen.anon.TypeofbabelCore
import typings.babelTypes.mod.Comment
import typings.babelTypes.mod.Node
import typings.babelTypes.mod.Statement
import typings.node.bufferMod.global.Buffer
import typings.typeFest.sourcePrimitiveMod.Primitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersMod {
  
  @JSImport("babel-plugin-codegen/dist/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFilename(fileOpts: TransformOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilename")(fileOpts.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getReplacement(param0: GetReplacementOptions, babel: TypeofbabelCore): Statement | js.Array[Statement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReplacement")(param0.asInstanceOf[js.Any], babel.asInstanceOf[js.Any])).asInstanceOf[Statement | js.Array[Statement]]
  
  inline def isCodegenComment(comment: Comment): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCodegenComment")(comment.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPropertyCall(path: NodePath[Node], name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyCall")(path.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def looksLike(a: LooksLikeTarget, b: LooksLikeMatch): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("looksLike")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def replace[SpecificNode /* <: Node */](param0: ReplaceOptions[SpecificNode], babel: TypeofbabelCore): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(param0.asInstanceOf[js.Any], babel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def requireFromString(code: String, filename: String): CodegenModuleExport | CompiledESModule = (^.asInstanceOf[js.Dynamic].applyDynamic("requireFromString")(code.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[CodegenModuleExport | CompiledESModule]
  inline def requireFromString(code: Buffer, filename: String): CodegenModuleExport | CompiledESModule = (^.asInstanceOf[js.Dynamic].applyDynamic("requireFromString")(code.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[CodegenModuleExport | CompiledESModule]
  
  inline def resolveModuleContents(param0: Filename): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleContents")(param0.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  type CodegenModuleExport = String | (js.Function1[/* repeated */ Any, String])
  
  trait CompiledESModule extends StObject {
    
    var default: CodegenModuleExport
    
    var __esModule: Boolean
  }
  object CompiledESModule {
    
    inline def apply(__esModule: Boolean, default: CodegenModuleExport): CompiledESModule = {
      val __obj = js.Dynamic.literal(__esModule = __esModule.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompiledESModule]
    }
    
    extension [Self <: CompiledESModule](x: Self) {
      
      inline def setDefault(value: CodegenModuleExport): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
      
      inline def set__esModule(value: Boolean): Self = StObject.set(x, "__esModule", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetReplacementOptions extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var code: String | Buffer
    
    var fileOpts: TransformOptions
  }
  object GetReplacementOptions {
    
    inline def apply(code: String | Buffer, fileOpts: TransformOptions): GetReplacementOptions = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], fileOpts = fileOpts.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetReplacementOptions]
    }
    
    extension [Self <: GetReplacementOptions](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCode(value: String | Buffer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setFileOpts(value: TransformOptions): Self = StObject.set(x, "fileOpts", value.asInstanceOf[js.Any])
    }
  }
  
  type LooksLikeMatch = Primitive | (js.Function1[/* a */ LooksLikeTarget, Boolean]) | StringDictionary[Any]
  
  type LooksLikeTarget = Any
  
  trait ReplaceOptions[SpecificNode /* <: Node */] extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var code: String | Buffer
    
    var fileOpts: TransformOptions
    
    var path: NodePath[SpecificNode]
  }
  object ReplaceOptions {
    
    inline def apply[SpecificNode /* <: Node */](code: String | Buffer, fileOpts: TransformOptions, path: NodePath[SpecificNode]): ReplaceOptions[SpecificNode] = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], fileOpts = fileOpts.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceOptions[SpecificNode]]
    }
    
    extension [Self <: ReplaceOptions[?], SpecificNode /* <: Node */](x: Self & ReplaceOptions[SpecificNode]) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCode(value: String | Buffer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setFileOpts(value: TransformOptions): Self = StObject.set(x, "fileOpts", value.asInstanceOf[js.Any])
      
      inline def setPath(value: NodePath[SpecificNode]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
