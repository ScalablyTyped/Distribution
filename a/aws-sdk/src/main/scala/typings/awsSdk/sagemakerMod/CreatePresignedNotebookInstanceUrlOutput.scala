package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePresignedNotebookInstanceUrlOutput extends StObject {
  
  /**
    * A JSON object that contains the URL string. 
    */
  var AuthorizedUrl: js.UndefOr[NotebookInstanceUrl] = js.undefined
}
object CreatePresignedNotebookInstanceUrlOutput {
  
  inline def apply(): CreatePresignedNotebookInstanceUrlOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePresignedNotebookInstanceUrlOutput]
  }
  
  extension [Self <: CreatePresignedNotebookInstanceUrlOutput](x: Self) {
    
    inline def setAuthorizedUrl(value: NotebookInstanceUrl): Self = StObject.set(x, "AuthorizedUrl", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedUrlUndefined: Self = StObject.set(x, "AuthorizedUrl", js.undefined)
  }
}
