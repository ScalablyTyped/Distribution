package typings.datatablesNetFixedcolumns.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  /*
    * Get FixedColumns Api
    */
  def fixedColumns(): FixedColumnsMethods
}

object Api {
  @scala.inline
  def apply(fixedColumns: () => FixedColumnsMethods): Api = {
    val __obj = js.Dynamic.literal(fixedColumns = js.Any.fromFunction0(fixedColumns))
  
    __obj.asInstanceOf[Api]
  }
}

