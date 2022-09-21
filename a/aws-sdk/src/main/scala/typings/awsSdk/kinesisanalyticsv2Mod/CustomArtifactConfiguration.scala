package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomArtifactConfiguration extends StObject {
  
  /**
    *  UDF stands for user-defined functions. This type of artifact must be in an S3 bucket. A DEPENDENCY_JAR can be in either Maven or an S3 bucket.
    */
  var ArtifactType: typings.awsSdk.kinesisanalyticsv2Mod.ArtifactType
  
  /**
    * The parameters required to fully specify a Maven reference.
    */
  var MavenReference: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.MavenReference] = js.undefined
  
  var S3ContentLocation: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.S3ContentLocation] = js.undefined
}
object CustomArtifactConfiguration {
  
  inline def apply(ArtifactType: ArtifactType): CustomArtifactConfiguration = {
    val __obj = js.Dynamic.literal(ArtifactType = ArtifactType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomArtifactConfiguration]
  }
  
  extension [Self <: CustomArtifactConfiguration](x: Self) {
    
    inline def setArtifactType(value: ArtifactType): Self = StObject.set(x, "ArtifactType", value.asInstanceOf[js.Any])
    
    inline def setMavenReference(value: MavenReference): Self = StObject.set(x, "MavenReference", value.asInstanceOf[js.Any])
    
    inline def setMavenReferenceUndefined: Self = StObject.set(x, "MavenReference", js.undefined)
    
    inline def setS3ContentLocation(value: S3ContentLocation): Self = StObject.set(x, "S3ContentLocation", value.asInstanceOf[js.Any])
    
    inline def setS3ContentLocationUndefined: Self = StObject.set(x, "S3ContentLocation", js.undefined)
  }
}
