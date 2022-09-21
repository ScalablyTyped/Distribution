package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeArtifactRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the artifact to describe.
    */
  var ArtifactArn: typings.awsSdk.sagemakerMod.ArtifactArn
}
object DescribeArtifactRequest {
  
  inline def apply(ArtifactArn: ArtifactArn): DescribeArtifactRequest = {
    val __obj = js.Dynamic.literal(ArtifactArn = ArtifactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeArtifactRequest]
  }
  
  extension [Self <: DescribeArtifactRequest](x: Self) {
    
    inline def setArtifactArn(value: ArtifactArn): Self = StObject.set(x, "ArtifactArn", value.asInstanceOf[js.Any])
  }
}
