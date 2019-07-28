package typings.cropperjs.cropperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CropperViewMods extends js.Object

@JSImport("cropperjs", "CropperViewMods")
@js.native
object CropperViewMods extends js.Object {
  @js.native
  sealed trait CanvasShouldNotBeWithInTheContainer extends CropperViewMods
  
  @js.native
  sealed trait ContainerSshouldBeWithInTheCanvas extends CropperViewMods
  
  @js.native
  sealed trait CropBoxIsJustWithInTheContainer extends CropperViewMods
  
  @js.native
  sealed trait CropBoxShouldBeWithInTheCanvas extends CropperViewMods
  
  /* 2 */ val CanvasShouldNotBeWithInTheContainer: typings.cropperjs.cropperjsMod.CropperViewMods.CanvasShouldNotBeWithInTheContainer with Double = js.native
  /* 3 */ val ContainerSshouldBeWithInTheCanvas: typings.cropperjs.cropperjsMod.CropperViewMods.ContainerSshouldBeWithInTheCanvas with Double = js.native
  /* 0 */ val CropBoxIsJustWithInTheContainer: typings.cropperjs.cropperjsMod.CropperViewMods.CropBoxIsJustWithInTheContainer with Double = js.native
  /* 1 */ val CropBoxShouldBeWithInTheCanvas: typings.cropperjs.cropperjsMod.CropperViewMods.CropBoxShouldBeWithInTheCanvas with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CropperViewMods with Double] = js.native
}

