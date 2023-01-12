package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `105` extends StObject {
  
  var `type`: DeclareFunction
}
object `105` {
  
  inline def apply(): `105` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[`105`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `105`] (val x: Self) extends AnyVal {
    
    inline def setType(value: DeclareFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
