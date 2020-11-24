package typings.codemirror.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowHintOptions extends js.Object {
  
  var alignWithWord: js.UndefOr[Boolean] = js.native
  
  var closeCharacters: js.UndefOr[RegExp] = js.native
  
  var closeOnUnfocus: js.UndefOr[Boolean] = js.native
  
  var completeOnSingleClick: js.UndefOr[Boolean] = js.native
  
  var completeSingle: js.UndefOr[Boolean] = js.native
  
  var container: js.UndefOr[HTMLElement | Null] = js.native
  
  var customKeys: js.UndefOr[
    (StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String]) | Null
  ] = js.native
  
  var extraKeys: js.UndefOr[
    (StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String]) | Null
  ] = js.native
  
  var hint: HintFunction | AsyncHintFunction = js.native
}
object ShowHintOptions {
  
  @scala.inline
  def apply(hint: HintFunction | AsyncHintFunction): ShowHintOptions = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowHintOptions]
  }
  
  @scala.inline
  implicit class ShowHintOptionsOps[Self <: ShowHintOptions] (val x: Self) extends AnyVal {
    
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
    def setHintFunction1(value: /* cm */ Editor => Hints): Self = this.set("hint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHint(value: HintFunction | AsyncHintFunction): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignWithWord(value: Boolean): Self = this.set("alignWithWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignWithWord: Self = this.set("alignWithWord", js.undefined)
    
    @scala.inline
    def setCloseCharacters(value: RegExp): Self = this.set("closeCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseCharacters: Self = this.set("closeCharacters", js.undefined)
    
    @scala.inline
    def setCloseOnUnfocus(value: Boolean): Self = this.set("closeOnUnfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnUnfocus: Self = this.set("closeOnUnfocus", js.undefined)
    
    @scala.inline
    def setCompleteOnSingleClick(value: Boolean): Self = this.set("completeOnSingleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleteOnSingleClick: Self = this.set("completeOnSingleClick", js.undefined)
    
    @scala.inline
    def setCompleteSingle(value: Boolean): Self = this.set("completeSingle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleteSingle: Self = this.set("completeSingle", js.undefined)
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
    
    @scala.inline
    def setCustomKeys(value: StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String]): Self = this.set("customKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomKeys: Self = this.set("customKeys", js.undefined)
    
    @scala.inline
    def setCustomKeysNull: Self = this.set("customKeys", null)
    
    @scala.inline
    def setExtraKeys(value: StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String]): Self = this.set("extraKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraKeys: Self = this.set("extraKeys", js.undefined)
    
    @scala.inline
    def setExtraKeysNull: Self = this.set("extraKeys", null)
  }
}
