package typings.babylonWalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait flowVisitors[V] extends js.Object {
  var AnyTypeAnnotation: js.UndefOr[V] = js.native
  var ArrayTypeAnnotation: js.UndefOr[V] = js.native
  var BooleanLiteralTypeAnnotation: js.UndefOr[V] = js.native
  var BooleanTypeAnnotation: js.UndefOr[V] = js.native
  var ClassImplements: js.UndefOr[V] = js.native
  var DeclareClass: js.UndefOr[V] = js.native
  var DeclareFunction: js.UndefOr[V] = js.native
  var DeclareInterface: js.UndefOr[V] = js.native
  var DeclareModule: js.UndefOr[V] = js.native
  var DeclareTypeAlias: js.UndefOr[V] = js.native
  var DeclareVariable: js.UndefOr[V] = js.native
  var FunctionTypeAnnotation: js.UndefOr[V] = js.native
  var FunctionTypeParam: js.UndefOr[V] = js.native
  var GenericTypeAnnotation: js.UndefOr[V] = js.native
  var InterfaceDeclaration: js.UndefOr[V] = js.native
  var InterfaceExtends: js.UndefOr[V] = js.native
  var IntersectionTypeAnnotation: js.UndefOr[V] = js.native
  var MixedTypeAnnotation: js.UndefOr[V] = js.native
  var NullLiteralTypeAnnotation: js.UndefOr[V] = js.native
  var NullableTypeAnnotation: js.UndefOr[V] = js.native
  var NumberTypeAnnotation: js.UndefOr[V] = js.native
  var ObjectTypeAnnotation: js.UndefOr[V] = js.native
  var ObjectTypeCallProperty: js.UndefOr[V] = js.native
  var ObjectTypeIndexer: js.UndefOr[V] = js.native
  var ObjectTypeProperty: js.UndefOr[V] = js.native
  var QualifiedTypeIdentifier: js.UndefOr[V] = js.native
  var StringLiteralTypeAnnotation: js.UndefOr[V] = js.native
  var StringTypeAnnotation: js.UndefOr[V] = js.native
  var ThisTypeAnnotation: js.UndefOr[V] = js.native
  var TupleTypeAnnotation: js.UndefOr[V] = js.native
  var TypeAlias: js.UndefOr[V] = js.native
  var TypeAnnotation: js.UndefOr[V] = js.native
  var TypeCastExpression: js.UndefOr[V] = js.native
  var TypeParameterDeclaration: js.UndefOr[V] = js.native
  var TypeParameterInstantiation: js.UndefOr[V] = js.native
  var TypeofTypeAnnotation: js.UndefOr[V] = js.native
  var UnionTypeAnnotation: js.UndefOr[V] = js.native
  var VoidTypeAnnotation: js.UndefOr[V] = js.native
}

object flowVisitors {
  @scala.inline
  def apply[V](): flowVisitors[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[flowVisitors[V]]
  }
  @scala.inline
  implicit class flowVisitorsOps[Self <: flowVisitors[_], V] (val x: Self with flowVisitors[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnyTypeAnnotation(value: V): Self = this.set("AnyTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnyTypeAnnotation: Self = this.set("AnyTypeAnnotation", js.undefined)
    @scala.inline
    def setArrayTypeAnnotation(value: V): Self = this.set("ArrayTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayTypeAnnotation: Self = this.set("ArrayTypeAnnotation", js.undefined)
    @scala.inline
    def setBooleanLiteralTypeAnnotation(value: V): Self = this.set("BooleanLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanLiteralTypeAnnotation: Self = this.set("BooleanLiteralTypeAnnotation", js.undefined)
    @scala.inline
    def setBooleanTypeAnnotation(value: V): Self = this.set("BooleanTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanTypeAnnotation: Self = this.set("BooleanTypeAnnotation", js.undefined)
    @scala.inline
    def setClassImplements(value: V): Self = this.set("ClassImplements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassImplements: Self = this.set("ClassImplements", js.undefined)
    @scala.inline
    def setDeclareClass(value: V): Self = this.set("DeclareClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclareClass: Self = this.set("DeclareClass", js.undefined)
    @scala.inline
    def setDeclareFunction(value: V): Self = this.set("DeclareFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclareFunction: Self = this.set("DeclareFunction", js.undefined)
    @scala.inline
    def setDeclareInterface(value: V): Self = this.set("DeclareInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclareInterface: Self = this.set("DeclareInterface", js.undefined)
    @scala.inline
    def setDeclareModule(value: V): Self = this.set("DeclareModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclareModule: Self = this.set("DeclareModule", js.undefined)
    @scala.inline
    def setDeclareTypeAlias(value: V): Self = this.set("DeclareTypeAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclareTypeAlias: Self = this.set("DeclareTypeAlias", js.undefined)
    @scala.inline
    def setDeclareVariable(value: V): Self = this.set("DeclareVariable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclareVariable: Self = this.set("DeclareVariable", js.undefined)
    @scala.inline
    def setFunctionTypeAnnotation(value: V): Self = this.set("FunctionTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionTypeAnnotation: Self = this.set("FunctionTypeAnnotation", js.undefined)
    @scala.inline
    def setFunctionTypeParam(value: V): Self = this.set("FunctionTypeParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionTypeParam: Self = this.set("FunctionTypeParam", js.undefined)
    @scala.inline
    def setGenericTypeAnnotation(value: V): Self = this.set("GenericTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenericTypeAnnotation: Self = this.set("GenericTypeAnnotation", js.undefined)
    @scala.inline
    def setInterfaceDeclaration(value: V): Self = this.set("InterfaceDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceDeclaration: Self = this.set("InterfaceDeclaration", js.undefined)
    @scala.inline
    def setInterfaceExtends(value: V): Self = this.set("InterfaceExtends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceExtends: Self = this.set("InterfaceExtends", js.undefined)
    @scala.inline
    def setIntersectionTypeAnnotation(value: V): Self = this.set("IntersectionTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntersectionTypeAnnotation: Self = this.set("IntersectionTypeAnnotation", js.undefined)
    @scala.inline
    def setMixedTypeAnnotation(value: V): Self = this.set("MixedTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMixedTypeAnnotation: Self = this.set("MixedTypeAnnotation", js.undefined)
    @scala.inline
    def setNullLiteralTypeAnnotation(value: V): Self = this.set("NullLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullLiteralTypeAnnotation: Self = this.set("NullLiteralTypeAnnotation", js.undefined)
    @scala.inline
    def setNullableTypeAnnotation(value: V): Self = this.set("NullableTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullableTypeAnnotation: Self = this.set("NullableTypeAnnotation", js.undefined)
    @scala.inline
    def setNumberTypeAnnotation(value: V): Self = this.set("NumberTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberTypeAnnotation: Self = this.set("NumberTypeAnnotation", js.undefined)
    @scala.inline
    def setObjectTypeAnnotation(value: V): Self = this.set("ObjectTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectTypeAnnotation: Self = this.set("ObjectTypeAnnotation", js.undefined)
    @scala.inline
    def setObjectTypeCallProperty(value: V): Self = this.set("ObjectTypeCallProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectTypeCallProperty: Self = this.set("ObjectTypeCallProperty", js.undefined)
    @scala.inline
    def setObjectTypeIndexer(value: V): Self = this.set("ObjectTypeIndexer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectTypeIndexer: Self = this.set("ObjectTypeIndexer", js.undefined)
    @scala.inline
    def setObjectTypeProperty(value: V): Self = this.set("ObjectTypeProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectTypeProperty: Self = this.set("ObjectTypeProperty", js.undefined)
    @scala.inline
    def setQualifiedTypeIdentifier(value: V): Self = this.set("QualifiedTypeIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifiedTypeIdentifier: Self = this.set("QualifiedTypeIdentifier", js.undefined)
    @scala.inline
    def setStringLiteralTypeAnnotation(value: V): Self = this.set("StringLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringLiteralTypeAnnotation: Self = this.set("StringLiteralTypeAnnotation", js.undefined)
    @scala.inline
    def setStringTypeAnnotation(value: V): Self = this.set("StringTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringTypeAnnotation: Self = this.set("StringTypeAnnotation", js.undefined)
    @scala.inline
    def setThisTypeAnnotation(value: V): Self = this.set("ThisTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThisTypeAnnotation: Self = this.set("ThisTypeAnnotation", js.undefined)
    @scala.inline
    def setTupleTypeAnnotation(value: V): Self = this.set("TupleTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTupleTypeAnnotation: Self = this.set("TupleTypeAnnotation", js.undefined)
    @scala.inline
    def setTypeAlias(value: V): Self = this.set("TypeAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAlias: Self = this.set("TypeAlias", js.undefined)
    @scala.inline
    def setTypeAnnotation(value: V): Self = this.set("TypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAnnotation: Self = this.set("TypeAnnotation", js.undefined)
    @scala.inline
    def setTypeCastExpression(value: V): Self = this.set("TypeCastExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeCastExpression: Self = this.set("TypeCastExpression", js.undefined)
    @scala.inline
    def setTypeParameterDeclaration(value: V): Self = this.set("TypeParameterDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeParameterDeclaration: Self = this.set("TypeParameterDeclaration", js.undefined)
    @scala.inline
    def setTypeParameterInstantiation(value: V): Self = this.set("TypeParameterInstantiation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeParameterInstantiation: Self = this.set("TypeParameterInstantiation", js.undefined)
    @scala.inline
    def setTypeofTypeAnnotation(value: V): Self = this.set("TypeofTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeofTypeAnnotation: Self = this.set("TypeofTypeAnnotation", js.undefined)
    @scala.inline
    def setUnionTypeAnnotation(value: V): Self = this.set("UnionTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnionTypeAnnotation: Self = this.set("UnionTypeAnnotation", js.undefined)
    @scala.inline
    def setVoidTypeAnnotation(value: V): Self = this.set("VoidTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoidTypeAnnotation: Self = this.set("VoidTypeAnnotation", js.undefined)
  }
  
}

