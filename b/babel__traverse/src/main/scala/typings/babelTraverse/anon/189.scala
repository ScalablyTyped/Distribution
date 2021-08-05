package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TemplateElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `189` extends StObject {
  
  var `type`: TemplateElement
}
object `189` {
  
  inline def apply(): `189` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TemplateElement")
    __obj.asInstanceOf[`189`]
  }
  
  extension [Self <: `189`](x: Self) {
    
    inline def setType(value: TemplateElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
