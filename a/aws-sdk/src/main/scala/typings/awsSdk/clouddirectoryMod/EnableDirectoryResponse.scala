package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableDirectoryResponse extends StObject {
  
  /**
    * The ARN of the enabled directory.
    */
  var DirectoryArn: Arn = js.native
}
object EnableDirectoryResponse {
  
  @scala.inline
  def apply(DirectoryArn: Arn): EnableDirectoryResponse = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDirectoryResponse]
  }
  
  @scala.inline
  implicit class EnableDirectoryResponseMutableBuilder[Self <: EnableDirectoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
  }
}
