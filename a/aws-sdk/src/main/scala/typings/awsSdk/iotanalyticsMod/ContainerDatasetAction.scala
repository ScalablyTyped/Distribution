package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerDatasetAction extends js.Object {
  
  /**
    * The ARN of the role that gives permission to the system to access required resources to run the containerAction. This includes, at minimum, permission to retrieve the dataset contents that are the input to the containerized application.
    */
  var executionRoleArn: RoleArn = js.native
  
  /**
    * The ARN of the Docker container stored in your account. The Docker container contains an application and required support libraries and is used to generate dataset contents.
    */
  var image: Image = js.native
  
  /**
    * Configuration of the resource that executes the containerAction.
    */
  var resourceConfiguration: ResourceConfiguration = js.native
  
  /**
    * The values of variables used in the context of the execution of the containerized application (basically, parameters passed to the application). Each variable must have a name and a value given by one of stringValue, datasetContentVersionValue, or outputFileUriValue.
    */
  var variables: js.UndefOr[Variables] = js.native
}
object ContainerDatasetAction {
  
  @scala.inline
  def apply(executionRoleArn: RoleArn, image: Image, resourceConfiguration: ResourceConfiguration): ContainerDatasetAction = {
    val __obj = js.Dynamic.literal(executionRoleArn = executionRoleArn.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], resourceConfiguration = resourceConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDatasetAction]
  }
  
  @scala.inline
  implicit class ContainerDatasetActionOps[Self <: ContainerDatasetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExecutionRoleArn(value: RoleArn): Self = this.set("executionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceConfiguration(value: ResourceConfiguration): Self = this.set("resourceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: Variable*): Self = this.set("variables", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: Variables): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
}
