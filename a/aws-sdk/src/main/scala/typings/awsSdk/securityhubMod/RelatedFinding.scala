package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelatedFinding extends StObject {
  
  /**
    * The product-generated identifier for a related finding.
    */
  var Id: NonEmptyString = js.native
  
  /**
    * The ARN of the product that generated a related finding.
    */
  var ProductArn: NonEmptyString = js.native
}
object RelatedFinding {
  
  @scala.inline
  def apply(Id: NonEmptyString, ProductArn: NonEmptyString): RelatedFinding = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ProductArn = ProductArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedFinding]
  }
  
  @scala.inline
  implicit class RelatedFindingMutableBuilder[Self <: RelatedFinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductArn(value: NonEmptyString): Self = StObject.set(x, "ProductArn", value.asInstanceOf[js.Any])
  }
}
