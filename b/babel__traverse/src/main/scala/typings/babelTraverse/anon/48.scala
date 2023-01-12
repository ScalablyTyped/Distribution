package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.InterfaceDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48` extends StObject {
  
  var `type`: InterfaceDeclaration
}
object `48` {
  
  inline def apply(): `48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.asInstanceOf[`48`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `48`] (val x: Self) extends AnyVal {
    
    inline def setType(value: InterfaceDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
