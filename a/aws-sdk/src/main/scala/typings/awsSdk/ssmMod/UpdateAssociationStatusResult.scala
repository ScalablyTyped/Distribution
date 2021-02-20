package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAssociationStatusResult extends StObject {
  
  /**
    * Information about the association.
    */
  var AssociationDescription: js.UndefOr[typings.awsSdk.ssmMod.AssociationDescription] = js.native
}
object UpdateAssociationStatusResult {
  
  @scala.inline
  def apply(): UpdateAssociationStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAssociationStatusResult]
  }
  
  @scala.inline
  implicit class UpdateAssociationStatusResultMutableBuilder[Self <: UpdateAssociationStatusResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationDescription(value: AssociationDescription): Self = StObject.set(x, "AssociationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationDescriptionUndefined: Self = StObject.set(x, "AssociationDescription", js.undefined)
  }
}
