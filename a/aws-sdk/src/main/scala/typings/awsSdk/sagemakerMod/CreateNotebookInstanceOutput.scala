package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNotebookInstanceOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notebook instance. 
    */
  var NotebookInstanceArn: js.UndefOr[typings.awsSdk.sagemakerMod.NotebookInstanceArn] = js.undefined
}
object CreateNotebookInstanceOutput {
  
  @scala.inline
  def apply(): CreateNotebookInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotebookInstanceOutput]
  }
  
  @scala.inline
  implicit class CreateNotebookInstanceOutputMutableBuilder[Self <: CreateNotebookInstanceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookInstanceArn(value: NotebookInstanceArn): Self = StObject.set(x, "NotebookInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceArnUndefined: Self = StObject.set(x, "NotebookInstanceArn", js.undefined)
  }
}
