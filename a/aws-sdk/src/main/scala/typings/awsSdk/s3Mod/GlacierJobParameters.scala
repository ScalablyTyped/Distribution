package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlacierJobParameters extends js.Object {
  /**
    * Glacier retrieval tier at which the restore will be processed.
    */
  var Tier: typings.awsSdk.s3Mod.Tier = js.native
}

object GlacierJobParameters {
  @scala.inline
  def apply(Tier: Tier): GlacierJobParameters = {
    val __obj = js.Dynamic.literal(Tier = Tier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlacierJobParameters]
  }
}

