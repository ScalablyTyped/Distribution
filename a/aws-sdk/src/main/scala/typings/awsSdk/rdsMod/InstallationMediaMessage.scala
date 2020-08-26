package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallationMediaMessage extends js.Object {
  /**
    * The list of InstallationMedia objects for the AWS account.
    */
  var InstallationMedia: js.UndefOr[InstallationMediaList] = js.native
  /**
    * An optional pagination token provided by a previous DescribeInstallationMedia request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
}

object InstallationMediaMessage {
  @scala.inline
  def apply(): InstallationMediaMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallationMediaMessage]
  }
  @scala.inline
  implicit class InstallationMediaMessageOps[Self <: InstallationMediaMessage] (val x: Self) extends AnyVal {
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
    def setInstallationMediaVarargs(value: InstallationMedia*): Self = this.set("InstallationMedia", js.Array(value :_*))
    @scala.inline
    def setInstallationMedia(value: InstallationMediaList): Self = this.set("InstallationMedia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallationMedia: Self = this.set("InstallationMedia", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

