package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaId extends StObject {
  
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined
  
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.undefined
  
  var SchemaName: js.UndefOr[SchemaRegistryNameString] = js.undefined
}
object SchemaId {
  
  @scala.inline
  def apply(): SchemaId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaId]
  }
  
  @scala.inline
  implicit class SchemaIdMutableBuilder[Self <: SchemaId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: GlueResourceArn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaName(value: SchemaRegistryNameString): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
  }
}
