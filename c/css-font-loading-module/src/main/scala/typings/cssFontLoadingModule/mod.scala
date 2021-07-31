package typings.cssFontLoadingModule

import typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loading
import typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loadingdone
import typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loadingerror
import typings.cssFontLoadingModule.mod.global.FontFace
import typings.cssFontLoadingModule.mod.global.FontFaceSetLoadEvent
import typings.std.AddEventListenerOptions
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Event
import typings.std.EventInit
import typings.std.EventListenerOptions
import typings.std.EventTarget
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @JSGlobal("FontFace")
    @js.native
    class FontFace protected () extends StObject {
      def this(family: String, source: String) = this()
      def this(family: String, source: BinaryData) = this()
      def this(family: String, source: String, descriptors: FontFaceDescriptors) = this()
      def this(family: String, source: BinaryData, descriptors: FontFaceDescriptors) = this()
      
      var display: String = js.native
      
      var family: String = js.native
      
      var featureSettings: String = js.native
      
      def load(): js.Promise[FontFace] = js.native
      
      val loaded: js.Promise[FontFace] = js.native
      
      val status: FontFaceLoadStatus = js.native
      
      var stretch: String = js.native
      
      var style: String = js.native
      
      var unicodeRange: String = js.native
      
      var variant: String = js.native
      
      var variationSettings: String = js.native
      
      var weight: String = js.native
    }
    
    @JSGlobal("FontFaceSetLoadEvent")
    @js.native
    class FontFaceSetLoadEvent protected ()
      extends StObject
         with Event {
      def this(`type`: String) = this()
      def this(`type`: String, eventInitDict: FontFaceSetLoadEventInit) = this()
      
      val fontfaces: js.Array[FontFace] = js.native
    }
    
    trait Document extends StObject {
      
      var fonts: FontFaceSet
    }
    object Document {
      
      @scala.inline
      def apply(fonts: FontFaceSet): Document = {
        val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any])
        __obj.asInstanceOf[Document]
      }
      
      @scala.inline
      implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFonts(value: FontFaceSet): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      }
    }
    
    trait WorkerGlobalScope extends StObject {
      
      var fonts: FontFaceSet
    }
    object WorkerGlobalScope {
      
      @scala.inline
      def apply(fonts: FontFaceSet): WorkerGlobalScope = {
        val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any])
        __obj.asInstanceOf[WorkerGlobalScope]
      }
      
      @scala.inline
      implicit class WorkerGlobalScopeMutableBuilder[Self <: WorkerGlobalScope] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFonts(value: FontFaceSet): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type BinaryData = ArrayBuffer | ArrayBufferView
  
  trait FontFaceDescriptors extends StObject {
    
    var featureSettings: js.UndefOr[String] = js.undefined
    
    var stretch: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
    
    var unicodeRange: js.UndefOr[String] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
    
    var weight: js.UndefOr[String] = js.undefined
  }
  object FontFaceDescriptors {
    
    @scala.inline
    def apply(): FontFaceDescriptors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontFaceDescriptors]
    }
    
    @scala.inline
    implicit class FontFaceDescriptorsMutableBuilder[Self <: FontFaceDescriptors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatureSettings(value: String): Self = StObject.set(x, "featureSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureSettingsUndefined: Self = StObject.set(x, "featureSettings", js.undefined)
      
      @scala.inline
      def setStretch(value: String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      @scala.inline
      def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cssFontLoadingModule.cssFontLoadingModuleStrings.unloaded
    - typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loading
    - typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded
    - typings.cssFontLoadingModule.cssFontLoadingModuleStrings.error
  */
  trait FontFaceLoadStatus extends StObject
  object FontFaceLoadStatus {
    
    @scala.inline
    def error: typings.cssFontLoadingModule.cssFontLoadingModuleStrings.error = "error".asInstanceOf[typings.cssFontLoadingModule.cssFontLoadingModuleStrings.error]
    
    @scala.inline
    def loaded: typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded = "loaded".asInstanceOf[typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded]
    
    @scala.inline
    def loading: typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loading = "loading".asInstanceOf[typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loading]
    
    @scala.inline
    def unloaded: typings.cssFontLoadingModule.cssFontLoadingModuleStrings.unloaded = "unloaded".asInstanceOf[typings.cssFontLoadingModule.cssFontLoadingModuleStrings.unloaded]
  }
  
  @js.native
  trait FontFaceSet
    extends StObject
       with Set[FontFace]
       with EventTarget {
    
    // EventTarget
    def addEventListener[K /* <: /* keyof css-font-loading-module.css-font-loading-module.FontFaceSetEventMap */ loading | loadingdone | loadingerror */](
      `type`: K,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetEventMap[K] */ js.Any
    ): Unit = js.native
    def addEventListener[K /* <: /* keyof css-font-loading-module.css-font-loading-module.FontFaceSetEventMap */ loading | loadingdone | loadingerror */](
      `type`: K,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetEventMap[K] */ js.Any,
      options: Boolean
    ): Unit = js.native
    def addEventListener[K /* <: /* keyof css-font-loading-module.css-font-loading-module.FontFaceSetEventMap */ loading | loadingdone | loadingerror */](
      `type`: K,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetEventMap[K] */ js.Any,
      options: AddEventListenerOptions
    ): Unit = js.native
    
    // return whether all fonts in the fontlist are loaded
    // (does not initiate load if not available)
    def check(font: String): Boolean = js.native
    def check(font: String, text: String): Boolean = js.native
    
    // check and start loads if appropriate
    // and fulfill promise when all loads complete
    def load(font: String): js.Promise[js.Array[FontFace]] = js.native
    def load(font: String, text: String): js.Promise[js.Array[FontFace]] = js.native
    
    // events for when loading state changes
    var onloading: (js.ThisFunction1[/* this */ this.type, /* event */ FontFaceSetLoadEvent, js.Any]) | Null = js.native
    
    var onloadingdone: (js.ThisFunction1[/* this */ this.type, /* event */ FontFaceSetLoadEvent, js.Any]) | Null = js.native
    
    var onloadingerror: (js.ThisFunction1[/* this */ this.type, /* event */ FontFaceSetLoadEvent, js.Any]) | Null = js.native
    
    // async notification that font loading and layout operations are done
    val ready: js.Promise[FontFaceSet] = js.native
    
    def removeEventListener[K /* <: /* keyof css-font-loading-module.css-font-loading-module.FontFaceSetEventMap */ loading | loadingdone | loadingerror */](
      `type`: K,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetEventMap[K] */ js.Any
    ): Unit = js.native
    def removeEventListener[K /* <: /* keyof css-font-loading-module.css-font-loading-module.FontFaceSetEventMap */ loading | loadingdone | loadingerror */](
      `type`: K,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetEventMap[K] */ js.Any,
      options: Boolean
    ): Unit = js.native
    def removeEventListener[K /* <: /* keyof css-font-loading-module.css-font-loading-module.FontFaceSetEventMap */ loading | loadingdone | loadingerror */](
      `type`: K,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetEventMap[K] */ js.Any,
      options: EventListenerOptions
    ): Unit = js.native
    
    // loading state, "loading" while one or more fonts loading, "loaded" otherwise
    val status: FontFaceSetLoadStatus = js.native
  }
  
  trait FontFaceSetEventMap extends StObject {
    
    def loading(event: FontFaceSetLoadEvent): js.Any
    
    def loadingdone(event: FontFaceSetLoadEvent): js.Any
    
    def loadingerror(event: FontFaceSetLoadEvent): js.Any
  }
  object FontFaceSetEventMap {
    
    @scala.inline
    def apply(
      loading: FontFaceSetLoadEvent => js.Any,
      loadingdone: FontFaceSetLoadEvent => js.Any,
      loadingerror: FontFaceSetLoadEvent => js.Any
    ): FontFaceSetEventMap = {
      val __obj = js.Dynamic.literal(loading = js.Any.fromFunction1(loading), loadingdone = js.Any.fromFunction1(loadingdone), loadingerror = js.Any.fromFunction1(loadingerror))
      __obj.asInstanceOf[FontFaceSetEventMap]
    }
    
    @scala.inline
    implicit class FontFaceSetEventMapMutableBuilder[Self <: FontFaceSetEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoading(value: FontFaceSetLoadEvent => js.Any): Self = StObject.set(x, "loading", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadingdone(value: FontFaceSetLoadEvent => js.Any): Self = StObject.set(x, "loadingdone", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadingerror(value: FontFaceSetLoadEvent => js.Any): Self = StObject.set(x, "loadingerror", js.Any.fromFunction1(value))
    }
  }
  
  trait FontFaceSetLoadEventInit
    extends StObject
       with EventInit {
    
    var fontfaces: js.UndefOr[js.Array[FontFace]] = js.undefined
  }
  object FontFaceSetLoadEventInit {
    
    @scala.inline
    def apply(): FontFaceSetLoadEventInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontFaceSetLoadEventInit]
    }
    
    @scala.inline
    implicit class FontFaceSetLoadEventInitMutableBuilder[Self <: FontFaceSetLoadEventInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontfaces(value: js.Array[FontFace]): Self = StObject.set(x, "fontfaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontfacesUndefined: Self = StObject.set(x, "fontfaces", js.undefined)
      
      @scala.inline
      def setFontfacesVarargs(value: FontFace*): Self = StObject.set(x, "fontfaces", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loading
    - typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded
  */
  trait FontFaceSetLoadStatus extends StObject
  object FontFaceSetLoadStatus {
    
    @scala.inline
    def loaded: typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded = "loaded".asInstanceOf[typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded]
    
    @scala.inline
    def loading: typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loading = "loading".asInstanceOf[typings.cssFontLoadingModule.cssFontLoadingModuleStrings.loading]
  }
}
