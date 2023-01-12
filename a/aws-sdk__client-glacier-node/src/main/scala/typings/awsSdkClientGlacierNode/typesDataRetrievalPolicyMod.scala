package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesDataRetrievalRuleMod.DataRetrievalRule
import typings.awsSdkClientGlacierNode.typesDataRetrievalRuleMod.UnmarshalledDataRetrievalRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDataRetrievalPolicyMod {
  
  trait DataRetrievalPolicy extends StObject {
    
    /**
      * <p>The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.</p>
      */
    var Rules: js.UndefOr[js.Array[DataRetrievalRule] | js.Iterable[DataRetrievalRule]] = js.undefined
  }
  object DataRetrievalPolicy {
    
    inline def apply(): DataRetrievalPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataRetrievalPolicy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataRetrievalPolicy] (val x: Self) extends AnyVal {
      
      inline def setRules(value: js.Array[DataRetrievalRule] | js.Iterable[DataRetrievalRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
      
      inline def setRulesVarargs(value: DataRetrievalRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    }
  }
  
  trait UnmarshalledDataRetrievalPolicy
    extends StObject
       with DataRetrievalPolicy {
    
    /**
      * <p>The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.</p>
      */
    @JSName("Rules")
    var Rules_UnmarshalledDataRetrievalPolicy: js.UndefOr[js.Array[UnmarshalledDataRetrievalRule]] = js.undefined
  }
  object UnmarshalledDataRetrievalPolicy {
    
    inline def apply(): UnmarshalledDataRetrievalPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledDataRetrievalPolicy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledDataRetrievalPolicy] (val x: Self) extends AnyVal {
      
      inline def setRules(value: js.Array[UnmarshalledDataRetrievalRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
      
      inline def setRulesVarargs(value: UnmarshalledDataRetrievalRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    }
  }
}
