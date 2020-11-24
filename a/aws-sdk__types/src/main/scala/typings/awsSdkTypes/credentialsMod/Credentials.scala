package typings.awsSdkTypes.credentialsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credentials extends js.Object {
  
  /**
    * AWS access key ID
    */
  val accessKeyId: String = js.native
  
  /**
    * A {Date} when these credentials will no longer be accepted.
    */
  val expiration: js.UndefOr[Date] = js.native
  
  /**
    * AWS secret access key
    */
  val secretAccessKey: String = js.native
  
  /**
    * A security or session token to use with these credentials. Usually
    * present for temporary credentials.
    */
  val sessionToken: js.UndefOr[String] = js.native
}
object Credentials {
  
  @scala.inline
  def apply(accessKeyId: String, secretAccessKey: String): Credentials = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
    
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
    def setAccessKeyId(value: String): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretAccessKey(value: String): Self = this.set("secretAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiration(value: Date): Self = this.set("expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    
    @scala.inline
    def setSessionToken(value: String): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionToken: Self = this.set("sessionToken", js.undefined)
  }
}
