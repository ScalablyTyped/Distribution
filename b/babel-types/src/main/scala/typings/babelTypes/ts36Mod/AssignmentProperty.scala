package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ObjectProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentProperty
  extends StObject
     with Node {
  
  var computed: Boolean
  
  var decorators: js.UndefOr[js.Array[Decorator_]] = js.undefined
  
  var key: Expression
  
  var shorthand: Boolean
  
  @JSName("type")
  var type_AssignmentProperty: ObjectProperty
  
  var value: Pattern
}
object AssignmentProperty {
  
  @scala.inline
  def apply(
    computed: Boolean,
    end: Double,
    key: Expression,
    loc: SourceLocation,
    shorthand: Boolean,
    start: Double,
    value: Pattern
  ): AssignmentProperty = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectProperty")
    __obj.asInstanceOf[AssignmentProperty]
  }
  
  @scala.inline
  implicit class AssignmentPropertyMutableBuilder[Self <: AssignmentProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Pattern): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
