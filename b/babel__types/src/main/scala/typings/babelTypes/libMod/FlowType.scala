package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.AnyTypeAnnotation_
  - typings.babelTypes.libMod.ArrayTypeAnnotation_
  - typings.babelTypes.libMod.BooleanTypeAnnotation_
  - typings.babelTypes.libMod.BooleanLiteralTypeAnnotation_
  - typings.babelTypes.libMod.NullLiteralTypeAnnotation_
  - typings.babelTypes.libMod.ExistsTypeAnnotation_
  - typings.babelTypes.libMod.FunctionTypeAnnotation_
  - typings.babelTypes.libMod.GenericTypeAnnotation_
  - typings.babelTypes.libMod.InterfaceTypeAnnotation_
  - typings.babelTypes.libMod.IntersectionTypeAnnotation_
  - typings.babelTypes.libMod.MixedTypeAnnotation_
  - typings.babelTypes.libMod.EmptyTypeAnnotation_
  - typings.babelTypes.libMod.NullableTypeAnnotation_
  - typings.babelTypes.libMod.NumberLiteralTypeAnnotation_
  - typings.babelTypes.libMod.NumberTypeAnnotation_
  - typings.babelTypes.libMod.ObjectTypeAnnotation_
  - typings.babelTypes.libMod.StringLiteralTypeAnnotation_
  - typings.babelTypes.libMod.StringTypeAnnotation_
  - typings.babelTypes.libMod.SymbolTypeAnnotation_
  - typings.babelTypes.libMod.ThisTypeAnnotation_
  - typings.babelTypes.libMod.TupleTypeAnnotation_
  - typings.babelTypes.libMod.TypeofTypeAnnotation_
  - typings.babelTypes.libMod.UnionTypeAnnotation_
  - typings.babelTypes.libMod.VoidTypeAnnotation_
  - typings.babelTypes.libMod.IndexedAccessType_
  - typings.babelTypes.libMod.OptionalIndexedAccessType_
*/
trait FlowType extends StObject
object FlowType {
  
  inline def AnyTypeAnnotation_(): typings.babelTypes.libMod.AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AnyTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.AnyTypeAnnotation_]
  }
  
  inline def ArrayTypeAnnotation_(elementType: FlowType): typings.babelTypes.libMod.ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.ArrayTypeAnnotation_]
  }
  
  inline def BooleanLiteralTypeAnnotation_(value: Boolean): typings.babelTypes.libMod.BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.BooleanLiteralTypeAnnotation_]
  }
  
  inline def BooleanTypeAnnotation_(): typings.babelTypes.libMod.BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.BooleanTypeAnnotation_]
  }
  
  inline def EmptyTypeAnnotation_(): typings.babelTypes.libMod.EmptyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.EmptyTypeAnnotation_]
  }
  
  inline def ExistsTypeAnnotation_(): typings.babelTypes.libMod.ExistsTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExistsTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.ExistsTypeAnnotation_]
  }
  
  inline def FunctionTypeAnnotation_(params: js.Array[FunctionTypeParam_], returnType: FlowType): typings.babelTypes.libMod.FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.FunctionTypeAnnotation_]
  }
  
  inline def GenericTypeAnnotation_(id: Identifier_ | QualifiedTypeIdentifier_): typings.babelTypes.libMod.GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GenericTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.GenericTypeAnnotation_]
  }
  
  inline def IndexedAccessType_(indexType: FlowType, objectType: FlowType): typings.babelTypes.libMod.IndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IndexedAccessType")
    __obj.asInstanceOf[typings.babelTypes.libMod.IndexedAccessType_]
  }
  
  inline def InterfaceTypeAnnotation_(body: ObjectTypeAnnotation_): typings.babelTypes.libMod.InterfaceTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.InterfaceTypeAnnotation_]
  }
  
  inline def IntersectionTypeAnnotation_(types: js.Array[FlowType]): typings.babelTypes.libMod.IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.IntersectionTypeAnnotation_]
  }
  
  inline def MixedTypeAnnotation_(): typings.babelTypes.libMod.MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.MixedTypeAnnotation_]
  }
  
  inline def NullLiteralTypeAnnotation_(): typings.babelTypes.libMod.NullLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.NullLiteralTypeAnnotation_]
  }
  
  inline def NullableTypeAnnotation_(typeAnnotation: FlowType): typings.babelTypes.libMod.NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.NullableTypeAnnotation_]
  }
  
  inline def NumberLiteralTypeAnnotation_(value: Double): typings.babelTypes.libMod.NumberLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.NumberLiteralTypeAnnotation_]
  }
  
  inline def NumberTypeAnnotation_(): typings.babelTypes.libMod.NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.NumberTypeAnnotation_]
  }
  
  inline def ObjectTypeAnnotation_(exact: Boolean, properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]): typings.babelTypes.libMod.ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeAnnotation_]
  }
  
  inline def OptionalIndexedAccessType_(indexType: FlowType, objectType: FlowType, optional: Boolean): typings.babelTypes.libMod.OptionalIndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalIndexedAccessType")
    __obj.asInstanceOf[typings.babelTypes.libMod.OptionalIndexedAccessType_]
  }
  
  inline def StringLiteralTypeAnnotation_(value: String): typings.babelTypes.libMod.StringLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.StringLiteralTypeAnnotation_]
  }
  
  inline def StringTypeAnnotation_(): typings.babelTypes.libMod.StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("StringTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.StringTypeAnnotation_]
  }
  
  inline def SymbolTypeAnnotation_(): typings.babelTypes.libMod.SymbolTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SymbolTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.SymbolTypeAnnotation_]
  }
  
  inline def ThisTypeAnnotation_(): typings.babelTypes.libMod.ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.ThisTypeAnnotation_]
  }
  
  inline def TupleTypeAnnotation_(types: js.Array[FlowType]): typings.babelTypes.libMod.TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.TupleTypeAnnotation_]
  }
  
  inline def TypeofTypeAnnotation_(argument: FlowType): typings.babelTypes.libMod.TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeofTypeAnnotation_]
  }
  
  inline def UnionTypeAnnotation_(types: js.Array[FlowType]): typings.babelTypes.libMod.UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.UnionTypeAnnotation_]
  }
  
  inline def VoidTypeAnnotation_(): typings.babelTypes.libMod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.VoidTypeAnnotation_]
  }
}
