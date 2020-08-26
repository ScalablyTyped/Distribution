package typings.ckeditor.CKEDITOR.plugins.widget

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.eventInfo
import typings.ckeditor.CKEDITOR.feature
import typings.ckeditor.CKEDITOR.filter.allowedContentRules
import typings.ckeditor.CKEDITOR.htmlParser.element
import typings.ckeditor.CKEDITOR.style
import typings.ckeditor.CKEDITOR.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait definition extends feature {
  var button: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var defaults: js.UndefOr[StringDictionary[js.Any]] = js.native
  var dialog: js.UndefOr[String] = js.native
  var downcast: js.UndefOr[String | (js.Function1[/* element */ element, Unit])] = js.native
  var downcasts: js.UndefOr[StringDictionary[js.Any]] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var edit: js.UndefOr[js.Function0[Unit]] = js.native
  var editables: js.UndefOr[StringDictionary[js.Any]] = js.native
  var getLabel: js.UndefOr[js.Function0[_]] = js.native
  var init: js.UndefOr[js.Function0[Unit]] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var insert: js.UndefOr[js.Function0[Unit]] = js.native
  var mask: js.UndefOr[Boolean] = js.native
  var parts: js.UndefOr[StringDictionary[js.Any]] = js.native
  var pathName: js.UndefOr[String] = js.native
  var styleToAllowedContentRules: js.UndefOr[js.Function1[/* style */ style, allowedContentRules]] = js.native
  var styleableElements: js.UndefOr[String] = js.native
  var template: js.UndefOr[String | typings.ckeditor.CKEDITOR.template] = js.native
  var upcast: js.UndefOr[String | (js.Function2[/* element */ element, /* data */ js.Any, Boolean])] = js.native
  var upcastPriority: js.UndefOr[Double] = js.native
  var upcasts: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object definition {
  @scala.inline
  def apply(): definition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[definition]
  }
  @scala.inline
  implicit class definitionOps[Self <: definition] (val x: Self) extends AnyVal {
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
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setData(value: /* evt */ eventInfo => Unit): Self = this.set("data", js.Any.fromFunction1(value))
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDefaults(value: StringDictionary[js.Any]): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    @scala.inline
    def setDialog(value: String): Self = this.set("dialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialog: Self = this.set("dialog", js.undefined)
    @scala.inline
    def setDowncastFunction1(value: /* element */ element => Unit): Self = this.set("downcast", js.Any.fromFunction1(value))
    @scala.inline
    def setDowncast(value: String | (js.Function1[/* element */ element, Unit])): Self = this.set("downcast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDowncast: Self = this.set("downcast", js.undefined)
    @scala.inline
    def setDowncasts(value: StringDictionary[js.Any]): Self = this.set("downcasts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDowncasts: Self = this.set("downcasts", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEdit(value: () => Unit): Self = this.set("edit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    @scala.inline
    def setEditables(value: StringDictionary[js.Any]): Self = this.set("editables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditables: Self = this.set("editables", js.undefined)
    @scala.inline
    def setGetLabel(value: () => _): Self = this.set("getLabel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabel: Self = this.set("getLabel", js.undefined)
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setInsert(value: () => Unit): Self = this.set("insert", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    @scala.inline
    def setMask(value: Boolean): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setParts(value: StringDictionary[js.Any]): Self = this.set("parts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParts: Self = this.set("parts", js.undefined)
    @scala.inline
    def setPathName(value: String): Self = this.set("pathName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathName: Self = this.set("pathName", js.undefined)
    @scala.inline
    def setStyleToAllowedContentRules(value: /* style */ style => allowedContentRules): Self = this.set("styleToAllowedContentRules", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStyleToAllowedContentRules: Self = this.set("styleToAllowedContentRules", js.undefined)
    @scala.inline
    def setStyleableElements(value: String): Self = this.set("styleableElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleableElements: Self = this.set("styleableElements", js.undefined)
    @scala.inline
    def setTemplate(value: String | template): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setUpcastFunction2(value: (/* element */ element, /* data */ js.Any) => Boolean): Self = this.set("upcast", js.Any.fromFunction2(value))
    @scala.inline
    def setUpcast(value: String | (js.Function2[/* element */ element, /* data */ js.Any, Boolean])): Self = this.set("upcast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpcast: Self = this.set("upcast", js.undefined)
    @scala.inline
    def setUpcastPriority(value: Double): Self = this.set("upcastPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpcastPriority: Self = this.set("upcastPriority", js.undefined)
    @scala.inline
    def setUpcasts(value: StringDictionary[js.Any]): Self = this.set("upcasts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpcasts: Self = this.set("upcasts", js.undefined)
  }
  
}

