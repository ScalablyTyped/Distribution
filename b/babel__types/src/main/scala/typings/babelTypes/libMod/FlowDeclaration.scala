package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
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
  - typings.babelTypes.libMod.InterfaceDeclaration_
  - typings.babelTypes.libMod.OpaqueType_
  - typings.babelTypes.libMod.TypeAlias_
*/
trait FlowDeclaration extends StObject
object FlowDeclaration {
  
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
  
  inline def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.libMod.InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.InterfaceDeclaration_]
  }
  
  inline def OpaqueType_(id: Identifier_, impltype: FlowType): typings.babelTypes.libMod.OpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OpaqueType")
    __obj.asInstanceOf[typings.babelTypes.libMod.OpaqueType_]
  }
  
  inline def TypeAlias_(id: Identifier_, right: FlowType): typings.babelTypes.libMod.TypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeAlias_]
  }
}
