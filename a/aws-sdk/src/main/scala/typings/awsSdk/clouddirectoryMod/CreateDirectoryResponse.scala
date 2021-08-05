package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectoryResponse extends StObject {
  
  /**
    * The ARN of the published schema in the Directory. Once a published schema is copied into the directory, it has its own ARN, which is referred to applied schema ARN. For more information, see arns.
    */
  var AppliedSchemaArn: Arn
  
  /**
    * The ARN that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: typings.awsSdk.clouddirectoryMod.DirectoryArn
  
  /**
    * The name of the Directory.
    */
  var Name: DirectoryName
  
  /**
    * The root object node of the created directory.
    */
  var ObjectIdentifier: typings.awsSdk.clouddirectoryMod.ObjectIdentifier
}
object CreateDirectoryResponse {
  
  inline def apply(
    AppliedSchemaArn: Arn,
    DirectoryArn: DirectoryArn,
    Name: DirectoryName,
    ObjectIdentifier: ObjectIdentifier
  ): CreateDirectoryResponse = {
    val __obj = js.Dynamic.literal(AppliedSchemaArn = AppliedSchemaArn.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectIdentifier = ObjectIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryResponse]
  }
  
  extension [Self <: CreateDirectoryResponse](x: Self) {
    
    inline def setAppliedSchemaArn(value: Arn): Self = StObject.set(x, "AppliedSchemaArn", value.asInstanceOf[js.Any])
    
    inline def setDirectoryArn(value: DirectoryArn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: DirectoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
  }
}
