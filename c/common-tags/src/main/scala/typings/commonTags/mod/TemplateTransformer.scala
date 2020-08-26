package typings.commonTags.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateTransformer[TCtx] extends js.Object {
  /**
    * Called before everything else.
    * The result of this hook will be passed to other hooks as `context`.
    * If omitted, `context` will be an empty object.
    */
  var getInitialContext: js.UndefOr[js.Function0[TCtx]] = js.native
  /**
    * Called when all substitutions have been parsed
    * `endResult` is the final value.
    */
  var onEndResult: js.UndefOr[js.Function2[/* endResult */ String, /* context */ TCtx, String]] = js.native
  /**
    * Called when the tag encounters a string.
    * (a string is whatever's not inside "${}" in your template literal)
    * `str` is the value of the current string
    */
  var onString: js.UndefOr[js.Function2[/* str */ String, /* context */ TCtx, String]] = js.native
  /**
    * Called when the tag encounters a substitution.
    * (a substitution is whatever's inside "${}" in your template literal)
    * `substitution` is the value of the current substitution
    * `resultSoFar` is the end result up to the point of this substitution
    */
  var onSubstitution: js.UndefOr[
    js.Function3[/* substitution */ String, /* resultSoFar */ String, /* context */ TCtx, String]
  ] = js.native
}

object TemplateTransformer {
  @scala.inline
  def apply[TCtx](): TemplateTransformer[TCtx] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateTransformer[TCtx]]
  }
  @scala.inline
  implicit class TemplateTransformerOps[Self <: TemplateTransformer[_], TCtx] (val x: Self with TemplateTransformer[TCtx]) extends AnyVal {
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
    def setGetInitialContext(value: () => TCtx): Self = this.set("getInitialContext", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetInitialContext: Self = this.set("getInitialContext", js.undefined)
    @scala.inline
    def setOnEndResult(value: (/* endResult */ String, /* context */ TCtx) => String): Self = this.set("onEndResult", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnEndResult: Self = this.set("onEndResult", js.undefined)
    @scala.inline
    def setOnString(value: (/* str */ String, /* context */ TCtx) => String): Self = this.set("onString", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnString: Self = this.set("onString", js.undefined)
    @scala.inline
    def setOnSubstitution(value: (/* substitution */ String, /* resultSoFar */ String, /* context */ TCtx) => String): Self = this.set("onSubstitution", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnSubstitution: Self = this.set("onSubstitution", js.undefined)
  }
  
}

