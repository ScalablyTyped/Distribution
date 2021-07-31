package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.AnyTypeAnnotation_
  - typings.babelTypes.ts36Mod.ArrayTypeAnnotation_
  - typings.babelTypes.ts36Mod.BooleanTypeAnnotation_
  - typings.babelTypes.ts36Mod.BooleanLiteralTypeAnnotation_
  - typings.babelTypes.ts36Mod.ClassImplements_
  - typings.babelTypes.ts36Mod.ClassProperty_
  - typings.babelTypes.ts36Mod.DeclareClass_
  - typings.babelTypes.ts36Mod.DeclareFunction_
  - typings.babelTypes.ts36Mod.DeclareInterface_
  - typings.babelTypes.ts36Mod.DeclareModule_
  - typings.babelTypes.ts36Mod.DeclareTypeAlias_
  - typings.babelTypes.ts36Mod.DeclareVariable_
  - typings.babelTypes.ts36Mod.ExistentialTypeParam_
  - typings.babelTypes.ts36Mod.FunctionTypeAnnotation_
  - typings.babelTypes.ts36Mod.FunctionTypeParam_
  - typings.babelTypes.ts36Mod.GenericTypeAnnotation_
  - typings.babelTypes.ts36Mod.InterfaceExtends_
  - typings.babelTypes.ts36Mod.InterfaceDeclaration_
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
  - typings.babelTypes.ts36Mod.TypeAlias_
  - typings.babelTypes.ts36Mod.TypeAnnotation_
  - typings.babelTypes.ts36Mod.TypeCastExpression_
  - typings.babelTypes.ts36Mod.TypeParameterDeclaration_
  - typings.babelTypes.ts36Mod.TypeParameterInstantiation_
  - typings.babelTypes.ts36Mod.ObjectTypeAnnotation_
  - typings.babelTypes.ts36Mod.ObjectTypeCallProperty_
  - typings.babelTypes.ts36Mod.ObjectTypeIndexer_
  - typings.babelTypes.ts36Mod.ObjectTypeProperty_
  - typings.babelTypes.ts36Mod.QualifiedTypeIdentifier_
  - typings.babelTypes.ts36Mod.UnionTypeAnnotation_
  - typings.babelTypes.ts36Mod.VoidTypeAnnotation_
*/
trait Flow extends StObject
object Flow {
  
  @scala.inline
  def AnyTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AnyTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.AnyTypeAnnotation_]
  }
  
  @scala.inline
  def ArrayTypeAnnotation_(elementType: FlowTypeAnnotation, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ArrayTypeAnnotation_]
  }
  
  @scala.inline
  def BooleanLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.BooleanLiteralTypeAnnotation_]
  }
  
  @scala.inline
  def BooleanTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.BooleanTypeAnnotation_]
  }
  
  @scala.inline
  def ClassImplements_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterInstantiation_
  ): typings.babelTypes.ts36Mod.ClassImplements_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassImplements")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ClassImplements_]
  }
  
  @scala.inline
  def ClassProperty_(end: Double, key: Identifier_, loc: SourceLocation, start: Double, value: Expression): typings.babelTypes.ts36Mod.ClassProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassProperty")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ClassProperty_]
  }
  
  @scala.inline
  def DeclareClass_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.ts36Mod.DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareClass")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DeclareClass_]
  }
  
  @scala.inline
  def DeclareFunction_(end: Double, id: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.DeclareFunction_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DeclareFunction_]
  }
  
  @scala.inline
  def DeclareInterface_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.ts36Mod.DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DeclareInterface_]
  }
  
  @scala.inline
  def DeclareModule_(
    body: BlockStatement_,
    end: Double,
    id: StringLiteral_ | Identifier_,
    loc: SourceLocation,
    start: Double
  ): typings.babelTypes.ts36Mod.DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DeclareModule_]
  }
  
  @scala.inline
  def DeclareTypeAlias_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.ts36Mod.DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DeclareTypeAlias_]
  }
  
  @scala.inline
  def DeclareVariable_(end: Double, id: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.DeclareVariable_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DeclareVariable_]
  }
  
  @scala.inline
  def ExistentialTypeParam_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ExistentialTypeParam_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExistentialTypeParam")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ExistentialTypeParam_]
  }
  
  @scala.inline
  def FunctionTypeAnnotation_(
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
  
  @scala.inline
  def FunctionTypeParam_(
    end: Double,
    loc: SourceLocation,
    name: Identifier_,
    start: Double,
    typeAnnotation: FlowTypeAnnotation
  ): typings.babelTypes.ts36Mod.FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeParam")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.FunctionTypeParam_]
  }
  
  @scala.inline
  def GenericTypeAnnotation_(
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
  
  @scala.inline
  def InterfaceDeclaration_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.ts36Mod.InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.InterfaceDeclaration_]
  }
  
  @scala.inline
  def InterfaceExtends_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterInstantiation_
  ): typings.babelTypes.ts36Mod.InterfaceExtends_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceExtends")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.InterfaceExtends_]
  }
  
  @scala.inline
  def IntersectionTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, types: js.Array[FlowTypeAnnotation]): typings.babelTypes.ts36Mod.IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.IntersectionTypeAnnotation_]
  }
  
  @scala.inline
  def MixedTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.MixedTypeAnnotation_]
  }
  
  @scala.inline
  def NullableTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, typeAnnotation: FlowTypeAnnotation): typings.babelTypes.ts36Mod.NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.NullableTypeAnnotation_]
  }
  
  @scala.inline
  def NumberTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.NumberTypeAnnotation_]
  }
  
  @scala.inline
  def NumericLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.NumericLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.NumericLiteralTypeAnnotation_]
  }
  
  @scala.inline
  def ObjectTypeAnnotation_(
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
  
  @scala.inline
  def ObjectTypeCallProperty_(end: Double, loc: SourceLocation, start: Double, value: FlowTypeAnnotation): typings.babelTypes.ts36Mod.ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeCallProperty")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ObjectTypeCallProperty_]
  }
  
  @scala.inline
  def ObjectTypeIndexer_(
    end: Double,
    id: Expression,
    key: FlowTypeAnnotation,
    loc: SourceLocation,
    start: Double,
    value: FlowTypeAnnotation
  ): typings.babelTypes.ts36Mod.ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeIndexer")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ObjectTypeIndexer_]
  }
  
  @scala.inline
  def ObjectTypeProperty_(end: Double, key: Expression, loc: SourceLocation, start: Double, value: FlowTypeAnnotation): typings.babelTypes.ts36Mod.ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeProperty")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ObjectTypeProperty_]
  }
  
  @scala.inline
  def QualifiedTypeIdentifier_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    qualification: Identifier_ | typings.babelTypes.ts36Mod.QualifiedTypeIdentifier_,
    start: Double
  ): typings.babelTypes.ts36Mod.QualifiedTypeIdentifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("QualifiedTypeIdentifier")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.QualifiedTypeIdentifier_]
  }
  
  @scala.inline
  def StringLiteralTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.StringLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.StringLiteralTypeAnnotation_]
  }
  
  @scala.inline
  def StringTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.StringTypeAnnotation_]
  }
  
  @scala.inline
  def ThisTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ThisTypeAnnotation_]
  }
  
  @scala.inline
  def TupleTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, types: js.Array[FlowTypeAnnotation]): typings.babelTypes.ts36Mod.TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TupleTypeAnnotation_]
  }
  
  @scala.inline
  def TypeAlias_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.ts36Mod.TypeAlias_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TypeAlias_]
  }
  
  @scala.inline
  def TypeAnnotation_(end: Double, loc: SourceLocation, start: Double, typeAnnotation: FlowTypeAnnotation): typings.babelTypes.ts36Mod.TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TypeAnnotation_]
  }
  
  @scala.inline
  def TypeCastExpression_(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    typeAnnotation: FlowTypeAnnotation
  ): typings.babelTypes.ts36Mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TypeCastExpression_]
  }
  
  @scala.inline
  def TypeParameterDeclaration_(end: Double, loc: SourceLocation, params: js.Array[Identifier_], start: Double): typings.babelTypes.ts36Mod.TypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameterDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TypeParameterDeclaration_]
  }
  
  @scala.inline
  def TypeParameterInstantiation_(end: Double, loc: SourceLocation, params: js.Array[FlowTypeAnnotation], start: Double): typings.babelTypes.ts36Mod.TypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameterInstantiation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TypeParameterInstantiation_]
  }
  
  @scala.inline
  def TypeofTypeAnnotation_(argument: FlowTypeAnnotation, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TypeofTypeAnnotation_]
  }
  
  @scala.inline
  def UnionTypeAnnotation_(end: Double, loc: SourceLocation, start: Double, types: js.Array[FlowTypeAnnotation]): typings.babelTypes.ts36Mod.UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.UnionTypeAnnotation_]
  }
  
  @scala.inline
  def VoidTypeAnnotation_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.VoidTypeAnnotation_]
  }
}
