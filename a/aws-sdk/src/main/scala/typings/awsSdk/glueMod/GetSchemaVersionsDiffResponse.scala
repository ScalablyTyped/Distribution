package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSchemaVersionsDiffResponse extends StObject {
  
  /**
    * The difference between schemas as a string in JsonPatch format.
    */
  var Diff: js.UndefOr[SchemaDefinitionDiff] = js.undefined
}
object GetSchemaVersionsDiffResponse {
  
  @scala.inline
  def apply(): GetSchemaVersionsDiffResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSchemaVersionsDiffResponse]
  }
  
  @scala.inline
  implicit class GetSchemaVersionsDiffResponseMutableBuilder[Self <: GetSchemaVersionsDiffResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiff(value: SchemaDefinitionDiff): Self = StObject.set(x, "Diff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiffUndefined: Self = StObject.set(x, "Diff", js.undefined)
  }
}
