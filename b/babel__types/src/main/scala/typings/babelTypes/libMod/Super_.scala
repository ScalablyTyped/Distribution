package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.Super
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Super_
  extends StObject
     with BaseNode
     with Expression
     with Node
     with Standardized {
  
  @JSName("type")
  var type_Super_ : Super
}
object Super_ {
  
  inline def apply(): Super_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[Super_]
  }
  
  extension [Self <: Super_](x: Self) {
    
    inline def setType(value: Super): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
