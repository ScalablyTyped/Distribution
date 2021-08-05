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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-emotion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(context: EmotionContext): Emotion = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(context.asInstanceOf[js.Any]).asInstanceOf[Emotion]
  inline def default(context: EmotionContext, options: EmotionOptions): Emotion = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Emotion]
  
  @js.native
  trait ArrayClassNameArg
    extends StObject
       with Array[ClassNameArg]
  
  @js.native
  trait ArrayInterpolation
    extends StObject
       with Array[Interpolation]
       with _Interpolation
  
  type CSSBaseObject = PropertiesFallback[Double | String]
  
  trait CSSObject
    extends StObject
       with PropertiesFallback[Double | String]
       with CSSPseudoObject
       with CSSOthersObject
       with _Interpolation
  object CSSObject {
    
    inline def apply(): CSSObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSObject]
    }
  }
  
  trait CSSOthersObject
    extends StObject
       with /* propertiesName */ StringDictionary[Interpolation]
  object CSSOthersObject {
    
    inline def apply(): CSSOthersObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSOthersObject]
    }
  }
  
  /* Inlined {[ K in csstype.csstype.Pseudos ]:? create-emotion.create-emotion.CSSObject} */
  trait CSSPseudoObject extends StObject {
    
    @JSName(":-khtml-any-link")
    var `Colon-khtml-any-link`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":-moz-any-link")
    var `Colon-moz-any-link`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":-moz-any()")
    var `Colon-moz-anyLeftparenthesisRightparenthesis`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":-moz-dir")
    var `Colon-moz-dir`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":-moz-focusring")
    var `Colon-moz-focusring`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":-moz-full-screen")
    var `Colon-moz-full-screen`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":-moz-placeholder")
    var `Colon-moz-placeholder`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":-moz-read-only")
    var `Colon-moz-read-only`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":-moz-read-write")
    var `Colon-moz-read-write`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":-ms-fullscreen")
    var `Colon-ms-fullscreen`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":-ms-input-placeholder")
    var `Colon-ms-input-placeholder`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":-webkit-any-link")
    var `Colon-webkit-any-link`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":-webkit-any()")
    var `Colon-webkit-anyLeftparenthesisRightparenthesis`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":-webkit-full-screen")
    var `Colon-webkit-full-screen`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-moz-placeholder")
    var `ColonColon-moz-placeholder`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-moz-progress-bar")
    var `ColonColon-moz-progress-bar`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-moz-range-progress")
    var `ColonColon-moz-range-progress`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-moz-range-thumb")
    var `ColonColon-moz-range-thumb`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-moz-range-track")
    var `ColonColon-moz-range-track`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-moz-selection")
    var `ColonColon-moz-selection`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-backdrop")
    var `ColonColon-ms-backdrop`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-browse")
    var `ColonColon-ms-browse`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-check")
    var `ColonColon-ms-check`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-clear")
    var `ColonColon-ms-clear`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-fill")
    var `ColonColon-ms-fill`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-fill-lower")
    var `ColonColon-ms-fill-lower`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-fill-upper")
    var `ColonColon-ms-fill-upper`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-input-placeholder")
    var `ColonColon-ms-input-placeholder`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-reveal")
    var `ColonColon-ms-reveal`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-thumb")
    var `ColonColon-ms-thumb`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-ticks-after")
    var `ColonColon-ms-ticks-after`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-ticks-before")
    var `ColonColon-ms-ticks-before`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-tooltip")
    var `ColonColon-ms-tooltip`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-track")
    var `ColonColon-ms-track`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-ms-value")
    var `ColonColon-ms-value`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-webkit-backdrop")
    var `ColonColon-webkit-backdrop`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-webkit-input-placeholder")
    var `ColonColon-webkit-input-placeholder`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-webkit-progress-bar")
    var `ColonColon-webkit-progress-bar`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-webkit-progress-inner-value")
    var `ColonColon-webkit-progress-inner-value`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-webkit-progress-value")
    var `ColonColon-webkit-progress-value`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-webkit-slider-runnable-track")
    var `ColonColon-webkit-slider-runnable-track`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::-webkit-slider-thumb")
    var `ColonColon-webkit-slider-thumb`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::after")
    var ColonColonafter: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::backdrop")
    var ColonColonbackdrop: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::before")
    var ColonColonbefore: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::cue")
    var ColonColoncue: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::cue-region")
    var `ColonColoncue-region`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::first-letter")
    var `ColonColonfirst-letter`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::first-line")
    var `ColonColonfirst-line`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::grammar-error")
    var `ColonColongrammar-error`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::marker")
    var ColonColonmarker: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::part")
    var ColonColonpart: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::placeholder")
    var ColonColonplaceholder: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::selection")
    var ColonColonselection: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::slotted")
    var ColonColonslotted: js.UndefOr[CSSObject] = js.undefined
    
    @JSName("::spelling-error")
    var `ColonColonspelling-error`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":active")
    var Colonactive: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":after")
    var Colonafter: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":any-link")
    var `Colonany-link`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":before")
    var Colonbefore: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":blank")
    var Colonblank: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":checked")
    var Colonchecked: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":default")
    var Colondefault: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":defined")
    var Colondefined: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":dir")
    var Colondir: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":disabled")
    var Colondisabled: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":empty")
    var Colonempty: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":enabled")
    var Colonenabled: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":first")
    var Colonfirst: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":first-child")
    var `Colonfirst-child`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":first-letter")
    var `Colonfirst-letter`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":first-line")
    var `Colonfirst-line`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":first-of-type")
    var `Colonfirst-of-type`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":focus")
    var Colonfocus: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":focus-visible")
    var `Colonfocus-visible`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":focus-within")
    var `Colonfocus-within`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":fullscreen")
    var Colonfullscreen: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":has")
    var Colonhas: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":host")
    var Colonhost: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":host-context")
    var `Colonhost-context`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":hover")
    var Colonhover: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":in-range")
    var `Colonin-range`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":indeterminate")
    var Colonindeterminate: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":invalid")
    var Coloninvalid: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":is")
    var Colonis: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":lang")
    var Colonlang: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":last-child")
    var `Colonlast-child`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":last-of-type")
    var `Colonlast-of-type`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":left")
    var Colonleft: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":link")
    var Colonlink: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":matches()")
    var ColonmatchesLeftparenthesisRightparenthesis: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":not")
    var Colonnot: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":nth-child")
    var `Colonnth-child`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":nth-last-child")
    var `Colonnth-last-child`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":nth-last-of-type")
    var `Colonnth-last-of-type`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":nth-of-type")
    var `Colonnth-of-type`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":only-child")
    var `Colononly-child`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":only-of-type")
    var `Colononly-of-type`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":optional")
    var Colonoptional: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":out-of-range")
    var `Colonout-of-range`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":placeholder-shown")
    var `Colonplaceholder-shown`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":read-only")
    var `Colonread-only`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":read-write")
    var `Colonread-write`: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":required")
    var Colonrequired: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":right")
    var Colonright: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":root")
    var Colonroot: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":scope")
    var Colonscope: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":target")
    var Colontarget: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":valid")
    var Colonvalid: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":visited")
    var Colonvisited: js.UndefOr[CSSObject] = js.undefined
    
    @JSName(":where")
    var Colonwhere: js.UndefOr[CSSObject] = js.undefined
  }
  object CSSPseudoObject {
    
    inline def apply(): CSSPseudoObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSPseudoObject]
    }
    
    extension [Self <: CSSPseudoObject](x: Self) {
      
      inline def `setColon-khtml-any-link`(value: CSSObject): Self = StObject.set(x, ":-khtml-any-link", value.asInstanceOf[js.Any])
      
      inline def `setColon-khtml-any-linkUndefined`: Self = StObject.set(x, ":-khtml-any-link", js.undefined)
      
      inline def `setColon-moz-any-link`(value: CSSObject): Self = StObject.set(x, ":-moz-any-link", value.asInstanceOf[js.Any])
      
      inline def `setColon-moz-any-linkUndefined`: Self = StObject.set(x, ":-moz-any-link", js.undefined)
      
      inline def `setColon-moz-anyLeftparenthesisRightparenthesis`(value: CSSObject): Self = StObject.set(x, ":-moz-any()", value.asInstanceOf[js.Any])
      
      inline def `setColon-moz-anyLeftparenthesisRightparenthesisUndefined`: Self = StObject.set(x, ":-moz-any()", js.undefined)
      
      inline def `setColon-moz-dir`(value: CSSObject): Self = StObject.set(x, ":-moz-dir", value.asInstanceOf[js.Any])
      
      inline def `setColon-moz-dirUndefined`: Self = StObject.set(x, ":-moz-dir", js.undefined)
      
      inline def `setColon-moz-focusring`(value: CSSObject): Self = StObject.set(x, ":-moz-focusring", value.asInstanceOf[js.Any])
      
      inline def `setColon-moz-focusringUndefined`: Self = StObject.set(x, ":-moz-focusring", js.undefined)
      
      inline def `setColon-moz-full-screen`(value: CSSObject): Self = StObject.set(x, ":-moz-full-screen", value.asInstanceOf[js.Any])
      
      inline def `setColon-moz-full-screenUndefined`: Self = StObject.set(x, ":-moz-full-screen", js.undefined)
      
      inline def `setColon-moz-placeholder`(value: CSSObject): Self = StObject.set(x, ":-moz-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setColon-moz-placeholderUndefined`: Self = StObject.set(x, ":-moz-placeholder", js.undefined)
      
      inline def `setColon-moz-read-only`(value: CSSObject): Self = StObject.set(x, ":-moz-read-only", value.asInstanceOf[js.Any])
      
      inline def `setColon-moz-read-onlyUndefined`: Self = StObject.set(x, ":-moz-read-only", js.undefined)
      
      inline def `setColon-moz-read-write`(value: CSSObject): Self = StObject.set(x, ":-moz-read-write", value.asInstanceOf[js.Any])
      
      inline def `setColon-moz-read-writeUndefined`: Self = StObject.set(x, ":-moz-read-write", js.undefined)
      
      inline def `setColon-ms-fullscreen`(value: CSSObject): Self = StObject.set(x, ":-ms-fullscreen", value.asInstanceOf[js.Any])
      
      inline def `setColon-ms-fullscreenUndefined`: Self = StObject.set(x, ":-ms-fullscreen", js.undefined)
      
      inline def `setColon-ms-input-placeholder`(value: CSSObject): Self = StObject.set(x, ":-ms-input-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setColon-ms-input-placeholderUndefined`: Self = StObject.set(x, ":-ms-input-placeholder", js.undefined)
      
      inline def `setColon-webkit-any-link`(value: CSSObject): Self = StObject.set(x, ":-webkit-any-link", value.asInstanceOf[js.Any])
      
      inline def `setColon-webkit-any-linkUndefined`: Self = StObject.set(x, ":-webkit-any-link", js.undefined)
      
      inline def `setColon-webkit-anyLeftparenthesisRightparenthesis`(value: CSSObject): Self = StObject.set(x, ":-webkit-any()", value.asInstanceOf[js.Any])
      
      inline def `setColon-webkit-anyLeftparenthesisRightparenthesisUndefined`: Self = StObject.set(x, ":-webkit-any()", js.undefined)
      
      inline def `setColon-webkit-full-screen`(value: CSSObject): Self = StObject.set(x, ":-webkit-full-screen", value.asInstanceOf[js.Any])
      
      inline def `setColon-webkit-full-screenUndefined`: Self = StObject.set(x, ":-webkit-full-screen", js.undefined)
      
      inline def `setColonColon-moz-placeholder`(value: CSSObject): Self = StObject.set(x, "::-moz-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-moz-placeholderUndefined`: Self = StObject.set(x, "::-moz-placeholder", js.undefined)
      
      inline def `setColonColon-moz-progress-bar`(value: CSSObject): Self = StObject.set(x, "::-moz-progress-bar", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-moz-progress-barUndefined`: Self = StObject.set(x, "::-moz-progress-bar", js.undefined)
      
      inline def `setColonColon-moz-range-progress`(value: CSSObject): Self = StObject.set(x, "::-moz-range-progress", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-moz-range-progressUndefined`: Self = StObject.set(x, "::-moz-range-progress", js.undefined)
      
      inline def `setColonColon-moz-range-thumb`(value: CSSObject): Self = StObject.set(x, "::-moz-range-thumb", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-moz-range-thumbUndefined`: Self = StObject.set(x, "::-moz-range-thumb", js.undefined)
      
      inline def `setColonColon-moz-range-track`(value: CSSObject): Self = StObject.set(x, "::-moz-range-track", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-moz-range-trackUndefined`: Self = StObject.set(x, "::-moz-range-track", js.undefined)
      
      inline def `setColonColon-moz-selection`(value: CSSObject): Self = StObject.set(x, "::-moz-selection", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-moz-selectionUndefined`: Self = StObject.set(x, "::-moz-selection", js.undefined)
      
      inline def `setColonColon-ms-backdrop`(value: CSSObject): Self = StObject.set(x, "::-ms-backdrop", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-backdropUndefined`: Self = StObject.set(x, "::-ms-backdrop", js.undefined)
      
      inline def `setColonColon-ms-browse`(value: CSSObject): Self = StObject.set(x, "::-ms-browse", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-browseUndefined`: Self = StObject.set(x, "::-ms-browse", js.undefined)
      
      inline def `setColonColon-ms-check`(value: CSSObject): Self = StObject.set(x, "::-ms-check", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-checkUndefined`: Self = StObject.set(x, "::-ms-check", js.undefined)
      
      inline def `setColonColon-ms-clear`(value: CSSObject): Self = StObject.set(x, "::-ms-clear", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-clearUndefined`: Self = StObject.set(x, "::-ms-clear", js.undefined)
      
      inline def `setColonColon-ms-fill`(value: CSSObject): Self = StObject.set(x, "::-ms-fill", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-fill-lower`(value: CSSObject): Self = StObject.set(x, "::-ms-fill-lower", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-fill-lowerUndefined`: Self = StObject.set(x, "::-ms-fill-lower", js.undefined)
      
      inline def `setColonColon-ms-fill-upper`(value: CSSObject): Self = StObject.set(x, "::-ms-fill-upper", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-fill-upperUndefined`: Self = StObject.set(x, "::-ms-fill-upper", js.undefined)
      
      inline def `setColonColon-ms-fillUndefined`: Self = StObject.set(x, "::-ms-fill", js.undefined)
      
      inline def `setColonColon-ms-input-placeholder`(value: CSSObject): Self = StObject.set(x, "::-ms-input-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-input-placeholderUndefined`: Self = StObject.set(x, "::-ms-input-placeholder", js.undefined)
      
      inline def `setColonColon-ms-reveal`(value: CSSObject): Self = StObject.set(x, "::-ms-reveal", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-revealUndefined`: Self = StObject.set(x, "::-ms-reveal", js.undefined)
      
      inline def `setColonColon-ms-thumb`(value: CSSObject): Self = StObject.set(x, "::-ms-thumb", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-thumbUndefined`: Self = StObject.set(x, "::-ms-thumb", js.undefined)
      
      inline def `setColonColon-ms-ticks-after`(value: CSSObject): Self = StObject.set(x, "::-ms-ticks-after", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-ticks-afterUndefined`: Self = StObject.set(x, "::-ms-ticks-after", js.undefined)
      
      inline def `setColonColon-ms-ticks-before`(value: CSSObject): Self = StObject.set(x, "::-ms-ticks-before", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-ticks-beforeUndefined`: Self = StObject.set(x, "::-ms-ticks-before", js.undefined)
      
      inline def `setColonColon-ms-tooltip`(value: CSSObject): Self = StObject.set(x, "::-ms-tooltip", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-tooltipUndefined`: Self = StObject.set(x, "::-ms-tooltip", js.undefined)
      
      inline def `setColonColon-ms-track`(value: CSSObject): Self = StObject.set(x, "::-ms-track", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-trackUndefined`: Self = StObject.set(x, "::-ms-track", js.undefined)
      
      inline def `setColonColon-ms-value`(value: CSSObject): Self = StObject.set(x, "::-ms-value", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-ms-valueUndefined`: Self = StObject.set(x, "::-ms-value", js.undefined)
      
      inline def `setColonColon-webkit-backdrop`(value: CSSObject): Self = StObject.set(x, "::-webkit-backdrop", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-webkit-backdropUndefined`: Self = StObject.set(x, "::-webkit-backdrop", js.undefined)
      
      inline def `setColonColon-webkit-input-placeholder`(value: CSSObject): Self = StObject.set(x, "::-webkit-input-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-webkit-input-placeholderUndefined`: Self = StObject.set(x, "::-webkit-input-placeholder", js.undefined)
      
      inline def `setColonColon-webkit-progress-bar`(value: CSSObject): Self = StObject.set(x, "::-webkit-progress-bar", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-webkit-progress-barUndefined`: Self = StObject.set(x, "::-webkit-progress-bar", js.undefined)
      
      inline def `setColonColon-webkit-progress-inner-value`(value: CSSObject): Self = StObject.set(x, "::-webkit-progress-inner-value", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-webkit-progress-inner-valueUndefined`: Self = StObject.set(x, "::-webkit-progress-inner-value", js.undefined)
      
      inline def `setColonColon-webkit-progress-value`(value: CSSObject): Self = StObject.set(x, "::-webkit-progress-value", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-webkit-progress-valueUndefined`: Self = StObject.set(x, "::-webkit-progress-value", js.undefined)
      
      inline def `setColonColon-webkit-slider-runnable-track`(value: CSSObject): Self = StObject.set(x, "::-webkit-slider-runnable-track", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-webkit-slider-runnable-trackUndefined`: Self = StObject.set(x, "::-webkit-slider-runnable-track", js.undefined)
      
      inline def `setColonColon-webkit-slider-thumb`(value: CSSObject): Self = StObject.set(x, "::-webkit-slider-thumb", value.asInstanceOf[js.Any])
      
      inline def `setColonColon-webkit-slider-thumbUndefined`: Self = StObject.set(x, "::-webkit-slider-thumb", js.undefined)
      
      inline def setColonColonafter(value: CSSObject): Self = StObject.set(x, "::after", value.asInstanceOf[js.Any])
      
      inline def setColonColonafterUndefined: Self = StObject.set(x, "::after", js.undefined)
      
      inline def setColonColonbackdrop(value: CSSObject): Self = StObject.set(x, "::backdrop", value.asInstanceOf[js.Any])
      
      inline def setColonColonbackdropUndefined: Self = StObject.set(x, "::backdrop", js.undefined)
      
      inline def setColonColonbefore(value: CSSObject): Self = StObject.set(x, "::before", value.asInstanceOf[js.Any])
      
      inline def setColonColonbeforeUndefined: Self = StObject.set(x, "::before", js.undefined)
      
      inline def setColonColoncue(value: CSSObject): Self = StObject.set(x, "::cue", value.asInstanceOf[js.Any])
      
      inline def `setColonColoncue-region`(value: CSSObject): Self = StObject.set(x, "::cue-region", value.asInstanceOf[js.Any])
      
      inline def `setColonColoncue-regionUndefined`: Self = StObject.set(x, "::cue-region", js.undefined)
      
      inline def setColonColoncueUndefined: Self = StObject.set(x, "::cue", js.undefined)
      
      inline def `setColonColonfirst-letter`(value: CSSObject): Self = StObject.set(x, "::first-letter", value.asInstanceOf[js.Any])
      
      inline def `setColonColonfirst-letterUndefined`: Self = StObject.set(x, "::first-letter", js.undefined)
      
      inline def `setColonColonfirst-line`(value: CSSObject): Self = StObject.set(x, "::first-line", value.asInstanceOf[js.Any])
      
      inline def `setColonColonfirst-lineUndefined`: Self = StObject.set(x, "::first-line", js.undefined)
      
      inline def `setColonColongrammar-error`(value: CSSObject): Self = StObject.set(x, "::grammar-error", value.asInstanceOf[js.Any])
      
      inline def `setColonColongrammar-errorUndefined`: Self = StObject.set(x, "::grammar-error", js.undefined)
      
      inline def setColonColonmarker(value: CSSObject): Self = StObject.set(x, "::marker", value.asInstanceOf[js.Any])
      
      inline def setColonColonmarkerUndefined: Self = StObject.set(x, "::marker", js.undefined)
      
      inline def setColonColonpart(value: CSSObject): Self = StObject.set(x, "::part", value.asInstanceOf[js.Any])
      
      inline def setColonColonpartUndefined: Self = StObject.set(x, "::part", js.undefined)
      
      inline def setColonColonplaceholder(value: CSSObject): Self = StObject.set(x, "::placeholder", value.asInstanceOf[js.Any])
      
      inline def setColonColonplaceholderUndefined: Self = StObject.set(x, "::placeholder", js.undefined)
      
      inline def setColonColonselection(value: CSSObject): Self = StObject.set(x, "::selection", value.asInstanceOf[js.Any])
      
      inline def setColonColonselectionUndefined: Self = StObject.set(x, "::selection", js.undefined)
      
      inline def setColonColonslotted(value: CSSObject): Self = StObject.set(x, "::slotted", value.asInstanceOf[js.Any])
      
      inline def setColonColonslottedUndefined: Self = StObject.set(x, "::slotted", js.undefined)
      
      inline def `setColonColonspelling-error`(value: CSSObject): Self = StObject.set(x, "::spelling-error", value.asInstanceOf[js.Any])
      
      inline def `setColonColonspelling-errorUndefined`: Self = StObject.set(x, "::spelling-error", js.undefined)
      
      inline def setColonactive(value: CSSObject): Self = StObject.set(x, ":active", value.asInstanceOf[js.Any])
      
      inline def setColonactiveUndefined: Self = StObject.set(x, ":active", js.undefined)
      
      inline def setColonafter(value: CSSObject): Self = StObject.set(x, ":after", value.asInstanceOf[js.Any])
      
      inline def setColonafterUndefined: Self = StObject.set(x, ":after", js.undefined)
      
      inline def `setColonany-link`(value: CSSObject): Self = StObject.set(x, ":any-link", value.asInstanceOf[js.Any])
      
      inline def `setColonany-linkUndefined`: Self = StObject.set(x, ":any-link", js.undefined)
      
      inline def setColonbefore(value: CSSObject): Self = StObject.set(x, ":before", value.asInstanceOf[js.Any])
      
      inline def setColonbeforeUndefined: Self = StObject.set(x, ":before", js.undefined)
      
      inline def setColonblank(value: CSSObject): Self = StObject.set(x, ":blank", value.asInstanceOf[js.Any])
      
      inline def setColonblankUndefined: Self = StObject.set(x, ":blank", js.undefined)
      
      inline def setColonchecked(value: CSSObject): Self = StObject.set(x, ":checked", value.asInstanceOf[js.Any])
      
      inline def setColoncheckedUndefined: Self = StObject.set(x, ":checked", js.undefined)
      
      inline def setColondefault(value: CSSObject): Self = StObject.set(x, ":default", value.asInstanceOf[js.Any])
      
      inline def setColondefaultUndefined: Self = StObject.set(x, ":default", js.undefined)
      
      inline def setColondefined(value: CSSObject): Self = StObject.set(x, ":defined", value.asInstanceOf[js.Any])
      
      inline def setColondefinedUndefined: Self = StObject.set(x, ":defined", js.undefined)
      
      inline def setColondir(value: CSSObject): Self = StObject.set(x, ":dir", value.asInstanceOf[js.Any])
      
      inline def setColondirUndefined: Self = StObject.set(x, ":dir", js.undefined)
      
      inline def setColondisabled(value: CSSObject): Self = StObject.set(x, ":disabled", value.asInstanceOf[js.Any])
      
      inline def setColondisabledUndefined: Self = StObject.set(x, ":disabled", js.undefined)
      
      inline def setColonempty(value: CSSObject): Self = StObject.set(x, ":empty", value.asInstanceOf[js.Any])
      
      inline def setColonemptyUndefined: Self = StObject.set(x, ":empty", js.undefined)
      
      inline def setColonenabled(value: CSSObject): Self = StObject.set(x, ":enabled", value.asInstanceOf[js.Any])
      
      inline def setColonenabledUndefined: Self = StObject.set(x, ":enabled", js.undefined)
      
      inline def setColonfirst(value: CSSObject): Self = StObject.set(x, ":first", value.asInstanceOf[js.Any])
      
      inline def `setColonfirst-child`(value: CSSObject): Self = StObject.set(x, ":first-child", value.asInstanceOf[js.Any])
      
      inline def `setColonfirst-childUndefined`: Self = StObject.set(x, ":first-child", js.undefined)
      
      inline def `setColonfirst-letter`(value: CSSObject): Self = StObject.set(x, ":first-letter", value.asInstanceOf[js.Any])
      
      inline def `setColonfirst-letterUndefined`: Self = StObject.set(x, ":first-letter", js.undefined)
      
      inline def `setColonfirst-line`(value: CSSObject): Self = StObject.set(x, ":first-line", value.asInstanceOf[js.Any])
      
      inline def `setColonfirst-lineUndefined`: Self = StObject.set(x, ":first-line", js.undefined)
      
      inline def `setColonfirst-of-type`(value: CSSObject): Self = StObject.set(x, ":first-of-type", value.asInstanceOf[js.Any])
      
      inline def `setColonfirst-of-typeUndefined`: Self = StObject.set(x, ":first-of-type", js.undefined)
      
      inline def setColonfirstUndefined: Self = StObject.set(x, ":first", js.undefined)
      
      inline def setColonfocus(value: CSSObject): Self = StObject.set(x, ":focus", value.asInstanceOf[js.Any])
      
      inline def `setColonfocus-visible`(value: CSSObject): Self = StObject.set(x, ":focus-visible", value.asInstanceOf[js.Any])
      
      inline def `setColonfocus-visibleUndefined`: Self = StObject.set(x, ":focus-visible", js.undefined)
      
      inline def `setColonfocus-within`(value: CSSObject): Self = StObject.set(x, ":focus-within", value.asInstanceOf[js.Any])
      
      inline def `setColonfocus-withinUndefined`: Self = StObject.set(x, ":focus-within", js.undefined)
      
      inline def setColonfocusUndefined: Self = StObject.set(x, ":focus", js.undefined)
      
      inline def setColonfullscreen(value: CSSObject): Self = StObject.set(x, ":fullscreen", value.asInstanceOf[js.Any])
      
      inline def setColonfullscreenUndefined: Self = StObject.set(x, ":fullscreen", js.undefined)
      
      inline def setColonhas(value: CSSObject): Self = StObject.set(x, ":has", value.asInstanceOf[js.Any])
      
      inline def setColonhasUndefined: Self = StObject.set(x, ":has", js.undefined)
      
      inline def setColonhost(value: CSSObject): Self = StObject.set(x, ":host", value.asInstanceOf[js.Any])
      
      inline def `setColonhost-context`(value: CSSObject): Self = StObject.set(x, ":host-context", value.asInstanceOf[js.Any])
      
      inline def `setColonhost-contextUndefined`: Self = StObject.set(x, ":host-context", js.undefined)
      
      inline def setColonhostUndefined: Self = StObject.set(x, ":host", js.undefined)
      
      inline def setColonhover(value: CSSObject): Self = StObject.set(x, ":hover", value.asInstanceOf[js.Any])
      
      inline def setColonhoverUndefined: Self = StObject.set(x, ":hover", js.undefined)
      
      inline def `setColonin-range`(value: CSSObject): Self = StObject.set(x, ":in-range", value.asInstanceOf[js.Any])
      
      inline def `setColonin-rangeUndefined`: Self = StObject.set(x, ":in-range", js.undefined)
      
      inline def setColonindeterminate(value: CSSObject): Self = StObject.set(x, ":indeterminate", value.asInstanceOf[js.Any])
      
      inline def setColonindeterminateUndefined: Self = StObject.set(x, ":indeterminate", js.undefined)
      
      inline def setColoninvalid(value: CSSObject): Self = StObject.set(x, ":invalid", value.asInstanceOf[js.Any])
      
      inline def setColoninvalidUndefined: Self = StObject.set(x, ":invalid", js.undefined)
      
      inline def setColonis(value: CSSObject): Self = StObject.set(x, ":is", value.asInstanceOf[js.Any])
      
      inline def setColonisUndefined: Self = StObject.set(x, ":is", js.undefined)
      
      inline def setColonlang(value: CSSObject): Self = StObject.set(x, ":lang", value.asInstanceOf[js.Any])
      
      inline def setColonlangUndefined: Self = StObject.set(x, ":lang", js.undefined)
      
      inline def `setColonlast-child`(value: CSSObject): Self = StObject.set(x, ":last-child", value.asInstanceOf[js.Any])
      
      inline def `setColonlast-childUndefined`: Self = StObject.set(x, ":last-child", js.undefined)
      
      inline def `setColonlast-of-type`(value: CSSObject): Self = StObject.set(x, ":last-of-type", value.asInstanceOf[js.Any])
      
      inline def `setColonlast-of-typeUndefined`: Self = StObject.set(x, ":last-of-type", js.undefined)
      
      inline def setColonleft(value: CSSObject): Self = StObject.set(x, ":left", value.asInstanceOf[js.Any])
      
      inline def setColonleftUndefined: Self = StObject.set(x, ":left", js.undefined)
      
      inline def setColonlink(value: CSSObject): Self = StObject.set(x, ":link", value.asInstanceOf[js.Any])
      
      inline def setColonlinkUndefined: Self = StObject.set(x, ":link", js.undefined)
      
      inline def setColonmatchesLeftparenthesisRightparenthesis(value: CSSObject): Self = StObject.set(x, ":matches()", value.asInstanceOf[js.Any])
      
      inline def setColonmatchesLeftparenthesisRightparenthesisUndefined: Self = StObject.set(x, ":matches()", js.undefined)
      
      inline def setColonnot(value: CSSObject): Self = StObject.set(x, ":not", value.asInstanceOf[js.Any])
      
      inline def setColonnotUndefined: Self = StObject.set(x, ":not", js.undefined)
      
      inline def `setColonnth-child`(value: CSSObject): Self = StObject.set(x, ":nth-child", value.asInstanceOf[js.Any])
      
      inline def `setColonnth-childUndefined`: Self = StObject.set(x, ":nth-child", js.undefined)
      
      inline def `setColonnth-last-child`(value: CSSObject): Self = StObject.set(x, ":nth-last-child", value.asInstanceOf[js.Any])
      
      inline def `setColonnth-last-childUndefined`: Self = StObject.set(x, ":nth-last-child", js.undefined)
      
      inline def `setColonnth-last-of-type`(value: CSSObject): Self = StObject.set(x, ":nth-last-of-type", value.asInstanceOf[js.Any])
      
      inline def `setColonnth-last-of-typeUndefined`: Self = StObject.set(x, ":nth-last-of-type", js.undefined)
      
      inline def `setColonnth-of-type`(value: CSSObject): Self = StObject.set(x, ":nth-of-type", value.asInstanceOf[js.Any])
      
      inline def `setColonnth-of-typeUndefined`: Self = StObject.set(x, ":nth-of-type", js.undefined)
      
      inline def `setColononly-child`(value: CSSObject): Self = StObject.set(x, ":only-child", value.asInstanceOf[js.Any])
      
      inline def `setColononly-childUndefined`: Self = StObject.set(x, ":only-child", js.undefined)
      
      inline def `setColononly-of-type`(value: CSSObject): Self = StObject.set(x, ":only-of-type", value.asInstanceOf[js.Any])
      
      inline def `setColononly-of-typeUndefined`: Self = StObject.set(x, ":only-of-type", js.undefined)
      
      inline def setColonoptional(value: CSSObject): Self = StObject.set(x, ":optional", value.asInstanceOf[js.Any])
      
      inline def setColonoptionalUndefined: Self = StObject.set(x, ":optional", js.undefined)
      
      inline def `setColonout-of-range`(value: CSSObject): Self = StObject.set(x, ":out-of-range", value.asInstanceOf[js.Any])
      
      inline def `setColonout-of-rangeUndefined`: Self = StObject.set(x, ":out-of-range", js.undefined)
      
      inline def `setColonplaceholder-shown`(value: CSSObject): Self = StObject.set(x, ":placeholder-shown", value.asInstanceOf[js.Any])
      
      inline def `setColonplaceholder-shownUndefined`: Self = StObject.set(x, ":placeholder-shown", js.undefined)
      
      inline def `setColonread-only`(value: CSSObject): Self = StObject.set(x, ":read-only", value.asInstanceOf[js.Any])
      
      inline def `setColonread-onlyUndefined`: Self = StObject.set(x, ":read-only", js.undefined)
      
      inline def `setColonread-write`(value: CSSObject): Self = StObject.set(x, ":read-write", value.asInstanceOf[js.Any])
      
      inline def `setColonread-writeUndefined`: Self = StObject.set(x, ":read-write", js.undefined)
      
      inline def setColonrequired(value: CSSObject): Self = StObject.set(x, ":required", value.asInstanceOf[js.Any])
      
      inline def setColonrequiredUndefined: Self = StObject.set(x, ":required", js.undefined)
      
      inline def setColonright(value: CSSObject): Self = StObject.set(x, ":right", value.asInstanceOf[js.Any])
      
      inline def setColonrightUndefined: Self = StObject.set(x, ":right", js.undefined)
      
      inline def setColonroot(value: CSSObject): Self = StObject.set(x, ":root", value.asInstanceOf[js.Any])
      
      inline def setColonrootUndefined: Self = StObject.set(x, ":root", js.undefined)
      
      inline def setColonscope(value: CSSObject): Self = StObject.set(x, ":scope", value.asInstanceOf[js.Any])
      
      inline def setColonscopeUndefined: Self = StObject.set(x, ":scope", js.undefined)
      
      inline def setColontarget(value: CSSObject): Self = StObject.set(x, ":target", value.asInstanceOf[js.Any])
      
      inline def setColontargetUndefined: Self = StObject.set(x, ":target", js.undefined)
      
      inline def setColonvalid(value: CSSObject): Self = StObject.set(x, ":valid", value.asInstanceOf[js.Any])
      
      inline def setColonvalidUndefined: Self = StObject.set(x, ":valid", js.undefined)
      
      inline def setColonvisited(value: CSSObject): Self = StObject.set(x, ":visited", value.asInstanceOf[js.Any])
      
      inline def setColonvisitedUndefined: Self = StObject.set(x, ":visited", js.undefined)
      
      inline def setColonwhere(value: CSSObject): Self = StObject.set(x, ":where", value.asInstanceOf[js.Any])
      
      inline def setColonwhereUndefined: Self = StObject.set(x, ":where", js.undefined)
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
  
  trait EmotionBaseContext extends StObject {
    
    var __SECRET_EMOTION__ : js.UndefOr[Emotion] = js.undefined
  }
  object EmotionBaseContext {
    
    inline def apply(): EmotionBaseContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmotionBaseContext]
    }
    
    extension [Self <: EmotionBaseContext](x: Self) {
      
      inline def set__SECRET_EMOTION__(value: Emotion): Self = StObject.set(x, "__SECRET_EMOTION__", value.asInstanceOf[js.Any])
      
      inline def set__SECRET_EMOTION__Undefined: Self = StObject.set(x, "__SECRET_EMOTION__", js.undefined)
    }
  }
  
  trait EmotionCache extends StObject {
    
    var inserted: StringDictionary[String]
    
    var key: String
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var registered: StringDictionary[String]
  }
  object EmotionCache {
    
    inline def apply(inserted: StringDictionary[String], key: String, registered: StringDictionary[String]): EmotionCache = {
      val __obj = js.Dynamic.literal(inserted = inserted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], registered = registered.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmotionCache]
    }
    
    extension [Self <: EmotionCache](x: Self) {
      
      inline def setInserted(value: StringDictionary[String]): Self = StObject.set(x, "inserted", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setRegistered(value: StringDictionary[String]): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmotionContext
    extends StObject
       with EmotionBaseContext
       with /* key */ StringDictionary[js.Any]
  object EmotionContext {
    
    inline def apply(): EmotionContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmotionContext]
    }
  }
  
  trait EmotionOptions extends StObject {
    
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[
        Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ `1` | `2` | `3`, Boolean])
      ] = js.undefined
    
    var stylisPlugins: js.UndefOr[StylisPlugins] = js.undefined
  }
  object EmotionOptions {
    
    inline def apply(): EmotionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmotionOptions]
    }
    
    extension [Self <: EmotionOptions](x: Self) {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPrefix(
        value: Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ `1` | `2` | `3`, Boolean])
      ): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixFunction3(value: (/* key */ String, /* value */ String, /* context */ `1` | `2` | `3`) => Boolean): Self = StObject.set(x, "prefix", js.Any.fromFunction3(value))
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setStylisPlugins(value: StylisPlugins): Self = StObject.set(x, "stylisPlugins", value.asInstanceOf[js.Any])
      
      inline def setStylisPluginsFunction1(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "stylisPlugins", js.Any.fromFunction1(value))
      
      inline def setStylisPluginsNull: Self = StObject.set(x, "stylisPlugins", null)
      
      inline def setStylisPluginsUndefined: Self = StObject.set(x, "stylisPlugins", js.undefined)
      
      inline def setStylisPluginsVarargs(value: (js.Function1[/* repeated */ js.Any, js.Any])*): Self = StObject.set(x, "stylisPlugins", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
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
      
      trait HTMLAttributes extends StObject {
        
        var css: js.UndefOr[Interpolation] = js.undefined
      }
      object HTMLAttributes {
        
        inline def apply(): HTMLAttributes = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[HTMLAttributes]
        }
        
        extension [Self <: HTMLAttributes](x: Self) {
          
          inline def setCss(value: Interpolation): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
          
          inline def setCssNull: Self = StObject.set(x, "css", null)
          
          inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
        }
      }
    }
  }
  
  object reactAugmentingMod {
    
    trait HTMLAttributes[T] extends StObject {
      
      var css: js.UndefOr[Interpolation] = js.undefined
    }
    object HTMLAttributes {
      
      inline def apply[T](): HTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLAttributes[T]]
      }
      
      extension [Self <: HTMLAttributes[?], T](x: Self & HTMLAttributes[T]) {
        
        inline def setCss(value: Interpolation): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        inline def setCssNull: Self = StObject.set(x, "css", null)
        
        inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      }
    }
  }
}
