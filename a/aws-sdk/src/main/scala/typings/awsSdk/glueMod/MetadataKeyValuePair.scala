package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataKeyValuePair extends js.Object {
  
  /**
    * A metadata key.
    */
  var MetadataKey: js.UndefOr[MetadataKeyString] = js.native
  
  /**
    * A metadata key’s corresponding value.
    */
  var MetadataValue: js.UndefOr[MetadataValueString] = js.native
}
object MetadataKeyValuePair {
  
  @scala.inline
  def apply(): MetadataKeyValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataKeyValuePair]
  }
  
  @scala.inline
  implicit class MetadataKeyValuePairOps[Self <: MetadataKeyValuePair] (val x: Self) extends AnyVal {
    
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
    def setMetadataKey(value: MetadataKeyString): Self = this.set("MetadataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataKey: Self = this.set("MetadataKey", js.undefined)
    
    @scala.inline
    def setMetadataValue(value: MetadataValueString): Self = this.set("MetadataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataValue: Self = this.set("MetadataValue", js.undefined)
  }
}
