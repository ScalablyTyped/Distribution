package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateLinkAttributes extends js.Object {
  
  /**
    * The attributes update structure.
    */
  var AttributeUpdates: LinkAttributeUpdateList = js.native
  
  /**
    * Allows a typed link specifier to be accepted as input.
    */
  var TypedLinkSpecifier: typings.awsSdk.clouddirectoryMod.TypedLinkSpecifier = js.native
}
object BatchUpdateLinkAttributes {
  
  @scala.inline
  def apply(AttributeUpdates: LinkAttributeUpdateList, TypedLinkSpecifier: TypedLinkSpecifier): BatchUpdateLinkAttributes = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateLinkAttributes]
  }
  
  @scala.inline
  implicit class BatchUpdateLinkAttributesOps[Self <: BatchUpdateLinkAttributes] (val x: Self) extends AnyVal {
    
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
    def setAttributeUpdatesVarargs(value: LinkAttributeUpdate*): Self = this.set("AttributeUpdates", js.Array(value :_*))
    
    @scala.inline
    def setAttributeUpdates(value: LinkAttributeUpdateList): Self = this.set("AttributeUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypedLinkSpecifier(value: TypedLinkSpecifier): Self = this.set("TypedLinkSpecifier", value.asInstanceOf[js.Any])
  }
}
