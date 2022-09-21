package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.VideoColorPrimaries
import typings.typescriptNn5FuAjk.VideoColorSpaceInit
import typings.typescriptNn5FuAjk.VideoMatrixCoefficients
import typings.typescriptNn5FuAjk.VideoTransferCharacteristics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("VideoColorSpace")
@js.native
open class VideoColorSpace ()
  extends StObject
     with typings.typescriptNn5FuAjk.VideoColorSpace {
  def this(init: VideoColorSpaceInit) = this()
  
  /* CompleteClass */
  override val fullRange: scala.Boolean | Null = js.native
  
  /* CompleteClass */
  override val matrix: VideoMatrixCoefficients | Null = js.native
  
  /* CompleteClass */
  override val primaries: VideoColorPrimaries | Null = js.native
  
  /* CompleteClass */
  override def toJSON(): VideoColorSpaceInit = js.native
  
  /* CompleteClass */
  override val transfer: VideoTransferCharacteristics | Null = js.native
}
