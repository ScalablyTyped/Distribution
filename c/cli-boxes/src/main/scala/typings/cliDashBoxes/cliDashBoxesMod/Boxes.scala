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
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], classic = classic.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], doubleSingle = doubleSingle.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], singleDouble = singleDouble.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Boxes]
  }
}

