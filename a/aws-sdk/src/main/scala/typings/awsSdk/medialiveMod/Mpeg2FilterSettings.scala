package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mpeg2FilterSettings extends js.Object {
  
  var TemporalFilterSettings: js.UndefOr[typings.awsSdk.medialiveMod.TemporalFilterSettings] = js.native
}
object Mpeg2FilterSettings {
  
  @scala.inline
  def apply(): Mpeg2FilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mpeg2FilterSettings]
  }
  
  @scala.inline
  implicit class Mpeg2FilterSettingsOps[Self <: Mpeg2FilterSettings] (val x: Self) extends AnyVal {
    
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
    def setTemporalFilterSettings(value: TemporalFilterSettings): Self = this.set("TemporalFilterSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemporalFilterSettings: Self = this.set("TemporalFilterSettings", js.undefined)
  }
}
