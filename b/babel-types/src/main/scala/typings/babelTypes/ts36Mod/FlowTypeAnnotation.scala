package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.AnyTypeAnnotation_
  - typings.babelTypes.ts36Mod.ArrayTypeAnnotation_
  - typings.babelTypes.ts36Mod.BooleanTypeAnnotation_
  - typings.babelTypes.ts36Mod.BooleanLiteralTypeAnnotation_
  - typings.babelTypes.ts36Mod.FunctionTypeAnnotation_
  - typings.babelTypes.ts36Mod.GenericTypeAnnotation_
  - typings.babelTypes.ts36Mod.IntersectionTypeAnnotation_
  - typings.babelTypes.ts36Mod.MixedTypeAnnotation_
  - typings.babelTypes.ts36Mod.NullableTypeAnnotation_
  - typings.babelTypes.ts36Mod.NumericLiteralTypeAnnotation_
  - typings.babelTypes.ts36Mod.NumberTypeAnnotation_
  - typings.babelTypes.ts36Mod.StringLiteralTypeAnnotation_
  - typings.babelTypes.ts36Mod.StringTypeAnnotation_
  - typings.babelTypes.ts36Mod.ThisTypeAnnotation_
  - typings.babelTypes.ts36Mod.TupleTypeAnnotation_
  - typings.babelTypes.ts36Mod.TypeofTypeAnnotation_
  - typings.babelTypes.ts36Mod.TypeAnnotation_
  - typings.babelTypes.ts36Mod.ObjectTypeAnnotation_
  - typings.babelTypes.ts36Mod.UnionTypeAnnotation_
  - typings.babelTypes.ts36Mod.VoidTypeAnnotation_
*/
trait FlowTypeAnnotation extends StObject
object FlowTypeAnnotation {
  
  inline def AnyTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AnyTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.AnyTypeAnnotation_]
  }
  
  inline def ArrayTypeAnnotation_(elementType: FlowTypeAnnotation, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ArrayTypeAnnotation_]
  }
  
  inline def BooleanLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.BooleanLiteralTypeAnnotation_]
  }
  
  inline def BooleanTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.BooleanTypeAnnotation_]
  }
  
  inline def FunctionTypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    params: js.Array[FunctionTypeParam_],
    rest: FunctionTypeParam_,
    returnType: FlowTypeAnnotation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.ts36Mod.FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.FunctionTypeAnnotation_]
  }
  
  inline def GenericTypeAnnotation_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterInstantiation_
  ): typings.babelTypes.ts36Mod.GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GenericTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.GenericTypeAnnotation_]
  }
  
  inline def IntersectionTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, types: js.Array[FlowTypeAnnotation]): typings.babelTypes.ts36Mod.IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.IntersectionTypeAnnotation_]
  }
  
  inline def MixedTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.MixedTypeAnnotation_]
  }
  
  inline def NullableTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, typeAnnotation: FlowTypeAnnotation): typings.babelTypes.ts36Mod.NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.NullableTypeAnnotation_]
  }
  
  inline def NumberTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.NumberTypeAnnotation_]
  }
  
  inline def NumericLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.NumericLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.NumericLiteralTypeAnnotation_]
  }
  
  inline def ObjectTypeAnnotation_(
    callProperties: js.Array[ObjectTypeCallProperty_],
    end: Double,
    indexers: js.Array[ObjectTypeIndexer_],
    loc: SourceLocation,
    properties: js.Array[ObjectTypeProperty_],
    start: Double
  ): typings.babelTypes.ts36Mod.ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ObjectTypeAnnotation_]
  }
  
  inline def StringLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.StringLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.StringLiteralTypeAnnotation_]
  }
  
  inline def StringTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.StringTypeAnnotation_]
  }
  
  inline def ThisTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ThisTypeAnnotation_]
  }
  
  inline def TupleTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, types: js.Array[FlowTypeAnnotation]): typings.babelTypes.ts36Mod.TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TupleTypeAnnotation_]
  }
  
  inline def TypeAnnotation_(end: Double, loc: SourceLocation, start: Double, typeAnnotation: FlowTypeAnnotation): typings.babelTypes.ts36Mod.TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TypeAnnotation_]
  }
  
  inline def TypeofTypeAnnotation_(argument: FlowTypeAnnotation, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TypeofTypeAnnotation_]
  }
  
  inline def UnionTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, types: js.Array[FlowTypeAnnotation]): typings.babelTypes.ts36Mod.UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.UnionTypeAnnotation_]
  }
  
  inline def VoidTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.VoidTypeAnnotation_]
  }
}
