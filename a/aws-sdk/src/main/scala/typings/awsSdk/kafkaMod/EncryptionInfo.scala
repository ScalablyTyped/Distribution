package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): EncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionInfo]
  }
  
  @scala.inline
  implicit class EncryptionInfoOps[Self <: EncryptionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncryptionAtRest(value: EncryptionAtRest): Self = this.set("EncryptionAtRest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionAtRest: Self = this.set("EncryptionAtRest", js.undefined)
    
    @scala.inline
    def setEncryptionInTransit(value: EncryptionInTransit): Self = this.set("EncryptionInTransit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionInTransit: Self = this.set("EncryptionInTransit", js.undefined)
  }
}
