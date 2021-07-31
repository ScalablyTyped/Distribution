package typings.chromedriver

import typings.chromedriver.chromedriverBooleans.`false`
import typings.chromedriver.chromedriverBooleans.`true`
import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chromedriver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chromedriver", "defaultInstance")
  @js.native
  val defaultInstance: js.UndefOr[ChildProcess] = js.native
  
  @JSImport("chromedriver", "path")
  @js.native
  val path: String = js.native
  
  @scala.inline
  def start(): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[ChildProcess]
  @scala.inline
  def start(args: js.Array[String]): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(args.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  
  @scala.inline
  def start_false(args: js.Array[String], returnPromise: `false`): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(args.asInstanceOf[js.Any], returnPromise.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  @scala.inline
  def start_false(args: Unit, returnPromise: `false`): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(args.asInstanceOf[js.Any], returnPromise.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  @scala.inline
  def start_true(args: js.Array[String], returnPromise: `true`): js.Promise[ChildProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(args.asInstanceOf[js.Any], returnPromise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ChildProcess]]
  @scala.inline
  def start_true(args: Null, returnPromise: `true`): js.Promise[ChildProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(args.asInstanceOf[js.Any], returnPromise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ChildProcess]]
  @scala.inline
  def start_true(args: Unit, returnPromise: `true`): js.Promise[ChildProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(args.asInstanceOf[js.Any], returnPromise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ChildProcess]]
  
  @scala.inline
  def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  
  @JSImport("chromedriver", "version")
  @js.native
  val version: String = js.native
}
