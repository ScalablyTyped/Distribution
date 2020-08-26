package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticGpuSpecification extends js.Object {
  /**
    * The type of Elastic Graphics accelerator. For more information about the values to specify for Type, see Elastic Graphics Basics, specifically the Elastic Graphics accelerator column, in the Amazon Elastic Compute Cloud User Guide for Windows Instances.
    */
  var Type: String = js.native
}

object ElasticGpuSpecification {
  @scala.inline
  def apply(Type: String): ElasticGpuSpecification = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticGpuSpecification]
  }
  @scala.inline
  implicit class ElasticGpuSpecificationOps[Self <: ElasticGpuSpecification] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

