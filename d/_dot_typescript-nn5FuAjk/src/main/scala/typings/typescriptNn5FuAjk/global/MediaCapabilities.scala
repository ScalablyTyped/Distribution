package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.MediaCapabilitiesDecodingInfo
import typings.typescriptNn5FuAjk.MediaCapabilitiesEncodingInfo
import typings.typescriptNn5FuAjk.MediaDecodingConfiguration
import typings.typescriptNn5FuAjk.MediaEncodingConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MediaCapabilities")
@js.native
open class MediaCapabilities ()
  extends StObject
     with typings.typescriptNn5FuAjk.MediaCapabilities {
  
  /* CompleteClass */
  override def decodingInfo(configuration: MediaDecodingConfiguration): typings.typescriptNn5FuAjk.Promise[MediaCapabilitiesDecodingInfo] = js.native
  
  /* CompleteClass */
  override def encodingInfo(configuration: MediaEncodingConfiguration): typings.typescriptNn5FuAjk.Promise[MediaCapabilitiesEncodingInfo] = js.native
}
