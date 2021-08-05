package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TaggedTemplateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `70` extends StObject {
  
  var `type`: TaggedTemplateExpression
}
object `70` {
  
  inline def apply(): `70` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[`70`]
  }
  
  extension [Self <: `70`](x: Self) {
    
    inline def setType(value: TaggedTemplateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
