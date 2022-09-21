package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.BufferSource
import typings.typescriptNn5FuAjk.PromiseLike
import typings.typescriptNn5FuAjk.WebAssembly.Exports
import typings.typescriptNn5FuAjk.WebAssembly.Global
import typings.typescriptNn5FuAjk.WebAssembly.GlobalDescriptor
import typings.typescriptNn5FuAjk.WebAssembly.Imports
import typings.typescriptNn5FuAjk.WebAssembly.Instance
import typings.typescriptNn5FuAjk.WebAssembly.Memory
import typings.typescriptNn5FuAjk.WebAssembly.MemoryDescriptor
import typings.typescriptNn5FuAjk.WebAssembly.Module
import typings.typescriptNn5FuAjk.WebAssembly.ModuleExportDescriptor
import typings.typescriptNn5FuAjk.WebAssembly.ModuleImportDescriptor
import typings.typescriptNn5FuAjk.WebAssembly.Table
import typings.typescriptNn5FuAjk.WebAssembly.TableDescriptor
import typings.typescriptNn5FuAjk.WebAssembly.WebAssemblyInstantiatedSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  @JSGlobal("WebAssembly")
  @js.native
  val ^ : js.Any = js.native
  
  inline def CompileError(): typings.typescriptNn5FuAjk.WebAssembly.CompileError = ^.asInstanceOf[js.Dynamic].applyDynamic("CompileError")().asInstanceOf[typings.typescriptNn5FuAjk.WebAssembly.CompileError]
  inline def CompileError(message: java.lang.String): typings.typescriptNn5FuAjk.WebAssembly.CompileError = ^.asInstanceOf[js.Dynamic].applyDynamic("CompileError")(message.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.WebAssembly.CompileError]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.CompileError")
  @js.native
  open class CompileErrorCls ()
    extends StObject
       with typings.typescriptNn5FuAjk.Error {
    def this(message: java.lang.String) = this()
    
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Global")
  @js.native
  open class GlobalCls protected ()
    extends StObject
       with Global {
    def this(descriptor: GlobalDescriptor) = this()
    def this(descriptor: GlobalDescriptor, v: Any) = this()
    
    /* CompleteClass */
    var value: Any = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Instance")
  @js.native
  open class InstanceCls protected ()
    extends StObject
       with Instance {
    def this(module: Module) = this()
    def this(module: Module, importObject: Imports) = this()
    
    /* CompleteClass */
    override val exports: Exports = js.native
  }
  
  inline def LinkError(): typings.typescriptNn5FuAjk.WebAssembly.LinkError = ^.asInstanceOf[js.Dynamic].applyDynamic("LinkError")().asInstanceOf[typings.typescriptNn5FuAjk.WebAssembly.LinkError]
  inline def LinkError(message: java.lang.String): typings.typescriptNn5FuAjk.WebAssembly.LinkError = ^.asInstanceOf[js.Dynamic].applyDynamic("LinkError")(message.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.WebAssembly.LinkError]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.LinkError")
  @js.native
  open class LinkErrorCls ()
    extends StObject
       with typings.typescriptNn5FuAjk.Error {
    def this(message: java.lang.String) = this()
    
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Memory")
  @js.native
  open class MemoryCls protected ()
    extends StObject
       with Memory {
    def this(descriptor: MemoryDescriptor) = this()
    
    /* CompleteClass */
    override val buffer: typings.typescriptNn5FuAjk.ArrayBuffer = js.native
    
    /* CompleteClass */
    override def grow(delta: Double): Double = js.native
  }
  
  object Module {
    
    @JSGlobal("WebAssembly.Module")
    @js.native
    val ^ : js.Any = js.native
    
    inline def customSections(moduleObject: typings.typescriptNn5FuAjk.WebAssembly.Module, sectionName: java.lang.String): typings.typescriptNn5FuAjk.Array[typings.typescriptNn5FuAjk.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("customSections")(moduleObject.asInstanceOf[js.Any], sectionName.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Array[typings.typescriptNn5FuAjk.ArrayBuffer]]
    
    inline def exports(moduleObject: typings.typescriptNn5FuAjk.WebAssembly.Module): typings.typescriptNn5FuAjk.Array[ModuleExportDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("exports")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[ModuleExportDescriptor]]
    
    inline def imports(moduleObject: typings.typescriptNn5FuAjk.WebAssembly.Module): typings.typescriptNn5FuAjk.Array[ModuleImportDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("imports")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Array[ModuleImportDescriptor]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Module")
  @js.native
  open class ModuleCls protected ()
    extends StObject
       with Module {
    def this(bytes: BufferSource) = this()
  }
  
  inline def RuntimeError(): typings.typescriptNn5FuAjk.WebAssembly.RuntimeError = ^.asInstanceOf[js.Dynamic].applyDynamic("RuntimeError")().asInstanceOf[typings.typescriptNn5FuAjk.WebAssembly.RuntimeError]
  inline def RuntimeError(message: java.lang.String): typings.typescriptNn5FuAjk.WebAssembly.RuntimeError = ^.asInstanceOf[js.Dynamic].applyDynamic("RuntimeError")(message.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.WebAssembly.RuntimeError]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.RuntimeError")
  @js.native
  open class RuntimeErrorCls ()
    extends StObject
       with typings.typescriptNn5FuAjk.Error {
    def this(message: java.lang.String) = this()
    
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Table")
  @js.native
  open class TableCls protected ()
    extends StObject
       with Table {
    def this(descriptor: TableDescriptor) = this()
    def this(descriptor: TableDescriptor, value: Any) = this()
  }
  
  inline def compile(bytes: BufferSource): typings.typescriptNn5FuAjk.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Promise[Module]]
  
  inline def compileStreaming(source: PromiseLike[typings.typescriptNn5FuAjk.Response]): typings.typescriptNn5FuAjk.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Promise[Module]]
  inline def compileStreaming(source: typings.typescriptNn5FuAjk.Response): typings.typescriptNn5FuAjk.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Promise[Module]]
  
  inline def instantiate(bytes: BufferSource): typings.typescriptNn5FuAjk.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiate(bytes: BufferSource, importObject: Imports): typings.typescriptNn5FuAjk.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(bytes.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiate(moduleObject: Module): typings.typescriptNn5FuAjk.Promise[Instance] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Promise[Instance]]
  inline def instantiate(moduleObject: Module, importObject: Imports): typings.typescriptNn5FuAjk.Promise[Instance] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(moduleObject.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Promise[Instance]]
  
  inline def instantiateStreaming(source: PromiseLike[typings.typescriptNn5FuAjk.Response]): typings.typescriptNn5FuAjk.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiateStreaming(source: PromiseLike[typings.typescriptNn5FuAjk.Response], importObject: Imports): typings.typescriptNn5FuAjk.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiateStreaming(source: typings.typescriptNn5FuAjk.Response): typings.typescriptNn5FuAjk.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiateStreaming(source: typings.typescriptNn5FuAjk.Response, importObject: Imports): typings.typescriptNn5FuAjk.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptNn5FuAjk.Promise[WebAssemblyInstantiatedSource]]
  
  inline def validate(bytes: BufferSource): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(bytes.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
