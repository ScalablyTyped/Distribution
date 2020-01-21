package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /**
    * An Amazon DynamoDB table location.
    */
  var DynamoDB: js.UndefOr[CodeGenNodeArgs] = js.native
  /**
    * A JDBC location.
    */
  var Jdbc: js.UndefOr[CodeGenNodeArgs] = js.native
  /**
    * An Amazon Simple Storage Service (Amazon S3) location.
    */
  var S3: js.UndefOr[CodeGenNodeArgs] = js.native
}

object Location {
  @scala.inline
  def apply(DynamoDB: CodeGenNodeArgs = null, Jdbc: CodeGenNodeArgs = null, S3: CodeGenNodeArgs = null): Location = {
    val __obj = js.Dynamic.literal()
    if (DynamoDB != null) __obj.updateDynamic("DynamoDB")(DynamoDB.asInstanceOf[js.Any])
    if (Jdbc != null) __obj.updateDynamic("Jdbc")(Jdbc.asInstanceOf[js.Any])
    if (S3 != null) __obj.updateDynamic("S3")(S3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

