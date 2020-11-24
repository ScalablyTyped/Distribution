package typings.awsSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object utilMod {
  
  type BodyLengthCalculator = js.Function1[/* body */ js.Any, js.UndefOr[scala.Double]]
  
  type Decoder = js.Function1[/* input */ java.lang.String, typings.std.Uint8Array]
  
  type Encoder = js.Function1[/* input */ typings.std.Uint8Array, java.lang.String]
  
  type Provider[T] = js.Function0[js.Promise[T]]
  
  type RegionInfoProvider = js.Function2[
    /* region */ java.lang.String, 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[js.UndefOr[typings.awsSdkTypes.utilMod.RegionInfo]]
  ]
  
  type UrlParser = js.Function1[/* url */ java.lang.String, typings.awsSdkTypes.httpMod.Endpoint]
}
