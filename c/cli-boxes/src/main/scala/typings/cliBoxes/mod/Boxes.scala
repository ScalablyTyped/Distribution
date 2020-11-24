package typings.cliBoxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	All box styles.
	*/
@js.native
trait Boxes extends js.Object {
  
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
  
  @scala.inline
  implicit class BoxesOps[Self <: Boxes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBold(value: BoxStyle): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassic(value: BoxStyle): Self = this.set("classic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDouble(value: BoxStyle): Self = this.set("double", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleSingle(value: BoxStyle): Self = this.set("doubleSingle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRound(value: BoxStyle): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingle(value: BoxStyle): Self = this.set("single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleDouble(value: BoxStyle): Self = this.set("singleDouble", value.asInstanceOf[js.Any])
  }
}
