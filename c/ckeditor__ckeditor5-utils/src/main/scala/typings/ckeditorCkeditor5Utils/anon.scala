package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.ckeditorCkeditor5Utils.srcDomEmittermixinMod.DomEmitter
import typings.ckeditorCkeditor5Utils.srcDomScrollMod.IfTrue
import typings.ckeditorCkeditor5Utils.srcEmittermixinMod.Emitter
import typings.ckeditorCkeditor5Utils.srcObservablemixinMod.Observable
import typings.ckeditorCkeditor5Utils.srcPrioritiesMod.PriorityString
import typings.std.HTMLElement
import typings.std.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AlignToTop[T /* <: Boolean */, U /* <: IfTrue[T] */] extends StObject {
    
    val alignToTop: js.UndefOr[T] = js.undefined
    
    val ancestorOffset: js.UndefOr[Double] = js.undefined
    
    val forceScroll: js.UndefOr[U] = js.undefined
    
    val target: HTMLElement | Range
    
    val viewportOffset: js.UndefOr[Double] = js.undefined
  }
  object AlignToTop {
    
    inline def apply[T /* <: Boolean */, U /* <: IfTrue[T] */](target: HTMLElement | Range): AlignToTop[T, U] = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlignToTop[T, U]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlignToTop[?, ?], T /* <: Boolean */, U /* <: IfTrue[T] */] (val x: Self & (AlignToTop[T, U])) extends AnyVal {
      
      inline def setAlignToTop(value: T): Self = StObject.set(x, "alignToTop", value.asInstanceOf[js.Any])
      
      inline def setAlignToTopUndefined: Self = StObject.set(x, "alignToTop", js.undefined)
      
      inline def setAncestorOffset(value: Double): Self = StObject.set(x, "ancestorOffset", value.asInstanceOf[js.Any])
      
      inline def setAncestorOffsetUndefined: Self = StObject.set(x, "ancestorOffset", js.undefined)
      
      inline def setForceScroll(value: U): Self = StObject.set(x, "forceScroll", value.asInstanceOf[js.Any])
      
      inline def setForceScrollUndefined: Self = StObject.set(x, "forceScroll", js.undefined)
      
      inline def setTarget(value: HTMLElement | Range): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setViewportOffset(value: Double): Self = StObject.set(x, "viewportOffset", value.asInstanceOf[js.Any])
      
      inline def setViewportOffsetUndefined: Self = StObject.set(x, "viewportOffset", js.undefined)
    }
  }
  
  trait Bottom extends StObject {
    
    val bottom: js.UndefOr[Double] = js.undefined
    
    val left: js.UndefOr[Double] = js.undefined
    
    val right: js.UndefOr[Double] = js.undefined
    
    val top: js.UndefOr[Double] = js.undefined
  }
  object Bottom {
    
    inline def apply(): Bottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(): Unit = js.native
    
    var called: js.UndefOr[Boolean] = js.native
  }
  
  /* Inlined @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/emittermixin.CallbackOptions & { readonly useCapture :boolean | undefined,  readonly usePassive :boolean | undefined} */
  trait CallbackOptionsreadonlyus extends StObject {
    
    /**
      * The priority of this event callback. The higher
      * the priority value the sooner the callback will be fired. Events having the same priority are called in the
      * order they were added.
      *
      * @defaultValue `'normal'`
      */
    val priority: js.UndefOr[PriorityString] = js.undefined
    
    val useCapture: js.UndefOr[Boolean] = js.undefined
    
    val usePassive: js.UndefOr[Boolean] = js.undefined
  }
  object CallbackOptionsreadonlyus {
    
    inline def apply(): CallbackOptionsreadonlyus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbackOptionsreadonlyus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallbackOptionsreadonlyus] (val x: Self) extends AnyVal {
      
      inline def setPriority(value: PriorityString): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setUseCapture(value: Boolean): Self = StObject.set(x, "useCapture", value.asInstanceOf[js.Any])
      
      inline def setUseCaptureUndefined: Self = StObject.set(x, "useCapture", js.undefined)
      
      inline def setUsePassive(value: Boolean): Self = StObject.set(x, "usePassive", value.asInstanceOf[js.Any])
      
      inline def setUsePassiveUndefined: Self = StObject.set(x, "usePassive", js.undefined)
    }
  }
  
  trait ContentLanguage extends StObject {
    
    val contentLanguage: js.UndefOr[String] = js.undefined
    
    val uiLanguage: js.UndefOr[String] = js.undefined
  }
  object ContentLanguage {
    
    inline def apply(): ContentLanguage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentLanguage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentLanguage] (val x: Self) extends AnyVal {
      
      inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
      
      inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
      
      inline def setUiLanguage(value: String): Self = StObject.set(x, "uiLanguage", value.asInstanceOf[js.Any])
      
      inline def setUiLanguageUndefined: Self = StObject.set(x, "uiLanguage", js.undefined)
    }
  }
  
  trait Dictionary extends StObject {
    
    var dictionary: StringDictionary[String | js.Array[String]]
    
    var getPluralForm: js.UndefOr[js.Function1[/* n */ Double, Double]] = js.undefined
  }
  object Dictionary {
    
    inline def apply(dictionary: StringDictionary[String | js.Array[String]]): Dictionary = {
      val __obj = js.Dynamic.literal(dictionary = dictionary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictionary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictionary] (val x: Self) extends AnyVal {
      
      inline def setDictionary(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      inline def setGetPluralForm(value: /* n */ Double => Double): Self = StObject.set(x, "getPluralForm", js.Any.fromFunction1(value))
      
      inline def setGetPluralFormUndefined: Self = StObject.set(x, "getPluralForm", js.undefined)
    }
  }
  
  trait IdProperty extends StObject {
    
    val idProperty: js.UndefOr[String] = js.undefined
  }
  object IdProperty {
    
    inline def apply(): IdProperty = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdProperty]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdProperty] (val x: Self) extends AnyVal {
      
      inline def setIdProperty(value: String): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
      
      inline def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[DomEmitter]
  
  @js.native
  trait InstantiableEmitter
    extends StObject
       with Instantiable0[Emitter]
  
  @js.native
  trait InstantiableObservable
    extends StObject
       with Instantiable0[Observable]
  
  trait Priority extends StObject {
    
    val priority: js.UndefOr[PriorityString] = js.undefined
  }
  object Priority {
    
    inline def apply(): Priority = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Priority]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Priority] (val x: Self) extends AnyVal {
      
      inline def setPriority(value: PriorityString): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/keyboard.KeystrokeInfo> */
  trait ReadonlyKeystrokeInfo extends StObject {
    
    val altKey: Boolean
    
    val ctrlKey: Boolean
    
    val keyCode: Double
    
    val metaKey: Boolean
    
    val shiftKey: Boolean
  }
  object ReadonlyKeystrokeInfo {
    
    inline def apply(altKey: Boolean, ctrlKey: Boolean, keyCode: Double, metaKey: Boolean, shiftKey: Boolean): ReadonlyKeystrokeInfo = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyKeystrokeInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyKeystrokeInfo] (val x: Self) extends AnyVal {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
}
