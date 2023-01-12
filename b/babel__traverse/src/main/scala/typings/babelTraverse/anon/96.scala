package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.WithStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `96` extends StObject {
  
  var `type`: WithStatement
}
object `96` {
  
  inline def apply(): `96` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[`96`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `96`] (val x: Self) extends AnyVal {
    
    inline def setType(value: WithStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
