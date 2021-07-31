package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataStoreOptions extends StObject {
  
  var localQueryComparisonOptions: js.UndefOr[LocalQueryComparisonOptions] = js.undefined
  
  var namingConvention: js.UndefOr[NamingConvention] = js.undefined
}
object MetadataStoreOptions {
  
  @scala.inline
  def apply(): MetadataStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataStoreOptions]
  }
  
  @scala.inline
  implicit class MetadataStoreOptionsMutableBuilder[Self <: MetadataStoreOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalQueryComparisonOptions(value: LocalQueryComparisonOptions): Self = StObject.set(x, "localQueryComparisonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalQueryComparisonOptionsUndefined: Self = StObject.set(x, "localQueryComparisonOptions", js.undefined)
    
    @scala.inline
    def setNamingConvention(value: NamingConvention): Self = StObject.set(x, "namingConvention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamingConventionUndefined: Self = StObject.set(x, "namingConvention", js.undefined)
  }
}
