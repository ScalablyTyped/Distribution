package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssociationStatusResult extends StObject {
  
  /**
    * Information about the association.
    */
  var AssociationDescription: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.AssociationDescription] = js.undefined
}
object UpdateAssociationStatusResult {
  
  inline def apply(): UpdateAssociationStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAssociationStatusResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAssociationStatusResult] (val x: Self) extends AnyVal {
    
    inline def setAssociationDescription(value: AssociationDescription): Self = StObject.set(x, "AssociationDescription", value.asInstanceOf[js.Any])
    
    inline def setAssociationDescriptionUndefined: Self = StObject.set(x, "AssociationDescription", js.undefined)
  }
}
