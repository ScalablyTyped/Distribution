package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentVersionArtifactResponse extends StObject {
  
  /**
    * The URL of the artifact.
    */
  var preSignedUrl: NonEmptyString
}
object GetComponentVersionArtifactResponse {
  
  inline def apply(preSignedUrl: NonEmptyString): GetComponentVersionArtifactResponse = {
    val __obj = js.Dynamic.literal(preSignedUrl = preSignedUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentVersionArtifactResponse]
  }
  
  extension [Self <: GetComponentVersionArtifactResponse](x: Self) {
    
    inline def setPreSignedUrl(value: NonEmptyString): Self = StObject.set(x, "preSignedUrl", value.asInstanceOf[js.Any])
  }
}
