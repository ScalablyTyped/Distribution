package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.AnyTypeAnnotation_
  - typings.babelTypes.mod.ArrayTypeAnnotation_
  - typings.babelTypes.mod.BooleanTypeAnnotation_
  - typings.babelTypes.mod.BooleanLiteralTypeAnnotation_
  - typings.babelTypes.mod.NullLiteralTypeAnnotation_
  - typings.babelTypes.mod.ExistsTypeAnnotation_
  - typings.babelTypes.mod.FunctionTypeAnnotation_
  - typings.babelTypes.mod.GenericTypeAnnotation_
  - typings.babelTypes.mod.InterfaceTypeAnnotation_
  - typings.babelTypes.mod.IntersectionTypeAnnotation_
  - typings.babelTypes.mod.MixedTypeAnnotation_
  - typings.babelTypes.mod.EmptyTypeAnnotation_
  - typings.babelTypes.mod.NullableTypeAnnotation_
  - typings.babelTypes.mod.NumberLiteralTypeAnnotation_
  - typings.babelTypes.mod.NumberTypeAnnotation_
  - typings.babelTypes.mod.ObjectTypeAnnotation_
  - typings.babelTypes.mod.StringLiteralTypeAnnotation_
  - typings.babelTypes.mod.StringTypeAnnotation_
  - typings.babelTypes.mod.SymbolTypeAnnotation_
  - typings.babelTypes.mod.ThisTypeAnnotation_
  - typings.babelTypes.mod.TupleTypeAnnotation_
  - typings.babelTypes.mod.TypeofTypeAnnotation_
  - typings.babelTypes.mod.UnionTypeAnnotation_
  - typings.babelTypes.mod.VoidTypeAnnotation_
*/
trait FlowType
  extends StObject
     with _Node
object FlowType {
  
  inline def AnyTypeAnnotation_(): typings.babelTypes.mod.AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AnyTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.AnyTypeAnnotation_]
  }
  
  inline def ArrayTypeAnnotation_(elementType: FlowType): typings.babelTypes.mod.ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.ArrayTypeAnnotation_]
  }
  
  inline def BooleanLiteralTypeAnnotation_(value: Boolean): typings.babelTypes.mod.BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.BooleanLiteralTypeAnnotation_]
  }
  
  inline def BooleanTypeAnnotation_(): typings.babelTypes.mod.BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.BooleanTypeAnnotation_]
  }
  
  inline def EmptyTypeAnnotation_(): typings.babelTypes.mod.EmptyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EmptyTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.EmptyTypeAnnotation_]
  }
  
  inline def ExistsTypeAnnotation_(): typings.babelTypes.mod.ExistsTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExistsTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.ExistsTypeAnnotation_]
  }
  
  inline def FunctionTypeAnnotation_(params: js.Array[FunctionTypeParam_], returnType: FlowType): typings.babelTypes.mod.FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, rest = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("FunctionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.FunctionTypeAnnotation_]
  }
  
  inline def GenericTypeAnnotation_(id: Identifier_ | QualifiedTypeIdentifier_): typings.babelTypes.mod.GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("GenericTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.GenericTypeAnnotation_]
  }
  
  inline def InterfaceTypeAnnotation_(body: ObjectTypeAnnotation_): typings.babelTypes.mod.InterfaceTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("InterfaceTypeAnnotation")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.InterfaceTypeAnnotation_]
  }
  
  inline def IntersectionTypeAnnotation_(types: js.Array[FlowType]): typings.babelTypes.mod.IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.IntersectionTypeAnnotation_]
  }
  
  inline def MixedTypeAnnotation_(): typings.babelTypes.mod.MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.MixedTypeAnnotation_]
  }
  
  inline def NullLiteralTypeAnnotation_(): typings.babelTypes.mod.NullLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.NullLiteralTypeAnnotation_]
  }
  
  inline def NullableTypeAnnotation_(typeAnnotation: FlowType): typings.babelTypes.mod.NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.NullableTypeAnnotation_]
  }
  
  inline def NumberLiteralTypeAnnotation_(value: Double): typings.babelTypes.mod.NumberLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumberLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.NumberLiteralTypeAnnotation_]
  }
  
  inline def NumberTypeAnnotation_(): typings.babelTypes.mod.NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.NumberTypeAnnotation_]
  }
  
  inline def ObjectTypeAnnotation_(exact: Boolean, properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]): typings.babelTypes.mod.ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], callProperties = null, end = null, indexers = null, inexact = null, innerComments = null, internalSlots = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectTypeAnnotation_]
  }
  
  inline def StringLiteralTypeAnnotation_(value: String): typings.babelTypes.mod.StringLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.StringLiteralTypeAnnotation_]
  }
  
  inline def StringTypeAnnotation_(): typings.babelTypes.mod.StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.StringTypeAnnotation_]
  }
  
  inline def SymbolTypeAnnotation_(): typings.babelTypes.mod.SymbolTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("SymbolTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.SymbolTypeAnnotation_]
  }
  
  inline def ThisTypeAnnotation_(): typings.babelTypes.mod.ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.ThisTypeAnnotation_]
  }
  
  inline def TupleTypeAnnotation_(types: js.Array[FlowType]): typings.babelTypes.mod.TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.TupleTypeAnnotation_]
  }
  
  inline def TypeofTypeAnnotation_(argument: FlowType): typings.babelTypes.mod.TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeofTypeAnnotation_]
  }
  
  inline def UnionTypeAnnotation_(types: js.Array[FlowType]): typings.babelTypes.mod.UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.UnionTypeAnnotation_]
  }
  
  inline def VoidTypeAnnotation_(): typings.babelTypes.mod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.VoidTypeAnnotation_]
  }
}
