package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmappedAttribute extends js.Object {
  /**
    *  The specific attribute that has been extracted but not mapped to an entity. 
    */
  var Attribute: js.UndefOr[typings.awsSdk.comprehendmedicalMod.Attribute] = js.native
  /**
    *  The type of the attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY", "TEST_AND_TREATMENT_PROCEDURE" or "PROTECTED_HEALTH_INFORMATION". 
    */
  var Type: js.UndefOr[EntityType] = js.native
}

object UnmappedAttribute {
  @scala.inline
  def apply(): UnmappedAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmappedAttribute]
  }
  @scala.inline
  implicit class UnmappedAttributeOps[Self <: UnmappedAttribute] (val x: Self) extends AnyVal {
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
    def setAttribute(value: Attribute): Self = this.set("Attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribute: Self = this.set("Attribute", js.undefined)
    @scala.inline
    def setType(value: EntityType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

