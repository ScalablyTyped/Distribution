package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EngineAttribute extends js.Object {
  /**
    * The name of the engine attribute. 
    */
  var Name: js.UndefOr[EngineAttributeName] = js.native
  /**
    * The value of the engine attribute. 
    */
  var Value: js.UndefOr[EngineAttributeValue] = js.native
}

object EngineAttribute {
  @scala.inline
  def apply(): EngineAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineAttribute]
  }
  @scala.inline
  implicit class EngineAttributeOps[Self <: EngineAttribute] (val x: Self) extends AnyVal {
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
    def setName(value: EngineAttributeName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setValue(value: EngineAttributeValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

