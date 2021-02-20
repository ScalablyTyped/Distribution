package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDirectoryResponse extends StObject {
  
  /**
    * The ARN of the published schema in the Directory. Once a published schema is copied into the directory, it has its own ARN, which is referred to applied schema ARN. For more information, see arns.
    */
  var AppliedSchemaArn: Arn = js.native
  
  /**
    * The ARN that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: typings.awsSdk.clouddirectoryMod.DirectoryArn = js.native
  
  /**
    * The name of the Directory.
    */
  var Name: DirectoryName = js.native
  
  /**
    * The root object node of the created directory.
    */
  var ObjectIdentifier: typings.awsSdk.clouddirectoryMod.ObjectIdentifier = js.native
}
object CreateDirectoryResponse {
  
  @scala.inline
  def apply(
    AppliedSchemaArn: Arn,
    DirectoryArn: DirectoryArn,
    Name: DirectoryName,
    ObjectIdentifier: ObjectIdentifier
  ): CreateDirectoryResponse = {
    val __obj = js.Dynamic.literal(AppliedSchemaArn = AppliedSchemaArn.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectIdentifier = ObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryResponse]
  }
  
  @scala.inline
  implicit class CreateDirectoryResponseMutableBuilder[Self <: CreateDirectoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppliedSchemaArn(value: Arn): Self = StObject.set(x, "AppliedSchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryArn(value: DirectoryArn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DirectoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
  }
}
