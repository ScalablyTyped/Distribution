package typings.blueTape

import typings.node.NodeJS.ReadableStream
import typings.tape.mod.StreamOptions
import typings.tape.mod.TestCase
import typings.tape.mod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("blue-tape", JSImport.Namespace)
  @js.native
  def apply(cb: TestCase): Unit = js.native
  /**
    * Create a new test with an optional name string and optional opts object.
    * cb(t) fires with the new test object t once all preceeding tests have finished.
    * Tests execute serially.
    */
  @JSImport("blue-tape", JSImport.Namespace)
  @js.native
  def apply(name: String, cb: TestCase): Unit = js.native
  @JSImport("blue-tape", JSImport.Namespace)
  @js.native
  def apply(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  @JSImport("blue-tape", JSImport.Namespace)
  @js.native
  def apply(opts: TestOptions, cb: TestCase): Unit = js.native
  
  @JSImport("blue-tape", "createHarness")
  @js.native
  def createHarness(): js.Any = js.native
  
  @JSImport("blue-tape", "createStream")
  @js.native
  def createStream(): ReadableStream = js.native
  @JSImport("blue-tape", "createStream")
  @js.native
  def createStream(opts: StreamOptions): ReadableStream = js.native
  
  @JSImport("blue-tape", "onFailure")
  @js.native
  def onFailure(cb: js.Function0[Unit]): Unit = js.native
  
  @JSImport("blue-tape", "onFinish")
  @js.native
  def onFinish(cb: js.Function0[Unit]): Unit = js.native
  
  @JSImport("blue-tape", "only")
  @js.native
  def only(cb: TestCase): Unit = js.native
  @JSImport("blue-tape", "only")
  @js.native
  def only(name: String, cb: TestCase): Unit = js.native
  @JSImport("blue-tape", "only")
  @js.native
  def only(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  @JSImport("blue-tape", "only")
  @js.native
  def only(opts: TestOptions, cb: TestCase): Unit = js.native
  
  @JSImport("blue-tape", "skip")
  @js.native
  def skip(cb: TestCase): Unit = js.native
  @JSImport("blue-tape", "skip")
  @js.native
  def skip(name: String, cb: TestCase): Unit = js.native
  @JSImport("blue-tape", "skip")
  @js.native
  def skip(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  @JSImport("blue-tape", "skip")
  @js.native
  def skip(opts: TestOptions, cb: TestCase): Unit = js.native
}
