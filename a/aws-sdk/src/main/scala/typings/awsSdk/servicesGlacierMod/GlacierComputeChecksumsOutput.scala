package typings.awsSdk.servicesGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlacierComputeChecksumsOutput extends js.Object {
  var linearHash: String = js.native
  var treeHash: String = js.native
}

object GlacierComputeChecksumsOutput {
  @scala.inline
  def apply(linearHash: String, treeHash: String): GlacierComputeChecksumsOutput = {
    val __obj = js.Dynamic.literal(linearHash = linearHash.asInstanceOf[js.Any], treeHash = treeHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlacierComputeChecksumsOutput]
  }
  @scala.inline
  implicit class GlacierComputeChecksumsOutputOps[Self <: GlacierComputeChecksumsOutput] (val x: Self) extends AnyVal {
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
    def setLinearHash(value: String): Self = this.set("linearHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeHash(value: String): Self = this.set("treeHash", value.asInstanceOf[js.Any])
  }
  
}

