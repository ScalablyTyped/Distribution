package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobManifestSpec extends StObject {
  
  /**
    * If the specified manifest object is in the S3BatchOperations_CSV_20180820 format, this element describes which columns contain the required data.
    */
  var Fields: js.UndefOr[JobManifestFieldList] = js.undefined
  
  /**
    * Indicates which of the available formats the specified manifest uses.
    */
  var Format: JobManifestFormat
}
object JobManifestSpec {
  
  inline def apply(Format: JobManifestFormat): JobManifestSpec = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobManifestSpec]
  }
  
  extension [Self <: JobManifestSpec](x: Self) {
    
    inline def setFields(value: JobManifestFieldList): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    inline def setFieldsVarargs(value: JobManifestFieldName*): Self = StObject.set(x, "Fields", js.Array(value :_*))
    
    inline def setFormat(value: JobManifestFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
  }
}
