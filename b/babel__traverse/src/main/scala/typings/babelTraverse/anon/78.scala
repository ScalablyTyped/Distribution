package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TemplateLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `78` extends StObject {
  
  var `type`: TemplateLiteral
}
object `78` {
  
  inline def apply(): `78` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[`78`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `78`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TemplateLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
