package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionInfo extends js.Object {
  /**
    * 
    The data-volume encryption details.
    
    */
  var EncryptionAtRest: js.UndefOr[typings.awsSdk.kafkaMod.EncryptionAtRest] = js.native
  /**
    * 
    The details for encryption in transit.
    
    */
  var EncryptionInTransit: js.UndefOr[typings.awsSdk.kafkaMod.EncryptionInTransit] = js.native
}

object EncryptionInfo {
  @scala.inline
  def apply(EncryptionAtRest: EncryptionAtRest = null, EncryptionInTransit: EncryptionInTransit = null): EncryptionInfo = {
    val __obj = js.Dynamic.literal()
    if (EncryptionAtRest != null) __obj.updateDynamic("EncryptionAtRest")(EncryptionAtRest.asInstanceOf[js.Any])
    if (EncryptionInTransit != null) __obj.updateDynamic("EncryptionInTransit")(EncryptionInTransit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionInfo]
  }
}

