package typings.bbcodeToReact.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.bbcodeToReact.anon.Linkify
import typings.bbcodeToReact.anon.PartialOmitTagTypechildre
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class designed for parsing bbcode.
  * The class exposes some public function
  * to make the conversion between bbcode and html/ReactNode possible.
  * The class is exported from the library,
  * and a class instance with pre-defined tags collections is exported as default.
  */
@JSImport("bbcode-to-react", "Parser")
@js.native
/**
  * Initializing the class members
  * @param allowedTags
  * An object to be combined with a set of default tags
  * for forming the class member "tag"
  */
class Parser[T] () extends js.Object {
  def this(allowedTags: js.Object) = this()
  
  /**
    * Method for parsing an input string into a tag instance
    * @param input A string to be parsed
    * @returns a tag instance
    */
  /* protected */ def parse(input: String): Tag[Linkify] = js.native
  
  /**
    * Method for adding an user-defined tag instance into the parser
    * @param name A tag name to be provided
    * @param tag A tag instance to be provided
    */
  def registerTag(
    name: String,
    tag: Instantiable2[
      /* renderer */ Renderer[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
      /* settings */ js.UndefOr[PartialOmitTagTypechildre], 
      Tag[js.Object]
    ]
  ): Unit = js.native
  
  /**
    * A renderer member for a parser instance
    */
  var renderer: Renderer[T] = js.native
  
  /**
    * A tags collection for a parser instance
    */
  var tags: StringDictionary[Tag[Linkify]] = js.native
  
  /**
    * Method for converting a bbcode to HTML
    * @param input a bbcode string
    * @returns a HTML in string form
    */
  def toHTML(input: String): String = js.native
  
  /**
    * Method for converting a bbcode to react component
    * @param input a bbcode string
    * @returns a react component
    */
  def toReact(input: String): ReactNode = js.native
}
