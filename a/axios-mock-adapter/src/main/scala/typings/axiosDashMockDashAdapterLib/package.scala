package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axiosDashMockDashAdapterLib {
  type CallbackResponseSpecFunc = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify AxiosRequestConfig */ /* config */ js.Any, 
    js.Array[js.Any] | js.Promise[js.Array[js.Any]]
  ]
  type RequestMatcherFunc = js.Function2[
    /* matcher */ js.UndefOr[java.lang.String | stdLib.RegExp], 
    /* body */ js.UndefOr[
      java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any)
    ], 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestHandler */ js.Any
  ]
  type ResponseSpecFunc = js.Function3[
    /* statusOrCallback */ scala.Double | CallbackResponseSpecFunc, 
    /* data */ js.UndefOr[js.Any], 
    /* headers */ js.UndefOr[js.Any], 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify MockAdapter */ js.Any
  ]
}
