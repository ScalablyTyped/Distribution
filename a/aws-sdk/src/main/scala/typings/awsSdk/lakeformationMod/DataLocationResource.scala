package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataLocationResource extends StObject {
  
  /**
    * The identifier for the Data Catalog where the location is registered with AWS Lake Formation. By default, it is the account ID of the caller.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
    */
  var ResourceArn: ResourceArnString
}
object DataLocationResource {
  
  @scala.inline
  def apply(ResourceArn: ResourceArnString): DataLocationResource = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLocationResource]
  }
  
  @scala.inline
  implicit class DataLocationResourceMutableBuilder[Self <: DataLocationResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
