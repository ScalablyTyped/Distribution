package typings
package charmLib.charmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharmInstance
  extends nodeLib.NodeJSNs.WritableStream {
  /**
  		 * Set the background color with the string `color`, which can be:
  		 *
  		 *  - red
  		 *  - yellow
  		 *  - green
  		 *  - blue
  		 *  - cyan
  		 *  - magenta
  		 *  - black
  		 *  - white
  		 *  - or `color` can be an integer from 0 to 255, inclusive.
  		 */
  def background(color: CharmColor): this.type = js.native
  /** Set the cursor visibility with a boolean `visible`. */
  def cursor(visible: scala.Boolean): js.Any = js.native
  @JSName("delete")
  def delete_char(mode: charmLib.charmLibStrings.char): this.type = js.native
  @JSName("delete")
  def delete_char(mode: charmLib.charmLibStrings.char, n: scala.Double): this.type = js.native
  /**
  		 * Delete `'line'` or `'char'`s. delete differs from erase because it does not write over
  		 * the deleted characters with whitesapce, but instead removes the deleted space.
  		 *
  		 * mode can be `'line'` or `'char'`. `n` is the number of items to be deleted.
  		 * `n` must be a positive integer.
  		 *
  		 * The cursor position is not updated.
  		 */
  @JSName("delete")
  def delete_line(mode: charmLib.charmLibStrings.line): this.type = js.native
  @JSName("delete")
  def delete_line(mode: charmLib.charmLibStrings.line, n: scala.Double): this.type = js.native
  /** Emit an "end" event downstream. */
  def destroy(): scala.Unit = js.native
  @JSName("display")
  def display_blink(attr: charmLib.charmLibStrings.blink): this.type = js.native
  @JSName("display")
  def display_bright(attr: charmLib.charmLibStrings.bright): this.type = js.native
  @JSName("display")
  def display_dim(attr: charmLib.charmLibStrings.dim): this.type = js.native
  @JSName("display")
  def display_hidden(attr: charmLib.charmLibStrings.hidden): this.type = js.native
  /**
  		 * Set the display mode with the string `attr.`
  		 *
  		 * `attr` can be:
  		 *
  		 *  - reset
  		 *  - bright
  		 *  - dim
  		 *  - underscore
  		 *  - blink
  		 *  - reverse
  		 *  - hidden
  		 */
  @JSName("display")
  def display_reset(attr: charmLib.charmLibStrings.reset): this.type = js.native
  @JSName("display")
  def display_reverse(attr: charmLib.charmLibStrings.reverse): this.type = js.native
  @JSName("display")
  def display_underscore(attr: charmLib.charmLibStrings.underscore): this.type = js.native
  /** Move the cursor down by `y` rows. */
  def down(y: scala.Double): this.type = js.native
  @JSName("erase")
  def erase_down(s: charmLib.charmLibStrings.down): this.type = js.native
  /**
  		 * Erase a region defined by the string `s`.
  		 *
  		 * `s` can be:
  		 *
  		 *  - end - erase from the cursor to the end of the line
  		 *  - start - erase from the cursor to the start of the line
  		 *  - line - erase the current line
  		 *  - down - erase everything below the current line
  		 *  - up - erase everything above the current line
  		 *  - screen - erase the entire screen
  		 */
  @JSName("erase")
  def erase_end(s: charmLib.charmLibStrings.end): this.type = js.native
  @JSName("erase")
  def erase_line(s: charmLib.charmLibStrings.line): this.type = js.native
  @JSName("erase")
  def erase_screen(s: charmLib.charmLibStrings.screen): this.type = js.native
  @JSName("erase")
  def erase_start(s: charmLib.charmLibStrings.start): this.type = js.native
  @JSName("erase")
  def erase_up(s: charmLib.charmLibStrings.up): this.type = js.native
  /**
  		 * Set the foreground color with the string `color`, which can be:
  		 *
  		 *  - red
  		 *  - yellow
  		 *  - green
  		 *  - blue
  		 *  - cyan
  		 *  - magenta
  		 *  - black
  		 *  - white
  		 *  - or `color` can be an integer from 0 to 255, inclusive.
  		 */
  def foreground(color: CharmColor): this.type = js.native
  @JSName("insert")
  def insert_char(mode: charmLib.charmLibStrings.char, n: scala.Double): this.type = js.native
  /**
  		 * Insert space into the terminal. `insert` is the opposite of `delete`,
  		 *
  		 * mode can be `'line'` or `'char'`. `n` is the number of items to be deleted.
  		 * `n` must be a positive integer.
  		 */
  @JSName("insert")
  def insert_line(mode: charmLib.charmLibStrings.line, n: scala.Double): this.type = js.native
  /** Move the cursor left by `x` columns. */
  def left(x: scala.Double): this.type = js.native
  /** Move the cursor position by the relative coordinates `x`, `y`. */
  def move(x: scala.Double, y: scala.Double): this.type = js.native
  /** Pipes the output of Charm to a writeable stream `stream` */
  def pipe(stream: nodeLib.NodeJSNs.WritableStream): scala.Unit = js.native
  /** Pop the cursor state and optionally the attribute state. */
  def pop(): this.type = js.native
  def pop(withAttributes: scala.Boolean): this.type = js.native
  /**
  		 * Query the absolute cursor position from the input stream through the output stream
  		 * (the shell does this automatically) and get the response back as `cb(x, y)`.
  		 */
  def position(callback: js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit]): scala.Unit = js.native
  /** Set the cursor position to the absolute coordinates `x`, `y`. */
  def position(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /** Push the cursor state and optionally the attribute state. */
  def push(): this.type = js.native
  def push(withAttributes: scala.Boolean): this.type = js.native
  /** Reset the entire screen, like the /usr/bin/reset command. */
  def reset(): scala.Unit = js.native
  /** Move the cursor right by `x` columns. */
  def right(x: scala.Double): this.type = js.native
  /** Move the cursor up by `y` rows. */
  def up(y: scala.Double): this.type = js.native
  def write(msg: java.lang.String, cb: js.Function): scala.Boolean = js.native
  def write(msg: nodeLib.Buffer): scala.Boolean = js.native
  def write(msg: nodeLib.Buffer, cb: js.Function): scala.Boolean = js.native
  def write(msgs: java.lang.String, encoding: java.lang.String, cb: js.Function): scala.Boolean = js.native
  def write(msgs: nodeLib.Buffer, encoding: java.lang.String): scala.Boolean = js.native
  def write(msgs: nodeLib.Buffer, encoding: java.lang.String, cb: js.Function): scala.Boolean = js.native
}

