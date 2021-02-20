package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSchemaRequest extends StObject {
  
  /**
    * The name of the schema.
    */
  var Name: SchemaName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the development schema. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}
object UpdateSchemaRequest {
  
  @scala.inline
  def apply(Name: SchemaName, SchemaArn: Arn): UpdateSchemaRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSchemaRequest]
  }
  
  @scala.inline
  implicit class UpdateSchemaRequestMutableBuilder[Self <: UpdateSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: SchemaName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
