package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ObjectTypeProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectTypeProperty_
  extends Node
     with Flow
     with UserWhitespacable {
  
  var key: Expression = js.native
  
  @JSName("type")
  var type_ObjectTypeProperty_ : ObjectTypeProperty = js.native
  
  var value: FlowTypeAnnotation = js.native
}
object ObjectTypeProperty_ {
  
  @scala.inline
  def apply(
    end: Double,
    key: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: ObjectTypeProperty,
    value: FlowTypeAnnotation
  ): ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeProperty_]
  }
  
  @scala.inline
  implicit class ObjectTypeProperty_MutableBuilder[Self <: ObjectTypeProperty_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectTypeProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FlowTypeAnnotation): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
