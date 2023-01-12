package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ArgumentPlaceholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentPlaceholder_
  extends StObject
     with BaseNode
     with Node {
  
  @JSName("type")
  var type_ArgumentPlaceholder_ : ArgumentPlaceholder
}
object ArgumentPlaceholder_ {
  
  inline def apply(): ArgumentPlaceholder_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArgumentPlaceholder")
    __obj.asInstanceOf[ArgumentPlaceholder_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgumentPlaceholder_] (val x: Self) extends AnyVal {
    
    inline def setType(value: ArgumentPlaceholder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
