package typings.csso.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompressOptions extends js.Object {
  /**
    * Transform a copy of input AST if true. Useful in case of AST reuse.
    * @default false
    */
  @JSName("clone")
  var clone_FCompressOptions: js.UndefOr[Boolean] = js.native
  /**
    * Specify what comments to leave:
    * - 'exclamation' or true – leave all exclamation comments
    * - 'first-exclamation' – remove every comment except first one
    * - false – remove all comments
    * @default true
    */
  var comments: js.UndefOr[String | Boolean] = js.native
  /**
    * Enables merging of @media rules with the same media query by splitted by other rules.
    * The optimisation is unsafe in general, but should work fine in most cases. Use it on your own risk.
    * @default false
    */
  var forceMediaMerge: js.UndefOr[Boolean] = js.native
  /**
    * Function to track every step of transformation.
    */
  var logger: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Disable or enable a structure optimisations.
    * @default true
    */
  var restructure: js.UndefOr[Boolean] = js.native
  /**
    * Usage data for advanced optimisations.
    */
  var usage: js.UndefOr[Usage] = js.native
}

object CompressOptions {
  @scala.inline
  def apply(): CompressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressOptions]
  }
  @scala.inline
  implicit class CompressOptionsOps[Self <: CompressOptions] (val x: Self) extends AnyVal {
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
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setComments(value: String | Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setForceMediaMerge(value: Boolean): Self = this.set("forceMediaMerge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceMediaMerge: Self = this.set("forceMediaMerge", js.undefined)
    @scala.inline
    def setLogger(value: () => Unit): Self = this.set("logger", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setRestructure(value: Boolean): Self = this.set("restructure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestructure: Self = this.set("restructure", js.undefined)
    @scala.inline
    def setUsage(value: Usage): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
  
}

