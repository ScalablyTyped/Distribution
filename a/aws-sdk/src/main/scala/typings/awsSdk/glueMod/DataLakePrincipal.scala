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
  def apply(): DataLakePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLakePrincipal]
  }
  @scala.inline
  implicit class DataLakePrincipalOps[Self <: DataLakePrincipal] (val x: Self) extends AnyVal {
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
    def setDataLakePrincipalIdentifier(value: DataLakePrincipalString): Self = this.set("DataLakePrincipalIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLakePrincipalIdentifier: Self = this.set("DataLakePrincipalIdentifier", js.undefined)
  }
  
}

