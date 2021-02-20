package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.anon.Address
import typings.awsSdk.anon.CachePeriodInMinutes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointCacheMod {
  
  @JSImport("aws-sdk/vendor/endpoint-cache", "EndpointCache")
  @js.native
  class EndpointCache () extends StObject {
    def this(maxSize: Double) = this()
    
    var cache: js.Any = js.native
    
    def empty(): Unit = js.native
    
    def get(key: String): js.UndefOr[EndpointRecords] = js.native
    def get(key: EndpointIdentifier): js.UndefOr[EndpointRecords] = js.native
    
    val maxSize: Double = js.native
    
    var populateValue: js.Any = js.native
    
    def put(key: String, value: DiscoveredEndpoints): Unit = js.native
    def put(key: EndpointIdentifier, value: DiscoveredEndpoints): Unit = js.native
    
    def remove(key: String): Unit = js.native
    def remove(key: EndpointIdentifier): Unit = js.native
    
    val size: Double = js.native
  }
  /* static members */
  object EndpointCache {
    
    @JSImport("aws-sdk/vendor/endpoint-cache", "EndpointCache.getKeyString")
    @js.native
    def getKeyString(key: EndpointIdentifier): String = js.native
  }
  
  type DiscoveredEndpoints = js.Array[CachePeriodInMinutes]
  
  @js.native
  trait EndpointIdentifier
    extends /* key */ StringDictionary[js.UndefOr[String]] {
    
    var accessKeyId: js.UndefOr[String] = js.native
    
    var operation: js.UndefOr[String] = js.native
    
    var region: js.UndefOr[String] = js.native
    
    var serviceId: js.UndefOr[String] = js.native
  }
  object EndpointIdentifier {
    
    @scala.inline
    def apply(): EndpointIdentifier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointIdentifier]
    }
    
    @scala.inline
    implicit class EndpointIdentifierMutableBuilder[Self <: EndpointIdentifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      @scala.inline
      def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    }
  }
  
  type EndpointRecords = js.Array[Address]
}
