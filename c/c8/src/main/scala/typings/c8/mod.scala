package typings.c8

import typings.c8.anon.All
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("c8", "Report")
  @js.native
  open class Report protected () extends StObject {
    def this(opts: All) = this()
    
    def run(): js.Promise[Unit] = js.native
  }
  
  type Watermark = js.Tuple2[Double, Double]
}
