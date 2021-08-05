package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyVersion extends StObject {
  
  /**
    * The date and time the policy was created.
    */
  var createDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * Specifies whether the policy version is the default.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.undefined
  
  /**
    * The policy version ID.
    */
  var versionId: js.UndefOr[PolicyVersionId] = js.undefined
}
object PolicyVersion {
  
  inline def apply(): PolicyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyVersion]
  }
  
  extension [Self <: PolicyVersion](x: Self) {
    
    inline def setCreateDate(value: DateType): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "createDate", js.undefined)
    
    inline def setIsDefaultVersion(value: IsDefaultVersion): Self = StObject.set(x, "isDefaultVersion", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultVersionUndefined: Self = StObject.set(x, "isDefaultVersion", js.undefined)
    
    inline def setVersionId(value: PolicyVersionId): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
