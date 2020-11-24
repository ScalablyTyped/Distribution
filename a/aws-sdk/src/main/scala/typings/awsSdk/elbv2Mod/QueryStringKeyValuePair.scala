package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryStringKeyValuePair extends js.Object {
  
  /**
    * The key. You can omit the key.
    */
  var Key: js.UndefOr[StringValue] = js.native
  
  /**
    * The value.
    */
  var Value: js.UndefOr[StringValue] = js.native
}
object QueryStringKeyValuePair {
  
  @scala.inline
  def apply(): QueryStringKeyValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStringKeyValuePair]
  }
  
  @scala.inline
  implicit class QueryStringKeyValuePairOps[Self <: QueryStringKeyValuePair] (val x: Self) extends AnyVal {
    
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
    def setKey(value: StringValue): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setValue(value: StringValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
