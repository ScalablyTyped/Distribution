package typings.babelTypes.mod

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
import typings.babelTypes.babelTypesStrings.InterfaceDeclaration
import typings.babelTypes.babelTypesStrings.OpaqueType
import typings.babelTypes.babelTypesStrings.TypeAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
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
  - typings.babelTypes.mod.InterfaceDeclaration_
  - typings.babelTypes.mod.OpaqueType_
  - typings.babelTypes.mod.TypeAlias_
*/
trait FlowDeclaration extends _Node

object FlowDeclaration {
  @scala.inline
  def DeclareModuleExports_(`type`: DeclareModuleExports, typeAnnotation: TypeAnnotation_): FlowDeclaration = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  @scala.inline
  def OpaqueType_(id: Identifier_, impltype: FlowType, `type`: OpaqueType): FlowDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  @scala.inline
  def DeclareVariable_(id: Identifier_, `type`: DeclareVariable): FlowDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  @scala.inline
  def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: InterfaceDeclaration): FlowDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  @scala.inline
  def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_, `type`: DeclareModule): FlowDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  @scala.inline
  def DeclareFunction_(id: Identifier_, `type`: DeclareFunction): FlowDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  @scala.inline
  def DeclareExportDeclaration_(`type`: DeclareExportDeclaration): FlowDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  @scala.inline
  def DeclareExportAllDeclaration_(source: StringLiteral_, `type`: DeclareExportAllDeclaration): FlowDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  @scala.inline
  def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: DeclareClass): FlowDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  @scala.inline
  def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: DeclareInterface): FlowDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  @scala.inline
  def TypeAlias_(id: Identifier_, right: FlowType, `type`: TypeAlias): FlowDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  @scala.inline
  def DeclareTypeAlias_(id: Identifier_, right: FlowType, `type`: DeclareTypeAlias): FlowDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
  @scala.inline
  def DeclareOpaqueType_(id: Identifier_, `type`: DeclareOpaqueType): FlowDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDeclaration]
  }
}

