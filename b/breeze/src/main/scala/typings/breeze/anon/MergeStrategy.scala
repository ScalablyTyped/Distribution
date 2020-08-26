package typings.breeze.anon

import typings.breeze.breeze.MergeStrategySymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeStrategy extends js.Object {
  var mergeStrategy: js.UndefOr[MergeStrategySymbol] = js.native
  var metadataVersionFn: js.UndefOr[js.Function1[/* any */ js.Any, Unit]] = js.native
}

object MergeStrategy {
  @scala.inline
  def apply(): MergeStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeStrategy]
  }
  @scala.inline
  implicit class MergeStrategyOps[Self <: MergeStrategy] (val x: Self) extends AnyVal {
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
    def setMergeStrategy(value: MergeStrategySymbol): Self = this.set("mergeStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeStrategy: Self = this.set("mergeStrategy", js.undefined)
    @scala.inline
    def setMetadataVersionFn(value: /* any */ js.Any => Unit): Self = this.set("metadataVersionFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMetadataVersionFn: Self = this.set("metadataVersionFn", js.undefined)
  }
  
}

