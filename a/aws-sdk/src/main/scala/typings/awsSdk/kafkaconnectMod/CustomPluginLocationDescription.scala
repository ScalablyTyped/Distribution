package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPluginLocationDescription extends StObject {
  
  /**
    * The S3 bucket Amazon Resource Name (ARN), file key, and object version of the plugin file stored in Amazon S3.
    */
  var s3Location: js.UndefOr[S3LocationDescription] = js.undefined
}
object CustomPluginLocationDescription {
  
  inline def apply(): CustomPluginLocationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPluginLocationDescription]
  }
  
  extension [Self <: CustomPluginLocationDescription](x: Self) {
    
    inline def setS3Location(value: S3LocationDescription): Self = StObject.set(x, "s3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "s3Location", js.undefined)
  }
}
