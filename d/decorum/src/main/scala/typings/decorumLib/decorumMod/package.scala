package typings
package decorumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object decorumMod {
  type IMessageHandlerMap = org.scalablytyped.runtime.StringDictionary[MessageHandler[js.Any]]
  type MessageHandler[TValidator /* <: BaseValidator */] = js.Function2[/* opts */ IMessageOpts, /* validator */ TValidator, java.lang.String]
  type ValidationDefinitions = org.scalablytyped.runtime.StringDictionary[js.Array[stdLib.PropertyDecorator]]
}
