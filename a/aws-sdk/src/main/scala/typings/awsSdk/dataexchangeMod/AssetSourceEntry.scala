package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetSourceEntry extends js.Object {
  
  /**
    * The S3 bucket that's part of the source of the asset.
    */
  var Bucket: string = js.native
  
  /**
    * The name of the object in Amazon S3 for the asset.
    */
  var Key: string = js.native
}
object AssetSourceEntry {
  
  @scala.inline
  def apply(Bucket: string, Key: string): AssetSourceEntry = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetSourceEntry]
  }
  
  @scala.inline
  implicit class AssetSourceEntryOps[Self <: AssetSourceEntry] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: string): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: string): Self = this.set("Key", value.asInstanceOf[js.Any])
  }
}
