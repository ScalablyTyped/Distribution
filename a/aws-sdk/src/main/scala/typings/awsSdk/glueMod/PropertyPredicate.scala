package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyPredicate extends js.Object {
  
  /**
    * The comparator used to compare this property to others.
    */
  var Comparator: js.UndefOr[typings.awsSdk.glueMod.Comparator] = js.native
  
  /**
    * The key of the property.
    */
  var Key: js.UndefOr[ValueString] = js.native
  
  /**
    * The value of the property.
    */
  var Value: js.UndefOr[ValueString] = js.native
}
object PropertyPredicate {
  
  @scala.inline
  def apply(): PropertyPredicate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyPredicate]
  }
  
  @scala.inline
  implicit class PropertyPredicateOps[Self <: PropertyPredicate] (val x: Self) extends AnyVal {
    
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
    def setComparator(value: Comparator): Self = this.set("Comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparator: Self = this.set("Comparator", js.undefined)
    
    @scala.inline
    def setKey(value: ValueString): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setValue(value: ValueString): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
