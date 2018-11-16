package typings
package cropperjsLib.cropperjsMod.cropperjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CropperViewMods extends js.Object

@JSImport("cropperjs/cropperjs", "CropperViewMods")
@js.native
object CropperViewMods extends js.Object {
  @js.native
  sealed trait CanvasShouldNotBeWithInTheContainer
    extends cropperjsLib.cropperjsMod.cropperjsNs.CropperViewMods
  
  @js.native
  sealed trait ContainerSshouldBeWithInTheCanvas
    extends cropperjsLib.cropperjsMod.cropperjsNs.CropperViewMods
  
  @js.native
  sealed trait CropBoxIsJustWithInTheContainer
    extends cropperjsLib.cropperjsMod.cropperjsNs.CropperViewMods
  
  @js.native
  sealed trait CropBoxShouldBeWithInTheCanvas
    extends cropperjsLib.cropperjsMod.cropperjsNs.CropperViewMods
  
}

