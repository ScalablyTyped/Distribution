package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.AnyTypeAnnotation
import typings.babelTypes.babelTypesStrings.ArrayTypeAnnotation
import typings.babelTypes.babelTypesStrings.BooleanLiteralTypeAnnotation
import typings.babelTypes.babelTypesStrings.BooleanTypeAnnotation
import typings.babelTypes.babelTypesStrings.EmptyTypeAnnotation
import typings.babelTypes.babelTypesStrings.ExistsTypeAnnotation
import typings.babelTypes.babelTypesStrings.FunctionTypeAnnotation
import typings.babelTypes.babelTypesStrings.GenericTypeAnnotation
import typings.babelTypes.babelTypesStrings.InterfaceTypeAnnotation
import typings.babelTypes.babelTypesStrings.IntersectionTypeAnnotation
import typings.babelTypes.babelTypesStrings.MixedTypeAnnotation
import typings.babelTypes.babelTypesStrings.NullLiteralTypeAnnotation
import typings.babelTypes.babelTypesStrings.NullableTypeAnnotation
import typings.babelTypes.babelTypesStrings.NumberLiteralTypeAnnotation
import typings.babelTypes.babelTypesStrings.NumberTypeAnnotation
import typings.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import typings.babelTypes.babelTypesStrings.StringLiteralTypeAnnotation
import typings.babelTypes.babelTypesStrings.StringTypeAnnotation
import typings.babelTypes.babelTypesStrings.SymbolTypeAnnotation
import typings.babelTypes.babelTypesStrings.ThisTypeAnnotation
import typings.babelTypes.babelTypesStrings.TupleTypeAnnotation
import typings.babelTypes.babelTypesStrings.TypeofTypeAnnotation
import typings.babelTypes.babelTypesStrings.UnionTypeAnnotation
import typings.babelTypes.babelTypesStrings.VoidTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait FlowType extends _Node

object FlowType {
  @scala.inline
  def MixedTypeAnnotation_(`type`: MixedTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def GenericTypeAnnotation_(id: Identifier_ | QualifiedTypeIdentifier_, `type`: GenericTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def TypeofTypeAnnotation_(argument: FlowType, `type`: TypeofTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def FunctionTypeAnnotation_(params: js.Array[FunctionTypeParam_], returnType: FlowType, `type`: FunctionTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def NullLiteralTypeAnnotation_(`type`: NullLiteralTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def EmptyTypeAnnotation_(`type`: EmptyTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def NumberTypeAnnotation_(`type`: NumberTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def SymbolTypeAnnotation_(`type`: SymbolTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def InterfaceTypeAnnotation_(body: ObjectTypeAnnotation_, `type`: InterfaceTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def IntersectionTypeAnnotation_(`type`: IntersectionTypeAnnotation, types: js.Array[FlowType]): FlowType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def NumberLiteralTypeAnnotation_(`type`: NumberLiteralTypeAnnotation, value: Double): FlowType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def BooleanLiteralTypeAnnotation_(`type`: BooleanLiteralTypeAnnotation, value: Boolean): FlowType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def StringTypeAnnotation_(`type`: StringTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def AnyTypeAnnotation_(`type`: AnyTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def UnionTypeAnnotation_(`type`: UnionTypeAnnotation, types: js.Array[FlowType]): FlowType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def ExistsTypeAnnotation_(`type`: ExistsTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def TupleTypeAnnotation_(`type`: TupleTypeAnnotation, types: js.Array[FlowType]): FlowType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def StringLiteralTypeAnnotation_(`type`: StringLiteralTypeAnnotation, value: String): FlowType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def ThisTypeAnnotation_(`type`: ThisTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def NullableTypeAnnotation_(`type`: NullableTypeAnnotation, typeAnnotation: FlowType): FlowType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def VoidTypeAnnotation_(`type`: VoidTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def ObjectTypeAnnotation_(
    exact: Boolean,
    properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_],
    `type`: ObjectTypeAnnotation
  ): FlowType = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def BooleanTypeAnnotation_(`type`: BooleanTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
  @scala.inline
  def ArrayTypeAnnotation_(elementType: FlowType, `type`: ArrayTypeAnnotation): FlowType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowType]
  }
}

