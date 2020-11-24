package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixLevel extends js.Object {
  
  /**
    * A container for the prefix-level storage metrics for S3 Storage Lens.
    */
  var StorageMetrics: PrefixLevelStorageMetrics = js.native
}
object PrefixLevel {
  
  @scala.inline
  def apply(StorageMetrics: PrefixLevelStorageMetrics): PrefixLevel = {
    val __obj = js.Dynamic.literal(StorageMetrics = StorageMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixLevel]
  }
  
  @scala.inline
  implicit class PrefixLevelOps[Self <: PrefixLevel] (val x: Self) extends AnyVal {
    
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
    def setStorageMetrics(value: PrefixLevelStorageMetrics): Self = this.set("StorageMetrics", value.asInstanceOf[js.Any])
  }
}
