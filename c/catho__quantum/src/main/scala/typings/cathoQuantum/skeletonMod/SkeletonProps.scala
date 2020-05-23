package typings.cathoQuantum.skeletonMod

import typings.cathoQuantum.anon.BaseFontSizeNumber
import typings.cathoQuantum.cathoQuantumStrings.button
import typings.cathoQuantum.cathoQuantumStrings.circle
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.rect
import typings.cathoQuantum.cathoQuantumStrings.small
import typings.cathoQuantum.cathoQuantumStrings.tag
import typings.cathoQuantum.cathoQuantumStrings.text
import typings.cathoQuantum.cathoQuantumStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonProps extends js.Object {
  var height: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large] = js.undefined
  var theme: js.UndefOr[BaseFontSizeNumber] = js.undefined
  var `type`: js.UndefOr[rect | circle | text | button | tag] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object SkeletonProps {
  @scala.inline
  def apply(
    height: String = null,
    size: xsmall | small | medium | large = null,
    theme: BaseFontSizeNumber = null,
    `type`: rect | circle | text | button | tag = null,
    width: String = null
  ): SkeletonProps = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonProps]
  }
}

