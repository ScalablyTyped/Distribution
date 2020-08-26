package typings.ckeditor.CKEDITOR.ui

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait handlerDefinition[T] extends js.Object {
  var contentsElement: element = js.native
  def create(definition: StringDictionary[js.Any]): T = js.native
}

object handlerDefinition {
  @scala.inline
  def apply[T](contentsElement: element, create: StringDictionary[js.Any] => T): handlerDefinition[T] = {
    val __obj = js.Dynamic.literal(contentsElement = contentsElement.asInstanceOf[js.Any], create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[handlerDefinition[T]]
  }
  @scala.inline
  implicit class handlerDefinitionOps[Self <: handlerDefinition[_], T] (val x: Self with handlerDefinition[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentsElement(value: element): Self = this.set("contentsElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: StringDictionary[js.Any] => T): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

