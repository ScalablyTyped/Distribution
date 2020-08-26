package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCredentials extends js.Object {
  /**
    * A temporary password that authorizes the user name returned by DbUser to log on to the database DbName. 
    */
  var DbPassword: js.UndefOr[SensitiveString] = js.native
  /**
    * A database user name that is authorized to log on to the database DbName using the password DbPassword. If the specified DbUser exists in the database, the new user name has the same database privileges as the the user named in DbUser. By default, the user is added to PUBLIC. If the DbGroups parameter is specifed, DbUser is added to the listed groups for any sessions created using these credentials.
    */
  var DbUser: js.UndefOr[String] = js.native
  /**
    * The date and time the password in DbPassword expires.
    */
  var Expiration: js.UndefOr[TStamp] = js.native
}

object ClusterCredentials {
  @scala.inline
  def apply(): ClusterCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterCredentials]
  }
  @scala.inline
  implicit class ClusterCredentialsOps[Self <: ClusterCredentials] (val x: Self) extends AnyVal {
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
    def setDbPassword(value: SensitiveString): Self = this.set("DbPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbPassword: Self = this.set("DbPassword", js.undefined)
    @scala.inline
    def setDbUser(value: String): Self = this.set("DbUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbUser: Self = this.set("DbUser", js.undefined)
    @scala.inline
    def setExpiration(value: TStamp): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
  }
  
}

