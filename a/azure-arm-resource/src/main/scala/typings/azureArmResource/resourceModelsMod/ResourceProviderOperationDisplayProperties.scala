package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceProviderOperationDisplayProperties extends js.Object {
  /**
    * Operation description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Resource provider operation.
    */
  var operation: js.UndefOr[String] = js.native
  /**
    * Operation provider.
    */
  var provider: js.UndefOr[String] = js.native
  /**
    * Operation description.
    */
  var publisher: js.UndefOr[String] = js.native
  /**
    * Operation resource.
    */
  var resource: js.UndefOr[String] = js.native
}

object ResourceProviderOperationDisplayProperties {
  @scala.inline
  def apply(): ResourceProviderOperationDisplayProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceProviderOperationDisplayProperties]
  }
  @scala.inline
  implicit class ResourceProviderOperationDisplayPropertiesOps[Self <: ResourceProviderOperationDisplayProperties] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

