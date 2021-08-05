package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetApplicationRevisionsOutput extends StObject {
  
  /**
    * The name of the application that corresponds to the revisions.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.undefined
  
  /**
    * Information about errors that might have occurred during the API call.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * Additional information about the revisions, including the type and location.
    */
  var revisions: js.UndefOr[RevisionInfoList] = js.undefined
}
object BatchGetApplicationRevisionsOutput {
  
  inline def apply(): BatchGetApplicationRevisionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetApplicationRevisionsOutput]
  }
  
  extension [Self <: BatchGetApplicationRevisionsOutput](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setRevisions(value: RevisionInfoList): Self = StObject.set(x, "revisions", value.asInstanceOf[js.Any])
    
    inline def setRevisionsUndefined: Self = StObject.set(x, "revisions", js.undefined)
    
    inline def setRevisionsVarargs(value: RevisionInfo*): Self = StObject.set(x, "revisions", js.Array(value :_*))
  }
}
