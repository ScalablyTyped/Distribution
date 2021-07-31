package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTypedLinkFacetRequest extends StObject {
  
  /**
    *  Facet structure that is associated with the typed link facet.
    */
  var Facet: TypedLinkFacet
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn
}
object CreateTypedLinkFacetRequest {
  
  @scala.inline
  def apply(Facet: TypedLinkFacet, SchemaArn: Arn): CreateTypedLinkFacetRequest = {
    val __obj = js.Dynamic.literal(Facet = Facet.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTypedLinkFacetRequest]
  }
  
  @scala.inline
  implicit class CreateTypedLinkFacetRequestMutableBuilder[Self <: CreateTypedLinkFacetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacet(value: TypedLinkFacet): Self = StObject.set(x, "Facet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
