package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbOptionGroupMembership extends StObject {
  
  /**
    * 
    */
  var OptionGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbOptionGroupMembership {
  
  inline def apply(): AwsRdsDbOptionGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbOptionGroupMembership]
  }
  
  extension [Self <: AwsRdsDbOptionGroupMembership](x: Self) {
    
    inline def setOptionGroupName(value: NonEmptyString): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
