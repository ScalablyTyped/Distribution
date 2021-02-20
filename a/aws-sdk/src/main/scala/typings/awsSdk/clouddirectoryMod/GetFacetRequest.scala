package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFacetRequest extends StObject {
  
  /**
    * The name of the facet to retrieve.
    */
  var Name: FacetName = js.native
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Facet. For more information, see arns.
    */
  var SchemaArn: Arn = js.native
}
object GetFacetRequest {
  
  @scala.inline
  def apply(Name: FacetName, SchemaArn: Arn): GetFacetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFacetRequest]
  }
  
  @scala.inline
  implicit class GetFacetRequestMutableBuilder[Self <: GetFacetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: FacetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
