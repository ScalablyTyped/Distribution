package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDirectoryResponse extends StObject {
  
  /**
    * Metadata about the directory.
    */
  var Directory: typings.awsSdk.clouddirectoryMod.Directory = js.native
}
object GetDirectoryResponse {
  
  @scala.inline
  def apply(Directory: Directory): GetDirectoryResponse = {
    val __obj = js.Dynamic.literal(Directory = Directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryResponse]
  }
  
  @scala.inline
  implicit class GetDirectoryResponseMutableBuilder[Self <: GetDirectoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectory(value: Directory): Self = StObject.set(x, "Directory", value.asInstanceOf[js.Any])
  }
}
