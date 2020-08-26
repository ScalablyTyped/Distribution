package typings.awsSdkClientXrayNode.typesSamplingRuleUpdateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSamplingRuleUpdate extends SamplingRuleUpdate {
  /**
    * <p>Matches attributes derived from the request.</p>
    */
  @JSName("Attributes")
  var Attributes_UnmarshalledSamplingRuleUpdate: js.UndefOr[StringDictionary[String]] = js.native
}

object UnmarshalledSamplingRuleUpdate {
  @scala.inline
  def apply(): UnmarshalledSamplingRuleUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSamplingRuleUpdate]
  }
  @scala.inline
  implicit class UnmarshalledSamplingRuleUpdateOps[Self <: UnmarshalledSamplingRuleUpdate] (val x: Self) extends AnyVal {
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
    def setAttributes(value: StringDictionary[String]): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
  }
  
}

