package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBInstanceAutomatedBackupMessage extends js.Object {
  /**
    * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
    */
  var DbiResourceId: String = js.native
}

object DeleteDBInstanceAutomatedBackupMessage {
  @scala.inline
  def apply(DbiResourceId: String): DeleteDBInstanceAutomatedBackupMessage = {
    val __obj = js.Dynamic.literal(DbiResourceId = DbiResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBInstanceAutomatedBackupMessage]
  }
}

