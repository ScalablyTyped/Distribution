package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTransformJobRequest extends js.Object {
  /**
    * The name of the transform job that you want to view details of.
    */
  var TransformJobName: typings.awsSdk.sagemakerMod.TransformJobName = js.native
}

object DescribeTransformJobRequest {
  @scala.inline
  def apply(TransformJobName: TransformJobName): DescribeTransformJobRequest = {
    val __obj = js.Dynamic.literal(TransformJobName = TransformJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransformJobRequest]
  }
  @scala.inline
  implicit class DescribeTransformJobRequestOps[Self <: DescribeTransformJobRequest] (val x: Self) extends AnyVal {
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
    def setTransformJobName(value: TransformJobName): Self = this.set("TransformJobName", value.asInstanceOf[js.Any])
  }
  
}

