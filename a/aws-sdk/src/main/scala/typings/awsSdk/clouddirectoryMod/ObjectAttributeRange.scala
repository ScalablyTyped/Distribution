package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectAttributeRange extends js.Object {
  
  /**
    * The key of the attribute that the attribute range covers.
    */
  var AttributeKey: js.UndefOr[typings.awsSdk.clouddirectoryMod.AttributeKey] = js.native
  
  /**
    * The range of attribute values being selected.
    */
  var Range: js.UndefOr[TypedAttributeValueRange] = js.native
}
object ObjectAttributeRange {
  
  @scala.inline
  def apply(): ObjectAttributeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectAttributeRange]
  }
  
  @scala.inline
  implicit class ObjectAttributeRangeOps[Self <: ObjectAttributeRange] (val x: Self) extends AnyVal {
    
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
    def setAttributeKey(value: AttributeKey): Self = this.set("AttributeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeKey: Self = this.set("AttributeKey", js.undefined)
    
    @scala.inline
    def setRange(value: TypedAttributeValueRange): Self = this.set("Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("Range", js.undefined)
  }
}
