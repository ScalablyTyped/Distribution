package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.MetaProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait MetaProperty_
  extends StObject
     with BaseNode
     with Expression {
  
  var meta: Identifier_
  
  var property: Identifier_
  
  @JSName("type")
  var type_MetaProperty_ : MetaProperty
}
object MetaProperty_ {
  
  inline def apply(meta: Identifier_, property: Identifier_): MetaProperty_ = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[MetaProperty_]
  }
  
  extension [Self <: MetaProperty_](x: Self) {
    
    inline def setMeta(value: Identifier_): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Identifier_): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: MetaProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
