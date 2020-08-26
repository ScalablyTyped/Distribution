package typings.deepmerge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var arrayMerge: js.UndefOr[
    js.Function3[
      /* target */ js.Array[_], 
      /* source */ js.Array[_], 
      /* options */ js.UndefOr[this.type], 
      js.Array[_]
    ]
  ] = js.native
  @JSName("clone")
  var clone_FOptions: js.UndefOr[Boolean] = js.native
  var customMerge: js.UndefOr[
    js.Function2[
      /* key */ String, 
      /* options */ js.UndefOr[this.type], 
      js.UndefOr[js.Function2[/* x */ _, /* y */ _, _]]
    ]
  ] = js.native
  var isMergeableObject: js.UndefOr[js.Function1[/* value */ js.Object, Boolean]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setArrayMerge(
      value: (/* target */ js.Array[_], /* source */ js.Array[_], /* options */ js.UndefOr[Options]) => js.Array[_]
    ): Self = this.set("arrayMerge", js.Any.fromFunction3(value))
    @scala.inline
    def deleteArrayMerge: Self = this.set("arrayMerge", js.undefined)
    @scala.inline
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setCustomMerge(
      value: (/* key */ String, /* options */ js.UndefOr[Options]) => js.UndefOr[js.Function2[/* x */ _, /* y */ _, _]]
    ): Self = this.set("customMerge", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomMerge: Self = this.set("customMerge", js.undefined)
    @scala.inline
    def setIsMergeableObject(value: /* value */ js.Object => Boolean): Self = this.set("isMergeableObject", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsMergeableObject: Self = this.set("isMergeableObject", js.undefined)
  }
  
}

