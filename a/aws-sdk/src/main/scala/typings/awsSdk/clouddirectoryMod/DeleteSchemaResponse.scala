package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSchemaResponse extends StObject {
  
  /**
    * The input ARN that is returned as part of the response. For more information, see arns.
    */
  var SchemaArn: js.UndefOr[Arn] = js.native
}
object DeleteSchemaResponse {
  
  @scala.inline
  def apply(): DeleteSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSchemaResponse]
  }
  
  @scala.inline
  implicit class DeleteSchemaResponseMutableBuilder[Self <: DeleteSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
  }
}
