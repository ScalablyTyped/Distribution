package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67` extends StObject {
  
  var `type`: EnumDeclaration
}
object `67` {
  
  inline def apply(): `67` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumDeclaration")
    __obj.asInstanceOf[`67`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `67`] (val x: Self) extends AnyVal {
    
    inline def setType(value: EnumDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
