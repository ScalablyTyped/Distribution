package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeKeyPhrasesDetectionJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with a key phrases detection job. 
    */
  var KeyPhrasesDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.KeyPhrasesDetectionJobProperties] = js.native
}

object DescribeKeyPhrasesDetectionJobResponse {
  @scala.inline
  def apply(): DescribeKeyPhrasesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeyPhrasesDetectionJobResponse]
  }
  @scala.inline
  implicit class DescribeKeyPhrasesDetectionJobResponseOps[Self <: DescribeKeyPhrasesDetectionJobResponse] (val x: Self) extends AnyVal {
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
    def setKeyPhrasesDetectionJobProperties(value: KeyPhrasesDetectionJobProperties): Self = this.set("KeyPhrasesDetectionJobProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPhrasesDetectionJobProperties: Self = this.set("KeyPhrasesDetectionJobProperties", js.undefined)
  }
  
}

