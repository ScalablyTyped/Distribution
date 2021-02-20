package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceDetails extends StObject {
  
  /**
    * Whether a resource is compliant with the effective tag policy.
    */
  var ComplianceStatus: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ComplianceStatus] = js.native
  
  /**
    * These are keys defined in the effective policy that are on the resource with either incorrect case treatment or noncompliant values. 
    */
  var KeysWithNoncompliantValues: js.UndefOr[TagKeyList] = js.native
  
  /**
    * These tag keys on the resource are noncompliant with the effective tag policy.
    */
  var NoncompliantKeys: js.UndefOr[TagKeyList] = js.native
}
object ComplianceDetails {
  
  @scala.inline
  def apply(): ComplianceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceDetails]
  }
  
  @scala.inline
  implicit class ComplianceDetailsMutableBuilder[Self <: ComplianceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceStatus(value: ComplianceStatus): Self = StObject.set(x, "ComplianceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceStatusUndefined: Self = StObject.set(x, "ComplianceStatus", js.undefined)
    
    @scala.inline
    def setKeysWithNoncompliantValues(value: TagKeyList): Self = StObject.set(x, "KeysWithNoncompliantValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysWithNoncompliantValuesUndefined: Self = StObject.set(x, "KeysWithNoncompliantValues", js.undefined)
    
    @scala.inline
    def setKeysWithNoncompliantValuesVarargs(value: TagKey*): Self = StObject.set(x, "KeysWithNoncompliantValues", js.Array(value :_*))
    
    @scala.inline
    def setNoncompliantKeys(value: TagKeyList): Self = StObject.set(x, "NoncompliantKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoncompliantKeysUndefined: Self = StObject.set(x, "NoncompliantKeys", js.undefined)
    
    @scala.inline
    def setNoncompliantKeysVarargs(value: TagKey*): Self = StObject.set(x, "NoncompliantKeys", js.Array(value :_*))
  }
}
