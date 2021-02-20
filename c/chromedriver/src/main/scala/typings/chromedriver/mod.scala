package typings.chromedriver

import typings.chromedriver.chromedriverBooleans.`false`
import typings.chromedriver.chromedriverBooleans.`true`
import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chromedriver", "defaultInstance")
  @js.native
  val defaultInstance: js.UndefOr[ChildProcess] = js.native
  
  @JSImport("chromedriver", "path")
  @js.native
  val path: String = js.native
  
  @JSImport("chromedriver", "start")
  @js.native
  def start(): ChildProcess = js.native
  @JSImport("chromedriver", "start")
  @js.native
  def start(args: js.Array[String]): ChildProcess = js.native
  @JSImport("chromedriver", "start")
  @js.native
  def start_false(args: js.UndefOr[scala.Nothing], returnPromise: `false`): ChildProcess = js.native
  @JSImport("chromedriver", "start")
  @js.native
  def start_false(args: js.Array[String], returnPromise: `false`): ChildProcess = js.native
  @JSImport("chromedriver", "start")
  @js.native
  def start_true(args: js.UndefOr[scala.Nothing], returnPromise: `true`): js.Promise[ChildProcess] = js.native
  @JSImport("chromedriver", "start")
  @js.native
  def start_true(args: js.Array[String], returnPromise: `true`): js.Promise[ChildProcess] = js.native
  @JSImport("chromedriver", "start")
  @js.native
  def start_true(args: Null, returnPromise: `true`): js.Promise[ChildProcess] = js.native
  
  @JSImport("chromedriver", "stop")
  @js.native
  def stop(): Unit = js.native
  
  @JSImport("chromedriver", "version")
  @js.native
  val version: String = js.native
}
