package typings
package cacheableDashRequestLib.cacheableDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheableRequest
  extends org.scalablytyped.runtime.Instantiable2[
      /* requestFn */ RequestFn, 
      (/* storageAdapter */ StorageAdapter) | (/* storageAdapter */ java.lang.String), 
      js.Function2[
        (nodeLib.httpMod.RequestOptions with httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.Options) | java.lang.String | nodeLib.urlMod.URL, 
        js.UndefOr[
          js.Function1[nodeLib.httpMod.ServerResponse | responselikeLib.responselikeMod.^ , scala.Unit]
        ], 
        Emitter
      ]
    ]
     with org.scalablytyped.runtime.Instantiable1[
      /* requestFn */ RequestFn, 
      js.Function2[
        (nodeLib.httpMod.RequestOptions with httpDashCacheDashSemanticsLib.httpDashCacheDashSemanticsMod.Options) | java.lang.String | nodeLib.urlMod.URL, 
        js.UndefOr[
          js.Function1[nodeLib.httpMod.ServerResponse | responselikeLib.responselikeMod.^ , scala.Unit]
        ], 
        Emitter
      ]
    ] {
  var CacheError: org.scalablytyped.runtime.Instantiable1[/* error */ stdLib.Error, CacheErrorCls] = js.native
  var RequestError: org.scalablytyped.runtime.Instantiable1[/* error */ stdLib.Error, RequestErrorCls] = js.native
}

