package typings.classTransformer

import typings.classTransformer.classTransformOptionsMod.ClassTransformOptions
import typings.classTransformer.transformationTypeEnumMod.TransformationType
import typings.classTransformer.typeMetadataMod.TypeMetadata
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformOperationExecutorMod {
  
  @JSImport("class-transformer/TransformOperationExecutor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-transformer/TransformOperationExecutor", "TransformOperationExecutor")
  @js.native
  class TransformOperationExecutor protected () extends StObject {
    def this(transformationType: TransformationType, options: ClassTransformOptions) = this()
    
    /* private */ var applyCustomTransformations: js.Any = js.native
    
    /* private */ var checkGroups: js.Any = js.native
    
    /* private */ var checkVersion: js.Any = js.native
    
    /* private */ var getKeys: js.Any = js.native
    
    /* private */ var getReflectedType: js.Any = js.native
    
    /* private */ var isCircular: js.Any = js.native
    
    /* private */ var options: js.Any = js.native
    
    /* private */ var recursionStack: js.Any = js.native
    
    def transform(source: js.Any, value: js.Any, targetType: js.Function, arrayType: js.Function, isMap: Boolean): js.Any = js.native
    def transform(
      source: js.Any,
      value: js.Any,
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(source: js.Any, value: js.Any, targetType: TypeMetadata, arrayType: js.Function, isMap: Boolean): js.Any = js.native
    def transform(
      source: js.Any,
      value: js.Any,
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: js.Any,
      value: js.Array[Record[String, js.Any]],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: js.Any,
      value: js.Array[Record[String, js.Any]],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: js.Any,
      value: js.Array[Record[String, js.Any]],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: js.Any,
      value: js.Array[Record[String, js.Any]],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: js.Any,
      value: Record[String, js.Any],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: js.Any,
      value: Record[String, js.Any],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: js.Any,
      value: Record[String, js.Any],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: js.Any,
      value: Record[String, js.Any],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: js.Array[Record[String, js.Any]],
      value: js.Any,
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: js.Array[Record[String, js.Any]],
      value: js.Any,
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: js.Array[Record[String, js.Any]],
      value: js.Any,
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: js.Array[Record[String, js.Any]],
      value: js.Any,
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: js.Array[Record[String, js.Any]],
      value: js.Array[Record[String, js.Any]],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: js.Array[Record[String, js.Any]],
      value: js.Array[Record[String, js.Any]],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: js.Array[Record[String, js.Any]],
      value: js.Array[Record[String, js.Any]],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: js.Array[Record[String, js.Any]],
      value: js.Array[Record[String, js.Any]],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: js.Array[Record[String, js.Any]],
      value: Record[String, js.Any],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: js.Array[Record[String, js.Any]],
      value: Record[String, js.Any],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: js.Array[Record[String, js.Any]],
      value: Record[String, js.Any],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: js.Array[Record[String, js.Any]],
      value: Record[String, js.Any],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: Record[String, js.Any],
      value: js.Any,
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: Record[String, js.Any],
      value: js.Any,
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: Record[String, js.Any],
      value: js.Any,
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: Record[String, js.Any],
      value: js.Any,
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: Record[String, js.Any],
      value: js.Array[Record[String, js.Any]],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: Record[String, js.Any],
      value: js.Array[Record[String, js.Any]],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: Record[String, js.Any],
      value: js.Array[Record[String, js.Any]],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: Record[String, js.Any],
      value: js.Array[Record[String, js.Any]],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: Record[String, js.Any],
      value: Record[String, js.Any],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: Record[String, js.Any],
      value: Record[String, js.Any],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    def transform(
      source: Record[String, js.Any],
      value: Record[String, js.Any],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): js.Any = js.native
    def transform(
      source: Record[String, js.Any],
      value: Record[String, js.Any],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): js.Any = js.native
    
    /* private */ var transformationType: js.Any = js.native
  }
  
  inline def testForBuffer(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("testForBuffer")().asInstanceOf[Boolean]
}
