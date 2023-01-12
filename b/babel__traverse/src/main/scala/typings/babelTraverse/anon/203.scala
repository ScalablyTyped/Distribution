package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSMethodSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `203` extends StObject {
  
  var `type`: TSMethodSignature
}
object `203` {
  
  inline def apply(): `203` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[`203`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `203`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSMethodSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
