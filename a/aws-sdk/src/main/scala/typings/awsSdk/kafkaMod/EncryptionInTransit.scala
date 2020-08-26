package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionInTransit extends js.Object {
  /**
    * 
    Indicates the encryption setting for data in transit between clients and brokers. The following are the possible values.
    
    TLS means that client-broker communication is enabled with TLS only.
    
    TLS_PLAINTEXT means that client-broker communication is enabled for both TLS-encrypted, as well as plaintext data.
    
    PLAINTEXT means that client-broker communication is enabled in plaintext only.
    The default value is TLS_PLAINTEXT.
    
    */
  var ClientBroker: js.UndefOr[typings.awsSdk.kafkaMod.ClientBroker] = js.native
  /**
    * 
    When set to true, it indicates that data communication among the broker nodes of the cluster is encrypted. When set to false, the communication happens in plaintext.
    The default value is true.
    
    */
  var InCluster: js.UndefOr[boolean] = js.native
}

object EncryptionInTransit {
  @scala.inline
  def apply(): EncryptionInTransit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionInTransit]
  }
  @scala.inline
  implicit class EncryptionInTransitOps[Self <: EncryptionInTransit] (val x: Self) extends AnyVal {
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
    def setClientBroker(value: ClientBroker): Self = this.set("ClientBroker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientBroker: Self = this.set("ClientBroker", js.undefined)
    @scala.inline
    def setInCluster(value: boolean): Self = this.set("InCluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInCluster: Self = this.set("InCluster", js.undefined)
  }
  
}

