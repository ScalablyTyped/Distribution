package typings.axiosMockAdapter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsymmetricHeadersMatcher = typings.axiosMockAdapter.mod.AsymmetricMatcher | typings.axiosMockAdapter.mod.HeadersMatcher
  
  type CallbackResponseSpecFunc = js.Function1[
    /* config */ typings.axios.mod.AxiosRequestConfig, 
    js.Array[js.Any] | js.Promise[js.Array[js.Any]]
  ]
  
  type HeadersMatcher = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type RequestMatcherFunc = js.Function3[
    /* matcher */ js.UndefOr[java.lang.String | typings.std.RegExp], 
    /* body */ js.UndefOr[java.lang.String | typings.axiosMockAdapter.mod.AsymmetricRequestDataMatcher], 
    /* headers */ js.UndefOr[typings.axiosMockAdapter.mod.AsymmetricHeadersMatcher], 
    typings.axiosMockAdapter.mod.RequestHandler
  ]
  
  type ResponseSpecFunc = js.Function3[
    /* statusOrCallback */ scala.Double | typings.axiosMockAdapter.mod.CallbackResponseSpecFunc, 
    /* data */ js.UndefOr[js.Any], 
    /* headers */ js.UndefOr[js.Any], 
    typings.axiosMockAdapter.mod.MockAdapter
  ]
}
