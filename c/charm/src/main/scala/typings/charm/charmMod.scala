package typings.charm

import typings.charm.charmMod.CharmAnyStream
import typings.charm.charmMod.CharmColor
import typings.charm.charmMod.CharmColorHex
import typings.charm.charmMod.CharmColorName
import typings.charm.charmMod.CharmInstance
import typings.charm.charmStrings.blink
import typings.charm.charmStrings.bright
import typings.charm.charmStrings.char
import typings.charm.charmStrings.dim
import typings.charm.charmStrings.down
import typings.charm.charmStrings.end
import typings.charm.charmStrings.hidden
import typings.charm.charmStrings.line
import typings.charm.charmStrings.reset
import typings.charm.charmStrings.reverse
import typings.charm.charmStrings.screen
import typings.charm.charmStrings.start
import typings.charm.charmStrings.underscore
import typings.charm.charmStrings.up
import typings.node.Buffer
import typings.node.NodeJS.Process
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("charm", JSImport.Namespace)
@js.native
object charmMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.charm.charmStrings.red
    - typings.charm.charmStrings.yellow
    - typings.charm.charmStrings.green
    - typings.charm.charmStrings.blue
    - typings.charm.charmStrings.cyan
    - typings.charm.charmStrings.magenta
    - typings.charm.charmStrings.black
    - typings.charm.charmStrings.white
  */
  trait CharmColorName extends js.Object
  
  @js.native
  trait CharmInstance extends WritableStream {
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
    def cursor(visible: Boolean): js.Any = js.native
    @JSName("delete")
    def delete_char(mode: char): this.type = js.native
    @JSName("delete")
    def delete_char(mode: char, n: Double): this.type = js.native
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
    def delete_line(mode: line): this.type = js.native
    @JSName("delete")
    def delete_line(mode: line, n: Double): this.type = js.native
    /** Emit an "end" event downstream. */
    def destroy(): Unit = js.native
    @JSName("display")
    def display_blink(attr: blink): this.type = js.native
    @JSName("display")
    def display_bright(attr: bright): this.type = js.native
    @JSName("display")
    def display_dim(attr: dim): this.type = js.native
    @JSName("display")
    def display_hidden(attr: hidden): this.type = js.native
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
    def display_reset(attr: reset): this.type = js.native
    @JSName("display")
    def display_reverse(attr: reverse): this.type = js.native
    @JSName("display")
    def display_underscore(attr: underscore): this.type = js.native
    /** Move the cursor down by `y` rows. */
    def down(y: Double): this.type = js.native
    @JSName("erase")
    def erase_down(s: down): this.type = js.native
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
    def erase_end(s: end): this.type = js.native
    @JSName("erase")
    def erase_line(s: line): this.type = js.native
    @JSName("erase")
    def erase_screen(s: screen): this.type = js.native
    @JSName("erase")
    def erase_start(s: start): this.type = js.native
    @JSName("erase")
    def erase_up(s: up): this.type = js.native
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
    def insert_char(mode: char, n: Double): this.type = js.native
    /**
    		 * Insert space into the terminal. `insert` is the opposite of `delete`,
    		 *
    		 * mode can be `'line'` or `'char'`. `n` is the number of items to be deleted.
    		 * `n` must be a positive integer.
    		 */
    @JSName("insert")
    def insert_line(mode: line, n: Double): this.type = js.native
    /** Move the cursor left by `x` columns. */
    def left(x: Double): this.type = js.native
    /** Move the cursor position by the relative coordinates `x`, `y`. */
    def move(x: Double, y: Double): this.type = js.native
    /** Pipes the output of Charm to a writeable stream `stream` */
    def pipe(stream: WritableStream): Unit = js.native
    /** Pop the cursor state and optionally the attribute state. */
    def pop(): this.type = js.native
    def pop(withAttributes: Boolean): this.type = js.native
    /**
    		 * Query the absolute cursor position from the input stream through the output stream
    		 * (the shell does this automatically) and get the response back as `cb(x, y)`.
    		 */
    def position(callback: js.Function2[/* x */ Double, /* y */ Double, Unit]): Unit = js.native
    /** Set the cursor position to the absolute coordinates `x`, `y`. */
    def position(x: Double, y: Double): Unit = js.native
    /** Push the cursor state and optionally the attribute state. */
    def push(): this.type = js.native
    def push(withAttributes: Boolean): this.type = js.native
    /** Reset the entire screen, like the /usr/bin/reset command. */
    def reset(): Unit = js.native
    /** Move the cursor right by `x` columns. */
    def right(x: Double): this.type = js.native
    /** Move the cursor up by `y` rows. */
    def up(y: Double): this.type = js.native
    def write(msg: String, cb: js.Function): Boolean = js.native
    def write(msgs: String, encoding: String, cb: js.Function): Boolean = js.native
    def write(msgs: Buffer, encoding: String): Boolean = js.native
    def write(msgs: Buffer, encoding: String, cb: js.Function): Boolean = js.native
    def write(msg: Buffer): Boolean = js.native
    def write(msg: Buffer, cb: js.Function): Boolean = js.native
  }
  
  /**
    * Create a new readable/writable charm stream.
    *
    * You can pass in readable or writable streams as parameters
    * and they will be piped to or from accordingly.
    * You can also pass `process` in which case
    * `process.stdin` and `process.stdout` will be used.
    */
  def apply(): CharmInstance = js.native
  def apply(param: CharmAnyStream): CharmInstance = js.native
  type CharmAnyStream = WritableStream | ReadableStream | Process
  type CharmColor = CharmColorName | CharmColorHex
  type CharmColorHex = Double
}

