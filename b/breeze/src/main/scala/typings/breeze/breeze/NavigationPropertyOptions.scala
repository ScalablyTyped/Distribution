package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationPropertyOptions extends js.Object {
  var associationName: js.UndefOr[String] = js.native
  var entityTypeName: String = js.native
  var foreignKeyNames: js.UndefOr[js.Array[String]] = js.native
  var foreignKeyNamesOnServer: js.UndefOr[js.Array[String]] = js.native
  var isScalar: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var nameOnServer: js.UndefOr[String] = js.native
  var validators: js.UndefOr[js.Array[Validator]] = js.native
}

object NavigationPropertyOptions {
  @scala.inline
  def apply(entityTypeName: String): NavigationPropertyOptions = {
    val __obj = js.Dynamic.literal(entityTypeName = entityTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationPropertyOptions]
  }
  @scala.inline
  implicit class NavigationPropertyOptionsOps[Self <: NavigationPropertyOptions] (val x: Self) extends AnyVal {
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
    def setEntityTypeName(value: String): Self = this.set("entityTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssociationName(value: String): Self = this.set("associationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationName: Self = this.set("associationName", js.undefined)
    @scala.inline
    def setForeignKeyNamesVarargs(value: String*): Self = this.set("foreignKeyNames", js.Array(value :_*))
    @scala.inline
    def setForeignKeyNames(value: js.Array[String]): Self = this.set("foreignKeyNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForeignKeyNames: Self = this.set("foreignKeyNames", js.undefined)
    @scala.inline
    def setForeignKeyNamesOnServerVarargs(value: String*): Self = this.set("foreignKeyNamesOnServer", js.Array(value :_*))
    @scala.inline
    def setForeignKeyNamesOnServer(value: js.Array[String]): Self = this.set("foreignKeyNamesOnServer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForeignKeyNamesOnServer: Self = this.set("foreignKeyNamesOnServer", js.undefined)
    @scala.inline
    def setIsScalar(value: Boolean): Self = this.set("isScalar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsScalar: Self = this.set("isScalar", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameOnServer(value: String): Self = this.set("nameOnServer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameOnServer: Self = this.set("nameOnServer", js.undefined)
    @scala.inline
    def setValidatorsVarargs(value: Validator*): Self = this.set("validators", js.Array(value :_*))
    @scala.inline
    def setValidators(value: js.Array[Validator]): Self = this.set("validators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidators: Self = this.set("validators", js.undefined)
  }
  
}

