package typings.awsSdkClientS3Browser.mod

import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectOutput
  extends StObject
     with typings.awsSdkClientS3Browser.typesPutObjectOutputMod.PutObjectOutput
object PutObjectOutput {
  
  inline def apply($metadata: ResponseMetadata): PutObjectOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectOutput]
  }
}
