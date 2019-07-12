package typings
package datatablesDotNetDashFixedcolumnsLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedColumnsMethodsModel extends js.Object {
  /*
    * Get FixedColumns Api
    */
  def fixedColumns(): FixedColumnsMethods
}

object FixedColumnsMethodsModel {
  @scala.inline
  def apply(fixedColumns: () => FixedColumnsMethods): FixedColumnsMethodsModel = {
    val __obj = js.Dynamic.literal(fixedColumns = js.Any.fromFunction0(fixedColumns))
  
    __obj.asInstanceOf[FixedColumnsMethodsModel]
  }
}

