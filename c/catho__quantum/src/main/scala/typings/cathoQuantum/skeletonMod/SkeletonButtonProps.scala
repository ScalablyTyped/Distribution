package typings.cathoQuantum.skeletonMod

import typings.cathoQuantum.AnonSpacingObject
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.small
import typings.cathoQuantum.cathoQuantumStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonButtonProps extends js.Object {
  var size: xsmall | small | medium | large
  var theme: AnonSpacingObject
}

object SkeletonButtonProps {
  @scala.inline
  def apply(size: xsmall | small | medium | large, theme: AnonSpacingObject): SkeletonButtonProps = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SkeletonButtonProps]
  }
}

