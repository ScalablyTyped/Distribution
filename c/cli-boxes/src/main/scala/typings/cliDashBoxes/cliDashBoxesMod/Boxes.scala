package typings.cliDashBoxes.cliDashBoxesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	All box styles.
	*/
trait Boxes extends js.Object {
  /**
  		@example
  		```
  		┏━━━━┓
  		┃    ┃
  		┗━━━━┛
  		```
  		*/
  val bold: BoxStyle
  /**
  		@example
  		```
  		+----+
  		|    |
  		+----+
  		```
  		*/
  val classic: BoxStyle
  /**
  		@example
  		```
  		╔════╗
  		║    ║
  		╚════╝
  		```
  		*/
  val double: BoxStyle
  /**
  		@example
  		```
  		╒════╕
  		│    │
  		╘════╛
  		```
  		*/
  val doubleSingle: BoxStyle
  /**
  		@example
  		```
  		╭────╮
  		│    │
  		╰────╯
  		```
  		*/
  val round: BoxStyle
  /**
  		@example
  		```
  		┌────┐
  		│    │
  		└────┘
  		```
  		*/
  val single: BoxStyle
  /**
  		@example
  		```
  		╓────╖
  		║    ║
  		╙────╜
  		```
  		*/
  val singleDouble: BoxStyle
}

object Boxes {
  @scala.inline
  def apply(
    bold: BoxStyle,
    classic: BoxStyle,
    double: BoxStyle,
    doubleSingle: BoxStyle,
    round: BoxStyle,
    single: BoxStyle,
    singleDouble: BoxStyle
  ): Boxes = {
    val __obj = js.Dynamic.literal(bold = bold, classic = classic, double = double, doubleSingle = doubleSingle, round = round, single = single, singleDouble = singleDouble)
  
    __obj.asInstanceOf[Boxes]
  }
}

