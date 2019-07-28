package typings.cypress.mochaMod

import typings.cypress.Anon_Close
import typings.cypress.MochaNs.IRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha", "reporters")
@js.native
object reportersNs extends js.Object {
  @js.native
  class Base protected ()
    extends typings.cypress.MochaNs.reportersNs.Base {
    def this(runner: IRunner) = this()
  }
  
  @js.native
  class Doc ()
    extends typings.cypress.MochaNs.reportersNs.Doc
  
  @js.native
  class Dot ()
    extends typings.cypress.MochaNs.reportersNs.Dot
  
  @js.native
  class HTML ()
    extends typings.cypress.MochaNs.reportersNs.HTML
  
  @js.native
  class HTMLCov ()
    extends typings.cypress.MochaNs.reportersNs.HTMLCov
  
  @js.native
  class JSON ()
    extends typings.cypress.MochaNs.reportersNs.JSON
  
  @js.native
  class JSONCov ()
    extends typings.cypress.MochaNs.reportersNs.JSONCov
  
  @js.native
  class JSONStream ()
    extends typings.cypress.MochaNs.reportersNs.JSONStream
  
  @js.native
  class Landing ()
    extends typings.cypress.MochaNs.reportersNs.Landing
  
  @js.native
  class List ()
    extends typings.cypress.MochaNs.reportersNs.List
  
  @js.native
  class Markdown ()
    extends typings.cypress.MochaNs.reportersNs.Markdown
  
  @js.native
  class Min ()
    extends typings.cypress.MochaNs.reportersNs.Min
  
  @js.native
  class Nyan ()
    extends typings.cypress.MochaNs.reportersNs.Nyan
  
  @js.native
  class Progress protected ()
    extends typings.cypress.MochaNs.reportersNs.Progress {
    /**
      * @param options.open String used to indicate the start of the progress bar.
      * @param options.complete String used to indicate a complete test on the progress bar.
      * @param options.incomplete String used to indicate an incomplete test on the progress bar.
      * @param options.close String used to indicate the end of the progress bar.
      */
    def this(runner: IRunner) = this()
    def this(runner: IRunner, options: Anon_Close) = this()
  }
  
  @js.native
  class Spec ()
    extends typings.cypress.MochaNs.reportersNs.Spec
  
  @js.native
  class TAP ()
    extends typings.cypress.MochaNs.reportersNs.TAP
  
  @js.native
  class XUnit protected ()
    extends typings.cypress.MochaNs.reportersNs.XUnit {
    def this(runner: IRunner) = this()
    def this(runner: IRunner, options: js.Any) = this()
  }
  
}

