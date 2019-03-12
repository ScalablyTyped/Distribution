package typings
package cacheableDashRequestLib.cacheableDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheableRequest
  extends org.scalablytyped.runtime.Instantiable2[
      /* requestFn */ cacheableDashRequestLib.RequestFn, 
      (/* storageAdapter */ keyvLib.keyvMod.KeyvNs.Store[js.Any]) | (/* storageAdapter */ java.lang.String), 
      js.Function2[
        /* opts */ java.lang.String | nodeLib.urlMod.URL | (nodeLib.httpMod.RequestOptions with httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Options), 
        /* cb */ js.UndefOr[
          js.Function1[
            /* response */ nodeLib.httpMod.ServerResponse | responselikeLib.responselikeMod.namespaced, 
            scala.Unit
          ]
        ], 
        cacheableDashRequestLib.cacheableDashRequestMod.CacheableRequestNs.Emitter
      ]
    ]
     with org.scalablytyped.runtime.Instantiable1[
      /* requestFn */ cacheableDashRequestLib.RequestFn, 
      js.Function2[
        /* opts */ java.lang.String | nodeLib.urlMod.URL | (nodeLib.httpMod.RequestOptions with httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.CachePolicyNs.Options), 
        /* cb */ js.UndefOr[
          js.Function1[
            /* response */ nodeLib.httpMod.ServerResponse | responselikeLib.responselikeMod.namespaced, 
            scala.Unit
          ]
        ], 
        cacheableDashRequestLib.cacheableDashRequestMod.CacheableRequestNs.Emitter
      ]
    ] {
  var CacheError: org.scalablytyped.runtime.Instantiable1[/* error */ stdLib.Error, CacheErrorCls] = js.native
  var RequestError: org.scalablytyped.runtime.Instantiable1[/* error */ stdLib.Error, RequestErrorCls] = js.native
}

