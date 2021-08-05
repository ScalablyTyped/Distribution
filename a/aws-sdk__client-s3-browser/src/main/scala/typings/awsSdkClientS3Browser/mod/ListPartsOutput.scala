package typings.awsSdkClientS3Browser.mod

import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartsOutput
  extends StObject
     with typings.awsSdkClientS3Browser.typesListPartsOutputMod.ListPartsOutput
object ListPartsOutput {
  
  inline def apply($metadata: ResponseMetadata): ListPartsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsOutput]
  }
}
