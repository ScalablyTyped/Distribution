package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateColumnsOperation extends js.Object {
  /**
    * Calculated columns to create.
    */
  var Columns: CalculatedColumnList = js.native
}

object CreateColumnsOperation {
  @scala.inline
  def apply(Columns: CalculatedColumnList): CreateColumnsOperation = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateColumnsOperation]
  }
}

