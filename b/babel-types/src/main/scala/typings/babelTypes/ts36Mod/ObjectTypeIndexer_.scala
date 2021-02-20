package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ObjectTypeIndexer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectTypeIndexer_
  extends Node
     with Flow
     with UserWhitespacable {
  
  var id: Expression = js.native
  
  var key: FlowTypeAnnotation = js.native
  
  @JSName("type")
  var type_ObjectTypeIndexer_ : ObjectTypeIndexer = js.native
  
  var value: FlowTypeAnnotation = js.native
}
object ObjectTypeIndexer_ {
  
  @scala.inline
  def apply(
    end: Double,
    id: Expression,
    key: FlowTypeAnnotation,
    loc: SourceLocation,
    start: Double,
    `type`: ObjectTypeIndexer,
    value: FlowTypeAnnotation
  ): ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeIndexer_]
  }
  
  @scala.inline
  implicit class ObjectTypeIndexer_MutableBuilder[Self <: ObjectTypeIndexer_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Expression): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: FlowTypeAnnotation): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectTypeIndexer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FlowTypeAnnotation): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
