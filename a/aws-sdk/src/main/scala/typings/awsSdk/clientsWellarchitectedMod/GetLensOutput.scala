package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLensOutput extends StObject {
  
  /**
    * A lens return object.
    */
  var Lens: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.Lens] = js.undefined
}
object GetLensOutput {
  
  inline def apply(): GetLensOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLensOutput]
  }
  
  extension [Self <: GetLensOutput](x: Self) {
    
    inline def setLens(value: Lens): Self = StObject.set(x, "Lens", value.asInstanceOf[js.Any])
    
    inline def setLensUndefined: Self = StObject.set(x, "Lens", js.undefined)
  }
}
