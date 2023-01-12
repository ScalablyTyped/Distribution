package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ClassBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `232` extends StObject {
  
  var `type`: ClassBody
}
object `232` {
  
  inline def apply(): `232` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassBody")
    __obj.asInstanceOf[`232`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `232`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ClassBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
