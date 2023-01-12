package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportLensOutput extends StObject {
  
  /**
    * The JSON for the lens.
    */
  var LensJSON: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensJSON] = js.undefined
}
object ExportLensOutput {
  
  inline def apply(): ExportLensOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportLensOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportLensOutput] (val x: Self) extends AnyVal {
    
    inline def setLensJSON(value: LensJSON): Self = StObject.set(x, "LensJSON", value.asInstanceOf[js.Any])
    
    inline def setLensJSONUndefined: Self = StObject.set(x, "LensJSON", js.undefined)
  }
}
