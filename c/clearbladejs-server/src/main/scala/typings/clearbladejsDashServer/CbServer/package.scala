package typings.clearbladejsDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CbServer {
  import org.scalablytyped.runtime.StringDictionary

  type CbCallback = js.Function2[/* error */ Boolean, /* response */ Resp, Unit]
  type ItemOptions = CollectionOptionsWithID
  type KeyValuePair = StringDictionary[js.Any]
  type QueryFilter = StringDictionary[QueryFilterValue]
  type QueryFilterValue = StringDictionary[QueryValue]
  type QueryValue = String | Double | Boolean
  type ReqTypes = BasicReq
}
