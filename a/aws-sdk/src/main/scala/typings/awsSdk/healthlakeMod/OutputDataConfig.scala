package typings.awsSdk.healthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputDataConfig extends StObject {
  
  /**
    *  The output data configuration that was supplied when the export job was created. 
    */
  var S3Configuration: js.UndefOr[typings.awsSdk.healthlakeMod.S3Configuration] = js.undefined
}
object OutputDataConfig {
  
  inline def apply(): OutputDataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDataConfig]
  }
  
  extension [Self <: OutputDataConfig](x: Self) {
    
    inline def setS3Configuration(value: S3Configuration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
    
    inline def setS3ConfigurationUndefined: Self = StObject.set(x, "S3Configuration", js.undefined)
  }
}
