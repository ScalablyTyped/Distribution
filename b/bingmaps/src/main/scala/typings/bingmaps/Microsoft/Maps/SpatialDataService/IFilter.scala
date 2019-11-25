package typings.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilter extends js.Object {
  /**
    * Executes the filter logic against a JSON object and returns a boolean indicating if the object meets the requirements of the Filter.
    * @returns A boolean indicating if the specified object meets the requirements of the Filter.
    */
  def execute(`object`: js.Any): Boolean
}

object IFilter {
  @scala.inline
  def apply(execute: js.Any => Boolean): IFilter = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
  
    __obj.asInstanceOf[IFilter]
  }
}

