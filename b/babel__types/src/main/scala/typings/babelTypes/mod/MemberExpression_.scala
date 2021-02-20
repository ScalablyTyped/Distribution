package typings.babelTypes.mod

import typings.babelTypes.babelTypesBooleans.`false`
import typings.babelTypes.babelTypesBooleans.`true`
import typings.babelTypes.babelTypesStrings.MemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait MemberExpression_
  extends Expression
     with BaseNode
     with LVal {
  
  var computed: Boolean = js.native
  
  var `object`: Expression = js.native
  
  var optional: `true` | `false` | Null = js.native
  
  var property: Expression | Identifier_ | PrivateName_ = js.native
  
  @JSName("type")
  var type_MemberExpression_ : MemberExpression = js.native
}
object MemberExpression_ {
  
  @scala.inline
  def apply(
    computed: Boolean,
    `object`: Expression,
    property: Expression | Identifier_ | PrivateName_,
    `type`: MemberExpression
  ): MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberExpression_]
  }
  
  @scala.inline
  implicit class MemberExpression_MutableBuilder[Self <: MemberExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Expression): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: `true` | `false`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    @scala.inline
    def setProperty(value: Expression | Identifier_ | PrivateName_): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
