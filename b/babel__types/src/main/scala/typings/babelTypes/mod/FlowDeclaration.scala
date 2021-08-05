package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait FlowDeclaration
  extends StObject
     with _Node
object FlowDeclaration {
  
  inline def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.mod.DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareClass")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareClass_]
  }
  
  inline def DeclareExportAllDeclaration_(source: StringLiteral_): typings.babelTypes.mod.DeclareExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareExportAllDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareExportAllDeclaration_]
  }
  
  inline def DeclareExportDeclaration_(): typings.babelTypes.mod.DeclareExportDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = null, default = null, end = null, innerComments = null, leadingComments = null, loc = null, source = null, specifiers = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareExportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareExportDeclaration_]
  }
  
  inline def DeclareFunction_(id: Identifier_): typings.babelTypes.mod.DeclareFunction_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, predicate = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareFunction_]
  }
  
  inline def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.mod.DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareInterface_]
  }
  
  inline def DeclareModuleExports_(typeAnnotation: TypeAnnotation_): typings.babelTypes.mod.DeclareModuleExports_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareModuleExports")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareModuleExports_]
  }
  
  inline def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_): typings.babelTypes.mod.DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, innerComments = null, kind = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareModule_]
  }
  
  inline def DeclareOpaqueType_(id: Identifier_): typings.babelTypes.mod.DeclareOpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, supertype = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareOpaqueType")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareOpaqueType_]
  }
  
  inline def DeclareTypeAlias_(id: Identifier_, right: FlowType): typings.babelTypes.mod.DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareTypeAlias_]
  }
  
  inline def DeclareVariable_(id: Identifier_): typings.babelTypes.mod.DeclareVariable_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareVariable_]
  }
  
  inline def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.mod.InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.InterfaceDeclaration_]
  }
  
  inline def OpaqueType_(id: Identifier_, impltype: FlowType): typings.babelTypes.mod.OpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, supertype = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("OpaqueType")
    __obj.asInstanceOf[typings.babelTypes.mod.OpaqueType_]
  }
  
  inline def TypeAlias_(id: Identifier_, right: FlowType): typings.babelTypes.mod.TypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeAlias_]
  }
}
