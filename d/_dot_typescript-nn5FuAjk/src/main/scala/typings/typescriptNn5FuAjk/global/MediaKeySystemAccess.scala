package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.MediaKeySystemConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MediaKeySystemAccess")
@js.native
open class MediaKeySystemAccess ()
  extends StObject
     with typings.typescriptNn5FuAjk.MediaKeySystemAccess {
  
  /* CompleteClass */
  override def createMediaKeys(): typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.MediaKeys] = js.native
  
  /* CompleteClass */
  override def getConfiguration(): MediaKeySystemConfiguration = js.native
  
  /* CompleteClass */
  override val keySystem: java.lang.String = js.native
}
