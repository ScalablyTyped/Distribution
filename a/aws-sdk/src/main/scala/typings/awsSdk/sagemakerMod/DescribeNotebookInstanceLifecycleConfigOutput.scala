package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNotebookInstanceLifecycleConfigOutput extends StObject {
  
  /**
    * A timestamp that tells when the lifecycle configuration was created.
    */
  var CreationTime: js.UndefOr[typings.awsSdk.sagemakerMod.CreationTime] = js.native
  
  /**
    * A timestamp that tells when the lifecycle configuration was last modified.
    */
  var LastModifiedTime: js.UndefOr[typings.awsSdk.sagemakerMod.LastModifiedTime] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigArn: js.UndefOr[typings.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigArn] = js.native
  
  /**
    * The name of the lifecycle configuration.
    */
  var NotebookInstanceLifecycleConfigName: js.UndefOr[typings.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName] = js.native
  
  /**
    * The shell script that runs only once, when you create a notebook instance.
    */
  var OnCreate: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.native
  
  /**
    * The shell script that runs every time you start a notebook instance, including when you create the notebook instance.
    */
  var OnStart: js.UndefOr[NotebookInstanceLifecycleConfigList] = js.native
}
object DescribeNotebookInstanceLifecycleConfigOutput {
  
  @scala.inline
  def apply(): DescribeNotebookInstanceLifecycleConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNotebookInstanceLifecycleConfigOutput]
  }
  
  @scala.inline
  implicit class DescribeNotebookInstanceLifecycleConfigOutputMutableBuilder[Self <: DescribeNotebookInstanceLifecycleConfigOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: LastModifiedTime): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigArn(value: NotebookInstanceLifecycleConfigArn): Self = StObject.set(x, "NotebookInstanceLifecycleConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigArnUndefined: Self = StObject.set(x, "NotebookInstanceLifecycleConfigArn", js.undefined)
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigNameUndefined: Self = StObject.set(x, "NotebookInstanceLifecycleConfigName", js.undefined)
    
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
