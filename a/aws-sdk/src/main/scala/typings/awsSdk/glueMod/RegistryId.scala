package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistryId extends StObject {
  
  /**
    * Arn of the registry to be updated. One of RegistryArn or RegistryName has to be provided.
    */
  var RegistryArn: js.UndefOr[GlueResourceArn] = js.native
  
  /**
    * Name of the registry. Used only for lookup. One of RegistryArn or RegistryName has to be provided. 
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.native
}
object RegistryId {
  
  @scala.inline
  def apply(): RegistryId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistryId]
  }
  
  @scala.inline
  implicit class RegistryIdMutableBuilder[Self <: RegistryId] (val x: Self) extends AnyVal {
    
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
