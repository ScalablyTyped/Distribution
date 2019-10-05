package typings.cacheableDashRequest.cacheableDashRequestMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.httpMod.RequestOptions
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.URL
import typings.responselike.responselikeMod.^
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheableRequest
  extends Instantiable2[
      /* requestFn */ RequestFn, 
      (/* storageAdapter */ StorageAdapter) | (/* storageAdapter */ String), 
      js.Function2[
        (RequestOptions with typings.httpDashCacheDashSemantics.httpDashCacheDashSemanticsMod.Options) | String | URL, 
        js.UndefOr[js.Function1[ServerResponse | ^ , Unit]], 
        Emitter
      ]
    ]
     with Instantiable1[
      /* requestFn */ RequestFn, 
      js.Function2[
        (RequestOptions with typings.httpDashCacheDashSemantics.httpDashCacheDashSemanticsMod.Options) | String | URL, 
        js.UndefOr[js.Function1[ServerResponse | ^ , Unit]], 
        Emitter
      ]
    ] {
  var CacheError: Instantiable1[/* error */ Error, CacheErrorCls] = js.native
  var RequestError: Instantiable1[/* error */ Error, RequestErrorCls] = js.native
}

