package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticGpuAssociation extends js.Object {
  /**
    * The ID of the association.
    */
  var ElasticGpuAssociationId: js.UndefOr[String] = js.native
  /**
    * The state of the association between the instance and the Elastic Graphics accelerator.
    */
  var ElasticGpuAssociationState: js.UndefOr[String] = js.native
  /**
    * The time the Elastic Graphics accelerator was associated with the instance.
    */
  var ElasticGpuAssociationTime: js.UndefOr[String] = js.native
  /**
    * The ID of the Elastic Graphics accelerator.
    */
  var ElasticGpuId: js.UndefOr[String] = js.native
}

object ElasticGpuAssociation {
  @scala.inline
  def apply(): ElasticGpuAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticGpuAssociation]
  }
  @scala.inline
  implicit class ElasticGpuAssociationOps[Self <: ElasticGpuAssociation] (val x: Self) extends AnyVal {
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
    def setElasticGpuAssociationId(value: String): Self = this.set("ElasticGpuAssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticGpuAssociationId: Self = this.set("ElasticGpuAssociationId", js.undefined)
    @scala.inline
    def setElasticGpuAssociationState(value: String): Self = this.set("ElasticGpuAssociationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticGpuAssociationState: Self = this.set("ElasticGpuAssociationState", js.undefined)
    @scala.inline
    def setElasticGpuAssociationTime(value: String): Self = this.set("ElasticGpuAssociationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticGpuAssociationTime: Self = this.set("ElasticGpuAssociationTime", js.undefined)
    @scala.inline
    def setElasticGpuId(value: String): Self = this.set("ElasticGpuId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticGpuId: Self = this.set("ElasticGpuId", js.undefined)
  }
  
}

