package typings.dav.mod

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
  @scala.inline
  def addressBookQuery(options: AddressBookQueryOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addressBookQuery")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    *
    * @param options
    * @returns
    */
  @scala.inline
  def basic(options: BasicOptions): Request_ = ^.asInstanceOf[js.Dynamic].applyDynamic("basic")(options.asInstanceOf[js.Any]).asInstanceOf[Request_]
  
  /**
    *
    * @param options
    * @returns
    */
  @scala.inline
  def calendarQuery(options: CalendarQueryOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("calendarQuery")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    *
    * @param options
    * @returns
    */
  @scala.inline
  def propfind(options: PropfindOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("propfind")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    *
    * @param options
    * @returns
    */
  @scala.inline
  def syncCollection(options: SyncCollectionOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("syncCollection")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
    
    @scala.inline
    def apply(props: js.Array[js.Object]): AddressBookQueryOptions = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressBookQueryOptions]
    }
    
    @scala.inline
    implicit class AddressBookQueryOptionsMutableBuilder[Self <: AddressBookQueryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setProps(value: js.Array[js.Object]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsVarargs(value: js.Object*): Self = StObject.set(x, "props", js.Array(value :_*))
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
    
    @scala.inline
    def apply(data: String, etag: String, method: String): BasicOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicOptions]
    }
    
    @scala.inline
    implicit class BasicOptionsMutableBuilder[Self <: BasicOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(filters: js.Array[js.Object], props: js.Array[js.Object], timezone: String): CalendarQueryOptions = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarQueryOptions]
    }
    
    @scala.inline
    implicit class CalendarQueryOptionsMutableBuilder[Self <: CalendarQueryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[js.Object]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersVarargs(value: js.Object*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setProps(value: js.Array[js.Object]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsVarargs(value: js.Object*): Self = StObject.set(x, "props", js.Array(value :_*))
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropfindOptions extends StObject {
    
    /**
      *  value for Depth header.
      */
    var depth: js.UndefOr[String] = js.undefined
    
    /**
      * list of props to request.
      */
    var props: js.Array[js.Object]
  }
  object PropfindOptions {
    
    @scala.inline
    def apply(props: js.Array[js.Object]): PropfindOptions = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropfindOptions]
    }
    
    @scala.inline
    implicit class PropfindOptionsMutableBuilder[Self <: PropfindOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setProps(value: js.Array[js.Object]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsVarargs(value: js.Object*): Self = StObject.set(x, "props", js.Array(value :_*))
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
    
    @scala.inline
    def apply(props: js.Array[js.Object], syncLevel: Double, syncToken: String): SyncCollectionOptions = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], syncLevel = syncLevel.asInstanceOf[js.Any], syncToken = syncToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncCollectionOptions]
    }
    
    @scala.inline
    implicit class SyncCollectionOptionsMutableBuilder[Self <: SyncCollectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setProps(value: js.Array[js.Object]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsVarargs(value: js.Object*): Self = StObject.set(x, "props", js.Array(value :_*))
      
      @scala.inline
      def setSyncLevel(value: Double): Self = StObject.set(x, "syncLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    }
  }
}
