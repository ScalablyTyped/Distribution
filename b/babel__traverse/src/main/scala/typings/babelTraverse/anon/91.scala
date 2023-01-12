package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSEnumDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `91` extends StObject {
  
  var `type`: TSEnumDeclaration
}
object `91` {
  
  inline def apply(): `91` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSEnumDeclaration")
    __obj.asInstanceOf[`91`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `91`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSEnumDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
