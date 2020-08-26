package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetByteMatchSetResponse extends js.Object {
  /**
    * Information about the ByteMatchSet that you specified in the GetByteMatchSet request. For more information, see the following topics:    ByteMatchSet: Contains ByteMatchSetId, ByteMatchTuples, and Name     ByteMatchTuples: Contains an array of ByteMatchTuple objects. Each ByteMatchTuple object contains FieldToMatch, PositionalConstraint, TargetString, and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var ByteMatchSet: js.UndefOr[typings.awsSdk.wafMod.ByteMatchSet] = js.native
}

object GetByteMatchSetResponse {
  @scala.inline
  def apply(): GetByteMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetByteMatchSetResponse]
  }
  @scala.inline
  implicit class GetByteMatchSetResponseOps[Self <: GetByteMatchSetResponse] (val x: Self) extends AnyVal {
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
    def setByteMatchSet(value: ByteMatchSet): Self = this.set("ByteMatchSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByteMatchSet: Self = this.set("ByteMatchSet", js.undefined)
  }
  
}

