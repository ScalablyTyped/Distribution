package typings.broccoliNodeApi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureSet
  extends /* feature */ StringDictionary[js.UndefOr[Boolean]] {
  var needsCacheFlag: js.UndefOr[Boolean] = js.native
  var persistentOutputFlag: js.UndefOr[Boolean] = js.native
  var sourceDirectories: js.UndefOr[Boolean] = js.native
}

object FeatureSet {
  @scala.inline
  def apply(): FeatureSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureSet]
  }
  @scala.inline
  implicit class FeatureSetOps[Self <: FeatureSet] (val x: Self) extends AnyVal {
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
    def setNeedsCacheFlag(value: Boolean): Self = this.set("needsCacheFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedsCacheFlag: Self = this.set("needsCacheFlag", js.undefined)
    @scala.inline
    def setPersistentOutputFlag(value: Boolean): Self = this.set("persistentOutputFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentOutputFlag: Self = this.set("persistentOutputFlag", js.undefined)
    @scala.inline
    def setSourceDirectories(value: Boolean): Self = this.set("sourceDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDirectories: Self = this.set("sourceDirectories", js.undefined)
  }
  
}

