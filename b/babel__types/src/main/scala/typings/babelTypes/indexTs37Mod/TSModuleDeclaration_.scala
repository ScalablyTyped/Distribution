package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSModuleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSModuleDeclaration_
  extends Declaration
     with BaseNode
     with Statement {
  
  var body: TSModuleBlock_ | TSModuleDeclaration_ = js.native
  
  var declare: Boolean | Null = js.native
  
  var global: Boolean | Null = js.native
  
  var id: Identifier_ | StringLiteral_ = js.native
  
  @JSName("type")
  var type_TSModuleDeclaration_ : TSModuleDeclaration = js.native
}
object TSModuleDeclaration_ {
  
  @scala.inline
  def apply(
    body: TSModuleBlock_ | TSModuleDeclaration_,
    id: Identifier_ | StringLiteral_,
    `type`: TSModuleDeclaration
  ): TSModuleDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSModuleDeclaration_]
  }
  
  @scala.inline
  implicit class TSModuleDeclaration_MutableBuilder[Self <: TSModuleDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: TSModuleBlock_ | TSModuleDeclaration_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNull: Self = StObject.set(x, "global", null)
    
    @scala.inline
    def setId(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSModuleDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
