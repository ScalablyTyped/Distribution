package typings
package clearbladejsDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CbServerNs {
  type CbCallback = js.Function2[/* error */ scala.Boolean, /* response */ Resp, scala.Unit]
  type ItemOptions = CollectionOptionsWithID
  type KeyValuePair = org.scalablytyped.runtime.StringDictionary[js.Any]
  type QueryFilter = org.scalablytyped.runtime.StringDictionary[QueryFilterValue]
  type QueryFilterValue = org.scalablytyped.runtime.StringDictionary[QueryValue]
  type QueryValue = java.lang.String | scala.Double | scala.Boolean
  type ReqTypes = BasicReq
}
