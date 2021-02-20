package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDiscoveredSchemaResponse extends StObject {
  
  /**
    * The source of the schema definition.
    */
  var Content: js.UndefOr[string] = js.native
}
object GetDiscoveredSchemaResponse {
  
  @scala.inline
  def apply(): GetDiscoveredSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiscoveredSchemaResponse]
  }
  
  @scala.inline
  implicit class GetDiscoveredSchemaResponseMutableBuilder[Self <: GetDiscoveredSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: string): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
  }
}
