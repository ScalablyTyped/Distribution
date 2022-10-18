package typings.classTransformer

import typings.classTransformer.typesEnumsTransformationTypeDotenumMod.TransformationType
import typings.classTransformer.typesInterfacesClassTransformerOptionsDotinterfaceMod.ClassTransformOptions
import typings.classTransformer.typesInterfacesMetadataTypeMetadataDotinterfaceMod.TypeMetadata
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransformOperationExecutorMod {
  
  @JSImport("class-transformer/types/TransformOperationExecutor", "TransformOperationExecutor")
  @js.native
  open class TransformOperationExecutor protected () extends StObject {
    def this(transformationType: TransformationType, options: ClassTransformOptions) = this()
    
    /* private */ var applyCustomTransformations: Any = js.native
    
    /* private */ var checkGroups: Any = js.native
    
    /* private */ var checkVersion: Any = js.native
    
    /* private */ var getKeys: Any = js.native
    
    /* private */ var getReflectedType: Any = js.native
    
    /* private */ var isCircular: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var recursionStack: Any = js.native
    
    def transform(
      source: js.Array[Record[String, Any]],
      value: js.Array[Record[String, Any]],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: js.Array[Record[String, Any]],
      value: js.Array[Record[String, Any]],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: js.Array[Record[String, Any]],
      value: js.Array[Record[String, Any]],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: js.Array[Record[String, Any]],
      value: js.Array[Record[String, Any]],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: js.Array[Record[String, Any]],
      value: Any,
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: js.Array[Record[String, Any]],
      value: Any,
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: js.Array[Record[String, Any]],
      value: Any,
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: js.Array[Record[String, Any]],
      value: Any,
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: js.Array[Record[String, Any]],
      value: Record[String, Any],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: js.Array[Record[String, Any]],
      value: Record[String, Any],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: js.Array[Record[String, Any]],
      value: Record[String, Any],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: js.Array[Record[String, Any]],
      value: Record[String, Any],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: Any,
      value: js.Array[Record[String, Any]],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: Any,
      value: js.Array[Record[String, Any]],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: Any,
      value: js.Array[Record[String, Any]],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: Any,
      value: js.Array[Record[String, Any]],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(source: Any, value: Any, targetType: js.Function, arrayType: js.Function, isMap: Boolean): Any = js.native
    def transform(
      source: Any,
      value: Any,
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(source: Any, value: Any, targetType: TypeMetadata, arrayType: js.Function, isMap: Boolean): Any = js.native
    def transform(
      source: Any,
      value: Any,
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: Any,
      value: Record[String, Any],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: Any,
      value: Record[String, Any],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: Any,
      value: Record[String, Any],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: Any,
      value: Record[String, Any],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: Record[String, Any],
      value: js.Array[Record[String, Any]],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: Record[String, Any],
      value: js.Array[Record[String, Any]],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: Record[String, Any],
      value: js.Array[Record[String, Any]],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: Record[String, Any],
      value: js.Array[Record[String, Any]],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: Record[String, Any],
      value: Any,
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: Record[String, Any],
      value: Any,
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: Record[String, Any],
      value: Any,
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: Record[String, Any],
      value: Any,
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: Record[String, Any],
      value: Record[String, Any],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: Record[String, Any],
      value: Record[String, Any],
      targetType: js.Function,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    def transform(
      source: Record[String, Any],
      value: Record[String, Any],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean
    ): Any = js.native
    def transform(
      source: Record[String, Any],
      value: Record[String, Any],
      targetType: TypeMetadata,
      arrayType: js.Function,
      isMap: Boolean,
      level: Double
    ): Any = js.native
    
    /* private */ var transformationType: Any = js.native
  }
}
