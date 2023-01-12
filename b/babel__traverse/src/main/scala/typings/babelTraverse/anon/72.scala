package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TaggedTemplateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `72` extends StObject {
  
  var `type`: TaggedTemplateExpression
}
object `72` {
  
  inline def apply(): `72` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[`72`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `72`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TaggedTemplateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
