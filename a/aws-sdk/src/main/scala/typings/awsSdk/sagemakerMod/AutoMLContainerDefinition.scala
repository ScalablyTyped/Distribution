package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLContainerDefinition extends js.Object {
  /**
    * Environment variables to set in the container. Refer to ContainerDefinition for more details.
    */
  var Environment: js.UndefOr[EnvironmentMap] = js.native
  /**
    * The ECR path of the container. Refer to ContainerDefinition for more details.
    */
  var Image: ContainerImage = js.native
  /**
    * The location of the model artifacts. Refer to ContainerDefinition for more details.
    */
  var ModelDataUrl: Url = js.native
}

object AutoMLContainerDefinition {
  @scala.inline
  def apply(Image: ContainerImage, ModelDataUrl: Url): AutoMLContainerDefinition = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any], ModelDataUrl = ModelDataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLContainerDefinition]
  }
  @scala.inline
  implicit class AutoMLContainerDefinitionOps[Self <: AutoMLContainerDefinition] (val x: Self) extends AnyVal {
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
    def setImage(value: ContainerImage): Self = this.set("Image", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelDataUrl(value: Url): Self = this.set("ModelDataUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironment(value: EnvironmentMap): Self = this.set("Environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("Environment", js.undefined)
  }
  
}

