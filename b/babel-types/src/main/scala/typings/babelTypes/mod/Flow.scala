package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.AnyTypeAnnotation_
  - typings.babelTypes.mod.ArrayTypeAnnotation_
  - typings.babelTypes.mod.BooleanTypeAnnotation_
  - typings.babelTypes.mod.BooleanLiteralTypeAnnotation_
  - typings.babelTypes.mod.ClassImplements_
  - typings.babelTypes.mod.ClassProperty_
  - typings.babelTypes.mod.DeclareClass_
  - typings.babelTypes.mod.DeclareFunction_
  - typings.babelTypes.mod.DeclareInterface_
  - typings.babelTypes.mod.DeclareModule_
  - typings.babelTypes.mod.DeclareTypeAlias_
  - typings.babelTypes.mod.DeclareVariable_
  - typings.babelTypes.mod.ExistentialTypeParam_
  - typings.babelTypes.mod.FunctionTypeAnnotation_
  - typings.babelTypes.mod.FunctionTypeParam_
  - typings.babelTypes.mod.GenericTypeAnnotation_
  - typings.babelTypes.mod.InterfaceExtends_
  - typings.babelTypes.mod.InterfaceDeclaration_
  - typings.babelTypes.mod.IntersectionTypeAnnotation_
  - typings.babelTypes.mod.MixedTypeAnnotation_
  - typings.babelTypes.mod.NullableTypeAnnotation_
  - typings.babelTypes.mod.NumericLiteralTypeAnnotation_
  - typings.babelTypes.mod.NumberTypeAnnotation_
  - typings.babelTypes.mod.StringLiteralTypeAnnotation_
  - typings.babelTypes.mod.StringTypeAnnotation_
  - typings.babelTypes.mod.ThisTypeAnnotation_
  - typings.babelTypes.mod.TupleTypeAnnotation_
  - typings.babelTypes.mod.TypeofTypeAnnotation_
  - typings.babelTypes.mod.TypeAlias_
  - typings.babelTypes.mod.TypeAnnotation_
  - typings.babelTypes.mod.TypeCastExpression_
  - typings.babelTypes.mod.TypeParameterDeclaration_
  - typings.babelTypes.mod.TypeParameterInstantiation_
  - typings.babelTypes.mod.ObjectTypeAnnotation_
  - typings.babelTypes.mod.ObjectTypeCallProperty_
  - typings.babelTypes.mod.ObjectTypeIndexer_
  - typings.babelTypes.mod.ObjectTypeProperty_
  - typings.babelTypes.mod.QualifiedTypeIdentifier_
  - typings.babelTypes.mod.UnionTypeAnnotation_
  - typings.babelTypes.mod.VoidTypeAnnotation_
*/
trait Flow extends StObject
object Flow {
  
  inline def AnyTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AnyTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.AnyTypeAnnotation_]
  }
  
  inline def ArrayTypeAnnotation_(elementType: FlowTypeAnnotation, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.ArrayTypeAnnotation_]
  }
  
  inline def BooleanLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.BooleanLiteralTypeAnnotation_]
  }
  
  inline def BooleanTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.BooleanTypeAnnotation_]
  }
  
  inline def ClassImplements_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterInstantiation_
  ): typings.babelTypes.mod.ClassImplements_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassImplements")
    __obj.asInstanceOf[typings.babelTypes.mod.ClassImplements_]
  }
  
  inline def ClassProperty_(end: Double, key: Identifier_, loc: SourceLocation, start: Double, value: Expression): typings.babelTypes.mod.ClassProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassProperty")
    __obj.asInstanceOf[typings.babelTypes.mod.ClassProperty_]
  }
  
  inline def DeclareClass_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.mod.DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareClass")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareClass_]
  }
  
  inline def DeclareFunction_(end: Double, id: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.mod.DeclareFunction_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareFunction_]
  }
  
  inline def DeclareInterface_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.mod.DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareInterface_]
  }
  
  inline def DeclareModule_(
    body: BlockStatement_,
    end: Double,
    id: StringLiteral_ | Identifier_,
    loc: SourceLocation,
    start: Double
  ): typings.babelTypes.mod.DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareModule_]
  }
  
  inline def DeclareTypeAlias_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.mod.DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareTypeAlias_]
  }
  
  inline def DeclareVariable_(end: Double, id: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.mod.DeclareVariable_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareVariable_]
  }
  
  inline def ExistentialTypeParam_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.ExistentialTypeParam_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExistentialTypeParam")
    __obj.asInstanceOf[typings.babelTypes.mod.ExistentialTypeParam_]
  }
  
  inline def FunctionTypeAnnotation_(
    end: Double,
    loc: SourceLocation,
    params: js.Array[FunctionTypeParam_],
    rest: FunctionTypeParam_,
    returnType: FlowTypeAnnotation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.mod.FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.FunctionTypeAnnotation_]
  }
  
  inline def FunctionTypeParam_(
    end: Double,
    loc: SourceLocation,
    name: Identifier_,
    start: Double,
    typeAnnotation: FlowTypeAnnotation
  ): typings.babelTypes.mod.FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeParam")
    __obj.asInstanceOf[typings.babelTypes.mod.FunctionTypeParam_]
  }
  
  inline def GenericTypeAnnotation_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterInstantiation_
  ): typings.babelTypes.mod.GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GenericTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.GenericTypeAnnotation_]
  }
  
  inline def InterfaceDeclaration_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.mod.InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.InterfaceDeclaration_]
  }
  
  inline def InterfaceExtends_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterInstantiation_
  ): typings.babelTypes.mod.InterfaceExtends_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceExtends")
    __obj.asInstanceOf[typings.babelTypes.mod.InterfaceExtends_]
  }
  
  inline def IntersectionTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, types: js.Array[FlowTypeAnnotation]): typings.babelTypes.mod.IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.IntersectionTypeAnnotation_]
  }
  
  inline def MixedTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.MixedTypeAnnotation_]
  }
  
  inline def NullableTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, typeAnnotation: FlowTypeAnnotation): typings.babelTypes.mod.NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.NullableTypeAnnotation_]
  }
  
  inline def NumberTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.NumberTypeAnnotation_]
  }
  
  inline def NumericLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.NumericLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.NumericLiteralTypeAnnotation_]
  }
  
  inline def ObjectTypeAnnotation_(
    callProperties: js.Array[ObjectTypeCallProperty_],
    end: Double,
    indexers: js.Array[ObjectTypeIndexer_],
    loc: SourceLocation,
    properties: js.Array[ObjectTypeProperty_],
    start: Double
  ): typings.babelTypes.mod.ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectTypeAnnotation_]
  }
  
  inline def ObjectTypeCallProperty_(end: Double, loc: SourceLocation, start: Double, value: FlowTypeAnnotation): typings.babelTypes.mod.ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeCallProperty")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectTypeCallProperty_]
  }
  
  inline def ObjectTypeIndexer_(
    end: Double,
    id: Expression,
    key: FlowTypeAnnotation,
    loc: SourceLocation,
    start: Double,
    value: FlowTypeAnnotation
  ): typings.babelTypes.mod.ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeIndexer")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectTypeIndexer_]
  }
  
  inline def ObjectTypeProperty_(end: Double, key: Expression, loc: SourceLocation, start: Double, value: FlowTypeAnnotation): typings.babelTypes.mod.ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeProperty")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectTypeProperty_]
  }
  
  inline def QualifiedTypeIdentifier_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    qualification: Identifier_ | typings.babelTypes.mod.QualifiedTypeIdentifier_,
    start: Double
  ): typings.babelTypes.mod.QualifiedTypeIdentifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("QualifiedTypeIdentifier")
    __obj.asInstanceOf[typings.babelTypes.mod.QualifiedTypeIdentifier_]
  }
  
  inline def StringLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.StringLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.StringLiteralTypeAnnotation_]
  }
  
  inline def StringTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.StringTypeAnnotation_]
  }
  
  inline def ThisTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.ThisTypeAnnotation_]
  }
  
  inline def TupleTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, types: js.Array[FlowTypeAnnotation]): typings.babelTypes.mod.TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.TupleTypeAnnotation_]
  }
  
  inline def TypeAlias_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.mod.TypeAlias_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeAlias_]
  }
  
  inline def TypeAnnotation_(end: Double, loc: SourceLocation, start: Double, typeAnnotation: FlowTypeAnnotation): typings.babelTypes.mod.TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeAnnotation_]
  }
  
  inline def TypeCastExpression_(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    typeAnnotation: FlowTypeAnnotation
  ): typings.babelTypes.mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeCastExpression_]
  }
  
  inline def TypeParameterDeclaration_(end: Double, loc: SourceLocation, params: js.Array[Identifier_], start: Double): typings.babelTypes.mod.TypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameterDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeParameterDeclaration_]
  }
  
  inline def TypeParameterInstantiation_(end: Double, loc: SourceLocation, params: js.Array[FlowTypeAnnotation], start: Double): typings.babelTypes.mod.TypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameterInstantiation")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeParameterInstantiation_]
  }
  
  inline def TypeofTypeAnnotation_(argument: FlowTypeAnnotation, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeofTypeAnnotation_]
  }
  
  inline def UnionTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, types: js.Array[FlowTypeAnnotation]): typings.babelTypes.mod.UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.UnionTypeAnnotation_]
  }
  
  inline def VoidTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.VoidTypeAnnotation_]
  }
}
