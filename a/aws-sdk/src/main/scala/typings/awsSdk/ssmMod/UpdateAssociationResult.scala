package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAssociationResult extends StObject {
  
  /**
    * The description of the association that was updated.
    */
  var AssociationDescription: js.UndefOr[typings.awsSdk.ssmMod.AssociationDescription] = js.native
}
object UpdateAssociationResult {
  
  @scala.inline
  def apply(): UpdateAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAssociationResult]
  }
  
  @scala.inline
  implicit class UpdateAssociationResultMutableBuilder[Self <: UpdateAssociationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationDescription(value: AssociationDescription): Self = StObject.set(x, "AssociationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationDescriptionUndefined: Self = StObject.set(x, "AssociationDescription", js.undefined)
  }
}
