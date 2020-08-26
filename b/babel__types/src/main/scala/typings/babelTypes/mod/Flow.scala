package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.AnyTypeAnnotation
import typings.babelTypes.babelTypesStrings.ArrayTypeAnnotation
import typings.babelTypes.babelTypesStrings.BooleanLiteralTypeAnnotation
import typings.babelTypes.babelTypesStrings.BooleanTypeAnnotation
import typings.babelTypes.babelTypesStrings.ClassImplements
import typings.babelTypes.babelTypesStrings.DeclareClass
import typings.babelTypes.babelTypesStrings.DeclareExportAllDeclaration
import typings.babelTypes.babelTypesStrings.DeclareExportDeclaration
import typings.babelTypes.babelTypesStrings.DeclareFunction
import typings.babelTypes.babelTypesStrings.DeclareInterface
import typings.babelTypes.babelTypesStrings.DeclareModule
import typings.babelTypes.babelTypesStrings.DeclareModuleExports
import typings.babelTypes.babelTypesStrings.DeclareOpaqueType
import typings.babelTypes.babelTypesStrings.DeclareTypeAlias
import typings.babelTypes.babelTypesStrings.DeclareVariable
import typings.babelTypes.babelTypesStrings.DeclaredPredicate
import typings.babelTypes.babelTypesStrings.EmptyTypeAnnotation
import typings.babelTypes.babelTypesStrings.ExistsTypeAnnotation
import typings.babelTypes.babelTypesStrings.FunctionTypeAnnotation
import typings.babelTypes.babelTypesStrings.FunctionTypeParam
import typings.babelTypes.babelTypesStrings.GenericTypeAnnotation
import typings.babelTypes.babelTypesStrings.InferredPredicate
import typings.babelTypes.babelTypesStrings.InterfaceDeclaration
import typings.babelTypes.babelTypesStrings.InterfaceExtends
import typings.babelTypes.babelTypesStrings.InterfaceTypeAnnotation
import typings.babelTypes.babelTypesStrings.IntersectionTypeAnnotation
import typings.babelTypes.babelTypesStrings.MixedTypeAnnotation
import typings.babelTypes.babelTypesStrings.NullLiteralTypeAnnotation
import typings.babelTypes.babelTypesStrings.NullableTypeAnnotation
import typings.babelTypes.babelTypesStrings.NumberLiteralTypeAnnotation
import typings.babelTypes.babelTypesStrings.NumberTypeAnnotation
import typings.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import typings.babelTypes.babelTypesStrings.ObjectTypeCallProperty
import typings.babelTypes.babelTypesStrings.ObjectTypeIndexer
import typings.babelTypes.babelTypesStrings.ObjectTypeInternalSlot
import typings.babelTypes.babelTypesStrings.ObjectTypeProperty
import typings.babelTypes.babelTypesStrings.ObjectTypeSpreadProperty
import typings.babelTypes.babelTypesStrings.OpaqueType
import typings.babelTypes.babelTypesStrings.QualifiedTypeIdentifier
import typings.babelTypes.babelTypesStrings.StringLiteralTypeAnnotation
import typings.babelTypes.babelTypesStrings.StringTypeAnnotation
import typings.babelTypes.babelTypesStrings.SymbolTypeAnnotation
import typings.babelTypes.babelTypesStrings.ThisTypeAnnotation
import typings.babelTypes.babelTypesStrings.TupleTypeAnnotation
import typings.babelTypes.babelTypesStrings.TypeAlias
import typings.babelTypes.babelTypesStrings.TypeAnnotation
import typings.babelTypes.babelTypesStrings.TypeCastExpression
import typings.babelTypes.babelTypesStrings.TypeParameter
import typings.babelTypes.babelTypesStrings.TypeParameterDeclaration
import typings.babelTypes.babelTypesStrings.TypeParameterInstantiation
import typings.babelTypes.babelTypesStrings.TypeofTypeAnnotation
import typings.babelTypes.babelTypesStrings.UnionTypeAnnotation
import typings.babelTypes.babelTypesStrings.Variance
import typings.babelTypes.babelTypesStrings.VoidTypeAnnotation
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.init
import typings.babelTypes.babelTypesStrings.minus
import typings.babelTypes.babelTypesStrings.plus
import typings.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.AnyTypeAnnotation_
  - typings.babelTypes.mod.ArrayTypeAnnotation_
  - typings.babelTypes.mod.BooleanTypeAnnotation_
  - typings.babelTypes.mod.BooleanLiteralTypeAnnotation_
  - typings.babelTypes.mod.NullLiteralTypeAnnotation_
  - typings.babelTypes.mod.ClassImplements_
  - typings.babelTypes.mod.DeclareClass_
  - typings.babelTypes.mod.DeclareFunction_
  - typings.babelTypes.mod.DeclareInterface_
  - typings.babelTypes.mod.DeclareModule_
  - typings.babelTypes.mod.DeclareModuleExports_
  - typings.babelTypes.mod.DeclareTypeAlias_
  - typings.babelTypes.mod.DeclareOpaqueType_
  - typings.babelTypes.mod.DeclareVariable_
  - typings.babelTypes.mod.DeclareExportDeclaration_
  - typings.babelTypes.mod.DeclareExportAllDeclaration_
  - typings.babelTypes.mod.DeclaredPredicate_
  - typings.babelTypes.mod.ExistsTypeAnnotation_
  - typings.babelTypes.mod.FunctionTypeAnnotation_
  - typings.babelTypes.mod.FunctionTypeParam_
  - typings.babelTypes.mod.GenericTypeAnnotation_
  - typings.babelTypes.mod.InferredPredicate_
  - typings.babelTypes.mod.InterfaceExtends_
  - typings.babelTypes.mod.InterfaceDeclaration_
  - typings.babelTypes.mod.InterfaceTypeAnnotation_
  - typings.babelTypes.mod.IntersectionTypeAnnotation_
  - typings.babelTypes.mod.MixedTypeAnnotation_
  - typings.babelTypes.mod.EmptyTypeAnnotation_
  - typings.babelTypes.mod.NullableTypeAnnotation_
  - typings.babelTypes.mod.NumberLiteralTypeAnnotation_
  - typings.babelTypes.mod.NumberTypeAnnotation_
  - typings.babelTypes.mod.ObjectTypeAnnotation_
  - typings.babelTypes.mod.ObjectTypeInternalSlot_
  - typings.babelTypes.mod.ObjectTypeCallProperty_
  - typings.babelTypes.mod.ObjectTypeIndexer_
  - typings.babelTypes.mod.ObjectTypeProperty_
  - typings.babelTypes.mod.ObjectTypeSpreadProperty_
  - typings.babelTypes.mod.OpaqueType_
  - typings.babelTypes.mod.QualifiedTypeIdentifier_
  - typings.babelTypes.mod.StringLiteralTypeAnnotation_
  - typings.babelTypes.mod.StringTypeAnnotation_
  - typings.babelTypes.mod.SymbolTypeAnnotation_
  - typings.babelTypes.mod.ThisTypeAnnotation_
  - typings.babelTypes.mod.TupleTypeAnnotation_
  - typings.babelTypes.mod.TypeofTypeAnnotation_
  - typings.babelTypes.mod.TypeAlias_
  - typings.babelTypes.mod.TypeAnnotation_
  - typings.babelTypes.mod.TypeCastExpression_
  - typings.babelTypes.mod.TypeParameter_
  - typings.babelTypes.mod.TypeParameterDeclaration_
  - typings.babelTypes.mod.TypeParameterInstantiation_
  - typings.babelTypes.mod.UnionTypeAnnotation_
  - typings.babelTypes.mod.Variance_
  - typings.babelTypes.mod.VoidTypeAnnotation_
*/
trait Flow extends _Node

object Flow {
  @scala.inline
  def ClassImplements_(id: Identifier_, `type`: ClassImplements): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def MixedTypeAnnotation_(`type`: MixedTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def GenericTypeAnnotation_(id: Identifier_ | QualifiedTypeIdentifier_, `type`: GenericTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareModuleExports_(`type`: DeclareModuleExports, typeAnnotation: TypeAnnotation_): Flow = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def OpaqueType_(id: Identifier_, impltype: FlowType, `type`: OpaqueType): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareVariable_(id: Identifier_, `type`: DeclareVariable): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: InterfaceDeclaration): Flow = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def InterfaceExtends_(id: Identifier_ | QualifiedTypeIdentifier_, `type`: InterfaceExtends): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TypeofTypeAnnotation_(argument: FlowType, `type`: TypeofTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclaredPredicate_(`type`: DeclaredPredicate, value: Flow): Flow = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def FunctionTypeAnnotation_(params: js.Array[FunctionTypeParam_], returnType: FlowType, `type`: FunctionTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TypeParameter_(name: String, `type`: TypeParameter): Flow = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_, `type`: DeclareModule): Flow = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def NullLiteralTypeAnnotation_(`type`: NullLiteralTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def EmptyTypeAnnotation_(`type`: EmptyTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def InferredPredicate_(`type`: InferredPredicate): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareFunction_(id: Identifier_, `type`: DeclareFunction): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ObjectTypeIndexer_(key: FlowType, static: Boolean, `type`: ObjectTypeIndexer, value: FlowType): Flow = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def NumberTypeAnnotation_(`type`: NumberTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TypeAnnotation_(`type`: TypeAnnotation, typeAnnotation: FlowType): Flow = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareExportDeclaration_(`type`: DeclareExportDeclaration): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def SymbolTypeAnnotation_(`type`: SymbolTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def InterfaceTypeAnnotation_(body: ObjectTypeAnnotation_, `type`: InterfaceTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def IntersectionTypeAnnotation_(`type`: IntersectionTypeAnnotation, types: js.Array[FlowType]): Flow = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TypeParameterInstantiation_(params: js.Array[FlowType], `type`: TypeParameterInstantiation): Flow = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TypeParameterDeclaration_(params: js.Array[TypeParameter_], `type`: TypeParameterDeclaration): Flow = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareExportAllDeclaration_(source: StringLiteral_, `type`: DeclareExportAllDeclaration): Flow = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def NumberLiteralTypeAnnotation_(`type`: NumberLiteralTypeAnnotation, value: Double): Flow = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def BooleanLiteralTypeAnnotation_(`type`: BooleanLiteralTypeAnnotation, value: Boolean): Flow = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ObjectTypeInternalSlot_(
    id: Identifier_,
    method: Boolean,
    optional: Boolean,
    static: Boolean,
    `type`: ObjectTypeInternalSlot,
    value: FlowType
  ): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def StringTypeAnnotation_(`type`: StringTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def AnyTypeAnnotation_(`type`: AnyTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def UnionTypeAnnotation_(`type`: UnionTypeAnnotation, types: js.Array[FlowType]): Flow = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: DeclareClass): Flow = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: DeclareInterface): Flow = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ExistsTypeAnnotation_(`type`: ExistsTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ObjectTypeSpreadProperty_(argument: FlowType, `type`: ObjectTypeSpreadProperty): Flow = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def FunctionTypeParam_(`type`: FunctionTypeParam, typeAnnotation: FlowType): Flow = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TupleTypeAnnotation_(`type`: TupleTypeAnnotation, types: js.Array[FlowType]): Flow = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def StringLiteralTypeAnnotation_(`type`: StringLiteralTypeAnnotation, value: String): Flow = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ThisTypeAnnotation_(`type`: ThisTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def NullableTypeAnnotation_(`type`: NullableTypeAnnotation, typeAnnotation: FlowType): Flow = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def VoidTypeAnnotation_(`type`: VoidTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ObjectTypeCallProperty_(static: Boolean, `type`: ObjectTypeCallProperty, value: FlowType): Flow = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TypeAlias_(id: Identifier_, right: FlowType, `type`: TypeAlias): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def TypeCastExpression_(expression: Expression, `type`: TypeCastExpression, typeAnnotation: TypeAnnotation_): Flow = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def QualifiedTypeIdentifier_(
    id: Identifier_,
    qualification: Identifier_ | typings.babelTypes.mod.QualifiedTypeIdentifier_,
    `type`: QualifiedTypeIdentifier
  ): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareTypeAlias_(id: Identifier_, right: FlowType, `type`: DeclareTypeAlias): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ObjectTypeAnnotation_(
    exact: Boolean,
    properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
    `type`: ObjectTypeAnnotation
  ): Flow = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def BooleanTypeAnnotation_(`type`: BooleanTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ArrayTypeAnnotation_(elementType: FlowType, `type`: ArrayTypeAnnotation): Flow = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def Variance_(kind: minus | plus, `type`: Variance): Flow = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def DeclareOpaqueType_(id: Identifier_, `type`: DeclareOpaqueType): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  def ObjectTypeProperty_(
    key: Identifier_ | StringLiteral_,
    kind: init | get | set,
    optional: Boolean,
    proto: Boolean,
    static: Boolean,
    `type`: ObjectTypeProperty,
    value: FlowType
  ): Flow = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
}

