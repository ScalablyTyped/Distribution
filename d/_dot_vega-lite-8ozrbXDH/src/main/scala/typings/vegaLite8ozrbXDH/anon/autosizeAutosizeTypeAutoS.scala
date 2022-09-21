package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.toplevelDTsMod.AutoSizeParams
import typings.vegaLite8ozrbXDH.toplevelDTsMod.AutosizeType
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  autosize :.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/toplevel.d.ts.AutosizeType | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/toplevel.d.ts.AutoSizeParams} & .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/spec/index.d.ts.LayoutSizeMixins */
trait autosizeAutosizeTypeAutoS extends StObject {
  
  var autosize: AutosizeType | AutoSizeParams
  
  /**
    * The height of a visualization.
    *
    * - For a plot with a continuous y-field, height should be a number.
    * - For a plot with either a discrete y-field or no y-field, height can be either a number indicating a fixed height or an object in the form of `{step: number}` defining the height per discrete step. (No y-field is equivalent to having one discrete step.)
    * - To enable responsive sizing on height, it should be set to `"container"`.
    *
    * __Default value:__ Based on `config.view.continuousHeight` for a plot with a continuous y-field and `config.view.discreteHeight` otherwise.
    *
    * __Note:__ For plots with [`row` and `column` channels](https://vega.github.io/vega-lite/docs/encoding.html#facet), this represents the height of a single view and the `"container"` option cannot be used.
    *
    * __See also:__ [`height`](https://vega.github.io/vega-lite/docs/size.html) documentation.
    */
  var height: js.UndefOr[Double | container | typings.vegaLite8ozrbXDH.specBaseDTsMod.Step] = js.undefined
  
  /**
    * The width of a visualization.
    *
    * - For a plot with a continuous x-field, width should be a number.
    * - For a plot with either a discrete x-field or no x-field, width can be either a number indicating a fixed width or an object in the form of `{step: number}` defining the width per discrete step. (No x-field is equivalent to having one discrete step.)
    * - To enable responsive sizing on width, it should be set to `"container"`.
    *
    * __Default value:__
    * Based on `config.view.continuousWidth` for a plot with a continuous x-field and `config.view.discreteWidth` otherwise.
    *
    * __Note:__ For plots with [`row` and `column` channels](https://vega.github.io/vega-lite/docs/encoding.html#facet), this represents the width of a single view and the `"container"` option cannot be used.
    *
    * __See also:__ [`width`](https://vega.github.io/vega-lite/docs/size.html) documentation.
    */
  var width: js.UndefOr[Double | container | typings.vegaLite8ozrbXDH.specBaseDTsMod.Step] = js.undefined
}
object autosizeAutosizeTypeAutoS {
  
  inline def apply(autosize: AutosizeType | AutoSizeParams): autosizeAutosizeTypeAutoS = {
    val __obj = js.Dynamic.literal(autosize = autosize.asInstanceOf[js.Any])
    __obj.asInstanceOf[autosizeAutosizeTypeAutoS]
  }
  
  extension [Self <: autosizeAutosizeTypeAutoS](x: Self) {
    
    inline def setAutosize(value: AutosizeType | AutoSizeParams): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double | container | typings.vegaLite8ozrbXDH.specBaseDTsMod.Step): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double | container | typings.vegaLite8ozrbXDH.specBaseDTsMod.Step): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
