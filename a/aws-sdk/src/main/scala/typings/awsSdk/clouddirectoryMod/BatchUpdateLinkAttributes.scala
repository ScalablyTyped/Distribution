package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateLinkAttributes extends StObject {
  
  /**
    * The attributes update structure.
    */
  var AttributeUpdates: LinkAttributeUpdateList
  
  /**
    * Allows a typed link specifier to be accepted as input.
    */
  var TypedLinkSpecifier: typings.awsSdk.clouddirectoryMod.TypedLinkSpecifier
}
object BatchUpdateLinkAttributes {
  
  @scala.inline
  def apply(AttributeUpdates: LinkAttributeUpdateList, TypedLinkSpecifier: TypedLinkSpecifier): BatchUpdateLinkAttributes = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateLinkAttributes]
  }
  
  @scala.inline
  implicit class BatchUpdateLinkAttributesMutableBuilder[Self <: BatchUpdateLinkAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeUpdates(value: LinkAttributeUpdateList): Self = StObject.set(x, "AttributeUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUpdatesVarargs(value: LinkAttributeUpdate*): Self = StObject.set(x, "AttributeUpdates", js.Array(value :_*))
    
    @scala.inline
    def setTypedLinkSpecifier(value: TypedLinkSpecifier): Self = StObject.set(x, "TypedLinkSpecifier", value.asInstanceOf[js.Any])
  }
}
