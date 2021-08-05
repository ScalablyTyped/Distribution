package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVersionNumber extends StObject {
  
  var LatestVersion: js.UndefOr[LatestSchemaVersionBoolean] = js.undefined
  
  var VersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
}
object SchemaVersionNumber {
  
  inline def apply(): SchemaVersionNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersionNumber]
  }
  
  extension [Self <: SchemaVersionNumber](x: Self) {
    
    inline def setLatestVersion(value: LatestSchemaVersionBoolean): Self = StObject.set(x, "LatestVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionUndefined: Self = StObject.set(x, "LatestVersion", js.undefined)
    
    inline def setVersionNumber(value: VersionLongNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
