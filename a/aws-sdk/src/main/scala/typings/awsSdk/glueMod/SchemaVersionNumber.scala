package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaVersionNumber extends StObject {
  
  var LatestVersion: js.UndefOr[LatestSchemaVersionBoolean] = js.native
  
  var VersionNumber: js.UndefOr[VersionLongNumber] = js.native
}
object SchemaVersionNumber {
  
  @scala.inline
  def apply(): SchemaVersionNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersionNumber]
  }
  
  @scala.inline
  implicit class SchemaVersionNumberMutableBuilder[Self <: SchemaVersionNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatestVersion(value: LatestSchemaVersionBoolean): Self = StObject.set(x, "LatestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestVersionUndefined: Self = StObject.set(x, "LatestVersion", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionLongNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
