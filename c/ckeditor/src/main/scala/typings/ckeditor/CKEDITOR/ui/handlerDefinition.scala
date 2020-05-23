package typings.ckeditor.CKEDITOR.ui

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait handlerDefinition[T] extends js.Object {
  var contentsElement: element
  def create(definition: StringDictionary[js.Any]): T
}

object handlerDefinition {
  @scala.inline
  def apply[T](contentsElement: element, create: StringDictionary[js.Any] => T): handlerDefinition[T] = {
    val __obj = js.Dynamic.literal(contentsElement = contentsElement.asInstanceOf[js.Any], create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[handlerDefinition[T]]
  }
}

