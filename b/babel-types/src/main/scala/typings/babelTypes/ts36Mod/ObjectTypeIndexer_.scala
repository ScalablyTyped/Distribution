package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ObjectTypeIndexer
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
  implicit class ObjectTypeIndexer_Ops[Self <: ObjectTypeIndexer_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: Expression): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: FlowTypeAnnotation): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectTypeIndexer): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FlowTypeAnnotation): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
