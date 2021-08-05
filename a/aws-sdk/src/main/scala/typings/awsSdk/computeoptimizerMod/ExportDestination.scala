package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDestination extends StObject {
  
  /**
    * An object that describes the destination Amazon Simple Storage Service (Amazon S3) bucket name and object keys of a recommendations export file, and its associated metadata file.
    */
  var s3: js.UndefOr[S3Destination] = js.undefined
}
object ExportDestination {
  
  inline def apply(): ExportDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportDestination]
  }
  
  extension [Self <: ExportDestination](x: Self) {
    
    inline def setS3(value: S3Destination): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
