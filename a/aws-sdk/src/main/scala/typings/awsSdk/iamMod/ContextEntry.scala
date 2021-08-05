package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextEntry extends StObject {
  
  /**
    * The full name of a condition context key, including the service prefix. For example, aws:SourceIp or s3:VersionId.
    */
  var ContextKeyName: js.UndefOr[ContextKeyNameType] = js.undefined
  
  /**
    * The data type of the value (or values) specified in the ContextKeyValues parameter.
    */
  var ContextKeyType: js.UndefOr[ContextKeyTypeEnum] = js.undefined
  
  /**
    * The value (or values, if the condition context key supports multiple values) to provide to the simulation when the key is referenced by a Condition element in an input policy.
    */
  var ContextKeyValues: js.UndefOr[ContextKeyValueListType] = js.undefined
}
object ContextEntry {
  
  inline def apply(): ContextEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextEntry]
  }
  
  extension [Self <: ContextEntry](x: Self) {
    
    inline def setContextKeyName(value: ContextKeyNameType): Self = StObject.set(x, "ContextKeyName", value.asInstanceOf[js.Any])
    
    inline def setContextKeyNameUndefined: Self = StObject.set(x, "ContextKeyName", js.undefined)
    
    inline def setContextKeyType(value: ContextKeyTypeEnum): Self = StObject.set(x, "ContextKeyType", value.asInstanceOf[js.Any])
    
    inline def setContextKeyTypeUndefined: Self = StObject.set(x, "ContextKeyType", js.undefined)
    
    inline def setContextKeyValues(value: ContextKeyValueListType): Self = StObject.set(x, "ContextKeyValues", value.asInstanceOf[js.Any])
    
    inline def setContextKeyValuesUndefined: Self = StObject.set(x, "ContextKeyValues", js.undefined)
    
    inline def setContextKeyValuesVarargs(value: ContextKeyValueType*): Self = StObject.set(x, "ContextKeyValues", js.Array(value :_*))
  }
}
