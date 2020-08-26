package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cvss extends js.Object {
  /**
    * The base CVSS score.
    */
  var BaseScore: js.UndefOr[Double] = js.native
  /**
    * The base scoring vector for the CVSS score.
    */
  var BaseVector: js.UndefOr[NonEmptyString] = js.native
  /**
    * The version of CVSS for the CVSS score.
    */
  var Version: js.UndefOr[NonEmptyString] = js.native
}

object Cvss {
  @scala.inline
  def apply(): Cvss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cvss]
  }
  @scala.inline
  implicit class CvssOps[Self <: Cvss] (val x: Self) extends AnyVal {
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
    def setBaseScore(value: Double): Self = this.set("BaseScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseScore: Self = this.set("BaseScore", js.undefined)
    @scala.inline
    def setBaseVector(value: NonEmptyString): Self = this.set("BaseVector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseVector: Self = this.set("BaseVector", js.undefined)
    @scala.inline
    def setVersion(value: NonEmptyString): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

