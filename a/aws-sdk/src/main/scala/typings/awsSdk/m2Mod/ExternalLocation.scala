package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalLocation extends StObject {
  
  /**
    * The URI of the Amazon S3 bucket.
    */
  var s3Location: js.UndefOr[String2000] = js.undefined
}
object ExternalLocation {
  
  inline def apply(): ExternalLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalLocation]
  }
  
  extension [Self <: ExternalLocation](x: Self) {
    
    inline def setS3Location(value: String2000): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
  }
}
