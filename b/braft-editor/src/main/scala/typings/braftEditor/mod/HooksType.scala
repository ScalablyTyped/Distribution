package typings.braftEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HooksType extends js.Object {
  var `change-block-type`: js.UndefOr[HookFunc] = js.native
  var `deselect-medias`: js.UndefOr[HookFunc] = js.native
  var `exec-editor-command`: js.UndefOr[HookFunc] = js.native
  var `insert-emoji`: js.UndefOr[HookFunc] = js.native
  var `insert-medias`: js.UndefOr[HookFunc] = js.native
  var `open-braft-finder`: js.UndefOr[HookFunc] = js.native
  var `remove-medias`: js.UndefOr[HookFunc] = js.native
  var `select-files`: js.UndefOr[HookFunc] = js.native
  var `select-medias`: js.UndefOr[HookFunc] = js.native
  var `set-image-alignment`: js.UndefOr[HookFunc] = js.native
  var `set-image-float`: js.UndefOr[HookFunc] = js.native
  var `set-image-link`: js.UndefOr[HookFunc] = js.native
  var `set-image-link-target`: js.UndefOr[HookFunc] = js.native
  var `set-image-size`: js.UndefOr[HookFunc] = js.native
  var `toggle-font-family`: js.UndefOr[HookFunc] = js.native
  var `toggle-font-size`: js.UndefOr[HookFunc] = js.native
  var `toggle-inline-style`: js.UndefOr[HookFunc] = js.native
  var `toggle-letter-spacing`: js.UndefOr[HookFunc] = js.native
  var `toggle-line-height`: js.UndefOr[HookFunc] = js.native
  var `toggle-link`: js.UndefOr[HookFunc] = js.native
  var `toggle-text-alignment`: js.UndefOr[HookFunc] = js.native
  var `toggle-text-background-color`: js.UndefOr[HookFunc] = js.native
  var `toggle-text-color`: js.UndefOr[HookFunc] = js.native
}

object HooksType {
  @scala.inline
  def apply(): HooksType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HooksType]
  }
  @scala.inline
  implicit class HooksTypeOps[Self <: HooksType] (val x: Self) extends AnyVal {
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
    def `setChange-block-type`(value: /* any */ js.Any => js.Any): Self = this.set("change-block-type", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteChange-block-type`: Self = this.set("change-block-type", js.undefined)
    @scala.inline
    def `setDeselect-medias`(value: /* any */ js.Any => js.Any): Self = this.set("deselect-medias", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteDeselect-medias`: Self = this.set("deselect-medias", js.undefined)
    @scala.inline
    def `setExec-editor-command`(value: /* any */ js.Any => js.Any): Self = this.set("exec-editor-command", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteExec-editor-command`: Self = this.set("exec-editor-command", js.undefined)
    @scala.inline
    def `setInsert-emoji`(value: /* any */ js.Any => js.Any): Self = this.set("insert-emoji", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteInsert-emoji`: Self = this.set("insert-emoji", js.undefined)
    @scala.inline
    def `setInsert-medias`(value: /* any */ js.Any => js.Any): Self = this.set("insert-medias", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteInsert-medias`: Self = this.set("insert-medias", js.undefined)
    @scala.inline
    def `setOpen-braft-finder`(value: /* any */ js.Any => js.Any): Self = this.set("open-braft-finder", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteOpen-braft-finder`: Self = this.set("open-braft-finder", js.undefined)
    @scala.inline
    def `setRemove-medias`(value: /* any */ js.Any => js.Any): Self = this.set("remove-medias", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteRemove-medias`: Self = this.set("remove-medias", js.undefined)
    @scala.inline
    def `setSelect-files`(value: /* any */ js.Any => js.Any): Self = this.set("select-files", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteSelect-files`: Self = this.set("select-files", js.undefined)
    @scala.inline
    def `setSelect-medias`(value: /* any */ js.Any => js.Any): Self = this.set("select-medias", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteSelect-medias`: Self = this.set("select-medias", js.undefined)
    @scala.inline
    def `setSet-image-alignment`(value: /* any */ js.Any => js.Any): Self = this.set("set-image-alignment", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteSet-image-alignment`: Self = this.set("set-image-alignment", js.undefined)
    @scala.inline
    def `setSet-image-float`(value: /* any */ js.Any => js.Any): Self = this.set("set-image-float", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteSet-image-float`: Self = this.set("set-image-float", js.undefined)
    @scala.inline
    def `setSet-image-link`(value: /* any */ js.Any => js.Any): Self = this.set("set-image-link", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteSet-image-link`: Self = this.set("set-image-link", js.undefined)
    @scala.inline
    def `setSet-image-link-target`(value: /* any */ js.Any => js.Any): Self = this.set("set-image-link-target", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteSet-image-link-target`: Self = this.set("set-image-link-target", js.undefined)
    @scala.inline
    def `setSet-image-size`(value: /* any */ js.Any => js.Any): Self = this.set("set-image-size", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteSet-image-size`: Self = this.set("set-image-size", js.undefined)
    @scala.inline
    def `setToggle-font-family`(value: /* any */ js.Any => js.Any): Self = this.set("toggle-font-family", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteToggle-font-family`: Self = this.set("toggle-font-family", js.undefined)
    @scala.inline
    def `setToggle-font-size`(value: /* any */ js.Any => js.Any): Self = this.set("toggle-font-size", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteToggle-font-size`: Self = this.set("toggle-font-size", js.undefined)
    @scala.inline
    def `setToggle-inline-style`(value: /* any */ js.Any => js.Any): Self = this.set("toggle-inline-style", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteToggle-inline-style`: Self = this.set("toggle-inline-style", js.undefined)
    @scala.inline
    def `setToggle-letter-spacing`(value: /* any */ js.Any => js.Any): Self = this.set("toggle-letter-spacing", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteToggle-letter-spacing`: Self = this.set("toggle-letter-spacing", js.undefined)
    @scala.inline
    def `setToggle-line-height`(value: /* any */ js.Any => js.Any): Self = this.set("toggle-line-height", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteToggle-line-height`: Self = this.set("toggle-line-height", js.undefined)
    @scala.inline
    def `setToggle-link`(value: /* any */ js.Any => js.Any): Self = this.set("toggle-link", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteToggle-link`: Self = this.set("toggle-link", js.undefined)
    @scala.inline
    def `setToggle-text-alignment`(value: /* any */ js.Any => js.Any): Self = this.set("toggle-text-alignment", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteToggle-text-alignment`: Self = this.set("toggle-text-alignment", js.undefined)
    @scala.inline
    def `setToggle-text-background-color`(value: /* any */ js.Any => js.Any): Self = this.set("toggle-text-background-color", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteToggle-text-background-color`: Self = this.set("toggle-text-background-color", js.undefined)
    @scala.inline
    def `setToggle-text-color`(value: /* any */ js.Any => js.Any): Self = this.set("toggle-text-color", js.Any.fromFunction1(value))
    @scala.inline
    def `deleteToggle-text-color`: Self = this.set("toggle-text-color", js.undefined)
  }
  
}

