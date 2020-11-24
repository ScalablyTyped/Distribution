package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attribute extends js.Object {
  
  /**
    * 
    */
  var AlternateNameEncoding: js.UndefOr[String] = js.native
  
  /**
    * 
    */
  var AlternateValueEncoding: js.UndefOr[String] = js.native
  
  /**
    * The name of the attribute.
    */
  var Name: String = js.native
  
  /**
    * The value of the attribute.
    */
  var Value: String = js.native
}
object Attribute {
  
  @scala.inline
  def apply(Name: String, Value: String): Attribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit class AttributeOps[Self <: Attribute] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateNameEncoding(value: String): Self = this.set("AlternateNameEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateNameEncoding: Self = this.set("AlternateNameEncoding", js.undefined)
    
    @scala.inline
    def setAlternateValueEncoding(value: String): Self = this.set("AlternateValueEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateValueEncoding: Self = this.set("AlternateValueEncoding", js.undefined)
  }
}
