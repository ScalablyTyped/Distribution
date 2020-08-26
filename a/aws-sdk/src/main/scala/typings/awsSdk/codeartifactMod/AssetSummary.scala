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
  def apply(name: AssetName): AssetSummary = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetSummary]
  }
  @scala.inline
  implicit class AssetSummaryOps[Self <: AssetSummary] (val x: Self) extends AnyVal {
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
    def setName(value: AssetName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashes(value: AssetHashes): Self = this.set("hashes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashes: Self = this.set("hashes", js.undefined)
    @scala.inline
    def setSize(value: LongOptional): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

