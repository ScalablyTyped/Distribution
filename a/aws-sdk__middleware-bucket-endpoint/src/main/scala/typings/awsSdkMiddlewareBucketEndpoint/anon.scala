package typings.awsSdkMiddlewareBucketEndpoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccelerateEndpoint extends StObject {
    
    var accelerateEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var pathStyleEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var tlsCompatible: js.UndefOr[Boolean] = js.undefined
  }
  object AccelerateEndpoint {
    
    inline def apply(): AccelerateEndpoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccelerateEndpoint]
    }
    
    extension [Self <: AccelerateEndpoint](x: Self) {
      
      inline def setAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "accelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def setAccelerateEndpointUndefined: Self = StObject.set(x, "accelerateEndpoint", js.undefined)
      
      inline def setPathStyleEndpoint(value: Boolean): Self = StObject.set(x, "pathStyleEndpoint", value.asInstanceOf[js.Any])
      
      inline def setPathStyleEndpointUndefined: Self = StObject.set(x, "pathStyleEndpoint", js.undefined)
      
      inline def setTlsCompatible(value: Boolean): Self = StObject.set(x, "tlsCompatible", value.asInstanceOf[js.Any])
      
      inline def setTlsCompatibleUndefined: Self = StObject.set(x, "tlsCompatible", js.undefined)
    }
  }
  
  trait AccesspointName extends StObject {
    
    var accesspointName: String
    
    var outpostId: js.UndefOr[String] = js.undefined
  }
  object AccesspointName {
    
    inline def apply(accesspointName: String): AccesspointName = {
      val __obj = js.Dynamic.literal(accesspointName = accesspointName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccesspointName]
    }
    
    extension [Self <: AccesspointName](x: Self) {
      
      inline def setAccesspointName(value: String): Self = StObject.set(x, "accesspointName", value.asInstanceOf[js.Any])
      
      inline def setOutpostId(value: String): Self = StObject.set(x, "outpostId", value.asInstanceOf[js.Any])
      
      inline def setOutpostIdUndefined: Self = StObject.set(x, "outpostId", js.undefined)
    }
  }
  
  trait AllowFipsRegion extends StObject {
    
    var allowFipsRegion: js.UndefOr[Boolean] = js.undefined
    
    var clientRegion: String
    
    var clientSigningRegion: String
    
    var useArnRegion: js.UndefOr[Boolean] = js.undefined
    
    var useFipsEndpoint: Boolean
  }
  object AllowFipsRegion {
    
    inline def apply(clientRegion: String, clientSigningRegion: String, useFipsEndpoint: Boolean): AllowFipsRegion = {
      val __obj = js.Dynamic.literal(clientRegion = clientRegion.asInstanceOf[js.Any], clientSigningRegion = clientSigningRegion.asInstanceOf[js.Any], useFipsEndpoint = useFipsEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowFipsRegion]
    }
    
    extension [Self <: AllowFipsRegion](x: Self) {
      
      inline def setAllowFipsRegion(value: Boolean): Self = StObject.set(x, "allowFipsRegion", value.asInstanceOf[js.Any])
      
      inline def setAllowFipsRegionUndefined: Self = StObject.set(x, "allowFipsRegion", js.undefined)
      
      inline def setClientRegion(value: String): Self = StObject.set(x, "clientRegion", value.asInstanceOf[js.Any])
      
      inline def setClientSigningRegion(value: String): Self = StObject.set(x, "clientSigningRegion", value.asInstanceOf[js.Any])
      
      inline def setUseArnRegion(value: Boolean): Self = StObject.set(x, "useArnRegion", value.asInstanceOf[js.Any])
      
      inline def setUseArnRegionUndefined: Self = StObject.set(x, "useArnRegion", js.undefined)
      
      inline def setUseFipsEndpoint(value: Boolean): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientPartition extends StObject {
    
    var clientPartition: String
  }
  object ClientPartition {
    
    inline def apply(clientPartition: String): ClientPartition = {
      val __obj = js.Dynamic.literal(clientPartition = clientPartition.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientPartition]
    }
    
    extension [Self <: ClientPartition](x: Self) {
      
      inline def setClientPartition(value: String): Self = StObject.set(x, "clientPartition", value.asInstanceOf[js.Any])
    }
  }
  
  trait DualstackEndpoint extends StObject {
    
    var accelerateEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var dualstackEndpoint: js.UndefOr[Boolean] = js.undefined
    
    var isCustomEndpoint: js.UndefOr[Boolean] = js.undefined
  }
  object DualstackEndpoint {
    
    inline def apply(): DualstackEndpoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DualstackEndpoint]
    }
    
    extension [Self <: DualstackEndpoint](x: Self) {
      
      inline def setAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "accelerateEndpoint", value.asInstanceOf[js.Any])
      
      inline def setAccelerateEndpointUndefined: Self = StObject.set(x, "accelerateEndpoint", js.undefined)
      
      inline def setDualstackEndpoint(value: Boolean): Self = StObject.set(x, "dualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setDualstackEndpointUndefined: Self = StObject.set(x, "dualstackEndpoint", js.undefined)
      
      inline def setIsCustomEndpoint(value: Boolean): Self = StObject.set(x, "isCustomEndpoint", value.asInstanceOf[js.Any])
      
      inline def setIsCustomEndpointUndefined: Self = StObject.set(x, "isCustomEndpoint", js.undefined)
    }
  }
  
  trait TlsCompatible extends StObject {
    
    var tlsCompatible: js.UndefOr[Boolean] = js.undefined
  }
  object TlsCompatible {
    
    inline def apply(): TlsCompatible = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TlsCompatible]
    }
    
    extension [Self <: TlsCompatible](x: Self) {
      
      inline def setTlsCompatible(value: Boolean): Self = StObject.set(x, "tlsCompatible", value.asInstanceOf[js.Any])
      
      inline def setTlsCompatibleUndefined: Self = StObject.set(x, "tlsCompatible", js.undefined)
    }
  }
}
