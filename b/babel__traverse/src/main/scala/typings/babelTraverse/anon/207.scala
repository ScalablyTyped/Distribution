package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSIndexSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `207` extends StObject {
  
  var `type`: TSIndexSignature
}
object `207` {
  
  inline def apply(): `207` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[`207`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `207`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSIndexSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
