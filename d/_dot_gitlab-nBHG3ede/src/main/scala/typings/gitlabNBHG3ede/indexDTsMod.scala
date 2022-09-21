package typings.gitlabNBHG3ede

import org.scalablytyped.runtime.StringDictionary
import typings.gitlabNBHG3ede.baseServiceDTsMod.BaseServiceOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.BaseRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.DelResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.GetResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.PaginatedRequestOptions
import typings.gitlabNBHG3ede.requestHelperDTsMod.PostResponse
import typings.gitlabNBHG3ede.requestHelperDTsMod.PutResponse
import typings.gitlabNBHG3ede.utilsDTsMod.Bundle
import typings.gitlabNBHG3ede.utilsDTsMod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexDTsMod {
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts", "BaseService")
  @js.native
  open class BaseService ()
    extends typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
  }
  
  object RequestHelper {
    
    @JSImport(".gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts", "RequestHelper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts", "RequestHelper.del")
    @js.native
    def del: js.Function3[
        /* service */ typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[DelResponse]
      ] = js.native
    inline def del(service: typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, endpoint: String): js.Promise[DelResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DelResponse]]
    inline def del(
      service: typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[DelResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DelResponse]]
    inline def del_=(
      x: js.Function3[
          /* service */ typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Promise[DelResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("del")(x.asInstanceOf[js.Any])
    
    @JSImport(".gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts", "RequestHelper.get")
    @js.native
    def get: js.Function3[
        /* service */ typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[PaginatedRequestOptions], 
        js.Promise[GetResponse]
      ] = js.native
    inline def get(service: typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, endpoint: String): js.Promise[GetResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResponse]]
    inline def get(
      service: typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService,
      endpoint: String,
      options: PaginatedRequestOptions
    ): js.Promise[GetResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResponse]]
    inline def get_=(
      x: js.Function3[
          /* service */ typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[PaginatedRequestOptions], 
          js.Promise[GetResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
    
    @JSImport(".gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts", "RequestHelper.post")
    @js.native
    def post: js.Function3[
        /* service */ typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PostResponse]
      ] = js.native
    inline def post(service: typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, endpoint: String): js.Promise[PostResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PostResponse]]
    inline def post(
      service: typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[PostResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PostResponse]]
    inline def post_=(
      x: js.Function3[
          /* service */ typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Promise[PostResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("post")(x.asInstanceOf[js.Any])
    
    @JSImport(".gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts", "RequestHelper.put")
    @js.native
    def put: js.Function3[
        /* service */ typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        js.Promise[PutResponse]
      ] = js.native
    inline def put(service: typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, endpoint: String): js.Promise[PutResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PutResponse]]
    inline def put(
      service: typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): js.Promise[PutResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PutResponse]]
    inline def put_=(
      x: js.Function3[
          /* service */ typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          js.Promise[PutResponse]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("put")(x.asInstanceOf[js.Any])
    
    @JSImport(".gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts", "RequestHelper.stream")
    @js.native
    def stream: js.Function3[
        /* service */ typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, 
        /* endpoint */ String, 
        /* options */ js.UndefOr[BaseRequestOptions], 
        Any
      ] = js.native
    inline def stream(service: typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, endpoint: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def stream(
      service: typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService,
      endpoint: String,
      options: BaseRequestOptions
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(service.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def stream_=(
      x: js.Function3[
          /* service */ typings.gitlabNBHG3ede.baseServiceDTsMod.BaseService, 
          /* endpoint */ String, 
          /* options */ js.UndefOr[BaseRequestOptions], 
          Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
  }
  
  inline def bundler[T /* <: StringDictionary[Constructor] */, P /* <: /* keyof T */ String */](services: T): Bundle[T, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("bundler")(services.asInstanceOf[js.Any]).asInstanceOf[Bundle[T, P]]
}
