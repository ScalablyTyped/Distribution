package typings.commandLineUsage

import typings.commandLineUsage.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("command-line-usage", JSImport.Namespace)
  @js.native
  def apply(sections: js.Array[Section]): String = js.native
  @JSImport("command-line-usage", JSImport.Namespace)
  @js.native
  def apply(sections: Section): String = js.native
  
  /** A Content section comprises a header and one or more lines of content. */
  @js.native
  trait Content extends Section {
    
    /**
      * Overloaded property, accepting data in one of four formats.
      *  1. A single string (one line of text).
      *  2. An array of strings (multiple lines of text).
      *  3. An array of objects (recordset-style data). In this case, the data will be rendered in table format. The property names of each object are not important, so long as they are
      *     consistent throughout the array.
      *  4. An object with two properties - data and options. In this case, the data and options will be passed directly to the underlying table layout module for rendering.
      */
    var content: js.UndefOr[String | (js.Array[_ | String]) | Data] = js.native
    
    /** The section header, always bold and underlined. */
    var header: js.UndefOr[String] = js.native
    
    /** Set to true to avoid indentation and wrapping. Useful for banners. */
    var raw: js.UndefOr[Boolean] = js.native
  }
  object Content {
    
    @scala.inline
    def apply(): Content = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String | (js.Array[_ | String]) | Data): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContentVarargs(value: (js.Any | String)*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  /** Describes a command-line option. Additionally, if generating a usage guide with command-line-usage you could optionally add description and typeLabel properties to each definition. */
  @js.native
  trait OptionDefinition extends StObject {
    
    /** getopt-style short option names. Can be any single character (unicode included) except a digit or hyphen. */
    var alias: js.UndefOr[String] = js.native
    
    /** Any values unaccounted for by an option definition will be set on the defaultOption. This flag is typically set on the most commonly-used option to make for more concise usage. */
    var defaultOption: js.UndefOr[Boolean] = js.native
    
    /** An initial value for the option. */
    var defaultValue: js.UndefOr[js.Any] = js.native
    
    /** A string describing the option. */
    var description: js.UndefOr[String] = js.native
    
    /**
      * When your app has a large amount of options it makes sense to organise them in groups.
      *
      * There are two automatic groups: _all (contains all options) and _none (contains options without a group specified in their definition).
      */
    var group: js.UndefOr[String | js.Array[String]] = js.native
    
    /** Identical to multiple but with greedy parsing disabled. */
    var lazyMultiple: js.UndefOr[Boolean] = js.native
    
    /** Set this flag if the option takes a list of values. You will receive an array of values, each passed through the type function (if specified). */
    var multiple: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    /**
      * The type value is a setter function (you receive the output from this), enabling you to be specific about the type and value received.
      *
      * The most common values used are String (the default), Number and Boolean but you can use a custom function.
      */
    var `type`: js.UndefOr[js.Any] = js.native
    
    /** A string to replace the default type string (e.g. <string>). It's often more useful to set a more descriptive type label, like <ms>, <files>, <command>, etc.. */
    var typeLabel: js.UndefOr[String] = js.native
  }
  object OptionDefinition {
    
    @scala.inline
    def apply(name: String): OptionDefinition = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionDefinition]
    }
    
    @scala.inline
    implicit class OptionDefinitionMutableBuilder[Self <: OptionDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setDefaultOption(value: Boolean): Self = StObject.set(x, "defaultOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOptionUndefined: Self = StObject.set(x, "defaultOption", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setGroup(value: String | js.Array[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setGroupVarargs(value: String*): Self = StObject.set(x, "group", js.Array(value :_*))
      
      @scala.inline
      def setLazyMultiple(value: Boolean): Self = StObject.set(x, "lazyMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyMultipleUndefined: Self = StObject.set(x, "lazyMultiple", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeLabel(value: String): Self = StObject.set(x, "typeLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeLabelUndefined: Self = StObject.set(x, "typeLabel", js.undefined)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /** A OptionList section adds a table displaying details of the available options. */
  @js.native
  trait OptionList extends Section {
    
    /** If specified, only options from this particular group will be printed.  */
    var group: js.UndefOr[String | js.Array[String]] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    /** The names of one of more option definitions to hide from the option list.  */
    var hide: js.UndefOr[String | js.Array[String]] = js.native
    
    /** An array of option definition objects. */
    var optionList: js.UndefOr[js.Array[OptionDefinition]] = js.native
    
    /** If true, the option alias will be displayed after the name, i.e. --verbose, -v instead of -v, --verbose). */
    var reverseNameOrder: js.UndefOr[Boolean] = js.native
    
    /** An options object suitable for passing into table-layout. */
    var tableOptions: js.UndefOr[js.Any] = js.native
  }
  object OptionList {
    
    @scala.inline
    def apply(): OptionList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionList]
    }
    
    @scala.inline
    implicit class OptionListMutableBuilder[Self <: OptionList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: String | js.Array[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setGroupVarargs(value: String*): Self = StObject.set(x, "group", js.Array(value :_*))
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHide(value: String | js.Array[String]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setHideVarargs(value: String*): Self = StObject.set(x, "hide", js.Array(value :_*))
      
      @scala.inline
      def setOptionList(value: js.Array[OptionDefinition]): Self = StObject.set(x, "optionList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionListUndefined: Self = StObject.set(x, "optionList", js.undefined)
      
      @scala.inline
      def setOptionListVarargs(value: OptionDefinition*): Self = StObject.set(x, "optionList", js.Array(value :_*))
      
      @scala.inline
      def setReverseNameOrder(value: Boolean): Self = StObject.set(x, "reverseNameOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseNameOrderUndefined: Self = StObject.set(x, "reverseNameOrder", js.undefined)
      
      @scala.inline
      def setTableOptions(value: js.Any): Self = StObject.set(x, "tableOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableOptionsUndefined: Self = StObject.set(x, "tableOptions", js.undefined)
    }
  }
  
  /** Section object. */
  /* Rewritten from type alias, can be one of: 
    - typings.commandLineUsage.mod.Content
    - typings.commandLineUsage.mod.OptionList
  */
  trait Section extends StObject
  object Section {
    
    @scala.inline
    def Content(): typings.commandLineUsage.mod.Content = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.commandLineUsage.mod.Content]
    }
    
    @scala.inline
    def OptionList(): typings.commandLineUsage.mod.OptionList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.commandLineUsage.mod.OptionList]
    }
  }
}
