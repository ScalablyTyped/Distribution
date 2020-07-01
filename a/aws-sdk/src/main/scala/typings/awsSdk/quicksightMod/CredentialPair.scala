package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredentialPair extends js.Object {
  /**
    * A set of alternate data source parameters that you want to share for these credentials. The credentials are applied in tandem with the data source parameters when you copy a data source by using a create or update request. The API compares the DataSourceParameters structure that's in the request with the structures in the AlternateDataSourceParameters allowlist. If the structures are an exact match, the request is allowed to use the new data source with the existing credentials. If the AlternateDataSourceParameters list is null, the DataSourceParameters originally used with these Credentials is automatically allowed.
    */
  var AlternateDataSourceParameters: js.UndefOr[DataSourceParametersList] = js.native
  /**
    * Password.
    */
  var Password: typings.awsSdk.quicksightMod.Password = js.native
  /**
    * User name.
    */
  var Username: typings.awsSdk.quicksightMod.Username = js.native
}

object CredentialPair {
  @scala.inline
  def apply(
    Password: Password,
    Username: Username,
    AlternateDataSourceParameters: DataSourceParametersList = null
  ): CredentialPair = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    if (AlternateDataSourceParameters != null) __obj.updateDynamic("AlternateDataSourceParameters")(AlternateDataSourceParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialPair]
  }
}

