package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParallelDataConfig extends StObject {
  
  /**
    * The format of the parallel data input file.
    */
  var Format: ParallelDataFormat
  
  /**
    * The URI of the Amazon S3 folder that contains the parallel data input file. The folder must be in the same Region as the API endpoint you are calling.
    */
  var S3Uri: typings.awsSdk.clientsTranslateMod.S3Uri
}
object ParallelDataConfig {
  
  inline def apply(Format: ParallelDataFormat, S3Uri: S3Uri): ParallelDataConfig = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelDataConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParallelDataConfig] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: ParallelDataFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
