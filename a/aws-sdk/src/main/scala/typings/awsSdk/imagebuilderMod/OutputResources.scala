package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputResources extends js.Object {
  /**
    *  The EC2 AMIs created by this image. 
    */
  var amis: js.UndefOr[AmiList] = js.native
}

object OutputResources {
  @scala.inline
  def apply(amis: AmiList = null): OutputResources = {
    val __obj = js.Dynamic.literal()
    if (amis != null) __obj.updateDynamic("amis")(amis.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputResources]
  }
}

