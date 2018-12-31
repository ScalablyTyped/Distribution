package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "column-methods"
//#region "row-methods"
@js.native
trait CommonRowMethod extends CommonSubMethods {
  /**
    * Obtain the th / td nodes for the selected column
    *
    * @param source Data source to read the new data from. Values: 'auto', 'data', 'dom'
    */
  def invalidate(): Api = js.native
  def invalidate(source: java.lang.String): Api = js.native
}

