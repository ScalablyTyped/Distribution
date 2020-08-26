package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBucketOptions extends js.Object {
  var authType: js.UndefOr[String] = js.native
  var bucketType: js.UndefOr[String] = js.native
  /**
    * The bucket name
    */
  var name: js.UndefOr[String] = js.native
  var ramQuotaMB: js.UndefOr[Double] = js.native
  var replicaNumber: js.UndefOr[Double] = js.native
}

object CreateBucketOptions {
  @scala.inline
  def apply(): CreateBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBucketOptions]
  }
  @scala.inline
  implicit class CreateBucketOptionsOps[Self <: CreateBucketOptions] (val x: Self) extends AnyVal {
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
    def setAuthType(value: String): Self = this.set("authType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthType: Self = this.set("authType", js.undefined)
    @scala.inline
    def setBucketType(value: String): Self = this.set("bucketType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketType: Self = this.set("bucketType", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRamQuotaMB(value: Double): Self = this.set("ramQuotaMB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRamQuotaMB: Self = this.set("ramQuotaMB", js.undefined)
    @scala.inline
    def setReplicaNumber(value: Double): Self = this.set("replicaNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaNumber: Self = this.set("replicaNumber", js.undefined)
  }
  
}

