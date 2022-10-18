package typings.contentstack

import typings.contentstack.anon.Paths
import typings.contentstackUtils.distTypesOptionsMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("contentstack", "Asset")
  @js.native
  open class Asset () extends StObject {
    
    var _query: js.Object = js.native
    
    def addParam(key: String, value: Any): Asset = js.native
    
    var asset_uid: String = js.native
    
    def fetch(): js.Promise[Any] = js.native
    def fetch(fetchOptions: js.Object): js.Promise[Any] = js.native
    
    def includeFallback(): Asset = js.native
    
    def toJSON(): Asset = js.native
  }
  
  @JSImport("contentstack", "Assets")
  @js.native
  open class Assets () extends StObject {
    
    def Query(): typings.contentstack.mod.Query = js.native
    
    def addParam(key: String, value: Any): Assets = js.native
    
    def toJSON(): Assets = js.native
  }
  
  @js.native
  sealed trait CachePolicy extends StObject
  @JSImport("contentstack", "CachePolicy")
  @js.native
  object CachePolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CachePolicy & Double] = js.native
    
    @js.native
    sealed trait CACHE_ELSE_NETWORK
      extends StObject
         with CachePolicy
    /* 1 */ val CACHE_ELSE_NETWORK: typings.contentstack.mod.CachePolicy.CACHE_ELSE_NETWORK & Double = js.native
    
    @js.native
    sealed trait CACHE_THEN_NETWORK
      extends StObject
         with CachePolicy
    /* 3 */ val CACHE_THEN_NETWORK: typings.contentstack.mod.CachePolicy.CACHE_THEN_NETWORK & Double = js.native
    
    @js.native
    sealed trait IGNORE_CACHE
      extends StObject
         with CachePolicy
    /* -1 */ val IGNORE_CACHE: typings.contentstack.mod.CachePolicy.IGNORE_CACHE & Double = js.native
    
    @js.native
    sealed trait NETWORK_ELSE_CACHE
      extends StObject
         with CachePolicy
    /* 2 */ val NETWORK_ELSE_CACHE: typings.contentstack.mod.CachePolicy.NETWORK_ELSE_CACHE & Double = js.native
    
    @js.native
    sealed trait ONLY_NETWORK
      extends StObject
         with CachePolicy
    /* 0 */ val ONLY_NETWORK: typings.contentstack.mod.CachePolicy.ONLY_NETWORK & Double = js.native
  }
  
  @JSImport("contentstack", "ContentType")
  @js.native
  open class ContentType () extends StObject {
    
    def Entry(uid: String): typings.contentstack.mod.Entry = js.native
    
    def Query(): typings.contentstack.mod.Query = js.native
    
    var content_type_uid: String = js.native
    
    def fetch(): js.Promise[Any] = js.native
    def fetch(fetchOptions: js.Object): js.Promise[Any] = js.native
  }
  
  @JSImport("contentstack", "Entry")
  @js.native
  open class Entry () extends StObject {
    
    var _query: js.Object = js.native
    
    def addParam(key: String, value: Any): this.type = js.native
    
    def addQuery(key: String, value: String): this.type = js.native
    
    var cachePolicy: Double = js.native
    
    var content_type_uid: String = js.native
    
    var entry_uid: String = js.native
    
    def except(field_uid: String): this.type = js.native
    def except(field_uids: js.Array[String]): this.type = js.native
    def except(reference_field_uid: String, field_uid: String): this.type = js.native
    def except(reference_field_uid: String, field_uids: js.Array[String]): this.type = js.native
    
    def fetch(): js.Promise[Any] = js.native
    def fetch(fetchOptions: js.Object): js.Promise[Any] = js.native
    
    def includeContentType(): this.type = js.native
    
    def includeEmbeddedItems(): this.type = js.native
    
    def includeFallback(): this.type = js.native
    
    def includeOwner(): this.type = js.native
    
    def includeReference(`val`: String*): this.type = js.native
    def includeReference(`val`: js.Array[String]): this.type = js.native
    
    def includeReferenceContentTypeUID(): this.type = js.native
    
    /**
      * @deprecated since version 3.3.0
      */
    def includeSchema(): this.type = js.native
    
    def language(language_code: String): this.type = js.native
    
    def only(field_uid: String): this.type = js.native
    def only(field_uids: js.Array[String]): this.type = js.native
    def only(reference_field_uid: String, field_uid: String): this.type = js.native
    def only(reference_field_uid: String, field_uids: js.Array[String]): this.type = js.native
    
    var provider: Any = js.native
    
    var queryCachePolicy: Double = js.native
    
    def setCachePolicy(policy: Double): this.type = js.native
    
    def setCacheProvider(provider: js.Object): this.type = js.native
    
    def toJSON(): this.type = js.native
  }
  
  @JSImport("contentstack", "Query")
  @js.native
  open class Query () extends Entry {
    
    def afterUid(uid: String): Query = js.native
    
    def and(queries: Query*): Query = js.native
    
    def ascending(key: String): Query = js.native
    
    def beforeUid(uid: String): Query = js.native
    
    def containedIn(key: String, value: js.Array[String | Double]): Query = js.native
    
    def count(): Query = js.native
    def count(fetchOptions: js.Object): Query = js.native
    
    def descending(key: String): Query = js.native
    
    def equalTo(key: String, value: String): Query = js.native
    def equalTo(key: String, value: Boolean): Query = js.native
    def equalTo(key: String, value: Double): Query = js.native
    
    def exists(key: String): Query = js.native
    
    def find(): js.Promise[Any] = js.native
    def find(fetchOptions: js.Object): js.Promise[Any] = js.native
    
    def findOne(): js.Promise[Any] = js.native
    
    def getQuery(): Query = js.native
    
    def greaterThan(key: String, value: String): Query = js.native
    def greaterThan(key: String, value: Double): Query = js.native
    
    def greaterThanOrEqualTo(key: String, value: String): Query = js.native
    def greaterThanOrEqualTo(key: String, value: Double): Query = js.native
    
    def includeCount(): Query = js.native
    
    def lessThan(key: String, value: String): Query = js.native
    def lessThan(key: String, value: Double): Query = js.native
    
    def lessThanOrEqualTo(key: String, value: String): Query = js.native
    def lessThanOrEqualTo(key: String, value: Double): Query = js.native
    
    def limit(limit: Double): Query = js.native
    
    def notContainedIn(key: String, value: js.Array[String | Double]): Query = js.native
    
    def notEqualTo(key: String, value: String): Query = js.native
    def notEqualTo(key: String, value: Boolean): Query = js.native
    def notEqualTo(key: String, value: Double): Query = js.native
    
    def notExists(key: String): Query = js.native
    
    def or(queries: Query*): Query = js.native
    
    def query(query: js.Object): Query = js.native
    
    def referenceIn(key: String, query: js.Object): Query = js.native
    def referenceIn(key: String, query: Query): Query = js.native
    
    def referenceNotIn(key: String, query: js.Object): Query = js.native
    def referenceNotIn(key: String, query: Query): Query = js.native
    
    def regex(key: String, value: String): Query = js.native
    def regex(key: String, value: String, options: String): Query = js.native
    
    /**
      * @deprecated since version 3.15.0
      */
    def search(value: String): Query = js.native
    
    def skip(skip: Double): Query = js.native
    
    def tags(value: js.Array[String]): Query = js.native
    
    def where(key: String, value: String): Query = js.native
    def where(key: String, value: Boolean): Query = js.native
    def where(key: String, value: Double): Query = js.native
  }
  
  @js.native
  sealed trait Region extends StObject
  @JSImport("contentstack", "Region")
  @js.native
  object Region extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Region & String] = js.native
    
    @js.native
    sealed trait AZURE_NA
      extends StObject
         with Region
    /* "azure-na" */ val AZURE_NA: typings.contentstack.mod.Region.AZURE_NA & String = js.native
    
    @js.native
    sealed trait EU
      extends StObject
         with Region
    /* "eu" */ val EU: typings.contentstack.mod.Region.EU & String = js.native
    
    @js.native
    sealed trait US
      extends StObject
         with Region
    /* "us" */ val US: typings.contentstack.mod.Region.US & String = js.native
  }
  
  @JSImport("contentstack", "Stack")
  @js.native
  open class Stack protected () extends StObject {
    def this(config: Config) = this()
    /**
      * @deprecated since version 3.15.0
      */
    def this(api_key: String, delivery_token: String, environment_name: String) = this()
    def this(api_key: String, delivery_token: String, environment_name: String, region: Region) = this()
    def this(api_key: String, delivery_token: String, environment_name: String, region: Unit, fetchOptions: Any) = this()
    def this(
      api_key: String,
      delivery_token: String,
      environment_name: String,
      region: Region,
      fetchOptions: Any
    ) = this()
    def this(
      api_key: String,
      delivery_token: String,
      environment_name: String,
      region: Unit,
      fetchOptions: Any,
      live_preview: LivePreview
    ) = this()
    def this(
      api_key: String,
      delivery_token: String,
      environment_name: String,
      region: Unit,
      fetchOptions: Unit,
      live_preview: LivePreview
    ) = this()
    def this(
      api_key: String,
      delivery_token: String,
      environment_name: String,
      region: Region,
      fetchOptions: Any,
      live_preview: LivePreview
    ) = this()
    def this(
      api_key: String,
      delivery_token: String,
      environment_name: String,
      region: Region,
      fetchOptions: Unit,
      live_preview: LivePreview
    ) = this()
    
    def Assets(): typings.contentstack.mod.Assets = js.native
    def Assets(uid: String): Asset = js.native
    
    def ContentType(uid: String): typings.contentstack.mod.ContentType = js.native
    
    var cachePolicy: CachePolicy = js.native
    
    def clearAll(): Stack = js.native
    
    def clearByContentType(): Stack = js.native
    
    def clearByQuery(): Stack = js.native
    
    var config: StackConfig = js.native
    
    var environment: String = js.native
    
    var fetchOptions: Any = js.native
    
    def getCacheProvider(): js.Object = js.native
    
    def getContentTypes(): js.Promise[ContentTypeCollection] = js.native
    def getContentTypes(param: js.Object): js.Promise[ContentTypeCollection] = js.native
    
    def getLastActivities(): js.Promise[Any] = js.native
    
    def imageTransform(url: String, params: Any): String = js.native
    
    def livePreviewQuery(query: LivePreviewQuery): Unit = js.native
    
    def setCachePolicy(policy: CachePolicy): Stack = js.native
    
    def setCacheProvider(provider: js.Object): Stack = js.native
    
    def setHost(host: String): Stack = js.native
    
    def setPort(port: Double): Stack = js.native
    
    def setProtocol(protocol: String): Stack = js.native
    
    def sync(params: js.Object): js.Promise[SyncResult] = js.native
  }
  object Stack {
    
    @JSImport("contentstack", "Stack")
    @js.native
    def apply(api_key: String, access_token: String, environment_name: String): Stack = js.native
    @JSImport("contentstack", "Stack")
    @js.native
    def apply(api_key: String, access_token: String, environment_name: String, region: String): Stack = js.native
    @JSImport("contentstack", "Stack")
    @js.native
    def apply(
      api_key: String,
      access_token: String,
      environment_name: String,
      region: String,
      fetchOptions: js.Object
    ): Stack = js.native
    @JSImport("contentstack", "Stack")
    @js.native
    def apply(
      api_key: String,
      access_token: String,
      environment_name: String,
      region: Unit,
      fetchOptions: js.Object
    ): Stack = js.native
    @JSImport("contentstack", "Stack")
    @js.native
    def apply(config: Config): Stack = js.native
  }
  
  @JSImport("contentstack", "Utils")
  @js.native
  open class Utils () extends StObject
  /* static members */
  object Utils {
    
    @JSImport("contentstack", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def jsonToHTML(option: Paths): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonToHTML")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def render(option: typings.contentstack.anon.Entry): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def renderContent(content: String, option: Option): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderContent")(content.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
    inline def renderContent(content: js.Array[String], option: Option): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderContent")(content.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  }
  
  trait Config extends StObject {
    
    var api_key: String
    
    var branch: js.UndefOr[String] = js.undefined
    
    var delivery_token: String
    
    var environment: String
    
    var fetchOptions: js.UndefOr[js.Object] = js.undefined
    
    var live_preview: js.UndefOr[LivePreview] = js.undefined
    
    var region: js.UndefOr[Region] = js.undefined
  }
  object Config {
    
    inline def apply(api_key: String, delivery_token: String, environment: String): Config = {
      val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], delivery_token = delivery_token.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setDelivery_token(value: String): Self = StObject.set(x, "delivery_token", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setFetchOptions(value: js.Object): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setLive_preview(value: LivePreview): Self = StObject.set(x, "live_preview", value.asInstanceOf[js.Any])
      
      inline def setLive_previewUndefined: Self = StObject.set(x, "live_preview", js.undefined)
      
      inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  trait ContentTypeCollection extends StObject {
    
    var content_types: js.Array[Any]
    
    var count: js.UndefOr[Double] = js.undefined
  }
  object ContentTypeCollection {
    
    inline def apply(content_types: js.Array[Any]): ContentTypeCollection = {
      val __obj = js.Dynamic.literal(content_types = content_types.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentTypeCollection]
    }
    
    extension [Self <: ContentTypeCollection](x: Self) {
      
      inline def setContent_types(value: js.Array[Any]): Self = StObject.set(x, "content_types", value.asInstanceOf[js.Any])
      
      inline def setContent_typesVarargs(value: Any*): Self = StObject.set(x, "content_types", js.Array(value*))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    }
  }
  
  trait LivePreview extends StObject {
    
    var enable: Boolean
    
    var host: String
    
    var management_token: String
  }
  object LivePreview {
    
    inline def apply(enable: Boolean, host: String, management_token: String): LivePreview = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], management_token = management_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[LivePreview]
    }
    
    extension [Self <: LivePreview](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setManagement_token(value: String): Self = StObject.set(x, "management_token", value.asInstanceOf[js.Any])
    }
  }
  
  trait LivePreviewQuery extends StObject {
    
    var content_type_uid: String
    
    var live_preview: String
  }
  object LivePreviewQuery {
    
    inline def apply(content_type_uid: String, live_preview: String): LivePreviewQuery = {
      val __obj = js.Dynamic.literal(content_type_uid = content_type_uid.asInstanceOf[js.Any], live_preview = live_preview.asInstanceOf[js.Any])
      __obj.asInstanceOf[LivePreviewQuery]
    }
    
    extension [Self <: LivePreviewQuery](x: Self) {
      
      inline def setContent_type_uid(value: String): Self = StObject.set(x, "content_type_uid", value.asInstanceOf[js.Any])
      
      inline def setLive_preview(value: String): Self = StObject.set(x, "live_preview", value.asInstanceOf[js.Any])
    }
  }
  
  trait StackConfig extends StObject {
    
    var host: String
    
    var port: Double
    
    var protocol: String
    
    var version: String
  }
  object StackConfig {
    
    inline def apply(host: String, port: Double, protocol: String, version: String): StackConfig = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackConfig]
    }
    
    extension [Self <: StackConfig](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyncResult extends StObject {
    
    var items: js.Array[Any]
    
    var limit: Double
    
    var paginationToken: js.UndefOr[String] = js.undefined
    
    var skip: Double
    
    var syncToken: js.UndefOr[String] = js.undefined
    
    var totalCount: Double
  }
  object SyncResult {
    
    inline def apply(items: js.Array[Any], limit: Double, skip: Double, totalCount: Double): SyncResult = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyncResult]
    }
    
    extension [Self <: SyncResult](x: Self) {
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setPaginationToken(value: String): Self = StObject.set(x, "paginationToken", value.asInstanceOf[js.Any])
      
      inline def setPaginationTokenUndefined: Self = StObject.set(x, "paginationToken", js.undefined)
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
      
      inline def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    }
  }
}
