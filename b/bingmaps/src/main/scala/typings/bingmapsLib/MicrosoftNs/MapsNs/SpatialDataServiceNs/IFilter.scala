package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilter extends js.Object {
  /**
    * Executes the filter logic against a JSON object and returns a boolean indicating if the object meets the requirements of the Filter.
    * @returns A boolean indicating if the specified object meets the requirements of the Filter.
    */
  def execute(`object`: js.Any): scala.Boolean
}

object IFilter {
  @scala.inline
  def apply(execute: js.Function1[js.Any, scala.Boolean], toString: js.Function0[java.lang.String]): IFilter = {
    val __obj = js.Dynamic.literal(execute = execute, toString = toString)
  
    __obj.asInstanceOf[IFilter]
  }
}

