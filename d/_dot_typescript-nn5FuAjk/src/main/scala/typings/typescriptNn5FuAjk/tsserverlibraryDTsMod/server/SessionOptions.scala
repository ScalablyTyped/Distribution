package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.LanguageServiceMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionOptions extends StObject {
  
  var allowLocalPluginLoads: js.UndefOr[Boolean] = js.native
  
  def byteLength(buf: String): Double = js.native
  def byteLength(buf: String, encoding: String): Double = js.native
  
  /**
    * If falsy, all events are suppressed.
    */
  var canUseEvents: Boolean = js.native
  
  var cancellationToken: ServerCancellationToken = js.native
  
  var eventHandler: js.UndefOr[ProjectServiceEventHandler] = js.native
  
  var globalPlugins: js.UndefOr[Array[String]] = js.native
  
  var host: ServerHost = js.native
  
  def hrtime(): Array[Double] = js.native
  def hrtime(start: Array[Double]): Array[Double] = js.native
  
  var logger: Logger = js.native
  
  var noGetErrOnBackgroundUpdate: js.UndefOr[Boolean] = js.native
  
  var pluginProbeLocations: js.UndefOr[Array[String]] = js.native
  
  var serverMode: js.UndefOr[LanguageServiceMode] = js.native
  
  /** Has no effect if eventHandler is also specified. */
  var suppressDiagnosticEvents: js.UndefOr[Boolean] = js.native
  
  /** @deprecated use serverMode instead */
  var syntaxOnly: js.UndefOr[Boolean] = js.native
  
  var throttleWaitMilliseconds: js.UndefOr[Double] = js.native
  
  var typesMapLocation: js.UndefOr[String] = js.native
  
  var typingsInstaller: ITypingsInstaller = js.native
  
  var useInferredProjectPerProjectRoot: Boolean = js.native
  
  var useSingleInferredProject: Boolean = js.native
}
