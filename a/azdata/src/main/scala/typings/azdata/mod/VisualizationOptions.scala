package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualizationOptions extends StObject {
  
  var `type`: VisualizationType
}
object VisualizationOptions {
  
  inline def apply(`type`: VisualizationType): VisualizationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualizationOptions]
  }
  
  extension [Self <: VisualizationOptions](x: Self) {
    
    inline def setType(value: VisualizationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
