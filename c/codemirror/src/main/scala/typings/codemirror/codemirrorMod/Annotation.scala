package typings.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An annotation contains a description of a lint error, detailing the location of the error within the code, the severity of the error,
  * and an explaination as to why the error was thrown.
  */
trait Annotation extends js.Object {
  var from: Position
  var message: js.UndefOr[String] = js.undefined
  var severity: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[Position] = js.undefined
}

object Annotation {
  @scala.inline
  def apply(from: Position, message: String = null, severity: String = null, to: Position = null): Annotation = {
    val __obj = js.Dynamic.literal(from = from)
    if (message != null) __obj.updateDynamic("message")(message)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Annotation]
  }
}

