package typings.cathoQuantum.skeletonMod

import typings.cathoQuantum.AnonBaseFontSizeNumber
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.small
import typings.cathoQuantum.cathoQuantumStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonTagProps extends js.Object {
  var size: xsmall | small | medium | large
  var theme: AnonBaseFontSizeNumber
}

object SkeletonTagProps {
  @scala.inline
  def apply(size: xsmall | small | medium | large, theme: AnonBaseFontSizeNumber): SkeletonTagProps = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SkeletonTagProps]
  }
}

