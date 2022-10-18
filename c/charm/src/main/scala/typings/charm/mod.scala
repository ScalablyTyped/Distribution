package typings.charm

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
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.bufferMod.global.Buffer
import typings.node.processMod.global.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new readable/writable charm stream.
    *
    * You can pass in readable or writable streams as parameters
    * and they will be piped to or from accordingly.
    * You can also pass `process` in which case
    * `process.stdin` and `process.stdout` will be used.
    */
  inline def apply(): CharmInstance = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[CharmInstance]
  inline def apply(param: CharmAnyStream): CharmInstance = ^.asInstanceOf[js.Dynamic].apply(param.asInstanceOf[js.Any]).asInstanceOf[CharmInstance]
  
  @JSImport("charm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CharmAnyStream = WritableStream | ReadableStream | Process
  
  type CharmColor = CharmColorName | CharmColorHex
  
  type CharmColorHex = Double
  
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
  trait CharmColorName extends StObject
  object CharmColorName {
    
    inline def black: typings.charm.charmStrings.black = "black".asInstanceOf[typings.charm.charmStrings.black]
    
    inline def blue: typings.charm.charmStrings.blue = "blue".asInstanceOf[typings.charm.charmStrings.blue]
    
    inline def cyan: typings.charm.charmStrings.cyan = "cyan".asInstanceOf[typings.charm.charmStrings.cyan]
    
    inline def green: typings.charm.charmStrings.green = "green".asInstanceOf[typings.charm.charmStrings.green]
    
    inline def magenta: typings.charm.charmStrings.magenta = "magenta".asInstanceOf[typings.charm.charmStrings.magenta]
    
    inline def red: typings.charm.charmStrings.red = "red".asInstanceOf[typings.charm.charmStrings.red]
    
    inline def white: typings.charm.charmStrings.white = "white".asInstanceOf[typings.charm.charmStrings.white]
    
    inline def yellow: typings.charm.charmStrings.yellow = "yellow".asInstanceOf[typings.charm.charmStrings.yellow]
  }
  
  @js.native
  trait CharmInstance
    extends StObject
       with WritableStream {
    
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
    def cursor(visible: Boolean): Any = js.native
    
    /**
      * Delete `'line'` or `'char'`s. delete differs from erase because it does not write over
      * the deleted characters with whitesapce, but instead removes the deleted space.
      *
      * mode can be `'line'` or `'char'`. `n` is the number of items to be deleted.
      * `n` must be a positive integer.
      *
      * The cursor position is not updated.
      */
    def delete(mode: line | char): this.type = js.native
    def delete(mode: line | char, n: Double): this.type = js.native
    
    /** Emit an "end" event downstream. */
    def destroy(): Any = js.native
    
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
    def display(attr: reset | bright | dim | underscore | blink | reverse | hidden): this.type = js.native
    
    /** Move the cursor down by `y` rows. */
    def down(y: Double): this.type = js.native
    
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
    def erase(s: end | start | line | down | up | screen): this.type = js.native
    
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
    
    /**
      * Insert space into the terminal. `insert` is the opposite of `delete`,
      *
      * mode can be `'line'` or `'char'`. `n` is the number of items to be deleted.
      * `n` must be a positive integer.
      */
    def insert(mode: line | char, n: Double): this.type = js.native
    
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
    def write(msgs: String, encoding: String): Boolean = js.native
    def write(msgs: String, encoding: String, cb: js.Function): Boolean = js.native
    def write(msgs: String, encoding: Unit, cb: js.Function): Boolean = js.native
    def write(msgs: Buffer, encoding: String): Boolean = js.native
    def write(msgs: Buffer, encoding: String, cb: js.Function): Boolean = js.native
    def write(msgs: Buffer, encoding: Unit, cb: js.Function): Boolean = js.native
    def write(msg: Buffer): Boolean = js.native
    def write(msg: Buffer, cb: js.Function): Boolean = js.native
  }
}
