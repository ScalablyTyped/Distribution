package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetSummary extends js.Object {
  /**
    *  The hashes of the asset. 
    */
  var hashes: js.UndefOr[AssetHashes] = js.native
  /**
    *  The name of the asset. 
    */
  var name: AssetName = js.native
  /**
    *  The size of the asset. 
    */
  var size: js.UndefOr[LongOptional] = js.native
}

object AssetSummary {
  @scala.inline
  def apply(name: AssetName, hashes: AssetHashes = null, size: js.UndefOr[LongOptional] = js.undefined): AssetSummary = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (hashes != null) __obj.updateDynamic("hashes")(hashes.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetSummary]
  }
}

