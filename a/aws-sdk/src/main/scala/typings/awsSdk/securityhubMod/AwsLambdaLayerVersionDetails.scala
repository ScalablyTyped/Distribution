package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaLayerVersionDetails extends js.Object {
  /**
    * The layer's compatible runtimes. Maximum number of five items. Valid values: nodejs10.x | nodejs12.x | java8 | java11 | python2.7 | python3.6 | python3.7 | python3.8 | dotnetcore1.0 | dotnetcore2.1 | go1.x | ruby2.5 | provided 
    */
  var CompatibleRuntimes: js.UndefOr[NonEmptyStringList] = js.native
  /**
    * The date that the version was created, in ISO 8601 format. For example, 2018-11-27T15:10:45.123+0000. 
    */
  var CreatedDate: js.UndefOr[NonEmptyString] = js.native
  /**
    * The version number.
    */
  var Version: js.UndefOr[AwsLambdaLayerVersionNumber] = js.native
}

object AwsLambdaLayerVersionDetails {
  @scala.inline
  def apply(): AwsLambdaLayerVersionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaLayerVersionDetails]
  }
  @scala.inline
  implicit class AwsLambdaLayerVersionDetailsOps[Self <: AwsLambdaLayerVersionDetails] (val x: Self) extends AnyVal {
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
    def setCompatibleRuntimesVarargs(value: NonEmptyString*): Self = this.set("CompatibleRuntimes", js.Array(value :_*))
    @scala.inline
    def setCompatibleRuntimes(value: NonEmptyStringList): Self = this.set("CompatibleRuntimes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibleRuntimes: Self = this.set("CompatibleRuntimes", js.undefined)
    @scala.inline
    def setCreatedDate(value: NonEmptyString): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    @scala.inline
    def setVersion(value: AwsLambdaLayerVersionNumber): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

