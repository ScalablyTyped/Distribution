package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectTypeAnnotation_
  extends Node
     with Flow
     with FlowTypeAnnotation {
  
  var callProperties: js.Array[ObjectTypeCallProperty_] = js.native
  
  var indexers: js.Array[ObjectTypeIndexer_] = js.native
  
  var properties: js.Array[ObjectTypeProperty_] = js.native
  
  @JSName("type")
  var type_ObjectTypeAnnotation_ : ObjectTypeAnnotation = js.native
}
object ObjectTypeAnnotation_ {
  
  @scala.inline
  def apply(
    callProperties: js.Array[ObjectTypeCallProperty_],
    end: Double,
    indexers: js.Array[ObjectTypeIndexer_],
    loc: SourceLocation,
    properties: js.Array[ObjectTypeProperty_],
    start: Double,
    `type`: ObjectTypeAnnotation
  ): ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeAnnotation_]
  }
  
  @scala.inline
  implicit class ObjectTypeAnnotation_Ops[Self <: ObjectTypeAnnotation_] (val x: Self) extends AnyVal {
    
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
    def setCallPropertiesVarargs(value: ObjectTypeCallProperty_ *): Self = this.set("callProperties", js.Array(value :_*))
    
    @scala.inline
    def setCallProperties(value: js.Array[ObjectTypeCallProperty_]): Self = this.set("callProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexersVarargs(value: ObjectTypeIndexer_ *): Self = this.set("indexers", js.Array(value :_*))
    
    @scala.inline
    def setIndexers(value: js.Array[ObjectTypeIndexer_]): Self = this.set("indexers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: ObjectTypeProperty_ *): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[ObjectTypeProperty_]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectTypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
