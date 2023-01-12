package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `242` extends StObject {
  
  var `type`: DeclareClass
}
object `242` {
  
  inline def apply(): `242` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareClass")
    __obj.asInstanceOf[`242`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `242`] (val x: Self) extends AnyVal {
    
    inline def setType(value: DeclareClass): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
