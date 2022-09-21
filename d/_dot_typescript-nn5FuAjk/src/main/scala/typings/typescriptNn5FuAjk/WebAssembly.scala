package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  type CompileError = Error
  
  /* Rewritten from type alias, can be one of: 
    - typings.typescriptNn5FuAjk.Function
    - typings.typescriptNn5FuAjk.WebAssembly.Global
    - typings.typescriptNn5FuAjk.WebAssembly.Memory
    - typings.typescriptNn5FuAjk.WebAssembly.Table
  */
  trait ExportValue extends StObject
  
  type Exports = Record[java.lang.String, ExportValue]
  
  trait Global
    extends StObject
       with ExportValue {
    
    var value: Any
  }
  object Global {
    
    inline def apply(value: Any): Global = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    extension [Self <: Global](x: Self) {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalDescriptor extends StObject {
    
    var mutable: js.UndefOr[scala.Boolean] = js.undefined
    
    var value: ValueType
  }
  object GlobalDescriptor {
    
    inline def apply(value: ValueType): GlobalDescriptor = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalDescriptor]
    }
    
    extension [Self <: GlobalDescriptor](x: Self) {
      
      inline def setMutable(value: scala.Boolean): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
      
      inline def setMutableUndefined: Self = StObject.set(x, "mutable", js.undefined)
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.function
    - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.global
    - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.memory
    - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.table
  */
  trait ImportExportKind extends StObject
  object ImportExportKind {
    
    inline def function: typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.function = "function".asInstanceOf[typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.function]
    
    inline def global: typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.global = "global".asInstanceOf[typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.global]
    
    inline def memory: typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.memory = "memory".asInstanceOf[typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.memory]
    
    inline def table: typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.table = "table".asInstanceOf[typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.table]
  }
  
  type ImportValue = ExportValue | Double
  
  type Imports = Record[java.lang.String, ModuleImports]
  
  trait Instance extends StObject {
    
    val exports: Exports
  }
  object Instance {
    
    inline def apply(exports: Exports): Instance = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    extension [Self <: Instance](x: Self) {
      
      inline def setExports(value: Exports): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    }
  }
  
  type LinkError = Error
  
  trait Memory
    extends StObject
       with ExportValue {
    
    val buffer: ArrayBuffer
    
    def grow(delta: Double): Double
  }
  object Memory {
    
    inline def apply(buffer: ArrayBuffer, grow: Double => Double): Memory = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], grow = js.Any.fromFunction1(grow))
      __obj.asInstanceOf[Memory]
    }
    
    extension [Self <: Memory](x: Self) {
      
      inline def setBuffer(value: ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setGrow(value: Double => Double): Self = StObject.set(x, "grow", js.Any.fromFunction1(value))
    }
  }
  
  trait MemoryDescriptor extends StObject {
    
    var initial: Double
    
    var maximum: js.UndefOr[Double] = js.undefined
    
    var shared: js.UndefOr[scala.Boolean] = js.undefined
  }
  object MemoryDescriptor {
    
    inline def apply(initial: Double): MemoryDescriptor = {
      val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryDescriptor]
    }
    
    extension [Self <: MemoryDescriptor](x: Self) {
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setShared(value: scala.Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    }
  }
  
  trait Module extends StObject
  
  trait ModuleExportDescriptor extends StObject {
    
    var kind: ImportExportKind
    
    var name: java.lang.String
  }
  object ModuleExportDescriptor {
    
    inline def apply(kind: ImportExportKind, name: java.lang.String): ModuleExportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleExportDescriptor]
    }
    
    extension [Self <: ModuleExportDescriptor](x: Self) {
      
      inline def setKind(value: ImportExportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleImportDescriptor extends StObject {
    
    var kind: ImportExportKind
    
    var module: java.lang.String
    
    var name: java.lang.String
  }
  object ModuleImportDescriptor {
    
    inline def apply(kind: ImportExportKind, module: java.lang.String, name: java.lang.String): ModuleImportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleImportDescriptor]
    }
    
    extension [Self <: ModuleImportDescriptor](x: Self) {
      
      inline def setKind(value: ImportExportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setModule(value: java.lang.String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ModuleImports = Record[java.lang.String, ImportValue]
  
  type RuntimeError = Error
  
  @js.native
  trait Table
    extends StObject
       with ExportValue {
    
    def get(index: Double): Any = js.native
    
    def grow(delta: Double): Double = js.native
    def grow(delta: Double, value: Any): Double = js.native
    
    val length: Double = js.native
    
    def set(index: Double): Unit = js.native
    def set(index: Double, value: Any): Unit = js.native
  }
  
  trait TableDescriptor extends StObject {
    
    var element: TableKind
    
    var initial: Double
    
    var maximum: js.UndefOr[Double] = js.undefined
  }
  object TableDescriptor {
    
    inline def apply(element: TableKind, initial: Double): TableDescriptor = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableDescriptor]
    }
    
    extension [Self <: TableDescriptor](x: Self) {
      
      inline def setElement(value: TableKind): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.anyfunc
    - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.externref
  */
  trait TableKind extends StObject
  object TableKind {
    
    inline def anyfunc: typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.anyfunc = "anyfunc".asInstanceOf[typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.anyfunc]
    
    inline def externref: typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.externref = "externref".asInstanceOf[typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.externref]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.anyfunc
    - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.externref
    - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.f32
    - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.f64
    - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.i32
    - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.i64
    - typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.v128
  */
  trait ValueType extends StObject
  object ValueType {
    
    inline def anyfunc: typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.anyfunc = "anyfunc".asInstanceOf[typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.anyfunc]
    
    inline def externref: typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.externref = "externref".asInstanceOf[typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.externref]
    
    inline def f32: typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.f32 = "f32".asInstanceOf[typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.f32]
    
    inline def f64: typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.f64 = "f64".asInstanceOf[typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.f64]
    
    inline def i32: typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.i32 = "i32".asInstanceOf[typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.i32]
    
    inline def i64: typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.i64 = "i64".asInstanceOf[typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.i64]
    
    inline def v128: typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.v128 = "v128".asInstanceOf[typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.v128]
  }
  
  trait WebAssemblyInstantiatedSource extends StObject {
    
    var instance: Instance
    
    var module: Module
  }
  object WebAssemblyInstantiatedSource {
    
    inline def apply(instance: Instance, module: Module): WebAssemblyInstantiatedSource = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAssemblyInstantiatedSource]
    }
    
    extension [Self <: WebAssemblyInstantiatedSource](x: Self) {
      
      inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
}
