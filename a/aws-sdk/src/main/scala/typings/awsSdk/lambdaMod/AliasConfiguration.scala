package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the alias.
    */
  var AliasArn: js.UndefOr[FunctionArn] = js.native
  /**
    * A description of the alias.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.native
  /**
    * The function version that the alias invokes.
    */
  var FunctionVersion: js.UndefOr[Version] = js.native
  /**
    * The name of the alias.
    */
  var Name: js.UndefOr[Alias] = js.native
  /**
    * A unique identifier that changes when you update the alias.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * The routing configuration of the alias.
    */
  var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.native
}

object AliasConfiguration {
  @scala.inline
  def apply(): AliasConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasConfiguration]
  }
  @scala.inline
  implicit class AliasConfigurationOps[Self <: AliasConfiguration] (val x: Self) extends AnyVal {
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
    def setAliasArn(value: FunctionArn): Self = this.set("AliasArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliasArn: Self = this.set("AliasArn", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setFunctionVersion(value: Version): Self = this.set("FunctionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionVersion: Self = this.set("FunctionVersion", js.undefined)
    @scala.inline
    def setName(value: Alias): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRevisionId(value: String): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("RevisionId", js.undefined)
    @scala.inline
    def setRoutingConfig(value: AliasRoutingConfiguration): Self = this.set("RoutingConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutingConfig: Self = this.set("RoutingConfig", js.undefined)
  }
  
}

