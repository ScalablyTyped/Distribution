package typings.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFilter extends StObject {
  
  /**
    * Executes the filter logic against a JSON object and returns a boolean indicating if the object meets the requirements of the Filter.
    * @returns A boolean indicating if the specified object meets the requirements of the Filter.
    */
  def execute(`object`: js.Any): Boolean = js.native
}
object IFilter {
  
  @scala.inline
  def apply(execute: js.Any => Boolean): IFilter = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[IFilter]
  }
  
  @scala.inline
  implicit class IFilterMutableBuilder[Self <: IFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecute(value: js.Any => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
