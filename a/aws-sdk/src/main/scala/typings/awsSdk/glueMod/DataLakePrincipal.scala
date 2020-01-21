package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLakePrincipal extends js.Object {
  /**
    * An identifier for the AWS Lake Formation principal.
    */
  var DataLakePrincipalIdentifier: js.UndefOr[DataLakePrincipalString] = js.native
}

object DataLakePrincipal {
  @scala.inline
  def apply(DataLakePrincipalIdentifier: DataLakePrincipalString = null): DataLakePrincipal = {
    val __obj = js.Dynamic.literal()
    if (DataLakePrincipalIdentifier != null) __obj.updateDynamic("DataLakePrincipalIdentifier")(DataLakePrincipalIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLakePrincipal]
  }
}

