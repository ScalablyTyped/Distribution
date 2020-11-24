package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNotebookInstanceLifecycleConfigInput extends js.Object {
  
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
  implicit class CreateNotebookInstanceLifecycleConfigInputOps[Self <: CreateNotebookInstanceLifecycleConfigInput] (val x: Self) extends AnyVal {
    
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
    def setNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = this.set("NotebookInstanceLifecycleConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCreateVarargs(value: NotebookInstanceLifecycleHook*): Self = this.set("OnCreate", js.Array(value :_*))
    
    @scala.inline
    def setOnCreate(value: NotebookInstanceLifecycleConfigList): Self = this.set("OnCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCreate: Self = this.set("OnCreate", js.undefined)
    
    @scala.inline
    def setOnStartVarargs(value: NotebookInstanceLifecycleHook*): Self = this.set("OnStart", js.Array(value :_*))
    
    @scala.inline
    def setOnStart(value: NotebookInstanceLifecycleConfigList): Self = this.set("OnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStart: Self = this.set("OnStart", js.undefined)
  }
}
