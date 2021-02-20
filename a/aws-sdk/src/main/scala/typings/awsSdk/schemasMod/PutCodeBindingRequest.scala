package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutCodeBindingRequest extends StObject {
  
  /**
    * The language of the code binding.
    */
  var Language: string = js.native
  
  /**
    * The name of the registry.
    */
  var RegistryName: string = js.native
  
  /**
    * The name of the schema.
    */
  var SchemaName: string = js.native
  
  /**
    * Specifying this limits the results to only this schema version.
    */
  var SchemaVersion: js.UndefOr[string] = js.native
}
object PutCodeBindingRequest {
  
  @scala.inline
  def apply(Language: string, RegistryName: string, SchemaName: string): PutCodeBindingRequest = {
    val __obj = js.Dynamic.literal(Language = Language.asInstanceOf[js.Any], RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutCodeBindingRequest]
  }
  
  @scala.inline
  implicit class PutCodeBindingRequestMutableBuilder[Self <: PutCodeBindingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: string): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersion(value: string): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
  }
}
