package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeSummary extends js.Object {
  /**
    * The ID of the default version of the type. The default version is used when the type version is not specified. To set the default version of a type, use  SetTypeDefaultVersion . 
    */
  var DefaultVersionId: js.UndefOr[TypeVersionId] = js.native
  /**
    * The description of the type.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  /**
    * When the current default version of the type was registered.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.native
  /**
    * The kind of type.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the type.
    */
  var TypeArn: js.UndefOr[typings.awsSdk.cloudformationMod.TypeArn] = js.native
  /**
    * The name of the type.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.native
}

object TypeSummary {
  @scala.inline
  def apply(): TypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeSummary]
  }
  @scala.inline
  implicit class TypeSummaryOps[Self <: TypeSummary] (val x: Self) extends AnyVal {
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
    def setDefaultVersionId(value: TypeVersionId): Self = this.set("DefaultVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVersionId: Self = this.set("DefaultVersionId", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setLastUpdated(value: Timestamp): Self = this.set("LastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdated: Self = this.set("LastUpdated", js.undefined)
    @scala.inline
    def setType(value: RegistryType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setTypeArn(value: TypeArn): Self = this.set("TypeArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeArn: Self = this.set("TypeArn", js.undefined)
    @scala.inline
    def setTypeName(value: TypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeName: Self = this.set("TypeName", js.undefined)
  }
  
}

