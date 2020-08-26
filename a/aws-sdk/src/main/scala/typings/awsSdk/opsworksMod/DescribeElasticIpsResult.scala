package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticIpsResult extends js.Object {
  /**
    * An ElasticIps object that describes the specified Elastic IP addresses.
    */
  var ElasticIps: js.UndefOr[typings.awsSdk.opsworksMod.ElasticIps] = js.native
}

object DescribeElasticIpsResult {
  @scala.inline
  def apply(): DescribeElasticIpsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticIpsResult]
  }
  @scala.inline
  implicit class DescribeElasticIpsResultOps[Self <: DescribeElasticIpsResult] (val x: Self) extends AnyVal {
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
    def setElasticIpsVarargs(value: ElasticIp*): Self = this.set("ElasticIps", js.Array(value :_*))
    @scala.inline
    def setElasticIps(value: ElasticIps): Self = this.set("ElasticIps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticIps: Self = this.set("ElasticIps", js.undefined)
  }
  
}

