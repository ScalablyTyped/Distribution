package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticInferenceAcceleratorAssociation extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the elastic inference accelerator. 
    */
  var ElasticInferenceAcceleratorArn: js.UndefOr[String] = js.native
  /**
    *  The ID of the association. 
    */
  var ElasticInferenceAcceleratorAssociationId: js.UndefOr[String] = js.native
  /**
    *  The state of the elastic inference accelerator. 
    */
  var ElasticInferenceAcceleratorAssociationState: js.UndefOr[String] = js.native
  /**
    *  The time at which the elastic inference accelerator is associated with an instance. 
    */
  var ElasticInferenceAcceleratorAssociationTime: js.UndefOr[DateTime] = js.native
}

object ElasticInferenceAcceleratorAssociation {
  @scala.inline
  def apply(): ElasticInferenceAcceleratorAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticInferenceAcceleratorAssociation]
  }
  @scala.inline
  implicit class ElasticInferenceAcceleratorAssociationOps[Self <: ElasticInferenceAcceleratorAssociation] (val x: Self) extends AnyVal {
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
    def setElasticInferenceAcceleratorArn(value: String): Self = this.set("ElasticInferenceAcceleratorArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticInferenceAcceleratorArn: Self = this.set("ElasticInferenceAcceleratorArn", js.undefined)
    @scala.inline
    def setElasticInferenceAcceleratorAssociationId(value: String): Self = this.set("ElasticInferenceAcceleratorAssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticInferenceAcceleratorAssociationId: Self = this.set("ElasticInferenceAcceleratorAssociationId", js.undefined)
    @scala.inline
    def setElasticInferenceAcceleratorAssociationState(value: String): Self = this.set("ElasticInferenceAcceleratorAssociationState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticInferenceAcceleratorAssociationState: Self = this.set("ElasticInferenceAcceleratorAssociationState", js.undefined)
    @scala.inline
    def setElasticInferenceAcceleratorAssociationTime(value: DateTime): Self = this.set("ElasticInferenceAcceleratorAssociationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticInferenceAcceleratorAssociationTime: Self = this.set("ElasticInferenceAcceleratorAssociationTime", js.undefined)
  }
  
}

