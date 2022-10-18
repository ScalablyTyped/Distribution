package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.anon.Address
import typings.awsSdk.anon.Expire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vendorEndpointCacheMod {
  
  @JSImport("aws-sdk/vendor/endpoint-cache", "EndpointCache")
  @js.native
  open class EndpointCache () extends StObject {
    def this(maxSize: Double) = this()
    
    /* private */ var cache: Any = js.native
    
    def empty(): Unit = js.native
    
    def get(key: String): js.UndefOr[EndpointRecords] = js.native
    def get(key: EndpointIdentifier): js.UndefOr[EndpointRecords] = js.native
    
    val maxSize: Double = js.native
    
    /* private */ var populateValue: Any = js.native
    
    def put(key: String, value: DiscoveredEndpoints): Unit = js.native
    def put(key: EndpointIdentifier, value: DiscoveredEndpoints): Unit = js.native
    
    def remove(key: String): Unit = js.native
    def remove(key: EndpointIdentifier): Unit = js.native
    
    val size: Double = js.native
  }
  /* static members */
  object EndpointCache {
    
    @JSImport("aws-sdk/vendor/endpoint-cache", "EndpointCache")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getKeyString(key: EndpointIdentifier): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyString")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  type DiscoveredEndpoints = js.Array[Address]
  
  trait EndpointIdentifier
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[String]] {
    
    var accessKeyId: js.UndefOr[String] = js.undefined
    
    var operation: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var serviceId: js.UndefOr[String] = js.undefined
  }
  object EndpointIdentifier {
    
    inline def apply(): EndpointIdentifier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointIdentifier]
    }
    
    extension [Self <: EndpointIdentifier](x: Self) {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    }
  }
  
  type EndpointRecords = js.Array[Expire]
}
