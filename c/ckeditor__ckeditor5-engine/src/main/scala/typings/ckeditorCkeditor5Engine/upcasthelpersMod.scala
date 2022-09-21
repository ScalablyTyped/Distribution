package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.ModelViewMatcherPattern
import typings.ckeditorCkeditor5Engine.anon.ViewMatcherPattern
import typings.ckeditorCkeditor5Engine.anon.ViewString
import typings.ckeditorCkeditor5Engine.anon.`11`
import typings.ckeditorCkeditor5Engine.anon.`9`
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentFragment
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.element
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementColon$LeftcurlybracketstringRightcurlybracket
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.selectionChange
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
import typings.ckeditorCkeditor5Engine.modelMod.Model
import typings.ckeditorCkeditor5Engine.upcastdispatcherMod.UpcastDispatcherCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upcasthelpersMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/conversion/upcasthelpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ckeditor/ckeditor5-engine/src/conversion/upcasthelpers", JSImport.Default)
  @js.native
  open class default () extends UpcastHelpers
  
  inline def convertSelectionChange(model: Model, mapper: typings.ckeditorCkeditor5Engine.mapperMod.default): UpcastDispatcherCallback[selectionChange, typings.ckeditorCkeditor5Engine.viewDocumentMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertSelectionChange")(model.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[UpcastDispatcherCallback[selectionChange, typings.ckeditorCkeditor5Engine.viewDocumentMod.default]]
  
  inline def convertText(): UpcastDispatcherCallback[
    text, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertText")().asInstanceOf[UpcastDispatcherCallback[
    text, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ]]
  
  inline def convertToModelFragment(): UpcastDispatcherCallback[
    element | elementColon$LeftcurlybracketstringRightcurlybracket | documentFragment, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToModelFragment")().asInstanceOf[UpcastDispatcherCallback[
    element | elementColon$LeftcurlybracketstringRightcurlybracket | documentFragment, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
  ]]
  
  @js.native
  trait UpcastHelpers
    extends typings.ckeditorCkeditor5Engine.conversionhelpersMod.default[UpcastHelpers] {
    
    /**
      * View attribute to model attribute conversion helper.
      *
      * This conversion results in setting an attribute on a model node. For example, view `<img src="foo.jpg"></img>` becomes
      * `<imageBlock source="foo.jpg"></imageBlock>` in the model.
      *
      * This helper is meant to convert view attributes from view elements which got converted to the model, so the view attribute
      * is set only on the corresponding model node:
      *
      *    <div class="dark"><div>foo</div></div>    -->    <div dark="true"><div>foo</div></div>
      *
      * Above, `class="dark"` attribute is added only to the `<div>` elements that has it. This is in contrary to
      * {@link module:engine/conversion/upcasthelpers~UpcastHelpers#elementToAttribute} which sets attributes for
      * all the children in the model:
      *
      *    <strong>Foo</strong>   -->   <strong><p>Foo</p></strong>   -->   <paragraph><$text bold="true">Foo</$text></paragraph>
      *
      * Above is a sample of HTML code, that goes through autoparagraphing (first step) and then is converted (second step).
      * Even though `<strong>` is over `<p>` element, `bold="true"` was added to the text.
      *
      * Keep in mind that the attribute will be set only if it is allowed by {@link module:engine/model/schema~Schema schema} configuration.
      *
      *    editor.conversion.for( 'upcast' ).attributeToAttribute( {
      *      view: 'src',
      *      model: 'source'
      *    } );
      *
      *    editor.conversion.for( 'upcast' ).attributeToAttribute( {
      *      view: { key: 'src' },
      *      model: 'source'
      *    } );
      *
      *    editor.conversion.for( 'upcast' ).attributeToAttribute( {
      *      view: { key: 'src' },
      *      model: 'source',
      *      converterPriority: 'normal'
      *    } );
      *
      *    editor.conversion.for( 'upcast' ).attributeToAttribute( {
      *      view: {
      *        key: 'data-style',
      *        value: /[\s\S]+/
      *      },
      *      model: 'styled'
      *    } );
      *
      *    editor.conversion.for( 'upcast' ).attributeToAttribute( {
      *      view: {
      *        name: 'img',
      *        key: 'class',
      *        value: 'styled-dark'
      *      },
      *      model: {
      *        key: 'styled',
      *        value: 'dark'
      *      }
      *    } );
      *
      *    editor.conversion.for( 'upcast' ).attributeToAttribute( {
      *      view: {
      *        key: 'class',
      *        value: /styled-[\S]+/
      *      },
      *      model: {
      *        key: 'styled'
      *        value: ( viewElement, conversionApi ) => {
      *          const regexp = /styled-([\S]+)/;
      *          const match = viewElement.getAttribute( 'class' ).match( regexp );
      *
      *          return match[ 1 ];
      *        }
      *      }
      *    } );
      *
      * Converting styles works a bit differently as it requires `view.styles` to be an object and by default
      * a model attribute will be set to `true` by such a converter. You can set the model attribute to any value by providing the `value`
      * callback that returns the desired value.
      *
      *    // Default conversion of font-weight style will result in setting bold attribute to true.
      *    editor.conversion.for( 'upcast' ).attributeToAttribute( {
      *      view: {
      *        styles: {
      *          'font-weight': 'bold'
      *        }
      *      },
      *      model: 'bold'
      *    } );
      *
      *    // This converter will pass any style value to the `lineHeight` model attribute.
      *    editor.conversion.for( 'upcast' ).attributeToAttribute( {
      *      view: {
      *        styles: {
      *          'line-height': /[\s\S]+/
      *        }
      *      },
      *      model: {
      *        key: 'lineHeight',
      *        value: ( viewElement, conversionApi ) => viewElement.getStyle( 'line-height' )
      *      }
      *    } );
      *
      * See {@link module:engine/conversion/conversion~Conversion#for `conversion.for()`} to learn how to add a converter
      * to the conversion process.
      */
    def attributeToAttribute(): this.type = js.native
    def attributeToAttribute(config: `11`): this.type = js.native
    
    /**
      * View-to-model marker conversion helper.
      *
      * Converts view data created by {@link module:engine/conversion/downcasthelpers~DowncastHelpers#markerToData `#markerToData()`}
      * back to a model marker.
      *
      * This converter looks for specific view elements and view attributes that mark marker boundaries. See
      * {@link module:engine/conversion/downcasthelpers~DowncastHelpers#markerToData `#markerToData()`} to learn what view data
      * is expected by this converter.
      *
      * The `config.view` property is equal to the marker group name to convert.
      *
      * By default, this converter creates markers with the `group:name` name convention (to match the default `markerToData` conversion).
      *
      * The conversion configuration can take a function that will generate a marker name.
      * If such function is set as the `config.model` parameter, it is passed the `name` part from the view element or attribute and it is
      * expected to return a string with the marker name.
      *
      * Basic usage:
      *
      *    // Using the default conversion.
      *    // In this case, all markers from the `comment` group will be converted.
      *    // The conversion will look for `<comment-start>` and `<comment-end>` tags and
      *    // `data-comment-start-before`, `data-comment-start-after`,
      *    // `data-comment-end-before` and `data-comment-end-after` attributes.
      *    editor.conversion.for( 'upcast' ).dataToMarker( {
      *      view: 'comment'
      *    } );
      *
      * An example of a model that may be generated by this conversion:
      *
      *    // View:
      *    <p>Foo<comment-start name="commentId:uid"></comment-start>bar</p>
      *    <figure data-comment-end-after="commentId:uid" class="image"><img src="abc.jpg" /></figure>
      *
      *    // Model:
      *    <paragraph>Foo[bar</paragraph>
      *    <imageBlock src="abc.jpg"></imageBlock>]
      *
      * Where `[]` are boundaries of a marker that will receive the `comment:commentId:uid` name.
      *
      * Other examples of usage:
      *
      *    // Using a custom function which is the same as the default conversion:
      *    editor.conversion.for( 'upcast' ).dataToMarker( {
      *      view: 'comment',
      *      model: ( name, conversionApi ) => 'comment:' + name,
      *    } );
      *
      *    // Using the converter priority:
      *    editor.conversion.for( 'upcast' ).dataToMarker( {
      *      view: 'comment',
      *      model: ( name, conversionApi ) => 'comment:' + name,
      *      converterPriority: 'high'
      *    } );
      *
      * See {@link module:engine/conversion/conversion~Conversion#for `conversion.for()`} to learn how to add a converter
      * to the conversion process.
      */
    def dataToMarker(): this.type = js.native
    def dataToMarker(config: ViewString): this.type = js.native
    
    /**
      * View element to model attribute conversion helper.
      *
      * This conversion results in setting an attribute on a model node. For example, view `<strong>Foo</strong>` becomes
      * `Foo` {@link module:engine/model/text~Text model text node} with `bold` attribute set to `true`.
      *
      * This helper is meant to set a model attribute on all the elements that are inside the converted element:
      *
      *    <strong>Foo</strong>   -->   <strong><p>Foo</p></strong>   -->   <paragraph><$text bold="true">Foo</$text></paragraph>
      *
      * Above is a sample of HTML code, that goes through autoparagraphing (first step) and then is converted (second step).
      * Even though `<strong>` is over `<p>` element, `bold="true"` was added to the text. See
      * {@link module:engine/conversion/upcasthelpers~UpcastHelpers#attributeToAttribute} for comparison.
      *
      * Keep in mind that the attribute will be set only if it is allowed by {@link module:engine/model/schema~Schema schema} configuration.
      *
      *    editor.conversion.for( 'upcast' ).elementToAttribute( {
      *      view: 'strong',
      *      model: 'bold'
      *    } );
      *
      *    editor.conversion.for( 'upcast' ).elementToAttribute( {
      *      view: 'strong',
      *      model: 'bold',
      *      converterPriority: 'high'
      *    } );
      *
      *    editor.conversion.for( 'upcast' ).elementToAttribute( {
      *      view: {
      *        name: 'span',
      *        classes: 'bold'
      *      },
      *      model: 'bold'
      *    } );
      *
      *    editor.conversion.for( 'upcast' ).elementToAttribute( {
      *      view: {
      *        name: 'span',
      *        classes: [ 'styled', 'styled-dark' ]
      *      },
      *      model: {
      *        key: 'styled',
      *        value: 'dark'
      *      }
      *    } );
      *
      *     editor.conversion.for( 'upcast' ).elementToAttribute( {
      *      view: {
      *        name: 'span',
      *        styles: {
      *          'font-size': /[\s\S]+/
      *        }
      *      },
      *      model: {
      *        key: 'fontSize',
      *        value: ( viewElement, conversionApi ) => {
      *          const fontSize = viewElement.getStyle( 'font-size' );
      *          const value = fontSize.substr( 0, fontSize.length - 2 );
      *
      *          if ( value <= 10 ) {
      *            return 'small';
      *          } else if ( value > 12 ) {
      *            return 'big';
      *          }
      *
      *          return null;
      *        }
      *      }
      *    } );
      *
      * See {@link module:engine/conversion/conversion~Conversion#for `conversion.for()`} to learn how to add a converter
      * to the conversion process.
      */
    def elementToAttribute(): this.type = js.native
    def elementToAttribute(config: ViewMatcherPattern): this.type = js.native
    
    /**
      * View element to model element conversion helper.
      *
      * This conversion results in creating a model element. For example,
      * view `<p>Foo</p>` becomes `<paragraph>Foo</paragraph>` in the model.
      *
      * Keep in mind that the element will be inserted only if it is allowed
      * by {@link module:engine/model/schema~Schema schema} configuration.
      *
      *    editor.conversion.for( 'upcast' ).elementToElement( {
      *      view: 'p',
      *      model: 'paragraph'
      *    } );
      *
      *    editor.conversion.for( 'upcast' ).elementToElement( {
      *      view: 'p',
      *      model: 'paragraph',
      *      converterPriority: 'high'
      *    } );
      *
      *    editor.conversion.for( 'upcast' ).elementToElement( {
      *      view: {
      *        name: 'p',
      *        classes: 'fancy'
      *      },
      *      model: 'fancyParagraph'
      *    } );
      *
      *    editor.conversion.for( 'upcast' ).elementToElement( {
      *       view: {
      *        name: 'p',
      *        classes: 'heading'
      *       },
      *       model: ( viewElement, conversionApi ) => {
      *         const modelWriter = conversionApi.writer;
      *
      *         return modelWriter.createElement( 'heading', { level: viewElement.getAttribute( 'data-level' ) } );
      *       }
      *     } );
      *
      * See {@link module:engine/conversion/conversion~Conversion#for `conversion.for()`} to learn how to add a converter
      * to the conversion process.
      */
    def elementToElement(): this.type = js.native
    def elementToElement(config: `9`): this.type = js.native
    
    /**
      * View element to model marker conversion helper.
      *
      * This conversion results in creating a model marker. For example, if the marker was stored in a view as an element:
      * `<p>Fo<span data-marker="comment" data-comment-id="7"></span>o</p><p>B<span data-marker="comment" data-comment-id="7"></span>ar</p>`,
      * after the conversion is done, the marker will be available in
      * {@link module:engine/model/model~Model#markers model document markers}.
      *
      * **Note**: When this helper is used in the data upcast in combination with
      * {@link module:engine/conversion/downcasthelpers~DowncastHelpers#markerToData `#markerToData()`} in the data downcast,
      * then invalid HTML code (e.g. a span between table cells) may be produced by the latter converter.
      *
      * In most of the cases, the {@link #dataToMarker} should be used instead.
      *
      *    editor.conversion.for( 'upcast' ).elementToMarker( {
      *      view: 'marker-search',
      *      model: 'search'
      *    } );
      *
      *    editor.conversion.for( 'upcast' ).elementToMarker( {
      *      view: 'marker-search',
      *      model: 'search',
      *      converterPriority: 'high'
      *    } );
      *
      *    editor.conversion.for( 'upcast' ).elementToMarker( {
      *      view: 'marker-search',
      *      model: ( viewElement, conversionApi ) => 'comment:' + viewElement.getAttribute( 'data-comment-id' )
      *    } );
      *
      *    editor.conversion.for( 'upcast' ).elementToMarker( {
      *      view: {
      *        name: 'span',
      *        attributes: {
      *          'data-marker': 'search'
      *        }
      *      },
      *      model: 'search'
      *    } );
      *
      * See {@link module:engine/conversion/conversion~Conversion#for `conversion.for()`} to learn how to add a converter
      * to the conversion process.
      */
    def elementToMarker(config: ModelViewMatcherPattern): this.type = js.native
  }
}
