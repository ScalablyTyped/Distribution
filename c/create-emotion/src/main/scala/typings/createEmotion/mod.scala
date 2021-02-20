package typings.createEmotion

import org.scalablytyped.runtime.StringDictionary
import typings.createEmotion.createEmotionNumbers.`1`
import typings.createEmotion.createEmotionNumbers.`2`
import typings.createEmotion.createEmotionNumbers.`3`
import typings.csstype.mod.PropertiesFallback
import typings.std.Array
import typings.std.HTMLElement
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-emotion", JSImport.Default)
  @js.native
  def default(context: EmotionContext): Emotion = js.native
  @JSImport("create-emotion", JSImport.Default)
  @js.native
  def default(context: EmotionContext, options: EmotionOptions): Emotion = js.native
  
  @js.native
  trait ArrayClassNameArg extends Array[ClassNameArg]
  
  @js.native
  trait ArrayInterpolation
    extends Array[Interpolation]
       with _Interpolation
  
  type CSSBaseObject = PropertiesFallback[Double | String]
  
  @js.native
  trait CSSObject
    extends PropertiesFallback[Double | String]
       with CSSPseudoObject
       with CSSOthersObject
       with _Interpolation
  object CSSObject {
    
    @scala.inline
    def apply(): CSSObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSObject]
    }
  }
  
  @js.native
  trait CSSOthersObject extends /* propertiesName */ StringDictionary[Interpolation]
  object CSSOthersObject {
    
    @scala.inline
    def apply(): CSSOthersObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSOthersObject]
    }
  }
  
  /* Inlined {[ K in csstype.csstype.Pseudos ]:? create-emotion.create-emotion.CSSObject} */
  @js.native
  trait CSSPseudoObject extends StObject {
    
    @JSName(":-khtml-any-link")
    var `Colon-khtml-any-link`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":-moz-any-link")
    var `Colon-moz-any-link`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":-moz-any()")
    var `Colon-moz-anyLeftparenthesisRightparenthesis`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":-moz-dir")
    var `Colon-moz-dir`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":-moz-focusring")
    var `Colon-moz-focusring`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":-moz-full-screen")
    var `Colon-moz-full-screen`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":-moz-placeholder")
    var `Colon-moz-placeholder`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":-moz-read-only")
    var `Colon-moz-read-only`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":-moz-read-write")
    var `Colon-moz-read-write`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":-ms-fullscreen")
    var `Colon-ms-fullscreen`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":-ms-input-placeholder")
    var `Colon-ms-input-placeholder`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":-webkit-any-link")
    var `Colon-webkit-any-link`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":-webkit-any()")
    var `Colon-webkit-anyLeftparenthesisRightparenthesis`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":-webkit-full-screen")
    var `Colon-webkit-full-screen`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-moz-placeholder")
    var `ColonColon-moz-placeholder`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-moz-progress-bar")
    var `ColonColon-moz-progress-bar`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-moz-range-progress")
    var `ColonColon-moz-range-progress`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-moz-range-thumb")
    var `ColonColon-moz-range-thumb`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-moz-range-track")
    var `ColonColon-moz-range-track`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-moz-selection")
    var `ColonColon-moz-selection`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-backdrop")
    var `ColonColon-ms-backdrop`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-browse")
    var `ColonColon-ms-browse`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-check")
    var `ColonColon-ms-check`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-clear")
    var `ColonColon-ms-clear`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-fill")
    var `ColonColon-ms-fill`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-fill-lower")
    var `ColonColon-ms-fill-lower`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-fill-upper")
    var `ColonColon-ms-fill-upper`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-input-placeholder")
    var `ColonColon-ms-input-placeholder`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-reveal")
    var `ColonColon-ms-reveal`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-thumb")
    var `ColonColon-ms-thumb`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-ticks-after")
    var `ColonColon-ms-ticks-after`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-ticks-before")
    var `ColonColon-ms-ticks-before`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-tooltip")
    var `ColonColon-ms-tooltip`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-track")
    var `ColonColon-ms-track`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-ms-value")
    var `ColonColon-ms-value`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-webkit-backdrop")
    var `ColonColon-webkit-backdrop`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-webkit-input-placeholder")
    var `ColonColon-webkit-input-placeholder`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-webkit-progress-bar")
    var `ColonColon-webkit-progress-bar`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-webkit-progress-inner-value")
    var `ColonColon-webkit-progress-inner-value`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-webkit-progress-value")
    var `ColonColon-webkit-progress-value`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-webkit-slider-runnable-track")
    var `ColonColon-webkit-slider-runnable-track`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::-webkit-slider-thumb")
    var `ColonColon-webkit-slider-thumb`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::after")
    var ColonColonafter: js.UndefOr[CSSObject] = js.native
    
    @JSName("::backdrop")
    var ColonColonbackdrop: js.UndefOr[CSSObject] = js.native
    
    @JSName("::before")
    var ColonColonbefore: js.UndefOr[CSSObject] = js.native
    
    @JSName("::cue")
    var ColonColoncue: js.UndefOr[CSSObject] = js.native
    
    @JSName("::cue-region")
    var `ColonColoncue-region`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::first-letter")
    var `ColonColonfirst-letter`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::first-line")
    var `ColonColonfirst-line`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::grammar-error")
    var `ColonColongrammar-error`: js.UndefOr[CSSObject] = js.native
    
    @JSName("::marker")
    var ColonColonmarker: js.UndefOr[CSSObject] = js.native
    
    @JSName("::part")
    var ColonColonpart: js.UndefOr[CSSObject] = js.native
    
    @JSName("::placeholder")
    var ColonColonplaceholder: js.UndefOr[CSSObject] = js.native
    
    @JSName("::selection")
    var ColonColonselection: js.UndefOr[CSSObject] = js.native
    
    @JSName("::slotted")
    var ColonColonslotted: js.UndefOr[CSSObject] = js.native
    
    @JSName("::spelling-error")
    var `ColonColonspelling-error`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":active")
    var Colonactive: js.UndefOr[CSSObject] = js.native
    
    @JSName(":after")
    var Colonafter: js.UndefOr[CSSObject] = js.native
    
    @JSName(":any-link")
    var `Colonany-link`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":before")
    var Colonbefore: js.UndefOr[CSSObject] = js.native
    
    @JSName(":blank")
    var Colonblank: js.UndefOr[CSSObject] = js.native
    
    @JSName(":checked")
    var Colonchecked: js.UndefOr[CSSObject] = js.native
    
    @JSName(":default")
    var Colondefault: js.UndefOr[CSSObject] = js.native
    
    @JSName(":defined")
    var Colondefined: js.UndefOr[CSSObject] = js.native
    
    @JSName(":dir")
    var Colondir: js.UndefOr[CSSObject] = js.native
    
    @JSName(":disabled")
    var Colondisabled: js.UndefOr[CSSObject] = js.native
    
    @JSName(":empty")
    var Colonempty: js.UndefOr[CSSObject] = js.native
    
    @JSName(":enabled")
    var Colonenabled: js.UndefOr[CSSObject] = js.native
    
    @JSName(":first")
    var Colonfirst: js.UndefOr[CSSObject] = js.native
    
    @JSName(":first-child")
    var `Colonfirst-child`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":first-letter")
    var `Colonfirst-letter`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":first-line")
    var `Colonfirst-line`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":first-of-type")
    var `Colonfirst-of-type`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":focus")
    var Colonfocus: js.UndefOr[CSSObject] = js.native
    
    @JSName(":focus-visible")
    var `Colonfocus-visible`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":focus-within")
    var `Colonfocus-within`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":fullscreen")
    var Colonfullscreen: js.UndefOr[CSSObject] = js.native
    
    @JSName(":has")
    var Colonhas: js.UndefOr[CSSObject] = js.native
    
    @JSName(":host")
    var Colonhost: js.UndefOr[CSSObject] = js.native
    
    @JSName(":host-context")
    var `Colonhost-context`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":hover")
    var Colonhover: js.UndefOr[CSSObject] = js.native
    
    @JSName(":in-range")
    var `Colonin-range`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":indeterminate")
    var Colonindeterminate: js.UndefOr[CSSObject] = js.native
    
    @JSName(":invalid")
    var Coloninvalid: js.UndefOr[CSSObject] = js.native
    
    @JSName(":is")
    var Colonis: js.UndefOr[CSSObject] = js.native
    
    @JSName(":lang")
    var Colonlang: js.UndefOr[CSSObject] = js.native
    
    @JSName(":last-child")
    var `Colonlast-child`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":last-of-type")
    var `Colonlast-of-type`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":left")
    var Colonleft: js.UndefOr[CSSObject] = js.native
    
    @JSName(":link")
    var Colonlink: js.UndefOr[CSSObject] = js.native
    
    @JSName(":matches()")
    var ColonmatchesLeftparenthesisRightparenthesis: js.UndefOr[CSSObject] = js.native
    
    @JSName(":not")
    var Colonnot: js.UndefOr[CSSObject] = js.native
    
    @JSName(":nth-child")
    var `Colonnth-child`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":nth-last-child")
    var `Colonnth-last-child`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":nth-last-of-type")
    var `Colonnth-last-of-type`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":nth-of-type")
    var `Colonnth-of-type`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":only-child")
    var `Colononly-child`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":only-of-type")
    var `Colononly-of-type`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":optional")
    var Colonoptional: js.UndefOr[CSSObject] = js.native
    
    @JSName(":out-of-range")
    var `Colonout-of-range`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":placeholder-shown")
    var `Colonplaceholder-shown`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":read-only")
    var `Colonread-only`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":read-write")
    var `Colonread-write`: js.UndefOr[CSSObject] = js.native
    
    @JSName(":required")
    var Colonrequired: js.UndefOr[CSSObject] = js.native
    
    @JSName(":right")
    var Colonright: js.UndefOr[CSSObject] = js.native
    
    @JSName(":root")
    var Colonroot: js.UndefOr[CSSObject] = js.native
    
    @JSName(":scope")
    var Colonscope: js.UndefOr[CSSObject] = js.native
    
    @JSName(":target")
    var Colontarget: js.UndefOr[CSSObject] = js.native
    
    @JSName(":valid")
    var Colonvalid: js.UndefOr[CSSObject] = js.native
    
    @JSName(":visited")
    var Colonvisited: js.UndefOr[CSSObject] = js.native
    
    @JSName(":where")
    var Colonwhere: js.UndefOr[CSSObject] = js.native
  }
  object CSSPseudoObject {
    
    @scala.inline
    def apply(): CSSPseudoObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSPseudoObject]
    }
    
    @scala.inline
    implicit class CSSPseudoObjectMutableBuilder[Self <: CSSPseudoObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setColon-khtml-any-link`(value: CSSObject): Self = StObject.set(x, ":-khtml-any-link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-khtml-any-linkUndefined`: Self = StObject.set(x, ":-khtml-any-link", js.undefined)
      
      @scala.inline
      def `setColon-moz-any-link`(value: CSSObject): Self = StObject.set(x, ":-moz-any-link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-moz-any-linkUndefined`: Self = StObject.set(x, ":-moz-any-link", js.undefined)
      
      @scala.inline
      def `setColon-moz-anyLeftparenthesisRightparenthesis`(value: CSSObject): Self = StObject.set(x, ":-moz-any()", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-moz-anyLeftparenthesisRightparenthesisUndefined`: Self = StObject.set(x, ":-moz-any()", js.undefined)
      
      @scala.inline
      def `setColon-moz-dir`(value: CSSObject): Self = StObject.set(x, ":-moz-dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-moz-dirUndefined`: Self = StObject.set(x, ":-moz-dir", js.undefined)
      
      @scala.inline
      def `setColon-moz-focusring`(value: CSSObject): Self = StObject.set(x, ":-moz-focusring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-moz-focusringUndefined`: Self = StObject.set(x, ":-moz-focusring", js.undefined)
      
      @scala.inline
      def `setColon-moz-full-screen`(value: CSSObject): Self = StObject.set(x, ":-moz-full-screen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-moz-full-screenUndefined`: Self = StObject.set(x, ":-moz-full-screen", js.undefined)
      
      @scala.inline
      def `setColon-moz-placeholder`(value: CSSObject): Self = StObject.set(x, ":-moz-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-moz-placeholderUndefined`: Self = StObject.set(x, ":-moz-placeholder", js.undefined)
      
      @scala.inline
      def `setColon-moz-read-only`(value: CSSObject): Self = StObject.set(x, ":-moz-read-only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-moz-read-onlyUndefined`: Self = StObject.set(x, ":-moz-read-only", js.undefined)
      
      @scala.inline
      def `setColon-moz-read-write`(value: CSSObject): Self = StObject.set(x, ":-moz-read-write", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-moz-read-writeUndefined`: Self = StObject.set(x, ":-moz-read-write", js.undefined)
      
      @scala.inline
      def `setColon-ms-fullscreen`(value: CSSObject): Self = StObject.set(x, ":-ms-fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-ms-fullscreenUndefined`: Self = StObject.set(x, ":-ms-fullscreen", js.undefined)
      
      @scala.inline
      def `setColon-ms-input-placeholder`(value: CSSObject): Self = StObject.set(x, ":-ms-input-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-ms-input-placeholderUndefined`: Self = StObject.set(x, ":-ms-input-placeholder", js.undefined)
      
      @scala.inline
      def `setColon-webkit-any-link`(value: CSSObject): Self = StObject.set(x, ":-webkit-any-link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-webkit-any-linkUndefined`: Self = StObject.set(x, ":-webkit-any-link", js.undefined)
      
      @scala.inline
      def `setColon-webkit-anyLeftparenthesisRightparenthesis`(value: CSSObject): Self = StObject.set(x, ":-webkit-any()", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-webkit-anyLeftparenthesisRightparenthesisUndefined`: Self = StObject.set(x, ":-webkit-any()", js.undefined)
      
      @scala.inline
      def `setColon-webkit-full-screen`(value: CSSObject): Self = StObject.set(x, ":-webkit-full-screen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColon-webkit-full-screenUndefined`: Self = StObject.set(x, ":-webkit-full-screen", js.undefined)
      
      @scala.inline
      def `setColonColon-moz-placeholder`(value: CSSObject): Self = StObject.set(x, "::-moz-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-moz-placeholderUndefined`: Self = StObject.set(x, "::-moz-placeholder", js.undefined)
      
      @scala.inline
      def `setColonColon-moz-progress-bar`(value: CSSObject): Self = StObject.set(x, "::-moz-progress-bar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-moz-progress-barUndefined`: Self = StObject.set(x, "::-moz-progress-bar", js.undefined)
      
      @scala.inline
      def `setColonColon-moz-range-progress`(value: CSSObject): Self = StObject.set(x, "::-moz-range-progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-moz-range-progressUndefined`: Self = StObject.set(x, "::-moz-range-progress", js.undefined)
      
      @scala.inline
      def `setColonColon-moz-range-thumb`(value: CSSObject): Self = StObject.set(x, "::-moz-range-thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-moz-range-thumbUndefined`: Self = StObject.set(x, "::-moz-range-thumb", js.undefined)
      
      @scala.inline
      def `setColonColon-moz-range-track`(value: CSSObject): Self = StObject.set(x, "::-moz-range-track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-moz-range-trackUndefined`: Self = StObject.set(x, "::-moz-range-track", js.undefined)
      
      @scala.inline
      def `setColonColon-moz-selection`(value: CSSObject): Self = StObject.set(x, "::-moz-selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-moz-selectionUndefined`: Self = StObject.set(x, "::-moz-selection", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-backdrop`(value: CSSObject): Self = StObject.set(x, "::-ms-backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-backdropUndefined`: Self = StObject.set(x, "::-ms-backdrop", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-browse`(value: CSSObject): Self = StObject.set(x, "::-ms-browse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-browseUndefined`: Self = StObject.set(x, "::-ms-browse", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-check`(value: CSSObject): Self = StObject.set(x, "::-ms-check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-checkUndefined`: Self = StObject.set(x, "::-ms-check", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-clear`(value: CSSObject): Self = StObject.set(x, "::-ms-clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-clearUndefined`: Self = StObject.set(x, "::-ms-clear", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-fill`(value: CSSObject): Self = StObject.set(x, "::-ms-fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-fill-lower`(value: CSSObject): Self = StObject.set(x, "::-ms-fill-lower", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-fill-lowerUndefined`: Self = StObject.set(x, "::-ms-fill-lower", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-fill-upper`(value: CSSObject): Self = StObject.set(x, "::-ms-fill-upper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-fill-upperUndefined`: Self = StObject.set(x, "::-ms-fill-upper", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-fillUndefined`: Self = StObject.set(x, "::-ms-fill", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-input-placeholder`(value: CSSObject): Self = StObject.set(x, "::-ms-input-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-input-placeholderUndefined`: Self = StObject.set(x, "::-ms-input-placeholder", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-reveal`(value: CSSObject): Self = StObject.set(x, "::-ms-reveal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-revealUndefined`: Self = StObject.set(x, "::-ms-reveal", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-thumb`(value: CSSObject): Self = StObject.set(x, "::-ms-thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-thumbUndefined`: Self = StObject.set(x, "::-ms-thumb", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-ticks-after`(value: CSSObject): Self = StObject.set(x, "::-ms-ticks-after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-ticks-afterUndefined`: Self = StObject.set(x, "::-ms-ticks-after", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-ticks-before`(value: CSSObject): Self = StObject.set(x, "::-ms-ticks-before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-ticks-beforeUndefined`: Self = StObject.set(x, "::-ms-ticks-before", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-tooltip`(value: CSSObject): Self = StObject.set(x, "::-ms-tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-tooltipUndefined`: Self = StObject.set(x, "::-ms-tooltip", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-track`(value: CSSObject): Self = StObject.set(x, "::-ms-track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-trackUndefined`: Self = StObject.set(x, "::-ms-track", js.undefined)
      
      @scala.inline
      def `setColonColon-ms-value`(value: CSSObject): Self = StObject.set(x, "::-ms-value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-ms-valueUndefined`: Self = StObject.set(x, "::-ms-value", js.undefined)
      
      @scala.inline
      def `setColonColon-webkit-backdrop`(value: CSSObject): Self = StObject.set(x, "::-webkit-backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-webkit-backdropUndefined`: Self = StObject.set(x, "::-webkit-backdrop", js.undefined)
      
      @scala.inline
      def `setColonColon-webkit-input-placeholder`(value: CSSObject): Self = StObject.set(x, "::-webkit-input-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-webkit-input-placeholderUndefined`: Self = StObject.set(x, "::-webkit-input-placeholder", js.undefined)
      
      @scala.inline
      def `setColonColon-webkit-progress-bar`(value: CSSObject): Self = StObject.set(x, "::-webkit-progress-bar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-webkit-progress-barUndefined`: Self = StObject.set(x, "::-webkit-progress-bar", js.undefined)
      
      @scala.inline
      def `setColonColon-webkit-progress-inner-value`(value: CSSObject): Self = StObject.set(x, "::-webkit-progress-inner-value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-webkit-progress-inner-valueUndefined`: Self = StObject.set(x, "::-webkit-progress-inner-value", js.undefined)
      
      @scala.inline
      def `setColonColon-webkit-progress-value`(value: CSSObject): Self = StObject.set(x, "::-webkit-progress-value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-webkit-progress-valueUndefined`: Self = StObject.set(x, "::-webkit-progress-value", js.undefined)
      
      @scala.inline
      def `setColonColon-webkit-slider-runnable-track`(value: CSSObject): Self = StObject.set(x, "::-webkit-slider-runnable-track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-webkit-slider-runnable-trackUndefined`: Self = StObject.set(x, "::-webkit-slider-runnable-track", js.undefined)
      
      @scala.inline
      def `setColonColon-webkit-slider-thumb`(value: CSSObject): Self = StObject.set(x, "::-webkit-slider-thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColon-webkit-slider-thumbUndefined`: Self = StObject.set(x, "::-webkit-slider-thumb", js.undefined)
      
      @scala.inline
      def setColonColonafter(value: CSSObject): Self = StObject.set(x, "::after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonColonafterUndefined: Self = StObject.set(x, "::after", js.undefined)
      
      @scala.inline
      def setColonColonbackdrop(value: CSSObject): Self = StObject.set(x, "::backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonColonbackdropUndefined: Self = StObject.set(x, "::backdrop", js.undefined)
      
      @scala.inline
      def setColonColonbefore(value: CSSObject): Self = StObject.set(x, "::before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonColonbeforeUndefined: Self = StObject.set(x, "::before", js.undefined)
      
      @scala.inline
      def setColonColoncue(value: CSSObject): Self = StObject.set(x, "::cue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColoncue-region`(value: CSSObject): Self = StObject.set(x, "::cue-region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColoncue-regionUndefined`: Self = StObject.set(x, "::cue-region", js.undefined)
      
      @scala.inline
      def setColonColoncueUndefined: Self = StObject.set(x, "::cue", js.undefined)
      
      @scala.inline
      def `setColonColonfirst-letter`(value: CSSObject): Self = StObject.set(x, "::first-letter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColonfirst-letterUndefined`: Self = StObject.set(x, "::first-letter", js.undefined)
      
      @scala.inline
      def `setColonColonfirst-line`(value: CSSObject): Self = StObject.set(x, "::first-line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColonfirst-lineUndefined`: Self = StObject.set(x, "::first-line", js.undefined)
      
      @scala.inline
      def `setColonColongrammar-error`(value: CSSObject): Self = StObject.set(x, "::grammar-error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColongrammar-errorUndefined`: Self = StObject.set(x, "::grammar-error", js.undefined)
      
      @scala.inline
      def setColonColonmarker(value: CSSObject): Self = StObject.set(x, "::marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonColonmarkerUndefined: Self = StObject.set(x, "::marker", js.undefined)
      
      @scala.inline
      def setColonColonpart(value: CSSObject): Self = StObject.set(x, "::part", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonColonpartUndefined: Self = StObject.set(x, "::part", js.undefined)
      
      @scala.inline
      def setColonColonplaceholder(value: CSSObject): Self = StObject.set(x, "::placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonColonplaceholderUndefined: Self = StObject.set(x, "::placeholder", js.undefined)
      
      @scala.inline
      def setColonColonselection(value: CSSObject): Self = StObject.set(x, "::selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonColonselectionUndefined: Self = StObject.set(x, "::selection", js.undefined)
      
      @scala.inline
      def setColonColonslotted(value: CSSObject): Self = StObject.set(x, "::slotted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonColonslottedUndefined: Self = StObject.set(x, "::slotted", js.undefined)
      
      @scala.inline
      def `setColonColonspelling-error`(value: CSSObject): Self = StObject.set(x, "::spelling-error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonColonspelling-errorUndefined`: Self = StObject.set(x, "::spelling-error", js.undefined)
      
      @scala.inline
      def setColonactive(value: CSSObject): Self = StObject.set(x, ":active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonactiveUndefined: Self = StObject.set(x, ":active", js.undefined)
      
      @scala.inline
      def setColonafter(value: CSSObject): Self = StObject.set(x, ":after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonafterUndefined: Self = StObject.set(x, ":after", js.undefined)
      
      @scala.inline
      def `setColonany-link`(value: CSSObject): Self = StObject.set(x, ":any-link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonany-linkUndefined`: Self = StObject.set(x, ":any-link", js.undefined)
      
      @scala.inline
      def setColonbefore(value: CSSObject): Self = StObject.set(x, ":before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonbeforeUndefined: Self = StObject.set(x, ":before", js.undefined)
      
      @scala.inline
      def setColonblank(value: CSSObject): Self = StObject.set(x, ":blank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonblankUndefined: Self = StObject.set(x, ":blank", js.undefined)
      
      @scala.inline
      def setColonchecked(value: CSSObject): Self = StObject.set(x, ":checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColoncheckedUndefined: Self = StObject.set(x, ":checked", js.undefined)
      
      @scala.inline
      def setColondefault(value: CSSObject): Self = StObject.set(x, ":default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColondefaultUndefined: Self = StObject.set(x, ":default", js.undefined)
      
      @scala.inline
      def setColondefined(value: CSSObject): Self = StObject.set(x, ":defined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColondefinedUndefined: Self = StObject.set(x, ":defined", js.undefined)
      
      @scala.inline
      def setColondir(value: CSSObject): Self = StObject.set(x, ":dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColondirUndefined: Self = StObject.set(x, ":dir", js.undefined)
      
      @scala.inline
      def setColondisabled(value: CSSObject): Self = StObject.set(x, ":disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColondisabledUndefined: Self = StObject.set(x, ":disabled", js.undefined)
      
      @scala.inline
      def setColonempty(value: CSSObject): Self = StObject.set(x, ":empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonemptyUndefined: Self = StObject.set(x, ":empty", js.undefined)
      
      @scala.inline
      def setColonenabled(value: CSSObject): Self = StObject.set(x, ":enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonenabledUndefined: Self = StObject.set(x, ":enabled", js.undefined)
      
      @scala.inline
      def setColonfirst(value: CSSObject): Self = StObject.set(x, ":first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonfirst-child`(value: CSSObject): Self = StObject.set(x, ":first-child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonfirst-childUndefined`: Self = StObject.set(x, ":first-child", js.undefined)
      
      @scala.inline
      def `setColonfirst-letter`(value: CSSObject): Self = StObject.set(x, ":first-letter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonfirst-letterUndefined`: Self = StObject.set(x, ":first-letter", js.undefined)
      
      @scala.inline
      def `setColonfirst-line`(value: CSSObject): Self = StObject.set(x, ":first-line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonfirst-lineUndefined`: Self = StObject.set(x, ":first-line", js.undefined)
      
      @scala.inline
      def `setColonfirst-of-type`(value: CSSObject): Self = StObject.set(x, ":first-of-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonfirst-of-typeUndefined`: Self = StObject.set(x, ":first-of-type", js.undefined)
      
      @scala.inline
      def setColonfirstUndefined: Self = StObject.set(x, ":first", js.undefined)
      
      @scala.inline
      def setColonfocus(value: CSSObject): Self = StObject.set(x, ":focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonfocus-visible`(value: CSSObject): Self = StObject.set(x, ":focus-visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonfocus-visibleUndefined`: Self = StObject.set(x, ":focus-visible", js.undefined)
      
      @scala.inline
      def `setColonfocus-within`(value: CSSObject): Self = StObject.set(x, ":focus-within", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonfocus-withinUndefined`: Self = StObject.set(x, ":focus-within", js.undefined)
      
      @scala.inline
      def setColonfocusUndefined: Self = StObject.set(x, ":focus", js.undefined)
      
      @scala.inline
      def setColonfullscreen(value: CSSObject): Self = StObject.set(x, ":fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonfullscreenUndefined: Self = StObject.set(x, ":fullscreen", js.undefined)
      
      @scala.inline
      def setColonhas(value: CSSObject): Self = StObject.set(x, ":has", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonhasUndefined: Self = StObject.set(x, ":has", js.undefined)
      
      @scala.inline
      def setColonhost(value: CSSObject): Self = StObject.set(x, ":host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonhost-context`(value: CSSObject): Self = StObject.set(x, ":host-context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonhost-contextUndefined`: Self = StObject.set(x, ":host-context", js.undefined)
      
      @scala.inline
      def setColonhostUndefined: Self = StObject.set(x, ":host", js.undefined)
      
      @scala.inline
      def setColonhover(value: CSSObject): Self = StObject.set(x, ":hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonhoverUndefined: Self = StObject.set(x, ":hover", js.undefined)
      
      @scala.inline
      def `setColonin-range`(value: CSSObject): Self = StObject.set(x, ":in-range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonin-rangeUndefined`: Self = StObject.set(x, ":in-range", js.undefined)
      
      @scala.inline
      def setColonindeterminate(value: CSSObject): Self = StObject.set(x, ":indeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonindeterminateUndefined: Self = StObject.set(x, ":indeterminate", js.undefined)
      
      @scala.inline
      def setColoninvalid(value: CSSObject): Self = StObject.set(x, ":invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColoninvalidUndefined: Self = StObject.set(x, ":invalid", js.undefined)
      
      @scala.inline
      def setColonis(value: CSSObject): Self = StObject.set(x, ":is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonisUndefined: Self = StObject.set(x, ":is", js.undefined)
      
      @scala.inline
      def setColonlang(value: CSSObject): Self = StObject.set(x, ":lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonlangUndefined: Self = StObject.set(x, ":lang", js.undefined)
      
      @scala.inline
      def `setColonlast-child`(value: CSSObject): Self = StObject.set(x, ":last-child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonlast-childUndefined`: Self = StObject.set(x, ":last-child", js.undefined)
      
      @scala.inline
      def `setColonlast-of-type`(value: CSSObject): Self = StObject.set(x, ":last-of-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonlast-of-typeUndefined`: Self = StObject.set(x, ":last-of-type", js.undefined)
      
      @scala.inline
      def setColonleft(value: CSSObject): Self = StObject.set(x, ":left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonleftUndefined: Self = StObject.set(x, ":left", js.undefined)
      
      @scala.inline
      def setColonlink(value: CSSObject): Self = StObject.set(x, ":link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonlinkUndefined: Self = StObject.set(x, ":link", js.undefined)
      
      @scala.inline
      def setColonmatchesLeftparenthesisRightparenthesis(value: CSSObject): Self = StObject.set(x, ":matches()", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonmatchesLeftparenthesisRightparenthesisUndefined: Self = StObject.set(x, ":matches()", js.undefined)
      
      @scala.inline
      def setColonnot(value: CSSObject): Self = StObject.set(x, ":not", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonnotUndefined: Self = StObject.set(x, ":not", js.undefined)
      
      @scala.inline
      def `setColonnth-child`(value: CSSObject): Self = StObject.set(x, ":nth-child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonnth-childUndefined`: Self = StObject.set(x, ":nth-child", js.undefined)
      
      @scala.inline
      def `setColonnth-last-child`(value: CSSObject): Self = StObject.set(x, ":nth-last-child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonnth-last-childUndefined`: Self = StObject.set(x, ":nth-last-child", js.undefined)
      
      @scala.inline
      def `setColonnth-last-of-type`(value: CSSObject): Self = StObject.set(x, ":nth-last-of-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonnth-last-of-typeUndefined`: Self = StObject.set(x, ":nth-last-of-type", js.undefined)
      
      @scala.inline
      def `setColonnth-of-type`(value: CSSObject): Self = StObject.set(x, ":nth-of-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonnth-of-typeUndefined`: Self = StObject.set(x, ":nth-of-type", js.undefined)
      
      @scala.inline
      def `setColononly-child`(value: CSSObject): Self = StObject.set(x, ":only-child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColononly-childUndefined`: Self = StObject.set(x, ":only-child", js.undefined)
      
      @scala.inline
      def `setColononly-of-type`(value: CSSObject): Self = StObject.set(x, ":only-of-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColononly-of-typeUndefined`: Self = StObject.set(x, ":only-of-type", js.undefined)
      
      @scala.inline
      def setColonoptional(value: CSSObject): Self = StObject.set(x, ":optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonoptionalUndefined: Self = StObject.set(x, ":optional", js.undefined)
      
      @scala.inline
      def `setColonout-of-range`(value: CSSObject): Self = StObject.set(x, ":out-of-range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonout-of-rangeUndefined`: Self = StObject.set(x, ":out-of-range", js.undefined)
      
      @scala.inline
      def `setColonplaceholder-shown`(value: CSSObject): Self = StObject.set(x, ":placeholder-shown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonplaceholder-shownUndefined`: Self = StObject.set(x, ":placeholder-shown", js.undefined)
      
      @scala.inline
      def `setColonread-only`(value: CSSObject): Self = StObject.set(x, ":read-only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonread-onlyUndefined`: Self = StObject.set(x, ":read-only", js.undefined)
      
      @scala.inline
      def `setColonread-write`(value: CSSObject): Self = StObject.set(x, ":read-write", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColonread-writeUndefined`: Self = StObject.set(x, ":read-write", js.undefined)
      
      @scala.inline
      def setColonrequired(value: CSSObject): Self = StObject.set(x, ":required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonrequiredUndefined: Self = StObject.set(x, ":required", js.undefined)
      
      @scala.inline
      def setColonright(value: CSSObject): Self = StObject.set(x, ":right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonrightUndefined: Self = StObject.set(x, ":right", js.undefined)
      
      @scala.inline
      def setColonroot(value: CSSObject): Self = StObject.set(x, ":root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonrootUndefined: Self = StObject.set(x, ":root", js.undefined)
      
      @scala.inline
      def setColonscope(value: CSSObject): Self = StObject.set(x, ":scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonscopeUndefined: Self = StObject.set(x, ":scope", js.undefined)
      
      @scala.inline
      def setColontarget(value: CSSObject): Self = StObject.set(x, ":target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColontargetUndefined: Self = StObject.set(x, ":target", js.undefined)
      
      @scala.inline
      def setColonvalid(value: CSSObject): Self = StObject.set(x, ":valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonvalidUndefined: Self = StObject.set(x, ":valid", js.undefined)
      
      @scala.inline
      def setColonvisited(value: CSSObject): Self = StObject.set(x, ":visited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonvisitedUndefined: Self = StObject.set(x, ":visited", js.undefined)
      
      @scala.inline
      def setColonwhere(value: CSSObject): Self = StObject.set(x, ":where", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonwhereUndefined: Self = StObject.set(x, ":where", js.undefined)
    }
  }
  
  @js.native
  trait ClassInterpolation
    extends js.Function
       with _Interpolation {
    
    var __emotion_base: ClassInterpolation = js.native
    
    var __emotion_forwardProp: js.UndefOr[Null | (js.Function1[/* arg */ String, Boolean])] = js.native
    
    var __emotion_real: js.Any = js.native
    
    var __emotion_styles: js.Array[Interpolation] = js.native
    
    var __emotion_target: String = js.native
  }
  
  type ClassNameArg = js.UndefOr[
    Null | Boolean | String | (StringDictionary[js.UndefOr[Null | Boolean | String]]) | ArrayClassNameArg
  ]
  
  @js.native
  trait Emotion extends StObject {
    
    var caches: EmotionCache = js.native
    
    def css(args: Interpolation*): String = js.native
    
    def cx(classNames: ClassNameArg*): String = js.native
    
    def flush(): Unit = js.native
    
    def getRegisteredStyles(registeredStyles: js.Array[String], classNames: String): String = js.native
    
    def hydrate(ids: js.Array[String]): Unit = js.native
    
    def injectGlobal(args: Interpolation*): Unit = js.native
    
    def keyframes(args: Interpolation*): String = js.native
    
    def merge(className: String): String = js.native
    def merge(className: String, sourceMap: String): String = js.native
    
    var sheet: StyleSheet = js.native
  }
  
  @js.native
  trait EmotionBaseContext extends StObject {
    
    var __SECRET_EMOTION__ : js.UndefOr[Emotion] = js.native
  }
  object EmotionBaseContext {
    
    @scala.inline
    def apply(): EmotionBaseContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmotionBaseContext]
    }
    
    @scala.inline
    implicit class EmotionBaseContextMutableBuilder[Self <: EmotionBaseContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__SECRET_EMOTION__(value: Emotion): Self = StObject.set(x, "__SECRET_EMOTION__", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__SECRET_EMOTION__Undefined: Self = StObject.set(x, "__SECRET_EMOTION__", js.undefined)
    }
  }
  
  @js.native
  trait EmotionCache extends StObject {
    
    var inserted: StringDictionary[String] = js.native
    
    var key: String = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var registered: StringDictionary[String] = js.native
  }
  object EmotionCache {
    
    @scala.inline
    def apply(inserted: StringDictionary[String], key: String, registered: StringDictionary[String]): EmotionCache = {
      val __obj = js.Dynamic.literal(inserted = inserted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], registered = registered.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmotionCache]
    }
    
    @scala.inline
    implicit class EmotionCacheMutableBuilder[Self <: EmotionCache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInserted(value: StringDictionary[String]): Self = StObject.set(x, "inserted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setRegistered(value: StringDictionary[String]): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EmotionContext
    extends EmotionBaseContext
       with /* key */ StringDictionary[js.Any]
  object EmotionContext {
    
    @scala.inline
    def apply(): EmotionContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmotionContext]
    }
  }
  
  @js.native
  trait EmotionOptions extends StObject {
    
    var container: js.UndefOr[HTMLElement] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[
        Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ `1` | `2` | `3`, Boolean])
      ] = js.native
    
    var stylisPlugins: js.UndefOr[StylisPlugins] = js.native
  }
  object EmotionOptions {
    
    @scala.inline
    def apply(): EmotionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmotionOptions]
    }
    
    @scala.inline
    implicit class EmotionOptionsMutableBuilder[Self <: EmotionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setPrefix(
        value: Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ `1` | `2` | `3`, Boolean])
      ): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixFunction3(value: (/* key */ String, /* value */ String, /* context */ `1` | `2` | `3`) => Boolean): Self = StObject.set(x, "prefix", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setStylisPlugins(value: StylisPlugins): Self = StObject.set(x, "stylisPlugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylisPluginsFunction1(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "stylisPlugins", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylisPluginsNull: Self = StObject.set(x, "stylisPlugins", null)
      
      @scala.inline
      def setStylisPluginsUndefined: Self = StObject.set(x, "stylisPlugins", js.undefined)
      
      @scala.inline
      def setStylisPluginsVarargs(value: (js.Function1[/* repeated */ js.Any, js.Any])*): Self = StObject.set(x, "stylisPlugins", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - scala.Boolean
    - java.lang.String
    - scala.Double
    - typings.std.TemplateStringsArray
    - typings.createEmotion.mod.CSSObject
    - typings.createEmotion.mod.ArrayInterpolation
    - typings.createEmotion.mod.ClassInterpolation
  */
  type Interpolation = js.UndefOr[_Interpolation | Null | Boolean | String | Double | TemplateStringsArray]
  
  @js.native
  trait StyleSheet extends StObject {
    
    def flush(): Unit = js.native
    
    def inject(): Unit = js.native
    
    def insert(rule: String): Unit = js.native
    def insert(rule: String, sourceMap: String): Unit = js.native
    
    def speedy(bool: Boolean): Unit = js.native
  }
  
  type StylisPlugins = Null | (js.Function1[/* repeated */ js.Any, js.Any]) | (js.Array[js.Function1[/* repeated */ js.Any, js.Any]])
  
  trait _Interpolation extends StObject
  
  // Preact support for css prop
  object global {
    
    object JSX {
      
      @js.native
      trait HTMLAttributes extends StObject {
        
        var css: js.UndefOr[Interpolation] = js.native
      }
      object HTMLAttributes {
        
        @scala.inline
        def apply(): HTMLAttributes = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[HTMLAttributes]
        }
        
        @scala.inline
        implicit class HTMLAttributesMutableBuilder[Self <: HTMLAttributes] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCss(value: Interpolation): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCssNull: Self = StObject.set(x, "css", null)
          
          @scala.inline
          def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
        }
      }
    }
  }
  
  object reactAugmentingMod {
    
    @js.native
    trait HTMLAttributes[T] extends StObject {
      
      var css: js.UndefOr[Interpolation] = js.native
    }
    object HTMLAttributes {
      
      @scala.inline
      def apply[T](): HTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLAttributes[T]]
      }
      
      @scala.inline
      implicit class HTMLAttributesMutableBuilder[Self <: HTMLAttributes[_], T] (val x: Self with HTMLAttributes[T]) extends AnyVal {
        
        @scala.inline
        def setCss(value: Interpolation): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCssNull: Self = StObject.set(x, "css", null)
        
        @scala.inline
        def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      }
    }
  }
}
