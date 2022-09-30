package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSEnumMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSEnumMember__
  extends StObject
     with BaseNode
     with Node
     with TypeScript {
  
  var id: Identifier_ | StringLiteral_
  
  var initializer: js.UndefOr[Expression | Null] = js.undefined
  
  @JSName("type")
  var type_TSEnumMember__ : TSEnumMember
}
object TSEnumMember__ {
  
  inline def apply(id: Identifier_ | StringLiteral_): TSEnumMember__ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSEnumMember")
    __obj.asInstanceOf[TSEnumMember__]
  }
  
  extension [Self <: TSEnumMember__](x: Self) {
    
    inline def setId(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    inline def setInitializerNull: Self = StObject.set(x, "initializer", null)
    
    inline def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
    
    inline def setType(value: TSEnumMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
