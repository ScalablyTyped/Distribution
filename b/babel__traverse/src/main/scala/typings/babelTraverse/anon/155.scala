package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `155` extends StObject {
  
  var `type`: Program
}
object `155` {
  
  inline def apply(): `155` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[`155`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `155`] (val x: Self) extends AnyVal {
    
    inline def setType(value: Program): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
