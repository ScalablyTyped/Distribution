package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDirectoryResponse extends StObject {
  
  /**
    * The ARN of the deleted directory.
    */
  var DirectoryArn: Arn = js.native
}
object DeleteDirectoryResponse {
  
  @scala.inline
  def apply(DirectoryArn: Arn): DeleteDirectoryResponse = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDirectoryResponse]
  }
  
  @scala.inline
  implicit class DeleteDirectoryResponseMutableBuilder[Self <: DeleteDirectoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
  }
}
