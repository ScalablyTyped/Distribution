package typings
package boxenLib.boxenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Align the text in the box based on the widest line.
  		@default 'left'
  		*/
  val align: js.UndefOr[
    boxenLib.boxenLibStrings.left | boxenLib.boxenLibStrings.right | boxenLib.boxenLibStrings.center
  ] = js.undefined
  /**
  		Color of the background.
  		*/
  val backgroundColor: js.UndefOr[
    typeDashFestLib.typeDashFestMod.LiteralUnion[
      boxenLib.boxenLibStrings.black | boxenLib.boxenLibStrings.red | boxenLib.boxenLibStrings.green | boxenLib.boxenLibStrings.yellow | boxenLib.boxenLibStrings.blue | boxenLib.boxenLibStrings.magenta | boxenLib.boxenLibStrings.cyan | boxenLib.boxenLibStrings.white | boxenLib.boxenLibStrings.blackBright | boxenLib.boxenLibStrings.redBright | boxenLib.boxenLibStrings.greenBright | boxenLib.boxenLibStrings.yellowBright | boxenLib.boxenLibStrings.blueBright | boxenLib.boxenLibStrings.magentaBright | boxenLib.boxenLibStrings.cyanBright | boxenLib.boxenLibStrings.whiteBright, 
      java.lang.String
    ]
  ] = js.undefined
  /**
  		Color of the box border.
  		*/
  val borderColor: js.UndefOr[
    typeDashFestLib.typeDashFestMod.LiteralUnion[
      boxenLib.boxenLibStrings.black | boxenLib.boxenLibStrings.red | boxenLib.boxenLibStrings.green | boxenLib.boxenLibStrings.yellow | boxenLib.boxenLibStrings.blue | boxenLib.boxenLibStrings.magenta | boxenLib.boxenLibStrings.cyan | boxenLib.boxenLibStrings.white | boxenLib.boxenLibStrings.gray | boxenLib.boxenLibStrings.grey | boxenLib.boxenLibStrings.blackBright | boxenLib.boxenLibStrings.redBright | boxenLib.boxenLibStrings.greenBright | boxenLib.boxenLibStrings.yellowBright | boxenLib.boxenLibStrings.blueBright | boxenLib.boxenLibStrings.magentaBright | boxenLib.boxenLibStrings.cyanBright | boxenLib.boxenLibStrings.whiteBright, 
      java.lang.String
    ]
  ] = js.undefined
  /**
  		Style of the box border.
  		@default BorderStyle.Single
  		*/
  val borderStyle: js.UndefOr[BorderStyle | CustomBorderStyle] = js.undefined
  /**
  		Reduce opacity of the border.
  		@default false
  		*/
  val dimBorder: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Float the box on the available terminal screen space.
  		@default 'left'
  		*/
  val float: js.UndefOr[
    boxenLib.boxenLibStrings.left | boxenLib.boxenLibStrings.right | boxenLib.boxenLibStrings.center
  ] = js.undefined
  /**
  		Space around the box.
  		@default 0
  		*/
  val margin: js.UndefOr[scala.Double | Spacing] = js.undefined
  /**
  		Space between the text and box border.
  		@default 0
  		*/
  val padding: js.UndefOr[scala.Double | Spacing] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    align: boxenLib.boxenLibStrings.left | boxenLib.boxenLibStrings.right | boxenLib.boxenLibStrings.center = null,
    backgroundColor: typeDashFestLib.typeDashFestMod.LiteralUnion[
      boxenLib.boxenLibStrings.black | boxenLib.boxenLibStrings.red | boxenLib.boxenLibStrings.green | boxenLib.boxenLibStrings.yellow | boxenLib.boxenLibStrings.blue | boxenLib.boxenLibStrings.magenta | boxenLib.boxenLibStrings.cyan | boxenLib.boxenLibStrings.white | boxenLib.boxenLibStrings.blackBright | boxenLib.boxenLibStrings.redBright | boxenLib.boxenLibStrings.greenBright | boxenLib.boxenLibStrings.yellowBright | boxenLib.boxenLibStrings.blueBright | boxenLib.boxenLibStrings.magentaBright | boxenLib.boxenLibStrings.cyanBright | boxenLib.boxenLibStrings.whiteBright, 
      java.lang.String
    ] = null,
    borderColor: typeDashFestLib.typeDashFestMod.LiteralUnion[
      boxenLib.boxenLibStrings.black | boxenLib.boxenLibStrings.red | boxenLib.boxenLibStrings.green | boxenLib.boxenLibStrings.yellow | boxenLib.boxenLibStrings.blue | boxenLib.boxenLibStrings.magenta | boxenLib.boxenLibStrings.cyan | boxenLib.boxenLibStrings.white | boxenLib.boxenLibStrings.gray | boxenLib.boxenLibStrings.grey | boxenLib.boxenLibStrings.blackBright | boxenLib.boxenLibStrings.redBright | boxenLib.boxenLibStrings.greenBright | boxenLib.boxenLibStrings.yellowBright | boxenLib.boxenLibStrings.blueBright | boxenLib.boxenLibStrings.magentaBright | boxenLib.boxenLibStrings.cyanBright | boxenLib.boxenLibStrings.whiteBright, 
      java.lang.String
    ] = null,
    borderStyle: BorderStyle | CustomBorderStyle = null,
    dimBorder: js.UndefOr[scala.Boolean] = js.undefined,
    float: boxenLib.boxenLibStrings.left | boxenLib.boxenLibStrings.right | boxenLib.boxenLibStrings.center = null,
    margin: scala.Double | Spacing = null,
    padding: scala.Double | Spacing = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dimBorder)) __obj.updateDynamic("dimBorder")(dimBorder)
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

