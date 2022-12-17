package typings.codemirrorState.mod

import typings.codemirrorState.codemirrorStateInts.`-1`
import typings.codemirrorState.codemirrorStateInts.`1`
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
The data structure for documents. @nonabstract
*/
/* note: abstract class */ @JSImport("@codemirror/state", "Text")
@js.native
open class Text ()
  extends StObject
     with Iterable[String] {
  
  /**
    Append another document to this one.
    */
  def append(other: Text): Text = js.native
  
  /**
    If this is a branch node, `children` will hold the `Text`
    objects that it is made up of. For leaf nodes, this holds null.
    */
  val children: js.Array[Text] | Null = js.native
  
  /**
    Test whether this text is equal to another instance.
    */
  def eq(other: Text): Boolean = js.native
  
  /**
    Iterate over the text. When `dir` is `-1`, iteration happens
    from end to start. This will return lines and the breaks between
    them as separate strings.
    */
  def iter(): TextIterator = js.native
  def iter(dir: `1` | `-1`): TextIterator = js.native
  
  /**
    Return a cursor that iterates over the given range of lines,
    _without_ returning the line breaks between, and yielding empty
    strings for empty lines.
    
    When `from` and `to` are given, they should be 1-based line numbers.
    */
  def iterLines(): TextIterator = js.native
  def iterLines(from: Double): TextIterator = js.native
  def iterLines(from: Double, to: Double): TextIterator = js.native
  def iterLines(from: Unit, to: Double): TextIterator = js.native
  
  /**
    Iterate over a range of the text. When `from` > `to`, the
    iterator will run in reverse.
    */
  def iterRange(from: Double): TextIterator = js.native
  def iterRange(from: Double, to: Double): TextIterator = js.native
  
  /**
    The length of the string.
    */
  val length: Double = js.native
  
  /**
    Get the description for the given (1-based) line number.
    */
  def line(n: Double): Line = js.native
  
  /**
    Get the line description around the given position.
    */
  def lineAt(pos: Double): Line = js.native
  
  /**
    The number of lines in the string (always >= 1).
    */
  val lines: Double = js.native
  
  /**
    Replace a range of the text with the given content.
    */
  def replace(from: Double, to: Double, text: Text): Text = js.native
  
  /**
    Retrieve the text between the given points.
    */
  def slice(from: Double): Text = js.native
  def slice(from: Double, to: Double): Text = js.native
  
  /**
    Retrieve a part of the document as a string
    */
  def sliceString(from: Double): String = js.native
  def sliceString(from: Double, to: Double): String = js.native
  def sliceString(from: Double, to: Double, lineSep: String): String = js.native
  def sliceString(from: Double, to: Unit, lineSep: String): String = js.native
  
  /**
    Convert the document to an array of lines (which can be
    deserialized again via [`Text.of`](https://codemirror.net/6/docs/ref/#state.Text^of)).
    */
  def toJSON(): js.Array[String] = js.native
}
object Text {
  
  @JSImport("@codemirror/state", "Text")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    The empty document.
    */
  /* static member */
  @JSImport("@codemirror/state", "Text.empty")
  @js.native
  def empty: Text = js.native
  inline def empty_=(x: Text): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
  
  /**
    Create a `Text` instance for the given array of lines.
    */
  /* static member */
  inline def of(text: js.Array[String]): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(text.asInstanceOf[js.Any]).asInstanceOf[Text]
}
