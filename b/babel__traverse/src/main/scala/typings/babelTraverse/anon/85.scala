package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.IfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `85` extends StObject {
  
  var `type`: IfStatement
}
object `85` {
  
  inline def apply(): `85` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[`85`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `85`] (val x: Self) extends AnyVal {
    
    inline def setType(value: IfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
