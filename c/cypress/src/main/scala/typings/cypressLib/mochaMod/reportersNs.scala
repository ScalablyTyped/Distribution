package typings
package cypressLib.mochaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha", "reporters")
@js.native
object reportersNs extends js.Object {
  @js.native
  class Base protected ()
    extends cypressLib.MochaNs.reportersNs.Base {
    def this(runner: cypressLib.MochaNs.IRunner) = this()
  }
  
  @js.native
  class Doc ()
    extends cypressLib.MochaNs.reportersNs.Doc
  
  @js.native
  class Dot ()
    extends cypressLib.MochaNs.reportersNs.Dot
  
  @js.native
  class HTML ()
    extends cypressLib.MochaNs.reportersNs.HTML
  
  @js.native
  class HTMLCov ()
    extends cypressLib.MochaNs.reportersNs.HTMLCov
  
  @js.native
  class JSON ()
    extends cypressLib.MochaNs.reportersNs.JSON
  
  @js.native
  class JSONCov ()
    extends cypressLib.MochaNs.reportersNs.JSONCov
  
  @js.native
  class JSONStream ()
    extends cypressLib.MochaNs.reportersNs.JSONStream
  
  @js.native
  class Landing ()
    extends cypressLib.MochaNs.reportersNs.Landing
  
  @js.native
  class List ()
    extends cypressLib.MochaNs.reportersNs.List
  
  @js.native
  class Markdown ()
    extends cypressLib.MochaNs.reportersNs.Markdown
  
  @js.native
  class Min ()
    extends cypressLib.MochaNs.reportersNs.Min
  
  @js.native
  class Nyan ()
    extends cypressLib.MochaNs.reportersNs.Nyan
  
  @js.native
  class Progress protected ()
    extends cypressLib.MochaNs.reportersNs.Progress {
    /**
      * @param options.open String used to indicate the start of the progress bar.
      * @param options.complete String used to indicate a complete test on the progress bar.
      * @param options.incomplete String used to indicate an incomplete test on the progress bar.
      * @param options.close String used to indicate the end of the progress bar.
      */
    def this(runner: cypressLib.MochaNs.IRunner) = this()
    def this(runner: cypressLib.MochaNs.IRunner, options: cypressLib.Anon_Close) = this()
  }
  
  @js.native
  class Spec ()
    extends cypressLib.MochaNs.reportersNs.Spec
  
  @js.native
  class TAP ()
    extends cypressLib.MochaNs.reportersNs.TAP
  
  @js.native
  class XUnit protected ()
    extends cypressLib.MochaNs.reportersNs.XUnit {
    def this(runner: cypressLib.MochaNs.IRunner) = this()
    def this(runner: cypressLib.MochaNs.IRunner, options: js.Any) = this()
  }
  
}

