package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputResources extends js.Object {
  /**
    * The EC2 AMIs created by this image. 
    */
  var amis: js.UndefOr[AmiList] = js.native
}

object OutputResources {
  @scala.inline
  def apply(): OutputResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputResources]
  }
  @scala.inline
  implicit class OutputResourcesOps[Self <: OutputResources] (val x: Self) extends AnyVal {
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
    def setAmisVarargs(value: Ami*): Self = this.set("amis", js.Array(value :_*))
    @scala.inline
    def setAmis(value: AmiList): Self = this.set("amis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmis: Self = this.set("amis", js.undefined)
  }
  
}

