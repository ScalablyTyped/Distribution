package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemFailureDetails extends StObject {
  
  /**
    * A message describing any failures that occurred during file system creation.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
}
object FileSystemFailureDetails {
  
  @scala.inline
  def apply(): FileSystemFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemFailureDetails]
  }
  
  @scala.inline
  implicit class FileSystemFailureDetailsMutableBuilder[Self <: FileSystemFailureDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
