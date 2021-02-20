package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSchemaVersionsInput extends StObject {
  
  /**
    * This is a wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
    */
  var SchemaId: typings.awsSdk.glueMod.SchemaId = js.native
  
  /**
    * A version range may be supplied which may be of the format:   a single version number, 5   a range, 5-8 : deletes versions 5, 6, 7, 8  
    */
  var Versions: VersionsString = js.native
}
object DeleteSchemaVersionsInput {
  
  @scala.inline
  def apply(SchemaId: SchemaId, Versions: VersionsString): DeleteSchemaVersionsInput = {
    val __obj = js.Dynamic.literal(SchemaId = SchemaId.asInstanceOf[js.Any], Versions = Versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSchemaVersionsInput]
  }
  
  @scala.inline
  implicit class DeleteSchemaVersionsInputMutableBuilder[Self <: DeleteSchemaVersionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchemaId(value: SchemaId): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersions(value: VersionsString): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
  }
}
