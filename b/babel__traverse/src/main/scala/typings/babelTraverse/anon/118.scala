package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSPropertySignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `118` extends StObject {
  
  var `type`: TSPropertySignature
}
object `118` {
  
  inline def apply(): `118` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[`118`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `118`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSPropertySignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
