package typings.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object refsMod {
  type IRef[T] = typings.blueprintjsCore.refsMod.IRefObject[T] | typings.blueprintjsCore.refsMod.IRefCallback[T]
  type IRefCallback[T] = js.Function1[/* ref */ T | scala.Null, js.Any]
}
