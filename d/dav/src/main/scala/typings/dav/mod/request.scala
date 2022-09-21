package typings.dav.mod

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object request {
  
  @JSImport("dav", "request")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @param options
    * @returns
    */
  inline def addressBookQuery(options: AddressBookQueryOptions): Request_ = ^.asInstanceOf[js.Dynamic].applyDynamic("addressBookQuery")(options.asInstanceOf[js.Any]).asInstanceOf[Request_]
  
  /**
    *
    * @param options
    * @returns
    */
  inline def basic(options: BasicOptions): Request_ = ^.asInstanceOf[js.Dynamic].applyDynamic("basic")(options.asInstanceOf[js.Any]).asInstanceOf[Request_]
  
  /**
    *
    * @param options
    * @returns
    */
  inline def calendarQuery(options: CalendarQueryOptions): Request_ = ^.asInstanceOf[js.Dynamic].applyDynamic("calendarQuery")(options.asInstanceOf[js.Any]).asInstanceOf[Request_]
  
  /**
    *
    * @param requestData
    * @param options
    * @returns
    */
  inline def collectionQuery(requestData: String, options: SetRequestHeadersOptions): Request_ = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionQuery")(requestData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Request_]
  
  /**
    *
    * @param options
    * @returns
    */
  inline def propfind(options: PropfindOptions): Request_ = ^.asInstanceOf[js.Dynamic].applyDynamic("propfind")(options.asInstanceOf[js.Any]).asInstanceOf[Request_]
  
  /**
    *
    * @param options
    * @returns
    */
  inline def setRequestHeaders(request: XMLHttpRequest, options: SetRequestHeadersOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRequestHeaders")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    *
    * @param options
    * @returns
    */
  inline def syncCollection(options: SyncCollectionOptions): Request_ = ^.asInstanceOf[js.Dynamic].applyDynamic("syncCollection")(options.asInstanceOf[js.Any]).asInstanceOf[Request_]
  
  trait AddressBookQueryOptions extends StObject {
    
    /**
      * value for Depth header.
      */
    var depth: js.UndefOr[String] = js.undefined
    
    /**
      * list of props to request.
      */
    var props: js.Array[js.Object]
  }
  object AddressBookQueryOptions {
    
    inline def apply(props: js.Array[js.Object]): AddressBookQueryOptions = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressBookQueryOptions]
    }
    
    extension [Self <: AddressBookQueryOptions](x: Self) {
      
      inline def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setProps(value: js.Array[js.Object]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsVarargs(value: js.Object*): Self = StObject.set(x, "props", js.Array(value*))
    }
  }
  
  trait BasicOptions extends StObject {
    
    /**
      * put request body.
      */
    var data: String
    
    /**
      * cached calendar object etag.
      */
    var etag: String
    
    /**
      * http method.
      */
    var method: String
  }
  object BasicOptions {
    
    inline def apply(data: String, etag: String, method: String): BasicOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicOptions]
    }
    
    extension [Self <: BasicOptions](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  trait CalendarQueryOptions extends StObject {
    
    /**
      * value for Depth header.
      */
    var depth: js.UndefOr[String] = js.undefined
    
    /**
      * list of filters to send with request.
      */
    var filters: js.Array[js.Object]
    
    /**
      * list of props to request.
      */
    var props: js.Array[js.Object]
    
    /**
      * VTIMEZONE calendar object.
      */
    var timezone: String
  }
  object CalendarQueryOptions {
    
    inline def apply(filters: js.Array[js.Object], props: js.Array[js.Object], timezone: String): CalendarQueryOptions = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarQueryOptions]
    }
    
    extension [Self <: CalendarQueryOptions](x: Self) {
      
      inline def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setFilters(value: js.Array[js.Object]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: js.Object*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setProps(value: js.Array[js.Object]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsVarargs(value: js.Object*): Self = StObject.set(x, "props", js.Array(value*))
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropfindOptions extends StObject {
    
    /**
      *  value for Depth header.
      */
    var depth: js.UndefOr[String] = js.undefined
    
    /**
      * whether to merge the response props.
      */
    var mergeResponses: js.UndefOr[Boolean] = js.undefined
    
    /**
      * list of props to request.
      */
    var props: js.Array[js.Object]
  }
  object PropfindOptions {
    
    inline def apply(props: js.Array[js.Object]): PropfindOptions = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropfindOptions]
    }
    
    extension [Self <: PropfindOptions](x: Self) {
      
      inline def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setMergeResponses(value: Boolean): Self = StObject.set(x, "mergeResponses", value.asInstanceOf[js.Any])
      
      inline def setMergeResponsesUndefined: Self = StObject.set(x, "mergeResponses", js.undefined)
      
      inline def setProps(value: js.Array[js.Object]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsVarargs(value: js.Object*): Self = StObject.set(x, "props", js.Array(value*))
    }
  }
  
  trait SetRequestHeadersOptions extends StObject {
    
    /**
      * value for Content-Type header.
      */
    var contentType: js.UndefOr[String] = js.undefined
    
    /**
      * value for Depth header.
      */
    var depth: js.UndefOr[String] = js.undefined
    
    /**
      * value for If-Match header.
      */
    var etag: js.UndefOr[String] = js.undefined
  }
  object SetRequestHeadersOptions {
    
    inline def apply(): SetRequestHeadersOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetRequestHeadersOptions]
    }
    
    extension [Self <: SetRequestHeadersOptions](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    }
  }
  
  trait SyncCollectionOptions extends StObject {
    
    /**
      * option value for Depth header.
      */
    var depth: js.UndefOr[String] = js.undefined
    
    /**
      * list of props to request.
      */
    var props: js.Array[js.Object]
    
    /**
      * indicates scope of the sync report request.
      */
    var syncLevel: Double
    
    /**
      * synchronization token provided by the server.
      */
    var syncToken: String
  }
  object SyncCollectionOptions {
    
    inline def apply(props: js.Array[js.Object], syncLevel: Double, syncToken: String): SyncCollectionOptions = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], syncLevel = syncLevel.asInstanceOf[js.Any], syncToken = syncToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncCollectionOptions]
    }
    
    extension [Self <: SyncCollectionOptions](x: Self) {
      
      inline def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setProps(value: js.Array[js.Object]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsVarargs(value: js.Object*): Self = StObject.set(x, "props", js.Array(value*))
      
      inline def setSyncLevel(value: Double): Self = StObject.set(x, "syncLevel", value.asInstanceOf[js.Any])
      
      inline def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    }
  }
}
