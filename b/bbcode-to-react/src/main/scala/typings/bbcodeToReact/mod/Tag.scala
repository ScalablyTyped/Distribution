package typings.bbcodeToReact.mod

import typings.bbcodeToReact.anon.PartialOmitTagTypechildre
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class designed for handling bbcode.
  * The Tag class mostly is extended into another customized class,
  * and seldom an instance would be needed for bbcode parsing.
  * The class is exported from the library.
  */
@JSImport("bbcode-to-react", "Tag")
@js.native
class Tag[T] protected () extends js.Object {
  /**
    * Initializing the class members
    * @param renderer A Renderer instance to be injected
    * @param settings
    * A "TagType" object (without children attribute)
    * for initializing the class member "params"
    */
  def this(renderer: Renderer[T]) = this()
  def this(renderer: Renderer[T], settings: PartialOmitTagTypechildre) = this()
  
  /**
    * The children of a tag object, with type ReactNode array
    */
  var children: js.Array[ReactNode] = js.native
  
  /**
    * Getter method of the "children" member of the Tag instance
    * @returns A ReactNode array representing the "children" member of the Tag instance
    */
  /* protected */ def getComponents(): js.Array[ReactNode] = js.native
  
  /**
    * Getter method for inner text of the Tag instance
    * @param raw If true, also convert a plain url to an "a" tag in text form
    * @returns Inner text of the Tag instance
    */
  /* protected */ def getContent(): String = js.native
  /* protected */ def getContent(raw: Boolean): String = js.native
  
  /**
    * Tag name, with type string
    */
  var name: String = js.native
  
  /**
    * A "params" object for inner processing
    */
  var params: /* import warning: importer.ImportType#apply Failed type conversion: bbcode-to-react.bbcode-to-react.TagType['params'] */ js.Any = js.native
  
  /**
    * The parent of a tag object, with type ReactNode
    */
  var parent: ReactNode = js.native
  
  /**
    * The inner text of a tag object, with type string
    */
  var text: String = js.native
  
  /**
    * Method for converting a tag instance to HTML
    * @returns a HTML in string form
    */
  /* protected */ def toHTML(): String = js.native
  
  /**
    * Method for converting a tag instance to react component
    * @returns a react component
    */
  /* protected */ def toReact(): ReactNode = js.native
}
