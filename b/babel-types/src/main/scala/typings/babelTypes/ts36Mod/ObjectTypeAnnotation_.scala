package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import org.scalablytyped.runtime.StObject
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
  implicit class ObjectTypeAnnotation_MutableBuilder[Self <: ObjectTypeAnnotation_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallProperties(value: js.Array[ObjectTypeCallProperty_]): Self = StObject.set(x, "callProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallPropertiesVarargs(value: ObjectTypeCallProperty_ *): Self = StObject.set(x, "callProperties", js.Array(value :_*))
    
    @scala.inline
    def setIndexers(value: js.Array[ObjectTypeIndexer_]): Self = StObject.set(x, "indexers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexersVarargs(value: ObjectTypeIndexer_ *): Self = StObject.set(x, "indexers", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[ObjectTypeProperty_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: ObjectTypeProperty_ *): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ObjectTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
