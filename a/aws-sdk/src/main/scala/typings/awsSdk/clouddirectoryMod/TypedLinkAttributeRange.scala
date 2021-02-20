package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedLinkAttributeRange extends StObject {
  
  /**
    * The unique name of the typed link attribute.
    */
  var AttributeName: js.UndefOr[typings.awsSdk.clouddirectoryMod.AttributeName] = js.native
  
  /**
    * The range of attribute values that are being selected.
    */
  var Range: TypedAttributeValueRange = js.native
}
object TypedLinkAttributeRange {
  
  @scala.inline
  def apply(Range: TypedAttributeValueRange): TypedLinkAttributeRange = {
    val __obj = js.Dynamic.literal(Range = Range.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkAttributeRange]
  }
  
  @scala.inline
  implicit class TypedLinkAttributeRangeMutableBuilder[Self <: TypedLinkAttributeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: AttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    @scala.inline
    def setRange(value: TypedAttributeValueRange): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
  }
}
