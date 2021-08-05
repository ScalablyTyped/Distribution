package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNotebookInstanceLifecycleConfigInput extends StObject {
  
  /**
    * The name of the lifecycle configuration to describe.
    */
  var NotebookInstanceLifecycleConfigName: typings.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName
}
object DescribeNotebookInstanceLifecycleConfigInput {
  
  inline def apply(NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName): DescribeNotebookInstanceLifecycleConfigInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotebookInstanceLifecycleConfigInput]
  }
  
  extension [Self <: DescribeNotebookInstanceLifecycleConfigInput](x: Self) {
    
    inline def setNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", value.asInstanceOf[js.Any])
  }
}
