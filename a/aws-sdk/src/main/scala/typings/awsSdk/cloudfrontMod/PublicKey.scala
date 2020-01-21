package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKey extends js.Object {
  /**
    * A time you added a public key to CloudFront.
    */
  var CreatedTime: timestamp = js.native
  /**
    * A unique ID assigned to a public key you've added to CloudFront.
    */
  var Id: String = js.native
  /**
    * A complex data type for a public key you add to CloudFront to use with features like field-level encryption.
    */
  var PublicKeyConfig: typings.awsSdk.cloudfrontMod.PublicKeyConfig = js.native
}

object PublicKey {
  @scala.inline
  def apply(CreatedTime: timestamp, Id: String, PublicKeyConfig: PublicKeyConfig): PublicKey = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], PublicKeyConfig = PublicKeyConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PublicKey]
  }
}

