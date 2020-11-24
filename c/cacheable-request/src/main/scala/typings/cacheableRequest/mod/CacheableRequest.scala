package typings.cacheableRequest.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.httpMod.RequestOptions
import typings.node.httpMod.ServerResponse
import typings.node.urlMod.URL_
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheableRequest
  extends Instantiable1[
      /* requestFn */ RequestFn, 
      js.Function2[
        /* opts */ String | URL_ | (RequestOptions with typings.httpCacheSemantics.mod.Options), 
        /* cb */ js.UndefOr[js.Function1[/* response */ ServerResponse | typings.responselike.mod.^ , Unit]], 
        Emitter
      ]
    ]
     with Instantiable2[
      /* requestFn */ RequestFn, 
      (/* storageAdapter */ StorageAdapter) | (/* storageAdapter */ String), 
      js.Function2[
        (RequestOptions with typings.httpCacheSemantics.mod.Options) | String | URL_, 
        js.UndefOr[js.Function1[ServerResponse | typings.responselike.mod.^ , Unit]], 
        Emitter
      ]
    ] {
  
  var CacheError: Instantiable1[/* error */ Error, CacheErrorCls] = js.native
  
  var RequestError: Instantiable1[/* error */ Error, RequestErrorCls] = js.native
}
