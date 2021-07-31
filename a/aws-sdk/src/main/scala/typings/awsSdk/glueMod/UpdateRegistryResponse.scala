package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRegistryResponse extends StObject {
  
  /**
    * The Amazon Resource name (ARN) of the updated registry.
    */
  var RegistryArn: js.UndefOr[GlueResourceArn] = js.undefined
  
  /**
    * The name of the updated registry.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined
}
object UpdateRegistryResponse {
  
  @scala.inline
  def apply(): UpdateRegistryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRegistryResponse]
  }
  
  @scala.inline
  implicit class UpdateRegistryResponseMutableBuilder[Self <: UpdateRegistryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistryArn(value: GlueResourceArn): Self = StObject.set(x, "RegistryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryArnUndefined: Self = StObject.set(x, "RegistryArn", js.undefined)
    
    @scala.inline
    def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
  }
}
