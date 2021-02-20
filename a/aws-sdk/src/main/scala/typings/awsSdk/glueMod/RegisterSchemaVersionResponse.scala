package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterSchemaVersionResponse extends StObject {
  
  /**
    * The unique ID that represents the version of this schema.
    */
  var SchemaVersionId: js.UndefOr[SchemaVersionIdString] = js.native
  
  /**
    * The status of the schema version.
    */
  var Status: js.UndefOr[SchemaVersionStatus] = js.native
  
  /**
    * The version of this schema (for sync flow only, in case this is the first version).
    */
  var VersionNumber: js.UndefOr[VersionLongNumber] = js.native
}
object RegisterSchemaVersionResponse {
  
  @scala.inline
  def apply(): RegisterSchemaVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterSchemaVersionResponse]
  }
  
  @scala.inline
  implicit class RegisterSchemaVersionResponseMutableBuilder[Self <: RegisterSchemaVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchemaVersionId(value: SchemaVersionIdString): Self = StObject.set(x, "SchemaVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersionIdUndefined: Self = StObject.set(x, "SchemaVersionId", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionLongNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
