package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.init
import typings.babelTypes.babelTypesStrings.minus
import typings.babelTypes.babelTypesStrings.plus
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.AnyTypeAnnotation_
  - typings.babelTypes.libMod.ArrayTypeAnnotation_
  - typings.babelTypes.libMod.BooleanTypeAnnotation_
  - typings.babelTypes.libMod.BooleanLiteralTypeAnnotation_
  - typings.babelTypes.libMod.NullLiteralTypeAnnotation_
  - typings.babelTypes.libMod.ClassImplements_
  - typings.babelTypes.libMod.DeclareClass_
  - typings.babelTypes.libMod.DeclareFunction_
  - typings.babelTypes.libMod.DeclareInterface_
  - typings.babelTypes.libMod.DeclareModule_
  - typings.babelTypes.libMod.DeclareModuleExports_
  - typings.babelTypes.libMod.DeclareTypeAlias_
  - typings.babelTypes.libMod.DeclareOpaqueType_
  - typings.babelTypes.libMod.DeclareVariable_
  - typings.babelTypes.libMod.DeclareExportDeclaration_
  - typings.babelTypes.libMod.DeclareExportAllDeclaration_
  - typings.babelTypes.libMod.DeclaredPredicate_
  - typings.babelTypes.libMod.ExistsTypeAnnotation_
  - typings.babelTypes.libMod.FunctionTypeAnnotation_
  - typings.babelTypes.libMod.FunctionTypeParam_
  - typings.babelTypes.libMod.GenericTypeAnnotation_
  - typings.babelTypes.libMod.InferredPredicate_
  - typings.babelTypes.libMod.InterfaceExtends_
  - typings.babelTypes.libMod.InterfaceDeclaration_
  - typings.babelTypes.libMod.InterfaceTypeAnnotation_
  - typings.babelTypes.libMod.IntersectionTypeAnnotation_
  - typings.babelTypes.libMod.MixedTypeAnnotation_
  - typings.babelTypes.libMod.EmptyTypeAnnotation_
  - typings.babelTypes.libMod.NullableTypeAnnotation_
  - typings.babelTypes.libMod.NumberLiteralTypeAnnotation_
  - typings.babelTypes.libMod.NumberTypeAnnotation_
  - typings.babelTypes.libMod.ObjectTypeAnnotation_
  - typings.babelTypes.libMod.ObjectTypeInternalSlot_
  - typings.babelTypes.libMod.ObjectTypeCallProperty_
  - typings.babelTypes.libMod.ObjectTypeIndexer_
  - typings.babelTypes.libMod.ObjectTypeProperty_
  - typings.babelTypes.libMod.ObjectTypeSpreadProperty_
  - typings.babelTypes.libMod.OpaqueType_
  - typings.babelTypes.libMod.QualifiedTypeIdentifier_
  - typings.babelTypes.libMod.StringLiteralTypeAnnotation_
  - typings.babelTypes.libMod.StringTypeAnnotation_
  - typings.babelTypes.libMod.SymbolTypeAnnotation_
  - typings.babelTypes.libMod.ThisTypeAnnotation_
  - typings.babelTypes.libMod.TupleTypeAnnotation_
  - typings.babelTypes.libMod.TypeofTypeAnnotation_
  - typings.babelTypes.libMod.TypeAlias_
  - typings.babelTypes.libMod.TypeAnnotation_
  - typings.babelTypes.libMod.TypeCastExpression_
  - typings.babelTypes.libMod.TypeParameter_
  - typings.babelTypes.libMod.TypeParameterDeclaration_
  - typings.babelTypes.libMod.TypeParameterInstantiation_
  - typings.babelTypes.libMod.UnionTypeAnnotation_
  - typings.babelTypes.libMod.Variance_
  - typings.babelTypes.libMod.VoidTypeAnnotation_
  - typings.babelTypes.libMod.EnumDeclaration_
  - typings.babelTypes.libMod.EnumBooleanBody_
  - typings.babelTypes.libMod.EnumNumberBody_
  - typings.babelTypes.libMod.EnumStringBody_
  - typings.babelTypes.libMod.EnumSymbolBody_
  - typings.babelTypes.libMod.EnumBooleanMember_
  - typings.babelTypes.libMod.EnumNumberMember_
  - typings.babelTypes.libMod.EnumStringMember_
  - typings.babelTypes.libMod.EnumDefaultedMember_
  - typings.babelTypes.libMod.IndexedAccessType_
  - typings.babelTypes.libMod.OptionalIndexedAccessType_
*/
trait Flow extends StObject
object Flow {
  
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
  
  inline def ClassImplements_(id: Identifier_): typings.babelTypes.libMod.ClassImplements_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassImplements")
    __obj.asInstanceOf[typings.babelTypes.libMod.ClassImplements_]
  }
  
  inline def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.libMod.DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareClass")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareClass_]
  }
  
  inline def DeclareExportAllDeclaration_(source: StringLiteral_): typings.babelTypes.libMod.DeclareExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareExportAllDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareExportAllDeclaration_]
  }
  
  inline def DeclareExportDeclaration_(): typings.babelTypes.libMod.DeclareExportDeclaration_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareExportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareExportDeclaration_]
  }
  
  inline def DeclareFunction_(id: Identifier_): typings.babelTypes.libMod.DeclareFunction_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareFunction_]
  }
  
  inline def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.libMod.DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareInterface_]
  }
  
  inline def DeclareModuleExports_(typeAnnotation: TypeAnnotation_): typings.babelTypes.libMod.DeclareModuleExports_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModuleExports")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareModuleExports_]
  }
  
  inline def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_): typings.babelTypes.libMod.DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareModule_]
  }
  
  inline def DeclareOpaqueType_(id: Identifier_): typings.babelTypes.libMod.DeclareOpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareOpaqueType")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareOpaqueType_]
  }
  
  inline def DeclareTypeAlias_(id: Identifier_, right: FlowType): typings.babelTypes.libMod.DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareTypeAlias_]
  }
  
  inline def DeclareVariable_(id: Identifier_): typings.babelTypes.libMod.DeclareVariable_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareVariable_]
  }
  
  inline def DeclaredPredicate_(value: Flow): typings.babelTypes.libMod.DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclaredPredicate")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclaredPredicate_]
  }
  
  inline def EmptyTypeAnnotation_(): typings.babelTypes.libMod.EmptyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.EmptyTypeAnnotation_]
  }
  
  inline def EnumBooleanBody_(explicitType: Boolean, hasUnknownMembers: Boolean, members: js.Array[EnumBooleanMember_]): typings.babelTypes.libMod.EnumBooleanBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumBooleanBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumBooleanBody_]
  }
  
  inline def EnumBooleanMember_(id: Identifier_, init: BooleanLiteral_): typings.babelTypes.libMod.EnumBooleanMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumBooleanMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumBooleanMember_]
  }
  
  inline def EnumDeclaration_(body: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_, id: Identifier_): typings.babelTypes.libMod.EnumDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumDeclaration_]
  }
  
  inline def EnumDefaultedMember_(id: Identifier_): typings.babelTypes.libMod.EnumDefaultedMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumDefaultedMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumDefaultedMember_]
  }
  
  inline def EnumNumberBody_(explicitType: Boolean, hasUnknownMembers: Boolean, members: js.Array[EnumNumberMember_]): typings.babelTypes.libMod.EnumNumberBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumNumberBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumNumberBody_]
  }
  
  inline def EnumNumberMember_(id: Identifier_, init: NumericLiteral_): typings.babelTypes.libMod.EnumNumberMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumNumberMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumNumberMember_]
  }
  
  inline def EnumStringBody_(
    explicitType: Boolean,
    hasUnknownMembers: Boolean,
    members: js.Array[EnumStringMember_ | EnumDefaultedMember_]
  ): typings.babelTypes.libMod.EnumStringBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumStringBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumStringBody_]
  }
  
  inline def EnumStringMember_(id: Identifier_, init: StringLiteral_): typings.babelTypes.libMod.EnumStringMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumStringMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumStringMember_]
  }
  
  inline def EnumSymbolBody_(hasUnknownMembers: Boolean, members: js.Array[EnumDefaultedMember_]): typings.babelTypes.libMod.EnumSymbolBody_ = {
    val __obj = js.Dynamic.literal(hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumSymbolBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumSymbolBody_]
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
  
  inline def FunctionTypeParam_(typeAnnotation: FlowType): typings.babelTypes.libMod.FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeParam")
    __obj.asInstanceOf[typings.babelTypes.libMod.FunctionTypeParam_]
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
  
  inline def InferredPredicate_(): typings.babelTypes.libMod.InferredPredicate_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InferredPredicate")
    __obj.asInstanceOf[typings.babelTypes.libMod.InferredPredicate_]
  }
  
  inline def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.libMod.InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.InterfaceDeclaration_]
  }
  
  inline def InterfaceExtends_(id: Identifier_ | QualifiedTypeIdentifier_): typings.babelTypes.libMod.InterfaceExtends_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceExtends")
    __obj.asInstanceOf[typings.babelTypes.libMod.InterfaceExtends_]
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
  
  inline def ObjectTypeCallProperty_(static: Boolean, value: FlowType): typings.babelTypes.libMod.ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeCallProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeCallProperty_]
  }
  
  inline def ObjectTypeIndexer_(key: FlowType, static: Boolean, value: FlowType): typings.babelTypes.libMod.ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeIndexer")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeIndexer_]
  }
  
  inline def ObjectTypeInternalSlot_(id: Identifier_, method: Boolean, optional: Boolean, static: Boolean, value: FlowType): typings.babelTypes.libMod.ObjectTypeInternalSlot_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeInternalSlot")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeInternalSlot_]
  }
  
  inline def ObjectTypeProperty_(
    key: Identifier_ | StringLiteral_,
    kind: init | get | set,
    method: Boolean,
    optional: Boolean,
    proto: Boolean,
    static: Boolean,
    value: FlowType
  ): typings.babelTypes.libMod.ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeProperty_]
  }
  
  inline def ObjectTypeSpreadProperty_(argument: FlowType): typings.babelTypes.libMod.ObjectTypeSpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeSpreadProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeSpreadProperty_]
  }
  
  inline def OpaqueType_(id: Identifier_, impltype: FlowType): typings.babelTypes.libMod.OpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OpaqueType")
    __obj.asInstanceOf[typings.babelTypes.libMod.OpaqueType_]
  }
  
  inline def OptionalIndexedAccessType_(indexType: FlowType, objectType: FlowType, optional: Boolean): typings.babelTypes.libMod.OptionalIndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalIndexedAccessType")
    __obj.asInstanceOf[typings.babelTypes.libMod.OptionalIndexedAccessType_]
  }
  
  inline def QualifiedTypeIdentifier_(id: Identifier_, qualification: Identifier_ | typings.babelTypes.libMod.QualifiedTypeIdentifier_): typings.babelTypes.libMod.QualifiedTypeIdentifier_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("QualifiedTypeIdentifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.QualifiedTypeIdentifier_]
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
  
  inline def TypeAlias_(id: Identifier_, right: FlowType): typings.babelTypes.libMod.TypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeAlias_]
  }
  
  inline def TypeAnnotation_(typeAnnotation: FlowType): typings.babelTypes.libMod.TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeAnnotation_]
  }
  
  inline def TypeCastExpression_(expression: Expression, typeAnnotation: TypeAnnotation_): typings.babelTypes.libMod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeCastExpression_]
  }
  
  inline def TypeParameterDeclaration_(params: js.Array[TypeParameter_]): typings.babelTypes.libMod.TypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameterDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeParameterDeclaration_]
  }
  
  inline def TypeParameterInstantiation_(params: js.Array[FlowType]): typings.babelTypes.libMod.TypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameterInstantiation")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeParameterInstantiation_]
  }
  
  inline def TypeParameter_(name: String): typings.babelTypes.libMod.TypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameter")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeParameter_]
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
  
  inline def Variance_(kind: minus | plus): typings.babelTypes.libMod.Variance_ = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Variance")
    __obj.asInstanceOf[typings.babelTypes.libMod.Variance_]
  }
  
  inline def VoidTypeAnnotation_(): typings.babelTypes.libMod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.VoidTypeAnnotation_]
  }
}
