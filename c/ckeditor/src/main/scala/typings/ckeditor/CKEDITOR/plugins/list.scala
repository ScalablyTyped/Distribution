package typings.ckeditor.CKEDITOR.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait list extends js.Object {
  def arrayToList(listArray: js.Any, database: js.Any, paragraphMode: js.Any, dir: js.Any): Unit
  def listToArray(
    listNode: js.Any,
    database: js.Any,
    baseArray: js.Any,
    baseIndentLevel: js.Any,
    grandparentNode: js.Any
  ): Unit
}

object list {
  @scala.inline
  def apply(
    arrayToList: (js.Any, js.Any, js.Any, js.Any) => Unit,
    listToArray: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit
  ): list = {
    val __obj = js.Dynamic.literal(arrayToList = js.Any.fromFunction4(arrayToList), listToArray = js.Any.fromFunction5(listToArray))
    __obj.asInstanceOf[list]
  }
}

