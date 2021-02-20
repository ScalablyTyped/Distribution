package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMappingRequest extends StObject {
  
  /**
    * Parameters for the mapping.
    */
  var Location: js.UndefOr[typings.awsSdk.glueMod.Location] = js.native
  
  /**
    * A list of target tables.
    */
  var Sinks: js.UndefOr[CatalogEntries] = js.native
  
  /**
    * Specifies the source table.
    */
  var Source: CatalogEntry = js.native
}
object GetMappingRequest {
  
  @scala.inline
  def apply(Source: CatalogEntry): GetMappingRequest = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMappingRequest]
  }
  
  @scala.inline
  implicit class GetMappingRequestMutableBuilder[Self <: GetMappingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    @scala.inline
    def setSinks(value: CatalogEntries): Self = StObject.set(x, "Sinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinksUndefined: Self = StObject.set(x, "Sinks", js.undefined)
    
    @scala.inline
    def setSinksVarargs(value: CatalogEntry*): Self = StObject.set(x, "Sinks", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: CatalogEntry): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
