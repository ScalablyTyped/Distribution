package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDirectoryRequest extends StObject {
  
  /**
    * The name of the Directory. Should be unique per account, per region.
    */
  var Name: DirectoryName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the published schema that will be copied into the data Directory. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}
object CreateDirectoryRequest {
  
  @scala.inline
  def apply(Name: DirectoryName, SchemaArn: Arn): CreateDirectoryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryRequest]
  }
  
  @scala.inline
  implicit class CreateDirectoryRequestMutableBuilder[Self <: CreateDirectoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DirectoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
