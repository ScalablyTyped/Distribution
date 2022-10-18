package typings.awsSdkTypes

import typings.awsSdkTypes.awsSdkTypesStrings.sigv4
import typings.awsSdkTypes.awsSdkTypesStrings.sigv4a
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAuthMod {
  
  trait AuthScheme extends StObject {
    
    /**
      * @example "sigv4a" or "sigv4"
      */
    var name: sigv4 | sigv4a | String
    
    var properties: Record[String, Any]
    
    /**
      * @example "s3"
      */
    var signingName: String
    
    /**
      * @example "us-east-1"
      */
    var signingRegion: String
    
    /**
      * TODO usage?
      */
    var signingRegionSet: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @deprecated this field was renamed to signingRegion.
      */
    var signingScope: js.UndefOr[scala.Nothing] = js.undefined
  }
  object AuthScheme {
    
    inline def apply(
      name: sigv4 | sigv4a | String,
      properties: Record[String, Any],
      signingName: String,
      signingRegion: String
    ): AuthScheme = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], signingName = signingName.asInstanceOf[js.Any], signingRegion = signingRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthScheme]
    }
    
    extension [Self <: AuthScheme](x: Self) {
      
      inline def setName(value: sigv4 | sigv4a | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Record[String, Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      inline def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
      
      inline def setSigningRegionSet(value: js.Array[String]): Self = StObject.set(x, "signingRegionSet", value.asInstanceOf[js.Any])
      
      inline def setSigningRegionSetUndefined: Self = StObject.set(x, "signingRegionSet", js.undefined)
      
      inline def setSigningRegionSetVarargs(value: String*): Self = StObject.set(x, "signingRegionSet", js.Array(value*))
    }
  }
}
