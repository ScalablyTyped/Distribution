package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Location. */
trait ILocation extends StObject {
  
  /** Location column */
  var column: js.UndefOr[Double | Null] = js.undefined
  
  /** Location line */
  var line: js.UndefOr[Double | Null] = js.undefined
}
object ILocation {
  
  inline def apply(): ILocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILocation]
  }
  
  extension [Self <: ILocation](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnNull: Self = StObject.set(x, "column", null)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
