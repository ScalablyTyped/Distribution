package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePresignedNotebookInstanceUrlOutput extends StObject {
  
  /**
    * A JSON object that contains the URL string. 
    */
  var AuthorizedUrl: js.UndefOr[NotebookInstanceUrl] = js.native
}
object CreatePresignedNotebookInstanceUrlOutput {
  
  @scala.inline
  def apply(): CreatePresignedNotebookInstanceUrlOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePresignedNotebookInstanceUrlOutput]
  }
  
  @scala.inline
  implicit class CreatePresignedNotebookInstanceUrlOutputMutableBuilder[Self <: CreatePresignedNotebookInstanceUrlOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizedUrl(value: NotebookInstanceUrl): Self = StObject.set(x, "AuthorizedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedUrlUndefined: Self = StObject.set(x, "AuthorizedUrl", js.undefined)
  }
}
