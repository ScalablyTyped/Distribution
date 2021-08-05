package typings.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFilter extends StObject {
  
  /**
    * Executes the filter logic against a JSON object and returns a boolean indicating if the object meets the requirements of the Filter.
    * @returns A boolean indicating if the specified object meets the requirements of the Filter.
    */
  def execute(`object`: js.Any): Boolean
}
object IFilter {
  
  inline def apply(execute: js.Any => Boolean): IFilter = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[IFilter]
  }
  
  extension [Self <: IFilter](x: Self) {
    
    inline def setExecute(value: js.Any => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
