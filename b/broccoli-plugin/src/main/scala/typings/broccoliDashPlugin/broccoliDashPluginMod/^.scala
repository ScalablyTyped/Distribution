package typings.broccoliDashPlugin.broccoliDashPluginMod

import typings.broccoliDashPlugin.Anon_Build
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("broccoli-plugin", JSImport.Namespace)
@js.native
class ^ protected () extends BroccoliPlugin {
  def this(inputNodes: js.Array[BroccoliNode]) = this()
  def this(inputNodes: js.Array[BroccoliNode], options: BroccoliPluginOptions) = this()
  /**
    * An array of paths on disk corresponding to each node in `inputNodes`.
    * Your plugin will read files from these paths.
    */
  /* CompleteClass */
  override val inputPaths: js.Array[String] = js.native
  /**
    * The path on disk corresponding to this plugin instance (this node).
    * Your plugin will write files to this path. This directory is emptied by
    * Broccoli before each build, unless the `persistentOutput` options is
    * `true`.
    */
  /* CompleteClass */
  override val outputPath: String = js.native
  /**
    * Override this method in your subclass. It will be called on each
    * (re-)build. All paths stay the same between builds.
    * To perform asynchronous work, return a promise.
    */
  /* CompleteClass */
  override def build(): Unit | js.Promise[_] = js.native
  /**
    * Advanced usage only.
    * Return the object on which Broccoli will call `obj.build()`. Called
    * once after instantiation. By default, returns `this`.
    */
  /* CompleteClass */
  override def getCallbackObject(): Anon_Build = js.native
}

