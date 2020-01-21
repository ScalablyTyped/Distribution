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
  def apply(ClientBroker: ClientBroker = null, InCluster: js.UndefOr[Boolean] = js.undefined): EncryptionInTransit = {
    val __obj = js.Dynamic.literal()
    if (ClientBroker != null) __obj.updateDynamic("ClientBroker")(ClientBroker.asInstanceOf[js.Any])
    if (!js.isUndefined(InCluster)) __obj.updateDynamic("InCluster")(InCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionInTransit]
  }
}

