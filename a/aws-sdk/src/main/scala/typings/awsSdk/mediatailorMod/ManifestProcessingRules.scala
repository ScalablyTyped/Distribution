package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManifestProcessingRules extends js.Object {
  
  var AdMarkerPassthrough: js.UndefOr[typings.awsSdk.mediatailorMod.AdMarkerPassthrough] = js.native
}
object ManifestProcessingRules {
  
  @scala.inline
  def apply(): ManifestProcessingRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestProcessingRules]
  }
  
  @scala.inline
  implicit class ManifestProcessingRulesOps[Self <: ManifestProcessingRules] (val x: Self) extends AnyVal {
    
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
    def setAdMarkerPassthrough(value: AdMarkerPassthrough): Self = this.set("AdMarkerPassthrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdMarkerPassthrough: Self = this.set("AdMarkerPassthrough", js.undefined)
  }
}
