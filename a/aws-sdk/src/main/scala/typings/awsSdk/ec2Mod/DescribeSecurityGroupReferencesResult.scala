package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecurityGroupReferencesResult extends StObject {
  
  /**
    * Information about the VPCs with the referencing security groups.
    */
  var SecurityGroupReferenceSet: js.UndefOr[SecurityGroupReferences] = js.undefined
}
object DescribeSecurityGroupReferencesResult {
  
  inline def apply(): DescribeSecurityGroupReferencesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecurityGroupReferencesResult]
  }
  
  extension [Self <: DescribeSecurityGroupReferencesResult](x: Self) {
    
    inline def setSecurityGroupReferenceSet(value: SecurityGroupReferences): Self = StObject.set(x, "SecurityGroupReferenceSet", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupReferenceSetUndefined: Self = StObject.set(x, "SecurityGroupReferenceSet", js.undefined)
    
    inline def setSecurityGroupReferenceSetVarargs(value: SecurityGroupReference*): Self = StObject.set(x, "SecurityGroupReferenceSet", js.Array(value*))
  }
}
