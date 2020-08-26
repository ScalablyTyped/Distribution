package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSigningJobRequest extends js.Object {
  /**
    * String that identifies the signing request. All calls after the first that use this token return the same response as the first call.
    */
  var clientRequestToken: ClientRequestToken = js.native
  /**
    * The S3 bucket in which to save your signed object. The destination contains the name of your bucket and an optional prefix.
    */
  var destination: Destination = js.native
  /**
    * The name of the signing profile.
    */
  var profileName: js.UndefOr[ProfileName] = js.native
  /**
    * The S3 bucket that contains the object to sign or a BLOB that contains your raw code.
    */
  var source: Source = js.native
}

object StartSigningJobRequest {
  @scala.inline
  def apply(clientRequestToken: ClientRequestToken, destination: Destination, source: Source): StartSigningJobRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSigningJobRequest]
  }
  @scala.inline
  implicit class StartSigningJobRequestOps[Self <: StartSigningJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestination(value: Destination): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfileName(value: ProfileName): Self = this.set("profileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileName: Self = this.set("profileName", js.undefined)
  }
  
}

