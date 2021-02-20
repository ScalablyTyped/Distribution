package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ObjectTypeCallProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectTypeCallProperty_
  extends Node
     with Flow
     with UserWhitespacable {
  
  @JSName("type")
  var type_ObjectTypeCallProperty_ : ObjectTypeCallProperty = js.native
  
  var value: FlowTypeAnnotation = js.native
}
object ObjectTypeCallProperty_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ObjectTypeCallProperty,
    value: FlowTypeAnnotation
  ): ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeCallProperty_]
  }
  
  @scala.inline
  implicit class ObjectTypeCallProperty_MutableBuilder[Self <: ObjectTypeCallProperty_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ObjectTypeCallProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FlowTypeAnnotation): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
