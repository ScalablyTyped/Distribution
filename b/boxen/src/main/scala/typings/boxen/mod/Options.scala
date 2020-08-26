package typings.boxen.mod

import typings.boxen.boxenStrings.black
import typings.boxen.boxenStrings.blackBright
import typings.boxen.boxenStrings.blue
import typings.boxen.boxenStrings.blueBright
import typings.boxen.boxenStrings.center
import typings.boxen.boxenStrings.cyan
import typings.boxen.boxenStrings.cyanBright
import typings.boxen.boxenStrings.gray
import typings.boxen.boxenStrings.green
import typings.boxen.boxenStrings.greenBright
import typings.boxen.boxenStrings.grey
import typings.boxen.boxenStrings.left
import typings.boxen.boxenStrings.magenta
import typings.boxen.boxenStrings.magentaBright
import typings.boxen.boxenStrings.red
import typings.boxen.boxenStrings.redBright
import typings.boxen.boxenStrings.right
import typings.boxen.boxenStrings.white
import typings.boxen.boxenStrings.whiteBright
import typings.boxen.boxenStrings.yellow
import typings.boxen.boxenStrings.yellowBright
import typings.typeFest.literalUnionMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Align the text in the box based on the widest line.
  		@default 'left'
  		*/
  val align: js.UndefOr[left | right | center] = js.native
  /**
  		Color of the background.
  		*/
  val backgroundColor: js.UndefOr[
    LiteralUnion[
      black | red | green | yellow | blue | magenta | cyan | white | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
      String
    ]
  ] = js.native
  /**
  		Color of the box border.
  		*/
  val borderColor: js.UndefOr[
    LiteralUnion[
      black | red | green | yellow | blue | magenta | cyan | white | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
      String
    ]
  ] = js.native
  /**
  		Style of the box border.
  		@default BorderStyle.Single
  		*/
  val borderStyle: js.UndefOr[BorderStyle | CustomBorderStyle] = js.native
  /**
  		Reduce opacity of the border.
  		@default false
  		*/
  val dimBorder: js.UndefOr[Boolean] = js.native
  /**
  		Float the box on the available terminal screen space.
  		@default 'left'
  		*/
  val float: js.UndefOr[left | right | center] = js.native
  /**
  		Space around the box.
  		@default 0
  		*/
  val margin: js.UndefOr[Double | Spacing] = js.native
  /**
  		Space between the text and box border.
  		@default 0
  		*/
  val padding: js.UndefOr[Double | Spacing] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAlign(value: left | right | center): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setBackgroundColor(
      value: LiteralUnion[
          black | red | green | yellow | blue | magenta | cyan | white | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
          String
        ]
    ): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(
      value: LiteralUnion[
          black | red | green | yellow | blue | magenta | cyan | white | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
          String
        ]
    ): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderStyle(value: BorderStyle | CustomBorderStyle): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    @scala.inline
    def setDimBorder(value: Boolean): Self = this.set("dimBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimBorder: Self = this.set("dimBorder", js.undefined)
    @scala.inline
    def setFloat(value: left | right | center): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloat: Self = this.set("float", js.undefined)
    @scala.inline
    def setMargin(value: Double | Spacing): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setPadding(value: Double | Spacing): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
  
}

