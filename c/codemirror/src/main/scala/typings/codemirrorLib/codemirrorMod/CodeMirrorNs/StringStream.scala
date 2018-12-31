package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringStream extends js.Object {
  var lastColumnPos: scala.Double = js.native
  var lastColumnValue: scala.Double = js.native
  var lineStart: scala.Double = js.native
  /**
    * Current position in the string.
    */
  var pos: scala.Double = js.native
  /**
    * Where the stream's position was when it was first passed to the token function.
    */
  var start: scala.Double = js.native
  /**
    * The current line's content.
    */
  var string: java.lang.String = js.native
  /**
    * Number of spaces per tab character.
    */
  var tabSize: scala.Double = js.native
  /**
    * Backs up the stream n characters. Backing it up further than the start of the current token will cause things to
    * break, so be careful.
    */
  def backUp(n: scala.Double): scala.Unit = js.native
  /**
    * Returns the column (taking into account tabs) at which the current token starts.
    */
  def column(): scala.Double = js.native
  /**
    * Get the string between the start of the current token and the current stream position.
    */
  def current(): java.lang.String = js.native
  /**
    * match can be a character, a regular expression, or a function that takes a character and returns a boolean.
    * If the next character in the stream 'matches' the given argument, it is consumed and returned.
    * Otherwise, undefined is returned.
    */
  def eat(`match`: java.lang.String): java.lang.String = js.native
  def eat(`match`: js.Function1[/* char */ java.lang.String, scala.Boolean]): java.lang.String = js.native
  def eat(`match`: stdLib.RegExp): java.lang.String = js.native
  /**
    * Shortcut for eatWhile when matching white-space.
    */
  def eatSpace(): scala.Boolean = js.native
  /**
    * Repeatedly calls eat with the given argument, until it fails. Returns true if any characters were eaten.
    */
  def eatWhile(`match`: java.lang.String): scala.Boolean = js.native
  def eatWhile(`match`: js.Function1[/* char */ java.lang.String, scala.Boolean]): scala.Boolean = js.native
  def eatWhile(`match`: stdLib.RegExp): scala.Boolean = js.native
  /**
    * Returns true only if the stream is at the end of the line.
    */
  def eol(): scala.Boolean = js.native
  /**
    * Tells you how far the current line has been indented, in spaces. Corrects for tab characters.
    */
  def indentation(): scala.Double = js.native
  /**
    * Act like a multi-character eat - if consume is true or not given - or a look-ahead that doesn't update the stream
    * position - if it is false. pattern can be either a string or a regular expression starting with ^. When it is a
    * string, caseFold can be set to true to make the match case-insensitive. When successfully matching a regular
    * expression, the returned value will be the array returned by match, in case you need to extract matched groups.
    */
  def `match`(pattern: java.lang.String): scala.Boolean = js.native
  def `match`(pattern: java.lang.String, consume: scala.Boolean): scala.Boolean = js.native
  def `match`(pattern: java.lang.String, consume: scala.Boolean, caseFold: scala.Boolean): scala.Boolean = js.native
  def `match`(pattern: stdLib.RegExp): js.Array[java.lang.String] = js.native
  def `match`(pattern: stdLib.RegExp, consume: scala.Boolean): js.Array[java.lang.String] = js.native
  /**
    * Returns the next character in the stream and advances it. Also returns null when no more characters are available.
    */
  def next(): java.lang.String | scala.Null = js.native
  /**
    * Returns the next character in the stream without advancing it. Will return an null at the end of the line.
    */
  def peek(): java.lang.String | scala.Null = js.native
  /**
    * Skips to the next occurrence of the given character, if found on the current line (doesn't advance the stream if
    * the character does not occur on the line).
    *
    * Returns true if the character was found.
    */
  def skipTo(ch: java.lang.String): scala.Boolean = js.native
  /**
    * Moves the position to the end of the line.
    */
  def skipToEnd(): scala.Unit = js.native
  /**
    * Returns true only if the stream is at the start of the line.
    */
  def sol(): scala.Boolean = js.native
}

