package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEntityRequest extends StObject {
  
  /**
    * Required. The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typings.awsSdk.marketplacecatalogMod.Catalog = js.native
  
  /**
    * Required. The unique ID of the entity to describe.
    */
  var EntityId: ResourceId = js.native
}
object DescribeEntityRequest {
  
  @scala.inline
  def apply(Catalog: Catalog, EntityId: ResourceId): DescribeEntityRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEntityRequest]
  }
  
  @scala.inline
  implicit class DescribeEntityRequestMutableBuilder[Self <: DescribeEntityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalog(value: Catalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityId(value: ResourceId): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
  }
}
