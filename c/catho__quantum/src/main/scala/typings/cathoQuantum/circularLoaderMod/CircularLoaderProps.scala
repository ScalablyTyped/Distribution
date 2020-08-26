package typings.cathoQuantum.circularLoaderMod

import typings.cathoQuantum.anon.Gutter
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.secondary
import typings.cathoQuantum.cathoQuantumStrings.xlarge
import typings.cathoQuantum.cathoQuantumStrings.xxlarge
import typings.cathoQuantum.cathoQuantumStrings.xxxlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircularLoaderProps extends js.Object {
  var size: js.UndefOr[medium | large | xlarge | xxlarge | xxxlarge] = js.native
  var skin: js.UndefOr[primary | secondary] = js.native
  var theme: js.UndefOr[Gutter] = js.native
}

object CircularLoaderProps {
  @scala.inline
  def apply(): CircularLoaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircularLoaderProps]
  }
  @scala.inline
  implicit class CircularLoaderPropsOps[Self <: CircularLoaderProps] (val x: Self) extends AnyVal {
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
    def setSize(value: medium | large | xlarge | xxlarge | xxxlarge): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSkin(value: primary | secondary): Self = this.set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    @scala.inline
    def setTheme(value: Gutter): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

