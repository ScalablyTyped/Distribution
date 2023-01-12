package typings.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFilter extends StObject {
  
  /**
    * Executes the filter logic against a JSON object and returns a boolean indicating if the object meets the requirements of the Filter.
    * @returns A boolean indicating if the specified object meets the requirements of the Filter.
    */
  def execute(`object`: Any): Boolean
}
object IFilter {
  
  inline def apply(execute: Any => Boolean): IFilter = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[IFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFilter] (val x: Self) extends AnyVal {
    
    inline def setExecute(value: Any => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
