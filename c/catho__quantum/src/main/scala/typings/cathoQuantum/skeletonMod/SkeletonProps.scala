package typings.cathoQuantum.skeletonMod

import typings.cathoQuantum.anon.`13`
import typings.cathoQuantum.cathoQuantumStrings.button
import typings.cathoQuantum.cathoQuantumStrings.circle
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.rect
import typings.cathoQuantum.cathoQuantumStrings.small
import typings.cathoQuantum.cathoQuantumStrings.tag
import typings.cathoQuantum.cathoQuantumStrings.text
import typings.cathoQuantum.cathoQuantumStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkeletonProps extends js.Object {
  var height: js.UndefOr[String] = js.native
  var size: js.UndefOr[xsmall | small | medium | large] = js.native
  var theme: js.UndefOr[`13`] = js.native
  var `type`: js.UndefOr[rect | circle | text | button | tag] = js.native
  var width: js.UndefOr[String] = js.native
}

object SkeletonProps {
  @scala.inline
  def apply(): SkeletonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkeletonProps]
  }
  @scala.inline
  implicit class SkeletonPropsOps[Self <: SkeletonProps] (val x: Self) extends AnyVal {
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSize(value: xsmall | small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTheme(value: `13`): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setType(value: rect | circle | text | button | tag): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

