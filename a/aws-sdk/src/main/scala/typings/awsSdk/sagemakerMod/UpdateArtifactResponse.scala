package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateArtifactResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the artifact.
    */
  var ArtifactArn: js.UndefOr[typings.awsSdk.sagemakerMod.ArtifactArn] = js.undefined
}
object UpdateArtifactResponse {
  
  inline def apply(): UpdateArtifactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateArtifactResponse]
  }
  
  extension [Self <: UpdateArtifactResponse](x: Self) {
    
    inline def setArtifactArn(value: ArtifactArn): Self = StObject.set(x, "ArtifactArn", value.asInstanceOf[js.Any])
    
    inline def setArtifactArnUndefined: Self = StObject.set(x, "ArtifactArn", js.undefined)
  }
}
