package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDiscoveredSchemaResponse extends StObject {
  
  /**
    * The source of the schema definition.
    */
  var Content: js.UndefOr[string] = js.undefined
}
object GetDiscoveredSchemaResponse {
  
  inline def apply(): GetDiscoveredSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiscoveredSchemaResponse]
  }
  
  extension [Self <: GetDiscoveredSchemaResponse](x: Self) {
    
    inline def setContent(value: string): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
  }
}
