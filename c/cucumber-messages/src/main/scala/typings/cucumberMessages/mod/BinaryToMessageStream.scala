package typings.cucumberMessages.mod

import typings.cucumberMessages.binaryToMessageStreamMod.default
import typings.protobufjs.mod.Reader
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cucumber-messages", "BinaryToMessageStream")
@js.native
class BinaryToMessageStream[T] protected () extends default[T] {
  def this(decodeDelimited: js.Function1[/* reader */ Reader | Uint8Array, T]) = this()
}
