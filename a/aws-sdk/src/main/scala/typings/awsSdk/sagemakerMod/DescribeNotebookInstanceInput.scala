package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNotebookInstanceInput extends StObject {
  
  /**
    * The name of the notebook instance that you want information about.
    */
  var NotebookInstanceName: typings.awsSdk.sagemakerMod.NotebookInstanceName
}
object DescribeNotebookInstanceInput {
  
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): DescribeNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotebookInstanceInput]
  }
  
  @scala.inline
  implicit class DescribeNotebookInstanceInputMutableBuilder[Self <: DescribeNotebookInstanceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookInstanceName(value: NotebookInstanceName): Self = StObject.set(x, "NotebookInstanceName", value.asInstanceOf[js.Any])
  }
}
