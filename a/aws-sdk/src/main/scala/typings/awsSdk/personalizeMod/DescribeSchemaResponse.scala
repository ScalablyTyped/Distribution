package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSchemaResponse extends StObject {
  
  /**
    * The requested schema.
    */
  var schema: js.UndefOr[DatasetSchema] = js.undefined
}
object DescribeSchemaResponse {
  
  @scala.inline
  def apply(): DescribeSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSchemaResponse]
  }
  
  @scala.inline
  implicit class DescribeSchemaResponseMutableBuilder[Self <: DescribeSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchema(value: DatasetSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
