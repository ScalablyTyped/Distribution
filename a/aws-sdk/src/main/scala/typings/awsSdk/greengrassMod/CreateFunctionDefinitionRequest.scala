package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFunctionDefinitionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  /**
    * Information about the initial version of the function definition.
    */
  var InitialVersion: js.UndefOr[FunctionDefinitionVersion] = js.native
  /**
    * The name of the function definition.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * Tag(s) to add to the new resource.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object CreateFunctionDefinitionRequest {
  @scala.inline
  def apply(): CreateFunctionDefinitionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFunctionDefinitionRequest]
  }
  @scala.inline
  implicit class CreateFunctionDefinitionRequestOps[Self <: CreateFunctionDefinitionRequest] (val x: Self) extends AnyVal {
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
    def setAmznClientToken(value: string): Self = this.set("AmznClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmznClientToken: Self = this.set("AmznClientToken", js.undefined)
    @scala.inline
    def setInitialVersion(value: FunctionDefinitionVersion): Self = this.set("InitialVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialVersion: Self = this.set("InitialVersion", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

