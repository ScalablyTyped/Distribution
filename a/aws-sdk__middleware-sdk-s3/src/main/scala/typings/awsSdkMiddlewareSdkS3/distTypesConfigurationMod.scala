package typings.awsSdkMiddlewareSdkS3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConfigurationMod {
  
  @JSImport("@aws-sdk/middleware-sdk-s3/dist-types/configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveS3Config[T](input: T & S3InputConfig): T & S3ResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveS3Config")(input.asInstanceOf[js.Any]).asInstanceOf[T & S3ResolvedConfig]
  
  trait S3InputConfig extends StObject {
    
    /**
      * Whether multi-region access points (MRAP) should be disabled.
      */
    var disableMultiregionAccessPoints: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to force path style URLs for S3 objects
      * (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
      */
    var forcePathStyle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use the S3 Transfer Acceleration endpoint by default
      */
    var useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
  }
  object S3InputConfig {
    
    inline def apply(): S3InputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[S3InputConfig]
    }
    
    extension [Self <: S3InputConfig](x: Self) {
      
      inline def setDisableMultiregionAccessPoints(value: Boolean): Self = StObject.set(x, "disableMultiregionAccessPoints", value.asInstanceOf[js.Any])
      
      inline def setDisableMultiregionAccessPointsUndefined: Self = StObject.set(x, "disableMultiregionAccessPoints", js.undefined)
      
      inline def setForcePathStyle(value: Boolean): Self = StObject.set(x, "forcePathStyle", value.asInstanceOf[js.Any])
      
      inline def setForcePathStyleUndefined: Self = StObject.set(x, "forcePathStyle", js.undefined)
      
      inline def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseAccelerateEndpointUndefined: Self = StObject.set(x, "useAccelerateEndpoint", js.undefined)
    }
  }
  
  trait S3ResolvedConfig extends StObject {
    
    var disableMultiregionAccessPoints: Boolean
    
    var forcePathStyle: Boolean
    
    var useAccelerateEndpoint: Boolean
  }
  object S3ResolvedConfig {
    
    inline def apply(disableMultiregionAccessPoints: Boolean, forcePathStyle: Boolean, useAccelerateEndpoint: Boolean): S3ResolvedConfig = {
      val __obj = js.Dynamic.literal(disableMultiregionAccessPoints = disableMultiregionAccessPoints.asInstanceOf[js.Any], forcePathStyle = forcePathStyle.asInstanceOf[js.Any], useAccelerateEndpoint = useAccelerateEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[S3ResolvedConfig]
    }
    
    extension [Self <: S3ResolvedConfig](x: Self) {
      
      inline def setDisableMultiregionAccessPoints(value: Boolean): Self = StObject.set(x, "disableMultiregionAccessPoints", value.asInstanceOf[js.Any])
      
      inline def setForcePathStyle(value: Boolean): Self = StObject.set(x, "forcePathStyle", value.asInstanceOf[js.Any])
      
      inline def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
    }
  }
}
