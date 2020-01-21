package typings.babylonWalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait flowVisitors[V] extends js.Object {
  var AnyTypeAnnotation: js.UndefOr[V] = js.undefined
  var ArrayTypeAnnotation: js.UndefOr[V] = js.undefined
  var BooleanLiteralTypeAnnotation: js.UndefOr[V] = js.undefined
  var BooleanTypeAnnotation: js.UndefOr[V] = js.undefined
  var ClassImplements: js.UndefOr[V] = js.undefined
  var DeclareClass: js.UndefOr[V] = js.undefined
  var DeclareFunction: js.UndefOr[V] = js.undefined
  var DeclareInterface: js.UndefOr[V] = js.undefined
  var DeclareModule: js.UndefOr[V] = js.undefined
  var DeclareTypeAlias: js.UndefOr[V] = js.undefined
  var DeclareVariable: js.UndefOr[V] = js.undefined
  var FunctionTypeAnnotation: js.UndefOr[V] = js.undefined
  var FunctionTypeParam: js.UndefOr[V] = js.undefined
  var GenericTypeAnnotation: js.UndefOr[V] = js.undefined
  var InterfaceDeclaration: js.UndefOr[V] = js.undefined
  var InterfaceExtends: js.UndefOr[V] = js.undefined
  var IntersectionTypeAnnotation: js.UndefOr[V] = js.undefined
  var MixedTypeAnnotation: js.UndefOr[V] = js.undefined
  var NullLiteralTypeAnnotation: js.UndefOr[V] = js.undefined
  var NullableTypeAnnotation: js.UndefOr[V] = js.undefined
  var NumberTypeAnnotation: js.UndefOr[V] = js.undefined
  var ObjectTypeAnnotation: js.UndefOr[V] = js.undefined
  var ObjectTypeCallProperty: js.UndefOr[V] = js.undefined
  var ObjectTypeIndexer: js.UndefOr[V] = js.undefined
  var ObjectTypeProperty: js.UndefOr[V] = js.undefined
  var QualifiedTypeIdentifier: js.UndefOr[V] = js.undefined
  var StringLiteralTypeAnnotation: js.UndefOr[V] = js.undefined
  var StringTypeAnnotation: js.UndefOr[V] = js.undefined
  var ThisTypeAnnotation: js.UndefOr[V] = js.undefined
  var TupleTypeAnnotation: js.UndefOr[V] = js.undefined
  var TypeAlias: js.UndefOr[V] = js.undefined
  var TypeAnnotation: js.UndefOr[V] = js.undefined
  var TypeCastExpression: js.UndefOr[V] = js.undefined
  var TypeParameterDeclaration: js.UndefOr[V] = js.undefined
  var TypeParameterInstantiation: js.UndefOr[V] = js.undefined
  var TypeofTypeAnnotation: js.UndefOr[V] = js.undefined
  var UnionTypeAnnotation: js.UndefOr[V] = js.undefined
  var VoidTypeAnnotation: js.UndefOr[V] = js.undefined
}

object flowVisitors {
  @scala.inline
  def apply[V](
    AnyTypeAnnotation: V = null,
    ArrayTypeAnnotation: V = null,
    BooleanLiteralTypeAnnotation: V = null,
    BooleanTypeAnnotation: V = null,
    ClassImplements: V = null,
    DeclareClass: V = null,
    DeclareFunction: V = null,
    DeclareInterface: V = null,
    DeclareModule: V = null,
    DeclareTypeAlias: V = null,
    DeclareVariable: V = null,
    FunctionTypeAnnotation: V = null,
    FunctionTypeParam: V = null,
    GenericTypeAnnotation: V = null,
    InterfaceDeclaration: V = null,
    InterfaceExtends: V = null,
    IntersectionTypeAnnotation: V = null,
    MixedTypeAnnotation: V = null,
    NullLiteralTypeAnnotation: V = null,
    NullableTypeAnnotation: V = null,
    NumberTypeAnnotation: V = null,
    ObjectTypeAnnotation: V = null,
    ObjectTypeCallProperty: V = null,
    ObjectTypeIndexer: V = null,
    ObjectTypeProperty: V = null,
    QualifiedTypeIdentifier: V = null,
    StringLiteralTypeAnnotation: V = null,
    StringTypeAnnotation: V = null,
    ThisTypeAnnotation: V = null,
    TupleTypeAnnotation: V = null,
    TypeAlias: V = null,
    TypeAnnotation: V = null,
    TypeCastExpression: V = null,
    TypeParameterDeclaration: V = null,
    TypeParameterInstantiation: V = null,
    TypeofTypeAnnotation: V = null,
    UnionTypeAnnotation: V = null,
    VoidTypeAnnotation: V = null
  ): flowVisitors[V] = {
    val __obj = js.Dynamic.literal()
    if (AnyTypeAnnotation != null) __obj.updateDynamic("AnyTypeAnnotation")(AnyTypeAnnotation.asInstanceOf[js.Any])
    if (ArrayTypeAnnotation != null) __obj.updateDynamic("ArrayTypeAnnotation")(ArrayTypeAnnotation.asInstanceOf[js.Any])
    if (BooleanLiteralTypeAnnotation != null) __obj.updateDynamic("BooleanLiteralTypeAnnotation")(BooleanLiteralTypeAnnotation.asInstanceOf[js.Any])
    if (BooleanTypeAnnotation != null) __obj.updateDynamic("BooleanTypeAnnotation")(BooleanTypeAnnotation.asInstanceOf[js.Any])
    if (ClassImplements != null) __obj.updateDynamic("ClassImplements")(ClassImplements.asInstanceOf[js.Any])
    if (DeclareClass != null) __obj.updateDynamic("DeclareClass")(DeclareClass.asInstanceOf[js.Any])
    if (DeclareFunction != null) __obj.updateDynamic("DeclareFunction")(DeclareFunction.asInstanceOf[js.Any])
    if (DeclareInterface != null) __obj.updateDynamic("DeclareInterface")(DeclareInterface.asInstanceOf[js.Any])
    if (DeclareModule != null) __obj.updateDynamic("DeclareModule")(DeclareModule.asInstanceOf[js.Any])
    if (DeclareTypeAlias != null) __obj.updateDynamic("DeclareTypeAlias")(DeclareTypeAlias.asInstanceOf[js.Any])
    if (DeclareVariable != null) __obj.updateDynamic("DeclareVariable")(DeclareVariable.asInstanceOf[js.Any])
    if (FunctionTypeAnnotation != null) __obj.updateDynamic("FunctionTypeAnnotation")(FunctionTypeAnnotation.asInstanceOf[js.Any])
    if (FunctionTypeParam != null) __obj.updateDynamic("FunctionTypeParam")(FunctionTypeParam.asInstanceOf[js.Any])
    if (GenericTypeAnnotation != null) __obj.updateDynamic("GenericTypeAnnotation")(GenericTypeAnnotation.asInstanceOf[js.Any])
    if (InterfaceDeclaration != null) __obj.updateDynamic("InterfaceDeclaration")(InterfaceDeclaration.asInstanceOf[js.Any])
    if (InterfaceExtends != null) __obj.updateDynamic("InterfaceExtends")(InterfaceExtends.asInstanceOf[js.Any])
    if (IntersectionTypeAnnotation != null) __obj.updateDynamic("IntersectionTypeAnnotation")(IntersectionTypeAnnotation.asInstanceOf[js.Any])
    if (MixedTypeAnnotation != null) __obj.updateDynamic("MixedTypeAnnotation")(MixedTypeAnnotation.asInstanceOf[js.Any])
    if (NullLiteralTypeAnnotation != null) __obj.updateDynamic("NullLiteralTypeAnnotation")(NullLiteralTypeAnnotation.asInstanceOf[js.Any])
    if (NullableTypeAnnotation != null) __obj.updateDynamic("NullableTypeAnnotation")(NullableTypeAnnotation.asInstanceOf[js.Any])
    if (NumberTypeAnnotation != null) __obj.updateDynamic("NumberTypeAnnotation")(NumberTypeAnnotation.asInstanceOf[js.Any])
    if (ObjectTypeAnnotation != null) __obj.updateDynamic("ObjectTypeAnnotation")(ObjectTypeAnnotation.asInstanceOf[js.Any])
    if (ObjectTypeCallProperty != null) __obj.updateDynamic("ObjectTypeCallProperty")(ObjectTypeCallProperty.asInstanceOf[js.Any])
    if (ObjectTypeIndexer != null) __obj.updateDynamic("ObjectTypeIndexer")(ObjectTypeIndexer.asInstanceOf[js.Any])
    if (ObjectTypeProperty != null) __obj.updateDynamic("ObjectTypeProperty")(ObjectTypeProperty.asInstanceOf[js.Any])
    if (QualifiedTypeIdentifier != null) __obj.updateDynamic("QualifiedTypeIdentifier")(QualifiedTypeIdentifier.asInstanceOf[js.Any])
    if (StringLiteralTypeAnnotation != null) __obj.updateDynamic("StringLiteralTypeAnnotation")(StringLiteralTypeAnnotation.asInstanceOf[js.Any])
    if (StringTypeAnnotation != null) __obj.updateDynamic("StringTypeAnnotation")(StringTypeAnnotation.asInstanceOf[js.Any])
    if (ThisTypeAnnotation != null) __obj.updateDynamic("ThisTypeAnnotation")(ThisTypeAnnotation.asInstanceOf[js.Any])
    if (TupleTypeAnnotation != null) __obj.updateDynamic("TupleTypeAnnotation")(TupleTypeAnnotation.asInstanceOf[js.Any])
    if (TypeAlias != null) __obj.updateDynamic("TypeAlias")(TypeAlias.asInstanceOf[js.Any])
    if (TypeAnnotation != null) __obj.updateDynamic("TypeAnnotation")(TypeAnnotation.asInstanceOf[js.Any])
    if (TypeCastExpression != null) __obj.updateDynamic("TypeCastExpression")(TypeCastExpression.asInstanceOf[js.Any])
    if (TypeParameterDeclaration != null) __obj.updateDynamic("TypeParameterDeclaration")(TypeParameterDeclaration.asInstanceOf[js.Any])
    if (TypeParameterInstantiation != null) __obj.updateDynamic("TypeParameterInstantiation")(TypeParameterInstantiation.asInstanceOf[js.Any])
    if (TypeofTypeAnnotation != null) __obj.updateDynamic("TypeofTypeAnnotation")(TypeofTypeAnnotation.asInstanceOf[js.Any])
    if (UnionTypeAnnotation != null) __obj.updateDynamic("UnionTypeAnnotation")(UnionTypeAnnotation.asInstanceOf[js.Any])
    if (VoidTypeAnnotation != null) __obj.updateDynamic("VoidTypeAnnotation")(VoidTypeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[flowVisitors[V]]
  }
}

