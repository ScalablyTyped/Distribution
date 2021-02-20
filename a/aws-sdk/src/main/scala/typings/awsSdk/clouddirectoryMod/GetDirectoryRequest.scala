package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDirectoryRequest extends StObject {
  
  /**
    * The ARN of the directory.
    */
  var DirectoryArn: typings.awsSdk.clouddirectoryMod.DirectoryArn = js.native
}
object GetDirectoryRequest {
  
  @scala.inline
  def apply(DirectoryArn: DirectoryArn): GetDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryRequest]
  }
  
  @scala.inline
  implicit class GetDirectoryRequestMutableBuilder[Self <: GetDirectoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryArn(value: DirectoryArn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
  }
}
