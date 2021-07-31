package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSIntrinsicKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSIntrinsicKeyword_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType {
  
  @JSName("type")
  var type_TSIntrinsicKeyword_ : TSIntrinsicKeyword
}
object TSIntrinsicKeyword_ {
  
  @scala.inline
  def apply(): TSIntrinsicKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSIntrinsicKeyword")
    __obj.asInstanceOf[TSIntrinsicKeyword_]
  }
  
  @scala.inline
  implicit class TSIntrinsicKeyword_MutableBuilder[Self <: TSIntrinsicKeyword_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSIntrinsicKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
