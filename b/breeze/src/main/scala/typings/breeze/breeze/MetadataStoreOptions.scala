package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataStoreOptions extends StObject {
  
  var localQueryComparisonOptions: js.UndefOr[LocalQueryComparisonOptions] = js.undefined
  
  var namingConvention: js.UndefOr[NamingConvention] = js.undefined
}
object MetadataStoreOptions {
  
  inline def apply(): MetadataStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataStoreOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataStoreOptions] (val x: Self) extends AnyVal {
    
    inline def setLocalQueryComparisonOptions(value: LocalQueryComparisonOptions): Self = StObject.set(x, "localQueryComparisonOptions", value.asInstanceOf[js.Any])
    
    inline def setLocalQueryComparisonOptionsUndefined: Self = StObject.set(x, "localQueryComparisonOptions", js.undefined)
    
    inline def setNamingConvention(value: NamingConvention): Self = StObject.set(x, "namingConvention", value.asInstanceOf[js.Any])
    
    inline def setNamingConventionUndefined: Self = StObject.set(x, "namingConvention", js.undefined)
  }
}
