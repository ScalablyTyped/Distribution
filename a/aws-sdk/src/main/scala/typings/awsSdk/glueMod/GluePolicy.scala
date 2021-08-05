package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GluePolicy extends StObject {
  
  /**
    * The date and time at which the policy was created.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Contains the hash value associated with this policy.
    */
  var PolicyHash: js.UndefOr[HashString] = js.undefined
  
  /**
    * Contains the requested policy document, in JSON format.
    */
  var PolicyInJson: js.UndefOr[PolicyJsonString] = js.undefined
  
  /**
    * The date and time at which the policy was last updated.
    */
  var UpdateTime: js.UndefOr[Timestamp] = js.undefined
}
object GluePolicy {
  
  inline def apply(): GluePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GluePolicy]
  }
  
  extension [Self <: GluePolicy](x: Self) {
    
    inline def setCreateTime(value: Timestamp): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setPolicyHash(value: HashString): Self = StObject.set(x, "PolicyHash", value.asInstanceOf[js.Any])
    
    inline def setPolicyHashUndefined: Self = StObject.set(x, "PolicyHash", js.undefined)
    
    inline def setPolicyInJson(value: PolicyJsonString): Self = StObject.set(x, "PolicyInJson", value.asInstanceOf[js.Any])
    
    inline def setPolicyInJsonUndefined: Self = StObject.set(x, "PolicyInJson", js.undefined)
    
    inline def setUpdateTime(value: Timestamp): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "UpdateTime", js.undefined)
  }
}
