package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesSamplingRuleMod.SamplingRule
import typings.awsSdkClientXrayNode.typesSamplingRuleMod.UnmarshalledSamplingRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSamplingRuleRecordMod {
  
  trait SamplingRuleRecord extends StObject {
    
    /**
      * <p>When the rule was created.</p>
      */
    var CreatedAt: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>When the rule was last modified.</p>
      */
    var ModifiedAt: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>The sampling rule.</p>
      */
    var SamplingRule: js.UndefOr[typings.awsSdkClientXrayNode.typesSamplingRuleMod.SamplingRule] = js.undefined
  }
  object SamplingRuleRecord {
    
    inline def apply(): SamplingRuleRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SamplingRuleRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SamplingRuleRecord] (val x: Self) extends AnyVal {
      
      inline def setCreatedAt(value: js.Date | String | Double): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
      
      inline def setModifiedAt(value: js.Date | String | Double): Self = StObject.set(x, "ModifiedAt", value.asInstanceOf[js.Any])
      
      inline def setModifiedAtUndefined: Self = StObject.set(x, "ModifiedAt", js.undefined)
      
      inline def setSamplingRule(value: SamplingRule): Self = StObject.set(x, "SamplingRule", value.asInstanceOf[js.Any])
      
      inline def setSamplingRuleUndefined: Self = StObject.set(x, "SamplingRule", js.undefined)
    }
  }
  
  trait UnmarshalledSamplingRuleRecord
    extends StObject
       with SamplingRuleRecord {
    
    /**
      * <p>When the rule was created.</p>
      */
    @JSName("CreatedAt")
    var CreatedAt_UnmarshalledSamplingRuleRecord: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>When the rule was last modified.</p>
      */
    @JSName("ModifiedAt")
    var ModifiedAt_UnmarshalledSamplingRuleRecord: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>The sampling rule.</p>
      */
    @JSName("SamplingRule")
    var SamplingRule_UnmarshalledSamplingRuleRecord: js.UndefOr[UnmarshalledSamplingRule] = js.undefined
  }
  object UnmarshalledSamplingRuleRecord {
    
    inline def apply(): UnmarshalledSamplingRuleRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSamplingRuleRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledSamplingRuleRecord] (val x: Self) extends AnyVal {
      
      inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
      
      inline def setModifiedAt(value: js.Date): Self = StObject.set(x, "ModifiedAt", value.asInstanceOf[js.Any])
      
      inline def setModifiedAtUndefined: Self = StObject.set(x, "ModifiedAt", js.undefined)
      
      inline def setSamplingRule(value: UnmarshalledSamplingRule): Self = StObject.set(x, "SamplingRule", value.asInstanceOf[js.Any])
      
      inline def setSamplingRuleUndefined: Self = StObject.set(x, "SamplingRule", js.undefined)
    }
  }
}
