package typings.ckeditorCkeditor5Highlight

import typings.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.marker
import typings.ckeditorCkeditor5Highlight.ckeditorCkeditor5HighlightStrings.pen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHighlightconfigMod {
  
  trait HighlightConfig extends StObject {
    
    /**
      * The available highlight options. The default value is:
      * ```ts
      * options: [
      * 	{
      * 		model: 'yellowMarker',
      * 		class: 'marker-yellow',
      * 		title: 'Yellow marker',
      * 		color: 'var(--ck-highlight-marker-yellow)',
      * 		type: 'marker'
      * 	},
      * 	{
      * 		model: 'greenMarker',
      * 		class: 'marker-green',
      * 		title: 'Green marker',
      * 		color: 'var(--ck-highlight-marker-green)',
      * 		type: 'marker'
      * 	},
      * 	{
      * 		model: 'pinkMarker',
      * 		class: 'marker-pink',
      * 		title: 'Pink marker',
      * 		color: 'var(--ck-highlight-marker-pink)',
      * 		type: 'marker'
      * 	},
      * 	{
      * 		model: 'blueMarker',
      * 		class: 'marker-blue',
      * 		title: 'Blue marker',
      * 		color: 'var(--ck-highlight-marker-blue)',
      * 		type: 'marker'
      * 	},
      * 	{
      * 		model: 'redPen',
      * 		class: 'pen-red',
      * 		title: 'Red pen',
      * 		color: 'var(--ck-highlight-pen-red)',
      * 		type: 'pen'
      * 	},
      * 	{
      * 		model: 'greenPen',
      * 		class: 'pen-green',
      * 		title: 'Green pen',
      * 		color: 'var(--ck-highlight-pen-green)',
      * 		type: 'pen'
      * 	}
      * ]
      * ```
      *
      * There are two types of highlighters available:
      *
      * * `'marker'` &ndash; Rendered as a `<mark>` element, styled with the `background-color`.
      * * `'pen'` &ndash; Rendered as a `<mark>` element, styled with the font `color`.
      *
      * **Note**: The highlight feature provides a stylesheet with the CSS classes and corresponding colors defined
      * as CSS variables.
      *
      * ```css
      * :root {
      * 	--ck-highlight-marker-yellow: #fdfd77;
      * 	--ck-highlight-marker-green: #63f963;
      * 	--ck-highlight-marker-pink: #fc7999;
      * 	--ck-highlight-marker-blue: #72cdfd;
      * 	--ck-highlight-pen-red: #e91313;
      * 	--ck-highlight-pen-green: #118800;
      * }
      *
      * .marker-yellow { ... }
      * .marker-green { ... }
      * .marker-pink { ... }
      * .marker-blue { ... }
      * .pen-red { ... }
      * .pen-green { ... }
      * ```
      *
      * It is possible to define the `color` property directly as `rgba(R, G, B, A)`,
      * `#RRGGBB[AA]` or `hsla(H, S, L, A)`. In such situation, the color will **only** apply to the UI of
      * the editor and the `<mark>` elements in the content must be styled by custom classes provided by
      * a dedicated stylesheet.
      *
      * **Note**: It is recommended for the `color` property to correspond to the class in the content
      * stylesheet because it represents the highlighter in the user interface of the editor.
      *
      * ```ts
      * ClassicEditor
      * 	.create( editorElement, {
      * 		highlight: {
      * 			options: [
      * 				{
      * 					model: 'pinkMarker',
      * 					class: 'marker-pink',
      * 					title: 'Pink Marker',
      * 					color: 'var(--ck-highlight-marker-pink)',
      * 					type: 'marker'
      * 				},
      * 				{
      * 					model: 'redPen',
      * 					class: 'pen-red',
      * 					title: 'Red Pen',
      * 					color: 'var(--ck-highlight-pen-red)',
      * 					type: 'pen'
      * 				},
      * 			]
      * 		}
      * } )
      * .then( ... )
      * .catch( ... );
      * ```
      */
    var options: js.Array[HighlightOption]
  }
  object HighlightConfig {
    
    inline def apply(options: js.Array[HighlightOption]): HighlightConfig = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighlightConfig] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: js.Array[HighlightOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: HighlightOption*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  trait HighlightOption extends StObject {
    
    /**
      * The CSS class used on the `<mark>` element in the view. It should match the `color` setting.
      */
    var `class`: String
    
    /**
      * The CSS `var()` used for the highlighter. The color is used in the user interface to represent the highlighter.
      * There is a possibility to use the default color format like rgb, hex or hsl, but you need to care about the color of `<mark>`
      * by adding CSS classes definition.
      */
    var color: String
    
    /**
      * The unique attribute value in the model.
      */
    var model: String
    
    /**
      * The user-readable title of the option.
      */
    var title: String
    
    /**
      * The type of highlighter:
      *
      * * `'marker'` &ndash; Uses the `color` as the `background-color` style,
      * * `'pen'` &ndash; Uses the `color` as the font `color` style.
      */
    var `type`: marker | pen
  }
  object HighlightOption {
    
    inline def apply(`class`: String, color: String, model: String, title: String, `type`: marker | pen): HighlightOption = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighlightOption] (val x: Self) extends AnyVal {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: marker | pen): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
