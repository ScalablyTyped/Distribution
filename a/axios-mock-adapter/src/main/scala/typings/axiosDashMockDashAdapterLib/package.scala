package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object axiosDashMockDashAdapterLib {
  type CallbackResponseSpecFunc = js.Function1[/* config */ js.Any, js.Array[js.Any] | stdLib.Promise[js.Array[js.Any]]]
  type RequestMatcherFunc = js.Function2[
    /* matcher */ js.UndefOr[java.lang.String | stdLib.RegExp], 
    /* body */ js.UndefOr[java.lang.String | js.Any], 
    js.Any
  ]
  type ResponseSpecFunc = js.Function3[
    /* statusOrCallback */ scala.Double | CallbackResponseSpecFunc, 
    /* data */ js.UndefOr[js.Any], 
    /* headers */ js.UndefOr[js.Any], 
    js.Any
  ]
}
