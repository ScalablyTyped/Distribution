package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSAnyKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSAnyKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType {
  
  @JSName("type")
  var type_TSAnyKeyword_ : TSAnyKeyword
}
object TSAnyKeyword_ {
  
  @scala.inline
  def apply(): TSAnyKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[TSAnyKeyword_]
  }
  
  @scala.inline
  implicit class TSAnyKeyword_MutableBuilder[Self <: TSAnyKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSAnyKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
