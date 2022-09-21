package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentVersionArtifactRequest extends StObject {
  
  /**
    * The ARN of the component version. Specify the ARN of a public or a Lambda component version.
    */
  var arn: ComponentVersionARN
  
  /**
    * The name of the artifact. You can use the GetComponent operation to download the component recipe, which includes the URI of the artifact. The artifact name is the section of the URI after the scheme. For example, in the artifact URI greengrass:SomeArtifact.zip, the artifact name is SomeArtifact.zip.
    */
  var artifactName: NonEmptyString
}
object GetComponentVersionArtifactRequest {
  
  inline def apply(arn: ComponentVersionARN, artifactName: NonEmptyString): GetComponentVersionArtifactRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], artifactName = artifactName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentVersionArtifactRequest]
  }
  
  extension [Self <: GetComponentVersionArtifactRequest](x: Self) {
    
    inline def setArn(value: ComponentVersionARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArtifactName(value: NonEmptyString): Self = StObject.set(x, "artifactName", value.asInstanceOf[js.Any])
  }
}
