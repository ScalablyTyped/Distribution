package typings.awsSdk.networkfirewallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleOption extends js.Object {
  
  /**
    * 
    */
  var Keyword: typings.awsSdk.networkfirewallMod.Keyword = js.native
  
  /**
    * 
    */
  var Settings: js.UndefOr[typings.awsSdk.networkfirewallMod.Settings] = js.native
}
object RuleOption {
  
  @scala.inline
  def apply(Keyword: Keyword): RuleOption = {
    val __obj = js.Dynamic.literal(Keyword = Keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOption]
  }
  
  @scala.inline
  implicit class RuleOptionOps[Self <: RuleOption] (val x: Self) extends AnyVal {
    
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
    def setKeyword(value: Keyword): Self = this.set("Keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsVarargs(value: Setting*): Self = this.set("Settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: Settings): Self = this.set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("Settings", js.undefined)
  }
}
