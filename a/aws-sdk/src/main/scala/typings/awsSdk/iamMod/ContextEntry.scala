package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextEntry extends js.Object {
  
  /**
    * The full name of a condition context key, including the service prefix. For example, aws:SourceIp or s3:VersionId.
    */
  var ContextKeyName: js.UndefOr[ContextKeyNameType] = js.native
  
  /**
    * The data type of the value (or values) specified in the ContextKeyValues parameter.
    */
  var ContextKeyType: js.UndefOr[ContextKeyTypeEnum] = js.native
  
  /**
    * The value (or values, if the condition context key supports multiple values) to provide to the simulation when the key is referenced by a Condition element in an input policy.
    */
  var ContextKeyValues: js.UndefOr[ContextKeyValueListType] = js.native
}
object ContextEntry {
  
  @scala.inline
  def apply(): ContextEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextEntry]
  }
  
  @scala.inline
  implicit class ContextEntryOps[Self <: ContextEntry] (val x: Self) extends AnyVal {
    
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
    def setContextKeyName(value: ContextKeyNameType): Self = this.set("ContextKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextKeyName: Self = this.set("ContextKeyName", js.undefined)
    
    @scala.inline
    def setContextKeyType(value: ContextKeyTypeEnum): Self = this.set("ContextKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextKeyType: Self = this.set("ContextKeyType", js.undefined)
    
    @scala.inline
    def setContextKeyValuesVarargs(value: ContextKeyValueType*): Self = this.set("ContextKeyValues", js.Array(value :_*))
    
    @scala.inline
    def setContextKeyValues(value: ContextKeyValueListType): Self = this.set("ContextKeyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextKeyValues: Self = this.set("ContextKeyValues", js.undefined)
  }
}
