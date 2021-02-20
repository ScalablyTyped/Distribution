package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplySchemaResponse extends StObject {
  
  /**
    * The applied schema ARN that is associated with the copied schema in the Directory. You can use this ARN to describe the schema information applied on this directory. For more information, see arns.
    */
  var AppliedSchemaArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ARN that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: js.UndefOr[Arn] = js.native
}
object ApplySchemaResponse {
  
  @scala.inline
  def apply(): ApplySchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplySchemaResponse]
  }
  
  @scala.inline
  implicit class ApplySchemaResponseMutableBuilder[Self <: ApplySchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppliedSchemaArn(value: Arn): Self = StObject.set(x, "AppliedSchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliedSchemaArnUndefined: Self = StObject.set(x, "AppliedSchemaArn", js.undefined)
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryArnUndefined: Self = StObject.set(x, "DirectoryArn", js.undefined)
  }
}
