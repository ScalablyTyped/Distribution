package typings.ckeditorCkeditor5Language

import typings.ckeditorCkeditor5Language.anon.LanguageCode
import typings.ckeditorCkeditor5Language.ckeditorCkeditor5LanguageBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTextpartlanguagecommandMod {
  
  @JSImport("@ckeditor/ckeditor5-language/src/textpartlanguagecommand", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TextPartLanguageCommand
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Command * / any */ @js.native
  trait TextPartLanguageCommand extends StObject {
    
    /**
      * Returns the attribute value of the first node in the selection that allows the attribute.
      * For a collapsed selection it returns the selection attribute.
      *
      * @returns The attribute value.
      */
    /* private */ var _getValueFromFirstAllowedNode: Any = js.native
    
    /**
      * Executes the command. Applies the attribute to the selection or removes it from the selection.
      *
      * If `languageCode` is set to `false` or a `null` value, it will remove attributes. Otherwise, it will set
      * the attribute in the `{@link #value value}` format.
      *
      * The execution result differs, depending on the {@link module:engine/model/document~Document#selection}:
      *
      * * If the selection is on a range, the command applies the attribute to all nodes in that range
      * (if they are allowed to have this attribute by the {@link module:engine/model/schema~Schema schema}).
      * * If the selection is collapsed in a non-empty node, the command applies the attribute to the
      * {@link module:engine/model/document~Document#selection} itself (note that typed characters copy attributes from the selection).
      * * If the selection is collapsed in an empty node, the command applies the attribute to the parent node of the selection (note
      * that the selection inherits all attributes from a node if it is in an empty node).
      *
      * @fires execute
      * @param options Command options.
      * @param options.languageCode The language code to be applied to the model.
      * @param options.textDirection The language text direction.
      */
    def execute(): Unit = js.native
    def execute(param0: LanguageCode): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def refresh(): Unit = js.native
    
    /**
      * If the selection starts in a language attribute, the value is set to
      * the value of that language in the following format:
      *
      * ```
      * <languageCode>:<textDirection>
      * ```
      *
      * * `languageCode` - The language code used for the `lang` attribute in the [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639-1)
      *    format.
      * * `textDirection` - One of the following values: `rtl` or `ltr`, indicating the reading direction of the language.
      *
      * See the {@link module:core/editor/editorconfig~LanguageConfig#textPartLanguage text part language configuration}
      * for more information about language properties.
      *
      * It is set to `false` otherwise.
      *
      * @observable
      * @readonly
      */
    var value: `false` | String = js.native
  }
}
