package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNotebookInstanceLifecycleConfigInput extends StObject {
  
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: typings.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName = js.native
  
  /**
    * A shell script that runs only once, when you create a notebook instance. The shell script must be a base64-encoded string.
    */
  var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.native
  
  /**
    * A shell script that runs every time you start a notebook instance, including when you create the notebook instance. The shell script must be a base64-encoded string.
    */
  var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.native
}
object CreateNotebookInstanceLifecycleConfigInput {
  
  @scala.inline
  def apply(NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName): CreateNotebookInstanceLifecycleConfigInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotebookInstanceLifecycleConfigInput]
  }
  
  @scala.inline
  implicit class CreateNotebookInstanceLifecycleConfigInputMutableBuilder[Self <: CreateNotebookInstanceLifecycleConfigInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCreate(value: NotebookInstanceLifecycleConfigList): Self = StObject.set(x, "OnCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCreateUndefined: Self = StObject.set(x, "OnCreate", js.undefined)
    
    @scala.inline
    def setOnCreateVarargs(value: NotebookInstanceLifecycleHook*): Self = StObject.set(x, "OnCreate", js.Array(value :_*))
    
    @scala.inline
    def setOnStart(value: NotebookInstanceLifecycleConfigList): Self = StObject.set(x, "OnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStartUndefined: Self = StObject.set(x, "OnStart", js.undefined)
    
    @scala.inline
    def setOnStartVarargs(value: NotebookInstanceLifecycleHook*): Self = StObject.set(x, "OnStart", js.Array(value :_*))
  }
}
