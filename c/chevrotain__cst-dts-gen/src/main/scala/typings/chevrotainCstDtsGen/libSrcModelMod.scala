package typings.chevrotainCstDtsGen

import typings.chevrotainCstDtsGen.chevrotainCstDtsGenStrings.rule
import typings.chevrotainCstDtsGen.chevrotainCstDtsGenStrings.token
import typings.chevrotainTypes.mod.Rule
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcModelMod {
  
  @JSImport("@chevrotain/cst-dts-gen/lib/src/model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildModel(productions: Record[String, Rule]): js.Array[CstNodeTypeDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildModel")(productions.asInstanceOf[js.Any]).asInstanceOf[js.Array[CstNodeTypeDefinition]]
  
  trait CstNodeTypeDefinition extends StObject {
    
    var name: String
    
    var properties: js.Array[PropertyTypeDefinition]
  }
  object CstNodeTypeDefinition {
    
    inline def apply(name: String, properties: js.Array[PropertyTypeDefinition]): CstNodeTypeDefinition = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[CstNodeTypeDefinition]
    }
    
    extension [Self <: CstNodeTypeDefinition](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Array[PropertyTypeDefinition]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: PropertyTypeDefinition*): Self = StObject.set(x, "properties", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chevrotainCstDtsGen.libSrcModelMod.TokenArrayType
    - typings.chevrotainCstDtsGen.libSrcModelMod.RuleArrayType
    - js.Array[
  typings.chevrotainCstDtsGen.libSrcModelMod.TokenArrayType | typings.chevrotainCstDtsGen.libSrcModelMod.RuleArrayType]
  */
  type PropertyArrayType = _PropertyArrayType | (js.Array[TokenArrayType | RuleArrayType])
  
  trait PropertyTypeDefinition extends StObject {
    
    var name: String
    
    var optional: Boolean
    
    var `type`: PropertyArrayType
  }
  object PropertyTypeDefinition {
    
    inline def apply(name: String, optional: Boolean, `type`: PropertyArrayType): PropertyTypeDefinition = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyTypeDefinition]
    }
    
    extension [Self <: PropertyTypeDefinition](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setType(value: PropertyArrayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeVarargs(value: (TokenArrayType | RuleArrayType)*): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
  
  trait RuleArrayType
    extends StObject
       with _PropertyArrayType {
    
    var kind: rule
    
    var name: String
  }
  object RuleArrayType {
    
    inline def apply(name: String): RuleArrayType = {
      val __obj = js.Dynamic.literal(kind = "rule", name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleArrayType]
    }
    
    extension [Self <: RuleArrayType](x: Self) {
      
      inline def setKind(value: rule): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenArrayType
    extends StObject
       with _PropertyArrayType {
    
    var kind: token
  }
  object TokenArrayType {
    
    inline def apply(): TokenArrayType = {
      val __obj = js.Dynamic.literal(kind = "token")
      __obj.asInstanceOf[TokenArrayType]
    }
    
    extension [Self <: TokenArrayType](x: Self) {
      
      inline def setKind(value: token): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait _PropertyArrayType extends StObject
  object _PropertyArrayType {
    
    inline def RuleArrayType(name: String): typings.chevrotainCstDtsGen.libSrcModelMod.RuleArrayType = {
      val __obj = js.Dynamic.literal(kind = "rule", name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chevrotainCstDtsGen.libSrcModelMod.RuleArrayType]
    }
    
    inline def TokenArrayType(): typings.chevrotainCstDtsGen.libSrcModelMod.TokenArrayType = {
      val __obj = js.Dynamic.literal(kind = "token")
      __obj.asInstanceOf[typings.chevrotainCstDtsGen.libSrcModelMod.TokenArrayType]
    }
  }
}
