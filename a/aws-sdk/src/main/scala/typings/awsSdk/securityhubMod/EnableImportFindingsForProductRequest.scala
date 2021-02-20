package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableImportFindingsForProductRequest extends StObject {
  
  /**
    * The ARN of the product to enable the integration for.
    */
  var ProductArn: NonEmptyString = js.native
}
object EnableImportFindingsForProductRequest {
  
  @scala.inline
  def apply(ProductArn: NonEmptyString): EnableImportFindingsForProductRequest = {
    val __obj = js.Dynamic.literal(ProductArn = ProductArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableImportFindingsForProductRequest]
  }
  
  @scala.inline
  implicit class EnableImportFindingsForProductRequestMutableBuilder[Self <: EnableImportFindingsForProductRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductArn(value: NonEmptyString): Self = StObject.set(x, "ProductArn", value.asInstanceOf[js.Any])
  }
}
