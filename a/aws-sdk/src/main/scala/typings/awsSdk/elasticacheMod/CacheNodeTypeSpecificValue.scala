package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheNodeTypeSpecificValue extends js.Object {
  
  /**
    * The cache node type for which this value applies.
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  
  /**
    * The value for the cache node type.
    */
  var Value: js.UndefOr[String] = js.native
}
object CacheNodeTypeSpecificValue {
  
  @scala.inline
  def apply(): CacheNodeTypeSpecificValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheNodeTypeSpecificValue]
  }
  
  @scala.inline
  implicit class CacheNodeTypeSpecificValueOps[Self <: CacheNodeTypeSpecificValue] (val x: Self) extends AnyVal {
    
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
    def setCacheNodeType(value: String): Self = this.set("CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeType: Self = this.set("CacheNodeType", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
