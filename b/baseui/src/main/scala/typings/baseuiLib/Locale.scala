package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var accordion: AccordionLocale
  var breadcrumbs: BreadcrumbLocale
  var buttongroup: ButtonGroupLocale
  var datepicker: DatepickerLocale
  var fileuploader: FileUploaderLocale
  var menu: MenuLocale
  var modal: ModalLocale
  var pagination: PaginationLocale
  var select: SelectLocale
  var toast: ToastLocale
}

object Locale {
  @scala.inline
  def apply(
    accordion: AccordionLocale,
    breadcrumbs: BreadcrumbLocale,
    buttongroup: ButtonGroupLocale,
    datepicker: DatepickerLocale,
    fileuploader: FileUploaderLocale,
    menu: MenuLocale,
    modal: ModalLocale,
    pagination: PaginationLocale,
    select: SelectLocale,
    toast: ToastLocale
  ): Locale = {
    val __obj = js.Dynamic.literal(accordion = accordion, breadcrumbs = breadcrumbs, buttongroup = buttongroup, datepicker = datepicker, fileuploader = fileuploader, menu = menu, modal = modal, pagination = pagination, select = select, toast = toast)
  
    __obj.asInstanceOf[Locale]
  }
}

