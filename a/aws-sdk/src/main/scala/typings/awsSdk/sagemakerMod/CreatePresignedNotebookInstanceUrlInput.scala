package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePresignedNotebookInstanceUrlInput extends StObject {
  
  /**
    * The name of the notebook instance.
    */
  var NotebookInstanceName: typings.awsSdk.sagemakerMod.NotebookInstanceName
  
  /**
    * The duration of the session, in seconds. The default is 12 hours.
    */
  var SessionExpirationDurationInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.SessionExpirationDurationInSeconds] = js.undefined
}
object CreatePresignedNotebookInstanceUrlInput {
  
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): CreatePresignedNotebookInstanceUrlInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedNotebookInstanceUrlInput]
  }
  
  @scala.inline
  implicit class CreatePresignedNotebookInstanceUrlInputMutableBuilder[Self <: CreatePresignedNotebookInstanceUrlInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookInstanceName(value: NotebookInstanceName): Self = StObject.set(x, "NotebookInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionExpirationDurationInSeconds(value: SessionExpirationDurationInSeconds): Self = StObject.set(x, "SessionExpirationDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionExpirationDurationInSecondsUndefined: Self = StObject.set(x, "SessionExpirationDurationInSeconds", js.undefined)
  }
}
