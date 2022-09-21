package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomArtifactConfigurationDescription extends StObject {
  
  /**
    *  UDF stands for user-defined functions. This type of artifact must be in an S3 bucket. A DEPENDENCY_JAR can be in either Maven or an S3 bucket.
    */
  var ArtifactType: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ArtifactType] = js.undefined
  
  /**
    * The parameters that are required to specify a Maven dependency.
    */
  var MavenReferenceDescription: js.UndefOr[MavenReference] = js.undefined
  
  var S3ContentLocationDescription: js.UndefOr[S3ContentLocation] = js.undefined
}
object CustomArtifactConfigurationDescription {
  
  inline def apply(): CustomArtifactConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomArtifactConfigurationDescription]
  }
  
  extension [Self <: CustomArtifactConfigurationDescription](x: Self) {
    
    inline def setArtifactType(value: ArtifactType): Self = StObject.set(x, "ArtifactType", value.asInstanceOf[js.Any])
    
    inline def setArtifactTypeUndefined: Self = StObject.set(x, "ArtifactType", js.undefined)
    
    inline def setMavenReferenceDescription(value: MavenReference): Self = StObject.set(x, "MavenReferenceDescription", value.asInstanceOf[js.Any])
    
    inline def setMavenReferenceDescriptionUndefined: Self = StObject.set(x, "MavenReferenceDescription", js.undefined)
    
    inline def setS3ContentLocationDescription(value: S3ContentLocation): Self = StObject.set(x, "S3ContentLocationDescription", value.asInstanceOf[js.Any])
    
    inline def setS3ContentLocationDescriptionUndefined: Self = StObject.set(x, "S3ContentLocationDescription", js.undefined)
  }
}
