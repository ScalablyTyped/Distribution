package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingRuleRecord extends StObject {
  
  /**
    * When the rule was created.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * When the rule was last modified.
    */
  var ModifiedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The sampling rule.
    */
  var SamplingRule: js.UndefOr[typings.awsSdk.xrayMod.SamplingRule] = js.native
}
object SamplingRuleRecord {
  
  @scala.inline
  def apply(): SamplingRuleRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingRuleRecord]
  }
  
  @scala.inline
  implicit class SamplingRuleRecordMutableBuilder[Self <: SamplingRuleRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setModifiedAt(value: Timestamp): Self = StObject.set(x, "ModifiedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedAtUndefined: Self = StObject.set(x, "ModifiedAt", js.undefined)
    
    @scala.inline
    def setSamplingRule(value: SamplingRule): Self = StObject.set(x, "SamplingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingRuleUndefined: Self = StObject.set(x, "SamplingRule", js.undefined)
  }
}
