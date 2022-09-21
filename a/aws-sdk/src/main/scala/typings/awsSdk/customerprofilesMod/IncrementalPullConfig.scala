package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncrementalPullConfig extends StObject {
  
  /**
    * A field that specifies the date time or timestamp field as the criteria to use when importing incremental records from the source.
    */
  var DatetimeTypeFieldName: js.UndefOr[typings.awsSdk.customerprofilesMod.DatetimeTypeFieldName] = js.undefined
}
object IncrementalPullConfig {
  
  inline def apply(): IncrementalPullConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncrementalPullConfig]
  }
  
  extension [Self <: IncrementalPullConfig](x: Self) {
    
    inline def setDatetimeTypeFieldName(value: DatetimeTypeFieldName): Self = StObject.set(x, "DatetimeTypeFieldName", value.asInstanceOf[js.Any])
    
    inline def setDatetimeTypeFieldNameUndefined: Self = StObject.set(x, "DatetimeTypeFieldName", js.undefined)
  }
}
