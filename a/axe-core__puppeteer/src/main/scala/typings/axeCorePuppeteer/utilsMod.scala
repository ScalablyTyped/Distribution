package typings.axeCorePuppeteer

import typings.axeCore.mod.CrossTreeSelector
import typings.axeCore.mod.SerialContextObject
import typings.axeCore.mod.Spec
import typings.puppeteer.mod.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@axe-core/puppeteer/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayify[T](src: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(src.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def arrayify[T](src: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(src.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def assertFrameReady(frame: Frame): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFrameReady")(frame.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def frameSourceInject(frame: Frame): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("frameSourceInject")(frame.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def frameSourceInject(frame: Frame, source: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("frameSourceInject")(frame.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def frameSourceInject(frame: Frame, source: String, config: Spec): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("frameSourceInject")(frame.asInstanceOf[js.Any], source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def frameSourceInject(frame: Frame, source: Unit, config: Spec): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("frameSourceInject")(frame.asInstanceOf[js.Any], source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getChildFrame(frame: Frame, childSelector: CrossTreeSelector): js.Promise[Frame | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildFrame")(frame.asInstanceOf[js.Any], childSelector.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Frame | Null]]
  
  inline def normalizeContext(
    includes: js.Array[js.Array[String]],
    excludes: js.Array[js.Array[String]],
    disabledFrameSelectors: js.Array[String]
  ): SerialContextObject = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeContext")(includes.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any], disabledFrameSelectors.asInstanceOf[js.Any])).asInstanceOf[SerialContextObject]
}
