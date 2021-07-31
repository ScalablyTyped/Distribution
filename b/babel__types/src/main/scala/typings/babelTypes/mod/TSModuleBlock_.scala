package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSModuleBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSModuleBlock_
  extends StObject
     with BaseNode
     with Block
     with BlockParent
     with Scopable {
  
  var body: js.Array[Statement]
  
  @JSName("type")
  var type_TSModuleBlock_ : TSModuleBlock
}
object TSModuleBlock_ {
  
  @scala.inline
  def apply(body: js.Array[Statement]): TSModuleBlock_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSModuleBlock")
    __obj.asInstanceOf[TSModuleBlock_]
  }
  
  @scala.inline
  implicit class TSModuleBlock_MutableBuilder[Self <: TSModuleBlock_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TSModuleBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
