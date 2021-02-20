package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableDirectoryRequest extends StObject {
  
  /**
    * The ARN of the directory to disable.
    */
  var DirectoryArn: Arn = js.native
}
object DisableDirectoryRequest {
  
  @scala.inline
  def apply(DirectoryArn: Arn): DisableDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDirectoryRequest]
  }
  
  @scala.inline
  implicit class DisableDirectoryRequestMutableBuilder[Self <: DisableDirectoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
  }
}
