package typings.contentfulManagement.assetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetProcessingForLocale extends js.Object {
  
  var processingCheckRetries: js.UndefOr[Double] = js.native
  
  var processingCheckWait: js.UndefOr[Double] = js.native
}
object AssetProcessingForLocale {
  
  @scala.inline
  def apply(): AssetProcessingForLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetProcessingForLocale]
  }
  
  @scala.inline
  implicit class AssetProcessingForLocaleOps[Self <: AssetProcessingForLocale] (val x: Self) extends AnyVal {
    
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
    def setProcessingCheckRetries(value: Double): Self = this.set("processingCheckRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingCheckRetries: Self = this.set("processingCheckRetries", js.undefined)
    
    @scala.inline
    def setProcessingCheckWait(value: Double): Self = this.set("processingCheckWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingCheckWait: Self = this.set("processingCheckWait", js.undefined)
  }
}
