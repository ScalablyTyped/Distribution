package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Import
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `172` extends StObject {
  
  var `type`: Import
}
object `172` {
  
  inline def apply(): `172` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Import")
    __obj.asInstanceOf[`172`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `172`] (val x: Self) extends AnyVal {
    
    inline def setType(value: Import): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
