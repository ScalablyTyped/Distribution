package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputContext extends StObject {
  
  /**
    * The name of the context.
    */
  var name: InputContextName
}
object InputContext {
  
  inline def apply(name: InputContextName): InputContext = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContext]
  }
  
  extension [Self <: InputContext](x: Self) {
    
    inline def setName(value: InputContextName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
