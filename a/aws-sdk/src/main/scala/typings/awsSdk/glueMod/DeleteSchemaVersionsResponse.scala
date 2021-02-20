package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSchemaVersionsResponse extends StObject {
  
  /**
    * A list of SchemaVersionErrorItem objects, each containing an error and schema version.
    */
  var SchemaVersionErrors: js.UndefOr[SchemaVersionErrorList] = js.native
}
object DeleteSchemaVersionsResponse {
  
  @scala.inline
  def apply(): DeleteSchemaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSchemaVersionsResponse]
  }
  
  @scala.inline
  implicit class DeleteSchemaVersionsResponseMutableBuilder[Self <: DeleteSchemaVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchemaVersionErrors(value: SchemaVersionErrorList): Self = StObject.set(x, "SchemaVersionErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionErrorsUndefined: Self = StObject.set(x, "SchemaVersionErrors", js.undefined)
    
    @scala.inline
    def setSchemaVersionErrorsVarargs(value: SchemaVersionErrorItem*): Self = StObject.set(x, "SchemaVersionErrors", js.Array(value :_*))
  }
}
