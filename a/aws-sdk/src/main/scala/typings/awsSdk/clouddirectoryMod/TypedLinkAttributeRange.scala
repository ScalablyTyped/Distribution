package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedLinkAttributeRange extends StObject {
  
  /**
    * The unique name of the typed link attribute.
    */
  var AttributeName: js.UndefOr[typings.awsSdk.clouddirectoryMod.AttributeName] = js.undefined
  
  /**
    * The range of attribute values that are being selected.
    */
  var Range: TypedAttributeValueRange
}
object TypedLinkAttributeRange {
  
  inline def apply(Range: TypedAttributeValueRange): TypedLinkAttributeRange = {
    val __obj = js.Dynamic.literal(Range = Range.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkAttributeRange]
  }
  
  extension [Self <: TypedLinkAttributeRange](x: Self) {
    
    inline def setAttributeName(value: AttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setRange(value: TypedAttributeValueRange): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
  }
}
