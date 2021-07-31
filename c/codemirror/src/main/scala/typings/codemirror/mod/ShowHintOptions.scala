package typings.codemirror.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowHintOptions extends StObject {
  
  var alignWithWord: js.UndefOr[Boolean] = js.undefined
  
  var closeCharacters: js.UndefOr[RegExp] = js.undefined
  
  var closeOnUnfocus: js.UndefOr[Boolean] = js.undefined
  
  var completeOnSingleClick: js.UndefOr[Boolean] = js.undefined
  
  var completeSingle: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[HTMLElement | Null] = js.undefined
  
  var customKeys: js.UndefOr[
    (StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String]) | Null
  ] = js.undefined
  
  var extraKeys: js.UndefOr[
    (StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String]) | Null
  ] = js.undefined
  
  var hint: HintFunction | AsyncHintFunction
}
object ShowHintOptions {
  
  @scala.inline
  def apply(hint: HintFunction | AsyncHintFunction): ShowHintOptions = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowHintOptions]
  }
  
  @scala.inline
  implicit class ShowHintOptionsMutableBuilder[Self <: ShowHintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignWithWord(value: Boolean): Self = StObject.set(x, "alignWithWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignWithWordUndefined: Self = StObject.set(x, "alignWithWord", js.undefined)
    
    @scala.inline
    def setCloseCharacters(value: RegExp): Self = StObject.set(x, "closeCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseCharactersUndefined: Self = StObject.set(x, "closeCharacters", js.undefined)
    
    @scala.inline
    def setCloseOnUnfocus(value: Boolean): Self = StObject.set(x, "closeOnUnfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnUnfocusUndefined: Self = StObject.set(x, "closeOnUnfocus", js.undefined)
    
    @scala.inline
    def setCompleteOnSingleClick(value: Boolean): Self = StObject.set(x, "completeOnSingleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteOnSingleClickUndefined: Self = StObject.set(x, "completeOnSingleClick", js.undefined)
    
    @scala.inline
    def setCompleteSingle(value: Boolean): Self = StObject.set(x, "completeSingle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteSingleUndefined: Self = StObject.set(x, "completeSingle", js.undefined)
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = StObject.set(x, "container", null)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setCustomKeys(value: StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String]): Self = StObject.set(x, "customKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomKeysNull: Self = StObject.set(x, "customKeys", null)
    
    @scala.inline
    def setCustomKeysUndefined: Self = StObject.set(x, "customKeys", js.undefined)
    
    @scala.inline
    def setExtraKeys(value: StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String]): Self = StObject.set(x, "extraKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraKeysNull: Self = StObject.set(x, "extraKeys", null)
    
    @scala.inline
    def setExtraKeysUndefined: Self = StObject.set(x, "extraKeys", js.undefined)
    
    @scala.inline
    def setHint(value: HintFunction | AsyncHintFunction): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintFunction1(value: /* cm */ Editor => Hints): Self = StObject.set(x, "hint", js.Any.fromFunction1(value))
  }
}
