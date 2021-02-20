package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAssociationResult extends StObject {
  
  /**
    * Information about the association.
    */
  var AssociationDescription: js.UndefOr[typings.awsSdk.ssmMod.AssociationDescription] = js.native
}
object DescribeAssociationResult {
  
  @scala.inline
  def apply(): DescribeAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAssociationResult]
  }
  
  @scala.inline
  implicit class DescribeAssociationResultMutableBuilder[Self <: DescribeAssociationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationDescription(value: AssociationDescription): Self = StObject.set(x, "AssociationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationDescriptionUndefined: Self = StObject.set(x, "AssociationDescription", js.undefined)
  }
}
