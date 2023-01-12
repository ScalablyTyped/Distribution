package typings.cldrjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.cldrjs.cldrjsStrings._underscore
import typings.cldrjs.cldrjsStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("cldrjs", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CldrStatic {
    /**
      * @name constructor
      * @memberof cldr.CldrFactory
      * @kind function
      * @access public
      *
      * @description
      * The constructor function for {@link cldr.CldrStatic} class.
      *
      * @param {string} locale The locale name that was previously loaded.
      *
      * @returns {cldr.CldrStatic} The instance of {@link cldr.CldrStatic} class.
      */
    def this(locale: String) = this()
  }
  @JSImport("cldrjs", JSImport.Namespace)
  @js.native
  val ^ : CldrFactory = js.native
  
  /**
    * @name Attributes
    * @memberof cldr
    * @kind interface
    *
    * @description
    * The object created during instance initialization and used internally by .get()
    * to replace dynamic parts of an item path.
    */
  trait Attributes extends StObject {
    
    /**
      * @name language
      * @memberof cldr.Attributes
      * @kind property
      * @access public
      *
      * @type {any}
      *
      * @description
      * Language subtag {@link http://www.unicode.org/reports/tr35/#Language_Locale_Field_Definitions}
      */
    var language: Any
    
    /**
      * @name languageId
      * @memberof cldr.Attributes
      * @kind property
      * @access public
      *
      * @type {any}
      *
      * @description
      * Language Id {@link http://www.unicode.org/reports/tr35/#Unicode_language_identifier}
      */
    var languageId: Any
    
    /**
      * @name maxLanguageId
      * @memberof cldr.Attributes
      * @kind property
      * @access public
      *
      * @type {any}
      *
      * @description
      * Maximized Language Id {@link http://www.unicode.org/reports/tr35/#Likely_Subtags}
      */
    var maxLanguageId: Any
    
    /**
      * @name minLanguageId
      * @memberof cldr.Attributes
      * @kind property
      * @access public
      *
      * @type {any}
      *
      * @description
      * Minimized Language Id {@link http://www.unicode.org/reports/tr35/#Likely_Subtags}
      */
    var minLanguageId: Any
    
    /**
      * @name region
      * @memberof cldr.Attributes
      * @kind property
      * @access public
      *
      * @type {any}
      *
      * @description
      * Region subtag {@link http://www.unicode.org/reports/tr35/#Language_Locale_Field_Definitions}
      */
    var region: Any
    
    /**
      * @name script
      * @memberof cldr.Attributes
      * @kind property
      * @access public
      *
      * @type {any}
      *
      * @description
      * Script subtag {@link http://www.unicode.org/reports/tr35/#Language_Locale_Field_Definitions}
      */
    var script: Any
    
    /**
      * @name territory
      * @memberof cldr.Attributes
      * @kind property
      * @access public
      *
      * @type {any}
      *
      * @description
      * Region subtag (territory variant) {@link http://www.unicode.org/reports/tr35/#Language_Locale_Field_Definitions}
      */
    var territory: Any
  }
  object Attributes {
    
    inline def apply(
      language: Any,
      languageId: Any,
      maxLanguageId: Any,
      minLanguageId: Any,
      region: Any,
      script: Any,
      territory: Any
    ): Attributes = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], languageId = languageId.asInstanceOf[js.Any], maxLanguageId = maxLanguageId.asInstanceOf[js.Any], minLanguageId = minLanguageId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], territory = territory.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: Any): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageId(value: Any): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
      
      inline def setMaxLanguageId(value: Any): Self = StObject.set(x, "maxLanguageId", value.asInstanceOf[js.Any])
      
      inline def setMinLanguageId(value: Any): Self = StObject.set(x, "minLanguageId", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: Any): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setScript(value: Any): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setTerritory(value: Any): Self = StObject.set(x, "territory", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @name CldrFactory
    * @memberof cldr
    * @kind inteface
    *
    * @description
    * The factory for {@link cldr.CldrStatic} class.
    */
  @js.native
  trait CldrFactory
    extends StObject
       with /**
    * @name constructor
    * @memberof cldr.CldrFactory
    * @kind function
    * @access public
    *
    * @description
    * The constructor function for {@link cldr.CldrStatic} class.
    *
    * @param {string} locale The locale name that was previously loaded.
    *
    * @returns {cldr.CldrStatic} The instance of {@link cldr.CldrStatic} class.
    */
  Instantiable1[/* locale */ String, CldrStatic] {
    
    /**
      * @name load
      * @memberof cldr.CldrFactory
      * @kind function
      * @access public
      *
      * @description
      * Load the CLDR content in the form of JSON.
      *
      * @param {any} json The json content.
      * @param {Array<any>} otherJson Optional. The parts of the JSON.
      *
      * @returns {void}
      */
    def load(json: Any, otherJson: Any*): Unit = js.native
    
    /**
      * Allow user to override locale separator "-" (default) | "_".
      * According to http://www.unicode.org/reports/tr35/#Unicode_language_identifier, both "-" and "_" are valid locale separators (eg. "en_GB", "en-GB").
      * According to http://unicode.org/cldr/trac/ticket/6786 its usage must be consistent throughout the data set.
      */
    var localeSep: `-_` | _underscore = js.native
    
    def off(event: String, listener: js.Function2[/* path */ String, /* value */ Any, Unit]): Unit = js.native
    
    def on(event: String, listener: js.Function2[/* path */ String, /* value */ Any, Unit]): Unit = js.native
    
    def once(event: String, listener: js.Function2[/* path */ String, /* value */ Any, Unit]): Unit = js.native
  }
  
  /**
    * @name CldrStatic
    * @memberof cldr
    * @kind interface
    *
    * @description
    * The cldr class definition.
    */
  @js.native
  trait CldrStatic extends StObject {
    
    /**
      * @name attributes
      * @memberof cldr.CldrStatic
      * @kind property
      * @access public
      *
      * @type {cldr.Attributes}
      *
      * @declaration
      * The object created during instance initialization and used internally by .get()
      * to replace dynamic parts of an item path.
      */
    var attributes: Attributes = js.native
    
    /**
      * @name get
      * @memberof cldr.CldrStatic
      * @kind function
      * @access public
      *
      * @description
      * Get the item data given its path, or 'undefined' if missing.
      *
      * @param {string} path The path to the cldr member.
      *
      * @returns {any} The cldr member.
      */
    def get(path: String): Any = js.native
    /**
      * @name get
      * @memberof cldr.CldrStatic
      * @kind function
      * @access public
      *
      * @description
      * Get the item data given its path, or 'undefined' if missing.
      *
      * @param {Array<string>} paths The array with path parts to the cldr member.
      *
      * @returns {any} The cldr member.
      */
    def get(paths: js.Array[String]): Any = js.native
    
    /**
      * @name locale
      * @memberof cldr.CldrStatic
      * @kind property
      * @access public
      *
      * @type {string}
      *
      * @declaration
      * The locale string.
      */
    var locale: String = js.native
    
    /**
      * @name main
      * @memberof cldr.CldrStatic
      * @kind function
      * @access public
      *
      * @description
      * It's an alias for .get(["main/{languageId}, ...])"
      *
      * @param {string} path The path to the cldr member.
      *
      * @returns {any} The cldr member.
      */
    def main(path: String): Any = js.native
    /**
      * @name main
      * @memberof cldr.CldrStatic
      * @kind function
      * @access public
      *
      * @declaration
      * It's an alias for .get(["main/{languageId}, ...])"
      *
      * @param {Array<string>} paths The array with path parts to the cldr member.
      *
      * @returns {any} The cldr member.
      */
    def main(paths: js.Array[String]): Any = js.native
    
    def off(event: String, listener: js.Function2[/* path */ String, /* value */ Any, Unit]): Unit = js.native
    
    def on(event: String, listener: js.Function2[/* path */ String, /* value */ Any, Unit]): Unit = js.native
    
    def once(event: String, listener: js.Function2[/* path */ String, /* value */ Any, Unit]): Unit = js.native
    
    def supplemental(path: String): Any = js.native
    def supplemental(paths: js.Array[String]): Any = js.native
    @JSName("supplemental")
    var supplemental_Original: SupplementalStatic = js.native
  }
  
  @js.native
  trait SupplementalStatic extends StObject {
    
    def apply(path: String): Any = js.native
    def apply(paths: js.Array[String]): Any = js.native
    
    var timeData: TimeDataStatic = js.native
    
    var weekData: WeekDataStatic = js.native
  }
  
  trait TimeDataStatic extends StObject {
    
    def allowed(): String
    
    def preferred(): String
  }
  object TimeDataStatic {
    
    inline def apply(allowed: () => String, preferred: () => String): TimeDataStatic = {
      val __obj = js.Dynamic.literal(allowed = js.Any.fromFunction0(allowed), preferred = js.Any.fromFunction0(preferred))
      __obj.asInstanceOf[TimeDataStatic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeDataStatic] (val x: Self) extends AnyVal {
      
      inline def setAllowed(value: () => String): Self = StObject.set(x, "allowed", js.Any.fromFunction0(value))
      
      inline def setPreferred(value: () => String): Self = StObject.set(x, "preferred", js.Any.fromFunction0(value))
    }
  }
  
  trait WeekDataStatic extends StObject {
    
    def firstDay(): String
    
    def minDays(): Double
  }
  object WeekDataStatic {
    
    inline def apply(firstDay: () => String, minDays: () => Double): WeekDataStatic = {
      val __obj = js.Dynamic.literal(firstDay = js.Any.fromFunction0(firstDay), minDays = js.Any.fromFunction0(minDays))
      __obj.asInstanceOf[WeekDataStatic]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WeekDataStatic] (val x: Self) extends AnyVal {
      
      inline def setFirstDay(value: () => String): Self = StObject.set(x, "firstDay", js.Any.fromFunction0(value))
      
      inline def setMinDays(value: () => Double): Self = StObject.set(x, "minDays", js.Any.fromFunction0(value))
    }
  }
  
  type _To = CldrFactory
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CldrFactory = ^
}
