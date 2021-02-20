package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeIndexer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ObjectTypeIndexer_
  extends Flow
     with BaseNode
     with UserWhitespacable {
  
  var id: Identifier_ | Null = js.native
  
  var key: FlowType = js.native
  
  var static: Boolean = js.native
  
  @JSName("type")
  var type_ObjectTypeIndexer_ : ObjectTypeIndexer = js.native
  
  var value: FlowType = js.native
  
  var variance: Variance_ | Null = js.native
}
object ObjectTypeIndexer_ {
  
  @scala.inline
  def apply(key: FlowType, static: Boolean, `type`: ObjectTypeIndexer, value: FlowType): ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeIndexer_]
  }
  
  @scala.inline
  implicit class ObjectTypeIndexer_MutableBuilder[Self <: ObjectTypeIndexer_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setKey(value: FlowType): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectTypeIndexer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FlowType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariance(value: Variance_): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarianceNull: Self = StObject.set(x, "variance", null)
  }
}
