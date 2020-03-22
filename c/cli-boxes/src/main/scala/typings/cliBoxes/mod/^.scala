package typings.cliBoxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cli-boxes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  		@example
  		```
  		┏━━━━┓
  		┃    ┃
  		┗━━━━┛
  		```
  		*/
  val bold: BoxStyle = js.native
  /**
  		@example
  		```
  		+----+
  		|    |
  		+----+
  		```
  		*/
  val classic: BoxStyle = js.native
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cliBoxes */ js.Any = js.native
  /**
  		@example
  		```
  		╔════╗
  		║    ║
  		╚════╝
  		```
  		*/
  val double: BoxStyle = js.native
  /**
  		@example
  		```
  		╒════╕
  		│    │
  		╘════╛
  		```
  		*/
  val doubleSingle: BoxStyle = js.native
  /**
  		@example
  		```
  		╭────╮
  		│    │
  		╰────╯
  		```
  		*/
  val round: BoxStyle = js.native
  /**
  		@example
  		```
  		┌────┐
  		│    │
  		└────┘
  		```
  		*/
  val single: BoxStyle = js.native
  /**
  		@example
  		```
  		╓────╖
  		║    ║
  		╙────╜
  		```
  		*/
  val singleDouble: BoxStyle = js.native
}

