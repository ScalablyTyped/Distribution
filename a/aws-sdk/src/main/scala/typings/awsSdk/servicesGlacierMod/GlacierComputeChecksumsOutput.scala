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
}

