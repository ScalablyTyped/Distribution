package typings
package axiosDashMockDashAdapterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axiosDashMockDashAdapterMod {
  type CallbackResponseSpecFunc = js.Function1[
    /* config */ axiosLib.axiosMod.AxiosRequestConfig, 
    js.Array[js.Any] | js.Promise[js.Array[js.Any]]
  ]
  type HeadersMatcher = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RequestMatcherFunc = js.Function3[
    /* matcher */ js.UndefOr[java.lang.String | stdLib.RegExp], 
    /* body */ js.UndefOr[java.lang.String | RequestDataMatcher], 
    /* headers */ js.UndefOr[HeadersMatcher], 
    RequestHandler
  ]
  type ResponseSpecFunc = js.Function3[
    /* statusOrCallback */ scala.Double | CallbackResponseSpecFunc, 
    /* data */ js.UndefOr[js.Any], 
    /* headers */ js.UndefOr[js.Any], 
    MockAdapter
  ]
}
