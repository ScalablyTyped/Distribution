package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRegistryResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the registry being deleted.
    */
  var RegistryArn: js.UndefOr[GlueResourceArn] = js.native
  
  /**
    * The name of the registry being deleted.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.native
  
  /**
    * The status of the registry. A successful operation will return the Deleting status.
    */
  var Status: js.UndefOr[RegistryStatus] = js.native
}
object DeleteRegistryResponse {
  
  @scala.inline
  def apply(): DeleteRegistryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRegistryResponse]
  }
  
  @scala.inline
  implicit class DeleteRegistryResponseMutableBuilder[Self <: DeleteRegistryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistryArn(value: GlueResourceArn): Self = StObject.set(x, "RegistryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryArnUndefined: Self = StObject.set(x, "RegistryArn", js.undefined)
    
    @scala.inline
    def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    @scala.inline
    def setStatus(value: RegistryStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
