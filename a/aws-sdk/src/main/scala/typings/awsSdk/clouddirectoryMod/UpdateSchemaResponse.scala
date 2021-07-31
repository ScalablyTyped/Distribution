package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSchemaResponse extends StObject {
  
  /**
    * The ARN that is associated with the updated schema. For more information, see arns.
    */
  var SchemaArn: js.UndefOr[Arn] = js.undefined
}
object UpdateSchemaResponse {
  
  @scala.inline
  def apply(): UpdateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSchemaResponse]
  }
  
  @scala.inline
  implicit class UpdateSchemaResponseMutableBuilder[Self <: UpdateSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
  }
}
