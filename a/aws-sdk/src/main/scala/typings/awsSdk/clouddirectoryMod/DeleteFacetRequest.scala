package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFacetRequest extends StObject {
  
  /**
    * The name of the facet to delete.
    */
  var Name: FacetName = js.native
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Facet. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}
object DeleteFacetRequest {
  
  @scala.inline
  def apply(Name: FacetName, SchemaArn: Arn): DeleteFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFacetRequest]
  }
  
  @scala.inline
  implicit class DeleteFacetRequestMutableBuilder[Self <: DeleteFacetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: FacetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
