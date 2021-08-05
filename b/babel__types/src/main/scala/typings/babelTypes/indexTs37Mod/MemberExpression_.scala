package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesBooleans.`false`
import typings.babelTypes.babelTypesBooleans.`true`
import typings.babelTypes.babelTypesStrings.MemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait MemberExpression_
  extends StObject
     with BaseNode
     with Expression
     with LVal {
  
  var computed: Boolean
  
  var `object`: Expression
  
  var optional: `true` | `false` | Null
  
  var property: Expression | Identifier_ | PrivateName_
  
  @JSName("type")
  var type_MemberExpression_ : MemberExpression
}
object MemberExpression_ {
  
  inline def apply(computed: Boolean, `object`: Expression, property: Expression | Identifier_ | PrivateName_): MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[MemberExpression_]
  }
  
  extension [Self <: MemberExpression_](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Expression): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: `true` | `false`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setProperty(value: Expression | Identifier_ | PrivateName_): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: MemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
