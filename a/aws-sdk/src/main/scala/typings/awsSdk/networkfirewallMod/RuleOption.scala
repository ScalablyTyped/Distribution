package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleOption extends StObject {
  
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
  implicit class RuleOptionMutableBuilder[Self <: RuleOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyword(value: Keyword): Self = StObject.set(x, "Keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: Settings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: Setting*): Self = StObject.set(x, "Settings", js.Array(value :_*))
  }
}
