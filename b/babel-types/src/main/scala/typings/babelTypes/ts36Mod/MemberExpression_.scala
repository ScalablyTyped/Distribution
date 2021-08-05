package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.MemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberExpression_
  extends StObject
     with Node
     with Expression
     with LVal {
  
  var computed: Boolean
  
  var `object`: Expression | Super
  
  var property: Expression
  
  @JSName("type")
  var type_MemberExpression_ : MemberExpression
}
object MemberExpression_ {
  
  inline def apply(
    computed: Boolean,
    end: Double,
    loc: SourceLocation,
    `object`: Expression | Super,
    property: Expression,
    start: Double
  ): MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[MemberExpression_]
  }
  
  extension [Self <: MemberExpression_](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Expression | Super): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Expression): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: MemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
