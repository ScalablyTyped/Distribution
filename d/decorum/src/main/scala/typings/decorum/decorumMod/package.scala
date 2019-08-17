package typings.decorum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object decorumMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.PropertyDecorator

  type IMessageHandlerMap = StringDictionary[MessageHandler[js.Any]]
  type MessageHandler[TValidator /* <: BaseValidator */] = js.Function2[/* opts */ IMessageOpts, /* validator */ TValidator, String]
  type ValidationDefinitions = StringDictionary[js.Array[PropertyDecorator]]
}
