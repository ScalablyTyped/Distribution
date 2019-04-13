package typings
package clearbladejsDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CbClientNs {
  type CbCallback = js.Function2[/* error */ scala.Boolean, /* response */ Resp, scala.Unit]
  type ItemOptions = CollectionOptionsWithID
  type MessageCallback = js.Function1[/* message */ java.lang.String, scala.Unit]
  type QueryFilter = org.scalablytyped.runtime.StringDictionary[QueryFilterValue]
  type QueryFilterValue = org.scalablytyped.runtime.StringDictionary[QueryValue]
  type QueryValue = java.lang.String | scala.Double | scala.Boolean
}
