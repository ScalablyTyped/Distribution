package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolchainSource extends StObject {
  
  /**
    * The Amazon S3 bucket where the toolchain template file provided with the project request is stored.
    */
  var s3: S3Location
}
object ToolchainSource {
  
  inline def apply(s3: S3Location): ToolchainSource = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolchainSource]
  }
  
  extension [Self <: ToolchainSource](x: Self) {
    
    inline def setS3(value: S3Location): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
  }
}
