package typings.browserUtilInspect

import typings.browserUtilInspect.mod.Options
import typings.browserUtilInspect.mod.OutputType
import typings.browserUtilInspect.mod.Stylizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined { readonly colors :boolean | undefined,  readonly stylize :undefined} & { readonly showHidden :boolean | undefined,  readonly depth :number | undefined,  readonly customInspect :boolean | undefined} */
  trait readonlycolorsbooleanunde
    extends StObject
       with Options {
    
    /**
      * Whether to use colors. The colors are from {@link colors} and {@link styles}.
      * If `true`, it is effectively the same as passing `stylizeWithColor` to {@link Options#stylize}.
      *
      * Mutually exclusive with {@link Options#stylize}.
      *
      * @default false
      * @see https://github.com/deecewan/browser-util-inspect/blob/master/index.js the source code for `stylizeWithColor`
      */
    val colors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use custom inspect functions of objects if available.
      *
      * The custom inspect function type is {@link CustomInspect}.
      *
      * @default true
      */
    val customInspect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Depth to expand nested objects up to.
      *
      * @default 2
      */
    val depth: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to show non-enumerable properties.
      *
      * @default false
      */
    val showHidden: js.UndefOr[Boolean] = js.undefined
    
    val stylize: Unit
  }
  object readonlycolorsbooleanunde {
    
    inline def apply(stylize: Unit): readonlycolorsbooleanunde = {
      val __obj = js.Dynamic.literal(stylize = stylize.asInstanceOf[js.Any])
      __obj.asInstanceOf[readonlycolorsbooleanunde]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: readonlycolorsbooleanunde] (val x: Self) extends AnyVal {
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setCustomInspect(value: Boolean): Self = StObject.set(x, "customInspect", value.asInstanceOf[js.Any])
      
      inline def setCustomInspectUndefined: Self = StObject.set(x, "customInspect", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setShowHidden(value: Boolean): Self = StObject.set(x, "showHidden", value.asInstanceOf[js.Any])
      
      inline def setShowHiddenUndefined: Self = StObject.set(x, "showHidden", js.undefined)
      
      inline def setStylize(value: Unit): Self = StObject.set(x, "stylize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined { readonly colors :undefined,  readonly stylize :browser-util-inspect.browser-util-inspect.Stylizer | undefined} & { readonly showHidden :boolean | undefined,  readonly depth :number | undefined,  readonly customInspect :boolean | undefined} */
  trait readonlycolorsundefinedre
    extends StObject
       with Options {
    
    val colors: Unit
    
    /**
      * Whether to use custom inspect functions of objects if available.
      *
      * The custom inspect function type is {@link CustomInspect}.
      *
      * @default true
      */
    val customInspect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Depth to expand nested objects up to.
      *
      * @default 2
      */
    val depth: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to show non-enumerable properties.
      *
      * @default false
      */
    val showHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom function for styling the output.
      *
      * Mutually exclusive with {@link Options#colors}.
      *
      * @default undefined
      */
    val stylize: js.UndefOr[Stylizer] = js.undefined
  }
  object readonlycolorsundefinedre {
    
    inline def apply(colors: Unit): readonlycolorsundefinedre = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[readonlycolorsundefinedre]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: readonlycolorsundefinedre] (val x: Self) extends AnyVal {
      
      inline def setColors(value: Unit): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setCustomInspect(value: Boolean): Self = StObject.set(x, "customInspect", value.asInstanceOf[js.Any])
      
      inline def setCustomInspectUndefined: Self = StObject.set(x, "customInspect", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setShowHidden(value: Boolean): Self = StObject.set(x, "showHidden", value.asInstanceOf[js.Any])
      
      inline def setShowHiddenUndefined: Self = StObject.set(x, "showHidden", js.undefined)
      
      inline def setStylize(value: (/* str */ String, /* type */ OutputType) => String): Self = StObject.set(x, "stylize", js.Any.fromFunction2(value))
      
      inline def setStylizeUndefined: Self = StObject.set(x, "stylize", js.undefined)
    }
  }
}
