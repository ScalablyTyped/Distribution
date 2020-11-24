package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePresignedNotebookInstanceUrlInput extends js.Object {
  
  /**
    * The name of the notebook instance.
    */
  var NotebookInstanceName: typings.awsSdk.sagemakerMod.NotebookInstanceName = js.native
  
  /**
    * The duration of the session, in seconds. The default is 12 hours.
    */
  var SessionExpirationDurationInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.SessionExpirationDurationInSeconds] = js.native
}
object CreatePresignedNotebookInstanceUrlInput {
  
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): CreatePresignedNotebookInstanceUrlInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedNotebookInstanceUrlInput]
  }
  
  @scala.inline
  implicit class CreatePresignedNotebookInstanceUrlInputOps[Self <: CreatePresignedNotebookInstanceUrlInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNotebookInstanceName(value: NotebookInstanceName): Self = this.set("NotebookInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionExpirationDurationInSeconds(value: SessionExpirationDurationInSeconds): Self = this.set("SessionExpirationDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionExpirationDurationInSeconds: Self = this.set("SessionExpirationDurationInSeconds", js.undefined)
  }
}
