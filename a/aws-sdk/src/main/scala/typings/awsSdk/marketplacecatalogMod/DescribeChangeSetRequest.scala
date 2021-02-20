package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChangeSetRequest extends StObject {
  
  /**
    * Required. The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typings.awsSdk.marketplacecatalogMod.Catalog = js.native
  
  /**
    * Required. The unique identifier for the StartChangeSet request that you want to describe the details for.
    */
  var ChangeSetId: ResourceId = js.native
}
object DescribeChangeSetRequest {
  
  @scala.inline
  def apply(Catalog: Catalog, ChangeSetId: ResourceId): DescribeChangeSetRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], ChangeSetId = ChangeSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChangeSetRequest]
  }
  
  @scala.inline
  implicit class DescribeChangeSetRequestMutableBuilder[Self <: DescribeChangeSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalog(value: Catalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetId(value: ResourceId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
  }
}
