package typings
package cropperjsLib.cropperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CropperViewMods extends js.Object

@JSImport("cropperjs", "CropperViewMods")
@js.native
object CropperViewMods extends js.Object {
  @js.native
  sealed trait CanvasShouldNotBeWithInTheContainer
    extends cropperjsLib.cropperjsMod.CropperViewMods
  
  @js.native
  sealed trait ContainerSshouldBeWithInTheCanvas
    extends cropperjsLib.cropperjsMod.CropperViewMods
  
  @js.native
  sealed trait CropBoxIsJustWithInTheContainer
    extends cropperjsLib.cropperjsMod.CropperViewMods
  
  @js.native
  sealed trait CropBoxShouldBeWithInTheCanvas
    extends cropperjsLib.cropperjsMod.CropperViewMods
  
  /* 2 */ val CanvasShouldNotBeWithInTheContainer: CanvasShouldNotBeWithInTheContainer with scala.Double = js.native
  /* 3 */ val ContainerSshouldBeWithInTheCanvas: ContainerSshouldBeWithInTheCanvas with scala.Double = js.native
  /* 0 */ val CropBoxIsJustWithInTheContainer: CropBoxIsJustWithInTheContainer with scala.Double = js.native
  /* 1 */ val CropBoxShouldBeWithInTheCanvas: CropBoxShouldBeWithInTheCanvas with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cropperjsLib.cropperjsMod.CropperViewMods with scala.Double] = js.native
}

