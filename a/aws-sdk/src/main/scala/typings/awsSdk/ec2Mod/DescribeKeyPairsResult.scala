package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeKeyPairsResult extends js.Object {
  /**
    * Information about the key pairs.
    */
  var KeyPairs: js.UndefOr[KeyPairList] = js.native
}

object DescribeKeyPairsResult {
  @scala.inline
  def apply(KeyPairs: KeyPairList = null): DescribeKeyPairsResult = {
    val __obj = js.Dynamic.literal()
    if (KeyPairs != null) __obj.updateDynamic("KeyPairs")(KeyPairs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeKeyPairsResult]
  }
}

